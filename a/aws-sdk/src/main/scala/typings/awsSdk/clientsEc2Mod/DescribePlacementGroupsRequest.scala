package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlacementGroupsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    group-name - The name of the placement group.    group-arn - The Amazon Resource Name (ARN) of the placement group.    spread-level - The spread level for the placement group (host | rack).     state - The state of the placement group (pending | available | deleting | deleted).    strategy - The strategy of the placement group (cluster | spread | partition).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the placement groups.
    */
  var GroupIds: js.UndefOr[PlacementGroupIdStringList] = js.undefined
  
  /**
    * The names of the placement groups. Default: Describes all your placement groups, or only those otherwise specified.
    */
  var GroupNames: js.UndefOr[PlacementGroupStringList] = js.undefined
}
object DescribePlacementGroupsRequest {
  
  inline def apply(): DescribePlacementGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePlacementGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setGroupIds(value: PlacementGroupIdStringList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: PlacementGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value*))
    
    inline def setGroupNames(value: PlacementGroupStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    inline def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    inline def setGroupNamesVarargs(value: PlacementGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value*))
  }
}
