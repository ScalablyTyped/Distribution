package typings.angularStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hide extends StObject {
    
    var hide: Double = js.native
    
    var show: Double = js.native
  }
  object Hide {
    
    @scala.inline
    def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    @scala.inline
    implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Padding extends StObject {
    
    var padding: String | Double = js.native
    
    var selector: String = js.native
  }
  object Padding {
    
    @scala.inline
    def apply(padding: String | Double, selector: String): Padding = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    @scala.inline
    implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: String | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
