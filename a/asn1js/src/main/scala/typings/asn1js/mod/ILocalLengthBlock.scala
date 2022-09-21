package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalLengthBlock extends StObject {
  
  var isIndefiniteForm: scala.Boolean
  
  var length: Double
  
  var longFormUsed: scala.Boolean
}
object ILocalLengthBlock {
  
  inline def apply(isIndefiniteForm: scala.Boolean, length: Double, longFormUsed: scala.Boolean): ILocalLengthBlock = {
    val __obj = js.Dynamic.literal(isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], longFormUsed = longFormUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalLengthBlock]
  }
  
  extension [Self <: ILocalLengthBlock](x: Self) {
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLongFormUsed(value: scala.Boolean): Self = StObject.set(x, "longFormUsed", value.asInstanceOf[js.Any])
  }
}
