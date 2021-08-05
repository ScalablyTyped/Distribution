package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.Integer
import typings.awsSdk.ec2Mod.SpotInstanceRequestId
import typings.awsSdk.ec2Mod.SpotInstanceRequestIdList
import typings.awsSdk.ec2Mod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSpotInstanceRequestsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeSpotInstanceReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    availability-zone-group - The Availability Zone group.    create-time - The time stamp when the Spot Instance request was created.    fault-code - The fault code related to the request.    fault-message - The fault message related to the request.    instance-id - The ID of the instance that fulfilled the request.    launch-group - The Spot Instance launch group.    launch.block-device-mapping.delete-on-termination - Indicates whether the EBS volume is deleted on instance termination.    launch.block-device-mapping.device-name - The device name for the volume in the block device mapping (for example, /dev/sdh or xvdh).    launch.block-device-mapping.snapshot-id - The ID of the snapshot for the EBS volume.    launch.block-device-mapping.volume-size - The size of the EBS volume, in GiB.    launch.block-device-mapping.volume-type - The type of EBS volume: gp2 for General Purpose SSD, io1 or io2 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1for Cold HDD, or standard for Magnetic.    launch.group-id - The ID of the security group for the instance.    launch.group-name - The name of the security group for the instance.    launch.image-id - The ID of the AMI.    launch.instance-type - The type of instance (for example, m3.medium).    launch.kernel-id - The kernel ID.    launch.key-name - The name of the key pair the instance launched with.    launch.monitoring-enabled - Whether detailed monitoring is enabled for the Spot Instance.    launch.ramdisk-id - The RAM disk ID.    launched-availability-zone - The Availability Zone in which the request is launched.    network-interface.addresses.primary - Indicates whether the IP address is the primary private IP address.    network-interface.delete-on-termination - Indicates whether the network interface is deleted when the instance is terminated.    network-interface.description - A description of the network interface.    network-interface.device-index - The index of the device for the network interface attachment on the instance.    network-interface.group-id - The ID of the security group associated with the network interface.    network-interface.network-interface-id - The ID of the network interface.    network-interface.private-ip-address - The primary private IP address of the network interface.    network-interface.subnet-id - The ID of the subnet for the instance.    product-description - The product description associated with the instance (Linux/UNIX | Windows).    spot-instance-request-id - The Spot Instance request ID.    spot-price - The maximum hourly price for any Spot Instance launched to fulfill the request.    state - The state of the Spot Instance request (open | active | closed | cancelled | failed). Spot request status information can help you track your Amazon EC2 Spot Instance requests. For more information, see Spot request status in the Amazon EC2 User Guide for Linux Instances.    status-code - The short code describing the most recent evaluation of your Spot Instance request.    status-message - The message explaining the status of the Spot Instance request.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of Spot Instance request (one-time | persistent).    valid-from - The start date of the request.    valid-until - The end date of the request.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token to request the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more Spot Instance request IDs.
    */
  var SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList] = js.undefined
}
object DescribeSpotInstanceReque {
  
  inline def apply(): DescribeSpotInstanceReque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotInstanceReque]
  }
  
  extension [Self <: DescribeSpotInstanceReque](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotInstanceRequestIds(value: SpotInstanceRequestIdList): Self = StObject.set(x, "SpotInstanceRequestIds", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestIdsUndefined: Self = StObject.set(x, "SpotInstanceRequestIds", js.undefined)
    
    inline def setSpotInstanceRequestIdsVarargs(value: SpotInstanceRequestId*): Self = StObject.set(x, "SpotInstanceRequestIds", js.Array(value :_*))
  }
}
