package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredField extends StObject {
  
  /**
    * Unique identifier of a field.
    */
  var fieldId: FieldId
}
object RequiredField {
  
  inline def apply(fieldId: FieldId): RequiredField = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredField]
  }
  
  extension [Self <: RequiredField](x: Self) {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
  }
}
