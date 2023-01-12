package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCaseRequest extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * An array of objects with fieldId (matching ListFields/DescribeField) and value union data, structured identical to CreateCase.
    */
  var fields: UpdateCaseRequestFieldsList
}
object UpdateCaseRequest {
  
  inline def apply(caseId: CaseId, domainId: DomainId, fields: UpdateCaseRequestFieldsList): UpdateCaseRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: UpdateCaseRequestFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldValue*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
