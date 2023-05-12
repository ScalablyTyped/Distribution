package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesModificationsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    modification-state - The current modification state (modifying | optimizing | completed | failed).    original-iops - The original IOPS rate of the volume.    original-size - The original size of the volume, in GiB.    original-volume-type - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).    originalMultiAttachEnabled - Indicates whether Multi-Attach support was enabled (true | false).    start-time - The modification start time.    target-iops - The target IOPS rate of the volume.    target-size - The target size of the volume, in GiB.    target-volume-type - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).    targetMultiAttachEnabled - Indicates whether Multi-Attach support is to be enabled (true | false).    volume-id - The ID of the volume.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results (up to a limit of 500) to be returned in a paginated request. For more information, see Pagination.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token returned by a previous paginated request. Pagination continues from the end of the items returned by the previous request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the volumes.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined
}
object DescribeVolumesModificationsRequest {
  
  inline def apply(): DescribeVolumesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesModificationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVolumesModificationsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumeIds(value: VolumeIdStringList): Self = StObject.set(x, "VolumeIds", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdsUndefined: Self = StObject.set(x, "VolumeIds", js.undefined)
    
    inline def setVolumeIdsVarargs(value: VolumeId*): Self = StObject.set(x, "VolumeIds", js.Array(value*))
  }
}
