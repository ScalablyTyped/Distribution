package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedCacheNodeMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
    */
  var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
}

object ReservedCacheNodeMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedCacheNodes: ReservedCacheNodeList = null): ReservedCacheNodeMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedCacheNodes != null) __obj.updateDynamic("ReservedCacheNodes")(ReservedCacheNodes)
    __obj.asInstanceOf[ReservedCacheNodeMessage]
  }
}

