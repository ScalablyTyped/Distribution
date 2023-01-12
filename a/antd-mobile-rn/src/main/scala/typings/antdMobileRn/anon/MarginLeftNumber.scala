package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginLeftNumber extends StObject {
  
  var marginLeft: Double
}
object MarginLeftNumber {
  
  inline def apply(marginLeft: Double): MarginLeftNumber = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginLeftNumber] (val x: Self) extends AnyVal {
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
  }
}
