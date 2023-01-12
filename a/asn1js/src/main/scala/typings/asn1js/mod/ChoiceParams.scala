package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<asn1js.asn1js.IChoice> */
trait ChoiceParams extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[js.Array[BaseBlock[ValueBlock, ValueBlockJson]]] = js.undefined
}
object ChoiceParams {
  
  inline def apply(): ChoiceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoiceParams] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setValue(value: js.Array[BaseBlock[ValueBlock, ValueBlockJson]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (BaseBlock[ValueBlock, ValueBlockJson])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
