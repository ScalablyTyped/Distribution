package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFastLaunchImagesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use the following filters to streamline results.    resource-type - The resource type for pre-provisioning.    launch-template - The launch template that is associated with the pre-provisioned Windows AMI.    owner-id - The owner ID for the pre-provisioning resource.    state - The current state of fast launching for the Windows AMI.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Details for one or more Windows AMI image IDs.
    */
  var ImageIds: js.UndefOr[FastLaunchImageIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another request with the returned NextToken value. If this parameter is not specified, then all results are returned.
    */
  var MaxResults: js.UndefOr[DescribeFastLaunchImagesRequestMaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeFastLaunchImagesRequest {
  
  inline def apply(): DescribeFastLaunchImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastLaunchImagesRequest]
  }
  
  extension [Self <: DescribeFastLaunchImagesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setImageIds(value: FastLaunchImageIdList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: ImageId*): Self = StObject.set(x, "ImageIds", js.Array(value*))
    
    inline def setMaxResults(value: DescribeFastLaunchImagesRequestMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
