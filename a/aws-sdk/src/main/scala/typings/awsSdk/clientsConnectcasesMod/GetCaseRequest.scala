package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCaseRequest extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * A list of unique field identifiers. 
    */
  var fields: GetCaseRequestFieldsList
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetCaseRequest {
  
  inline def apply(caseId: CaseId, domainId: DomainId, fields: GetCaseRequestFieldsList): GetCaseRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: GetCaseRequestFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldIdentifier*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
