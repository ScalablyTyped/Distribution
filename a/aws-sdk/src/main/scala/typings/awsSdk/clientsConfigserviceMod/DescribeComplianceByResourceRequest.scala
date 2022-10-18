package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComplianceByResourceRequest extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceTypes] = js.undefined
  
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource for which you want compliance information. You can specify only one resource ID. If you specify a resource ID, you must also specify a type for ResourceType.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The types of Amazon Web Services resources for which you want compliance information (for example, AWS::EC2::Instance). For this action, you can specify that the resource type is an Amazon Web Services account by specifying AWS::::Account.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object DescribeComplianceByResourceRequest {
  
  inline def apply(): DescribeComplianceByResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceRequest]
  }
  
  extension [Self <: DescribeComplianceByResourceRequest](x: Self) {
    
    inline def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    inline def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
