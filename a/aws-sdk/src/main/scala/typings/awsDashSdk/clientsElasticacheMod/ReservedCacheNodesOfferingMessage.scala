package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedCacheNodesOfferingMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of reserved cache node offerings. Each element in the list contains detailed information about one offering.
    */
  var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined
}

object ReservedCacheNodesOfferingMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedCacheNodesOfferings: ReservedCacheNodesOfferingList = null): ReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedCacheNodesOfferings != null) __obj.updateDynamic("ReservedCacheNodesOfferings")(ReservedCacheNodesOfferings)
    __obj.asInstanceOf[ReservedCacheNodesOfferingMessage]
  }
}

