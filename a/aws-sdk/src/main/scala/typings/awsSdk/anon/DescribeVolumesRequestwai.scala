package typings.awsSdk.anon

import typings.awsSdk.clientsEc2Mod.Boolean
import typings.awsSdk.clientsEc2Mod.Filter
import typings.awsSdk.clientsEc2Mod.FilterList
import typings.awsSdk.clientsEc2Mod.Integer
import typings.awsSdk.clientsEc2Mod.String
import typings.awsSdk.clientsEc2Mod.VolumeId
import typings.awsSdk.clientsEc2Mod.VolumeIdStringList
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVolumesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeVolumesRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    attachment.attach-time - The time stamp when the attachment initiated.    attachment.delete-on-termination - Whether the volume is deleted on instance termination.    attachment.device - The device name specified in the block device mapping (for example, /dev/sda1).    attachment.instance-id - The ID of the instance the volume is attached to.    attachment.status - The attachment state (attaching | attached | detaching).    availability-zone - The Availability Zone in which the volume was created.    create-time - The time stamp when the volume was created.    encrypted - Indicates whether the volume is encrypted (true | false)    multi-attach-enabled - Indicates whether the volume is enabled for Multi-Attach (true | false)    fast-restored - Indicates whether the volume was created from a snapshot that is enabled for fast snapshot restore (true | false).    size - The size of the volume, in GiB.    snapshot-id - The snapshot from which the volume was created.    status - The state of the volume (creating | available | in-use | deleting | deleted | error).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The volume ID.    volume-type - The Amazon EBS volume type (gp2 | gp3 | io1 | io2 | st1 | sc1| standard)  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of volumes to return for this request. This value can be between 5 and 500; if you specify a value larger than 500, only 500 items are returned. If this parameter is not used, then all items are returned. You cannot specify this parameter and the volume IDs parameter in the same request. For more information, see Pagination.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token returned from a previous paginated request. Pagination continues from the end of the items returned from the previous request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The volume IDs.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined
}
object DescribeVolumesRequestwai {
  
  inline def apply(): DescribeVolumesRequestwai = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequestwai]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVolumesRequestwai] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
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
