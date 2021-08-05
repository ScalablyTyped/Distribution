package typings.angularStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hide extends StObject {
    
    var hide: Double
    
    var show: Double
  }
  object Hide {
    
    inline def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  trait Padding extends StObject {
    
    var padding: String | Double
    
    var selector: String
  }
  object Padding {
    
    inline def apply(padding: String | Double, selector: String): Padding = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    extension [Self <: Padding](x: Self) {
      
      inline def setPadding(value: String | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
