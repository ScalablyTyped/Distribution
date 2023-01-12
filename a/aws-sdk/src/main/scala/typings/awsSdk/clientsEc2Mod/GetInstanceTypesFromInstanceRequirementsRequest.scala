package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypesFromInstanceRequirementsRequest extends StObject {
  
  /**
    * The processor architecture type.
    */
  var ArchitectureTypes: ArchitectureTypeSet
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attributes required for the instance types.
    */
  var InstanceRequirements: InstanceRequirementsRequest
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The virtualization type.
    */
  var VirtualizationTypes: VirtualizationTypeSet
}
object GetInstanceTypesFromInstanceRequirementsRequest {
  
  inline def apply(
    ArchitectureTypes: ArchitectureTypeSet,
    InstanceRequirements: InstanceRequirementsRequest,
    VirtualizationTypes: VirtualizationTypeSet
  ): GetInstanceTypesFromInstanceRequirementsRequest = {
    val __obj = js.Dynamic.literal(ArchitectureTypes = ArchitectureTypes.asInstanceOf[js.Any], InstanceRequirements = InstanceRequirements.asInstanceOf[js.Any], VirtualizationTypes = VirtualizationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypesFromInstanceRequirementsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceTypesFromInstanceRequirementsRequest] (val x: Self) extends AnyVal {
    
    inline def setArchitectureTypes(value: ArchitectureTypeSet): Self = StObject.set(x, "ArchitectureTypes", value.asInstanceOf[js.Any])
    
    inline def setArchitectureTypesVarargs(value: ArchitectureType*): Self = StObject.set(x, "ArchitectureTypes", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceRequirements(value: InstanceRequirementsRequest): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVirtualizationTypes(value: VirtualizationTypeSet): Self = StObject.set(x, "VirtualizationTypes", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypesVarargs(value: VirtualizationType*): Self = StObject.set(x, "VirtualizationTypes", js.Array(value*))
  }
}
