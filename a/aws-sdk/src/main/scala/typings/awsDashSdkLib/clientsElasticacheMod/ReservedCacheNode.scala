package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedCacheNode extends js.Object {
  /**
    * The number of cache nodes that have been reserved.
    */
  var CacheNodeCount: js.UndefOr[Integer] = js.undefined
  /**
    * The cache node type for the reserved cache nodes. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The fixed price charged for this reserved cache node.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The offering type of this reserved cache node.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The description of the reserved cache node.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  /**
    * The recurring price charged to run this reserved cache node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the reserved cache node. Example: arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582 
    */
  var ReservationARN: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier for the reservation.
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
  /**
    * The offering identifier.
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The state of the reserved cache node.
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The hourly price charged for this reserved cache node.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedCacheNode {
  @scala.inline
  def apply(
    CacheNodeCount: js.UndefOr[Integer] = js.undefined,
    CacheNodeType: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservationARN: String = null,
    ReservedCacheNodeId: String = null,
    ReservedCacheNodesOfferingId: String = null,
    StartTime: TStamp = null,
    State: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedCacheNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CacheNodeCount)) __obj.updateDynamic("CacheNodeCount")(CacheNodeCount)
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservationARN != null) __obj.updateDynamic("ReservationARN")(ReservationARN)
    if (ReservedCacheNodeId != null) __obj.updateDynamic("ReservedCacheNodeId")(ReservedCacheNodeId)
    if (ReservedCacheNodesOfferingId != null) __obj.updateDynamic("ReservedCacheNodesOfferingId")(ReservedCacheNodesOfferingId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedCacheNode]
  }
}

