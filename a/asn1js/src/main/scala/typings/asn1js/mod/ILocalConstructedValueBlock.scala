package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalConstructedValueBlock extends StObject {
  
  var isIndefiniteForm: scala.Boolean
  
  var value: js.Array[ConstructedItem]
}
object ILocalConstructedValueBlock {
  
  inline def apply(isIndefiniteForm: scala.Boolean, value: js.Array[ConstructedItem]): ILocalConstructedValueBlock = {
    val __obj = js.Dynamic.literal(isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalConstructedValueBlock]
  }
  
  extension [Self <: ILocalConstructedValueBlock](x: Self) {
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[ConstructedItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ConstructedItem*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
