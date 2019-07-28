package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesOfferingsRequest extends js.Object {
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    availability-zone - The Availability Zone where the Reserved Instance can be used.    duration - The duration of the Reserved Instance (for example, one year or three years), in seconds (31536000 | 94608000).    fixed-price - The purchase price of the Reserved Instance (for example, 9800.0).    instance-type - The instance type that is covered by the reservation.    marketplace - Set to true to show only Reserved Instance Marketplace offerings. When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance Marketplace are listed.    product-description - The Reserved Instance product platform description. Instances that include (Amazon VPC) in the product platform description will only be displayed to EC2-Classic account holders and are for use with Amazon VPC. (Linux/UNIX | Linux/UNIX (Amazon VPC) | SUSE Linux | SUSE Linux (Amazon VPC) | Red Hat Enterprise Linux | Red Hat Enterprise Linux (Amazon VPC) | Windows | Windows (Amazon VPC) | Windows with SQL Server Standard | Windows with SQL Server Standard (Amazon VPC) | Windows with SQL Server Web |  Windows with SQL Server Web (Amazon VPC) | Windows with SQL Server Enterprise | Windows with SQL Server Enterprise (Amazon VPC))     reserved-instances-offering-id - The Reserved Instances offering ID.    scope - The scope of the Reserved Instance (Availability Zone or Region).    usage-price - The usage price of the Reserved Instance, per hour (for example, 0.84).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * Include Reserved Instance Marketplace offerings in the response.
    */
  var IncludeMarketplace: js.UndefOr[Boolean] = js.undefined
  /**
    * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of dedicated is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).  Important: The host value cannot be used with this parameter. Use the default or dedicated values only. Default: default 
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
  /**
    * The instance type that the reservation will cover (for example, m1.small). For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceType] = js.undefined
  /**
    * The maximum duration (in seconds) to filter when searching for offerings. Default: 94608000 (3 years)
    */
  var MaxDuration: js.UndefOr[Long] = js.undefined
  /**
    * The maximum number of instances to filter when searching for offerings. Default: 20
    */
  var MaxInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. The maximum is 100. Default: 100
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The minimum duration (in seconds) to filter when searching for offerings. Default: 2592000 (1 month)
    */
  var MinDuration: js.UndefOr[Long] = js.undefined
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The offering class of the Reserved Instance. Can be standard or convertible.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.undefined
  /**
    * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only have access to the Medium Utilization Reserved Instance offering type. 
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined
  /**
    * The Reserved Instance product platform description. Instances that include (Amazon VPC) in the description are for use with Amazon VPC.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.undefined
  /**
    * One or more Reserved Instances offering IDs.
    */
  var ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList] = js.undefined
}

object DescribeReservedInstancesOfferingsRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    IncludeMarketplace: js.UndefOr[Boolean] = js.undefined,
    InstanceTenancy: Tenancy = null,
    InstanceType: InstanceType = null,
    MaxDuration: js.UndefOr[Long] = js.undefined,
    MaxInstanceCount: js.UndefOr[Integer] = js.undefined,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    MinDuration: js.UndefOr[Long] = js.undefined,
    NextToken: String = null,
    OfferingClass: OfferingClassType = null,
    OfferingType: OfferingTypeValues = null,
    ProductDescription: RIProductDescription = null,
    ReservedInstancesOfferingIds: ReservedInstancesOfferingIdStringList = null
  ): DescribeReservedInstancesOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(IncludeMarketplace)) __obj.updateDynamic("IncludeMarketplace")(IncludeMarketplace)
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxDuration)) __obj.updateDynamic("MaxDuration")(MaxDuration)
    if (!js.isUndefined(MaxInstanceCount)) __obj.updateDynamic("MaxInstanceCount")(MaxInstanceCount)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (!js.isUndefined(MinDuration)) __obj.updateDynamic("MinDuration")(MinDuration)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OfferingClass != null) __obj.updateDynamic("OfferingClass")(OfferingClass.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (ReservedInstancesOfferingIds != null) __obj.updateDynamic("ReservedInstancesOfferingIds")(ReservedInstancesOfferingIds)
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsRequest]
  }
}

