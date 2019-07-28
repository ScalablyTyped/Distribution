package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
  var ReservedCacheNode: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ReservedCacheNode] = js.undefined
}

object PurchaseReservedCacheNodesOfferingResult {
  @scala.inline
  def apply(ReservedCacheNode: ReservedCacheNode = null): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedCacheNode != null) __obj.updateDynamic("ReservedCacheNode")(ReservedCacheNode)
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
}

