package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryByResourceTypeRequest extends StObject {
  
  /**
    * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an Amazon Web Services resource type such as AWS::EC2::Instance. You can specify that the resource type is an Amazon Web Services account by specifying AWS::::Account.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceTypes] = js.undefined
}
object GetComplianceSummaryByResourceTypeRequest {
  
  inline def apply(): GetComplianceSummaryByResourceTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
  }
  
  extension [Self <: GetComplianceSummaryByResourceTypeRequest](x: Self) {
    
    inline def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
