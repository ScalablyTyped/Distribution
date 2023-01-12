package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the field.
    */
  var fieldArn: FieldArn
  
  /**
    * The unique identifier of a field.
    */
  var fieldId: FieldId
}
object CreateFieldResponse {
  
  inline def apply(fieldArn: FieldArn, fieldId: FieldId): CreateFieldResponse = {
    val __obj = js.Dynamic.literal(fieldArn = fieldArn.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFieldResponse] (val x: Self) extends AnyVal {
    
    inline def setFieldArn(value: FieldArn): Self = StObject.set(x, "fieldArn", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
  }
}
