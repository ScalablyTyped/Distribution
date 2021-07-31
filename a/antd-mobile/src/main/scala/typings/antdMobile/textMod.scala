package typings.antdMobile

import typings.antdMobile.anon.Component
import typings.antdMobile.viewMod.ViewProps
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("antd-mobile/lib/text", JSImport.Default)
  @js.native
  class default () extends Text
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/text", "default.defaultProps")
    @js.native
    def defaultProps: Component = js.native
    @scala.inline
    def defaultProps_=(x: Component): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Text
    extends typings.react.mod.Component[ViewProps[HTMLSpanElement], js.Any, js.Any]
}
