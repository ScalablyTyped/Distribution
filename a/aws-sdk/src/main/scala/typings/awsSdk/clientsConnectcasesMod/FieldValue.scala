package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValue extends StObject {
  
  /**
    * Unique identifier of a field.
    */
  var id: FieldId
  
  /**
    * Union of potential field value types.
    */
  var value: FieldValueUnion
}
object FieldValue {
  
  inline def apply(id: FieldId, value: FieldValueUnion): FieldValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValue]
  }
  
  extension [Self <: FieldValue](x: Self) {
    
    inline def setId(value: FieldId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldValueUnion): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
