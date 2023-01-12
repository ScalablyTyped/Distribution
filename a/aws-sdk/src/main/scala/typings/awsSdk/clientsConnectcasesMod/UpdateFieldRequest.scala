package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFieldRequest extends StObject {
  
  /**
    * The description of a field.
    */
  var description: js.UndefOr[FieldDescription] = js.undefined
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The unique identifier of a field.
    */
  var fieldId: FieldId
  
  /**
    * The name of the field.
    */
  var name: js.UndefOr[FieldName] = js.undefined
}
object UpdateFieldRequest {
  
  inline def apply(domainId: DomainId, fieldId: FieldId): UpdateFieldRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFieldRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FieldDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FieldName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
