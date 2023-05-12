package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByResourceRequest extends StObject {
  
  /**
    * Filters the results by compliance.  INSUFFICIENT_DATA is a valid ComplianceType that is returned when an Config rule cannot be evaluated. However, INSUFFICIENT_DATA cannot be used as a ComplianceType for filtering results.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceTypes] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of Amazon Web Services resource execution for which you want to retrieve evaluation results.   You need to only provide either a ResourceEvaluationID or a ResourceID and ResourceType. 
    */
  var ResourceEvaluationId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceEvaluationId] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource for which you want compliance information.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource for which you want compliance information.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object GetComplianceDetailsByResourceRequest {
  
  inline def apply(): GetComplianceDetailsByResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComplianceDetailsByResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    inline def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceEvaluationId(value: ResourceEvaluationId): Self = StObject.set(x, "ResourceEvaluationId", value.asInstanceOf[js.Any])
    
    inline def setResourceEvaluationIdUndefined: Self = StObject.set(x, "ResourceEvaluationId", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
