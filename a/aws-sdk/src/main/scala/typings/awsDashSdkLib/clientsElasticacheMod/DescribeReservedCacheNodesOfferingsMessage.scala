package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
  /**
    * The cache node type filter value. Use this parameter to show only the available offerings matching the specified cache node type. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given duration. Valid Values: 1 | 3 | 31536000 | 94608000 
    */
  var Duration: js.UndefOr[String] = js.undefined
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The offering type filter value. Use this parameter to show only the available offerings matching the specified offering type. Valid Values: "Light Utilization"|"Medium Utilization"|"Heavy Utilization" 
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The product description filter value. Use this parameter to show only the available offerings matching the specified product description.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  /**
    * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
}

object DescribeReservedCacheNodesOfferingsMessage {
  @scala.inline
  def apply(
    CacheNodeType: String = null,
    Duration: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    ReservedCacheNodesOfferingId: String = null
  ): DescribeReservedCacheNodesOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (ReservedCacheNodesOfferingId != null) __obj.updateDynamic("ReservedCacheNodesOfferingId")(ReservedCacheNodesOfferingId)
    __obj.asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
  }
}

