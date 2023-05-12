package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPathValue extends StObject {
  
  /**
    * The field ID of the field that needs to be sorted.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The actual value of the field that needs to be sorted.
    */
  var FieldValue: typings.awsSdk.clientsQuicksightMod.FieldValue
}
object DataPathValue {
  
  inline def apply(FieldId: FieldId, FieldValue: FieldValue): DataPathValue = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any], FieldValue = FieldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPathValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPathValue] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: FieldValue): Self = StObject.set(x, "FieldValue", value.asInstanceOf[js.Any])
  }
}
