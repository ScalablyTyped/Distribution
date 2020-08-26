package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.Integer
import typings.awsSdk.ec2Mod.String
import typings.awsSdk.ec2Mod.VolumeId
import typings.awsSdk.ec2Mod.VolumeIdStringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVolumesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeVolumesRequestwai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    attachment.attach-time - The time stamp when the attachment initiated.    attachment.delete-on-termination - Whether the volume is deleted on instance termination.    attachment.device - The device name specified in the block device mapping (for example, /dev/sda1).    attachment.instance-id - The ID of the instance the volume is attached to.    attachment.status - The attachment state (attaching | attached | detaching).    availability-zone - The Availability Zone in which the volume was created.    create-time - The time stamp when the volume was created.    encrypted - Indicates whether the volume is encrypted (true | false)    multi-attach-enabled - Indicates whether the volume is enabled for Multi-Attach (true | false)    fast-restored - Indicates whether the volume was created from a snapshot that is enabled for fast snapshot restore (true | false).    size - The size of the volume, in GiB.    snapshot-id - The snapshot from which the volume was created.    status - The status of the volume (creating | available | in-use | deleting | deleted | error).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The volume ID.    volume-type - The Amazon EBS volume type. This can be gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of volume results returned by DescribeVolumes in paginated output. When this parameter is used, DescribeVolumes only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another DescribeVolumes request with the returned NextToken value. This value can be between 5 and 500; if MaxResults is given a value larger than 500, only 500 results are returned. If this parameter is not used, then DescribeVolumes returns all results. You cannot specify this parameter and the volume IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The NextToken value returned from a previous paginated DescribeVolumes request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The volume IDs.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}

object DescribeVolumesRequestwai {
  @scala.inline
  def apply(): DescribeVolumesRequestwai = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequestwai]
  }
  @scala.inline
  implicit class DescribeVolumesRequestwaiOps[Self <: DescribeVolumesRequestwai] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVolumeIdsVarargs(value: VolumeId*): Self = this.set("VolumeIds", js.Array(value :_*))
    @scala.inline
    def setVolumeIds(value: VolumeIdStringList): Self = this.set("VolumeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeIds: Self = this.set("VolumeIds", js.undefined)
  }
  
}

