package typings.animejs

import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait El extends StObject {
    
    var el: HTMLElement | SVGElement = js.native
    
    var property: String = js.native
    
    var totalLength: Double = js.native
  }
  object El {
    
    @scala.inline
    def apply(el: HTMLElement | SVGElement, property: String, totalLength: Double): El = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[El]
    }
    
    @scala.inline
    implicit class ElMutableBuilder[Self <: El] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: HTMLElement | SVGElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
    }
  }
}
