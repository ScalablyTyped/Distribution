package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetFieldRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * A list of unique field identifiers. 
    */
  var fields: BatchGetFieldIdentifierList
}
object BatchGetFieldRequest {
  
  inline def apply(domainId: DomainId, fields: BatchGetFieldIdentifierList): BatchGetFieldRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFieldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetFieldRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: BatchGetFieldIdentifierList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldIdentifier*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
