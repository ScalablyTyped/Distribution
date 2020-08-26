package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.DescribeVpcsMaxResults
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.String
import typings.awsSdk.ec2Mod.VpcId
import typings.awsSdk.ec2Mod.VpcIdStringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVpcsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeVpcsRequestwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    cidr - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits (for example, /28).    cidr-block-association.cidr-block - An IPv4 CIDR block associated with the VPC.    cidr-block-association.association-id - The association ID for an IPv4 CIDR block associated with the VPC.    cidr-block-association.state - The state of an IPv4 CIDR block associated with the VPC.    dhcp-options-id - The ID of a set of DHCP options.    ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR block associated with the VPC.    ipv6-cidr-block-association.ipv6-pool - The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.    ipv6-cidr-block-association.association-id - The association ID for an IPv6 CIDR block associated with the VPC.    ipv6-cidr-block-association.state - The state of an IPv6 CIDR block associated with the VPC.    isDefault - Indicates whether the VPC is the default VPC.    owner-id - The ID of the AWS account that owns the VPC.    state - The state of the VPC (pending | available).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcsMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more VPC IDs. Default: Describes all your VPCs.
    */
  var VpcIds: js.UndefOr[VpcIdStringList] = js.native
}

object DescribeVpcsRequestwaiter {
  @scala.inline
  def apply(): DescribeVpcsRequestwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcsRequestwaiter]
  }
  @scala.inline
  implicit class DescribeVpcsRequestwaiterOps[Self <: DescribeVpcsRequestwaiter] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: DescribeVpcsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = this.set("VpcIds", js.Array(value :_*))
    @scala.inline
    def setVpcIds(value: VpcIdStringList): Self = this.set("VpcIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcIds: Self = this.set("VpcIds", js.undefined)
  }
  
}

