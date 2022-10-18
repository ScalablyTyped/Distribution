package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldRequest extends StObject {
  
  /**
    * The description of the field.
    */
  var description: js.UndefOr[FieldDescription] = js.undefined
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The name of the field.
    */
  var name: FieldName
  
  /**
    * Defines the data type, some system constraints, and default display of the field.
    */
  var `type`: FieldType
}
object CreateFieldRequest {
  
  inline def apply(domainId: DomainId, name: FieldName, `type`: FieldType): CreateFieldRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldRequest]
  }
  
  extension [Self <: CreateFieldRequest](x: Self) {
    
    inline def setDescription(value: FieldDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FieldName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
