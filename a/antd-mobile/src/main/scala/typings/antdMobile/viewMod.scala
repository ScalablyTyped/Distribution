package typings.antdMobile

import typings.antdMobile.anon.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("antd-mobile/lib/view", JSImport.Default)
  @js.native
  class default () extends View
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/view", "default.defaultProps")
    @js.native
    def defaultProps: Component = js.native
    @scala.inline
    def defaultProps_=(x: Component): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait View
    extends typings.react.mod.Component[ViewProps[HTMLDivElement], js.Any, js.Any]
  
  trait ViewProps[T]
    extends StObject
       with HTMLProps[T] {
    
    var Component: js.UndefOr[String] = js.undefined
  }
  object ViewProps {
    
    @scala.inline
    def apply[T](): ViewProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewProps[T]]
    }
    
    @scala.inline
    implicit class ViewPropsMutableBuilder[Self <: ViewProps[?], T] (val x: Self & ViewProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    }
  }
}
