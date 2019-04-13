package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
  /**
    * The number of cache node instances to reserve. Default: 1 
    */
  var CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A customer-specified identifier to track this reservation.  The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this parameter is not specified, ElastiCache automatically generates an identifier for the reservation.  Example: myreservationID
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the reserved cache node offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
    */
  var ReservedCacheNodesOfferingId: String
}

object PurchaseReservedCacheNodesOfferingMessage {
  @scala.inline
  def apply(
    ReservedCacheNodesOfferingId: String,
    CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined,
    ReservedCacheNodeId: String = null
  ): PurchaseReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedCacheNodesOfferingId = ReservedCacheNodesOfferingId)
    if (!js.isUndefined(CacheNodeCount)) __obj.updateDynamic("CacheNodeCount")(CacheNodeCount)
    if (ReservedCacheNodeId != null) __obj.updateDynamic("ReservedCacheNodeId")(ReservedCacheNodeId)
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
  }
}

