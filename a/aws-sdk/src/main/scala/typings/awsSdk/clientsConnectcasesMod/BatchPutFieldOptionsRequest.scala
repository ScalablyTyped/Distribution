package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutFieldOptionsRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The unique identifier of a field.
    */
  var fieldId: FieldId
  
  /**
    * A list of FieldOption objects.
    */
  var options: BatchPutFieldOptionsRequestOptionsList
}
object BatchPutFieldOptionsRequest {
  
  inline def apply(domainId: DomainId, fieldId: FieldId, options: BatchPutFieldOptionsRequestOptionsList): BatchPutFieldOptionsRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutFieldOptionsRequest]
  }
  
  extension [Self <: BatchPutFieldOptionsRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: BatchPutFieldOptionsRequestOptionsList): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: FieldOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
