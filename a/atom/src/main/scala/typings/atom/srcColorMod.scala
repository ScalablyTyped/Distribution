package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcColorMod {
  
  trait Color extends StObject {
    
    /** Returns a string in the form '#abcdef'. */
    def toHexString(): String
    
    /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
    def toRGBAString(): String
  }
  object Color {
    
    inline def apply(toHexString: () => String, toRGBAString: () => String): Color = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toRGBAString = js.Any.fromFunction0(toRGBAString))
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
      
      inline def setToRGBAString(value: () => String): Self = StObject.set(x, "toRGBAString", js.Any.fromFunction0(value))
    }
  }
}
