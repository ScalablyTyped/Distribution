package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCaseRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var clientToken: js.UndefOr[CreateCaseRequestClientTokenString] = js.undefined
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * An array of objects with field ID (matching ListFields/DescribeField) and value union data.
    */
  var fields: CreateCaseRequestFieldsList
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object CreateCaseRequest {
  
  inline def apply(domainId: DomainId, fields: CreateCaseRequestFieldsList, templateId: TemplateId): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: CreateCaseRequestClientTokenString): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: CreateCaseRequestFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldValue*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
