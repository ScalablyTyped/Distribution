package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultField extends StObject {
  
  /**
    * The log event field.
    */
  var field: js.UndefOr[Field] = js.undefined
  
  /**
    * The value of this field.
    */
  var value: js.UndefOr[Value] = js.undefined
}
object ResultField {
  
  inline def apply(): ResultField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultField] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
