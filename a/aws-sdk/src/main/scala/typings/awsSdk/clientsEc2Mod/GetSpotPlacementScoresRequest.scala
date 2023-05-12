package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpotPlacementScoresRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes. If you specify InstanceRequirementsWithMetadata, you can't specify InstanceTypes.
    */
  var InstanceRequirementsWithMetadata: js.UndefOr[InstanceRequirementsWithMetadataRequest] = js.undefined
  
  /**
    * The instance types. We recommend that you specify at least three instance types. If you specify one or two instance types, or specify variations of a single instance type (for example, an m3.xlarge with and without instance storage), the returned placement score will always be low.  If you specify InstanceTypes, you can't specify InstanceRequirementsWithMetadata.
    */
  var InstanceTypes: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceTypes] = js.undefined
  
  /**
    * The maximum number of items to return for this request. To get the next page of items, make another request with the token returned in the output. For more information, see Pagination.
    */
  var MaxResults: js.UndefOr[SpotPlacementScoresMaxResults] = js.undefined
  
  /**
    * The token returned from a previous paginated request. Pagination continues from the end of the items returned by the previous request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example, us-east-1.
    */
  var RegionNames: js.UndefOr[typings.awsSdk.clientsEc2Mod.RegionNames] = js.undefined
  
  /**
    * Specify true so that the response returns a list of scored Availability Zones. Otherwise, the response returns a list of scored Regions. A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single Availability Zone.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target capacity.
    */
  var TargetCapacity: SpotPlacementScoresTargetCapacity
  
  /**
    * The unit for the target capacity. Default: units (translates to number of instances)
    */
  var TargetCapacityUnitType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TargetCapacityUnitType] = js.undefined
}
object GetSpotPlacementScoresRequest {
  
  inline def apply(TargetCapacity: SpotPlacementScoresTargetCapacity): GetSpotPlacementScoresRequest = {
    val __obj = js.Dynamic.literal(TargetCapacity = TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPlacementScoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSpotPlacementScoresRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceRequirementsWithMetadata(value: InstanceRequirementsWithMetadataRequest): Self = StObject.set(x, "InstanceRequirementsWithMetadata", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsWithMetadataUndefined: Self = StObject.set(x, "InstanceRequirementsWithMetadata", js.undefined)
    
    inline def setInstanceTypes(value: InstanceTypes): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "InstanceTypes", js.Array(value*))
    
    inline def setMaxResults(value: SpotPlacementScoresMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionNames(value: RegionNames): Self = StObject.set(x, "RegionNames", value.asInstanceOf[js.Any])
    
    inline def setRegionNamesUndefined: Self = StObject.set(x, "RegionNames", js.undefined)
    
    inline def setRegionNamesVarargs(value: String*): Self = StObject.set(x, "RegionNames", js.Array(value*))
    
    inline def setSingleAvailabilityZone(value: Boolean): Self = StObject.set(x, "SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSingleAvailabilityZoneUndefined: Self = StObject.set(x, "SingleAvailabilityZone", js.undefined)
    
    inline def setTargetCapacity(value: SpotPlacementScoresTargetCapacity): Self = StObject.set(x, "TargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitType(value: TargetCapacityUnitType): Self = StObject.set(x, "TargetCapacityUnitType", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitTypeUndefined: Self = StObject.set(x, "TargetCapacityUnitType", js.undefined)
  }
}
