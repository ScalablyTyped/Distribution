package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedCacheNodesOffering extends js.Object {
  /**
    * The cache node type for the reserved cache node. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * The duration of the offering. in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The cache engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  /**
    * The recurring price charged to run this reserved cache node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * A unique identifier for the reserved cache node offering.
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedCacheNodesOffering {
  @scala.inline
  def apply(
    CacheNodeType: String = null,
    Duration: Int | scala.Double = null,
    FixedPrice: Int | scala.Double = null,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedCacheNodesOfferingId: String = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedCacheNodesOffering = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedCacheNodesOfferingId != null) __obj.updateDynamic("ReservedCacheNodesOfferingId")(ReservedCacheNodesOfferingId)
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedCacheNodesOffering]
  }
}

