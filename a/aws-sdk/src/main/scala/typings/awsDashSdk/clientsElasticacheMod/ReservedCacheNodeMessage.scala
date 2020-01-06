package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedCacheNodeMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
    */
  var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.native
}

object ReservedCacheNodeMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedCacheNodes: ReservedCacheNodeList = null): ReservedCacheNodeMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReservedCacheNodes != null) __obj.updateDynamic("ReservedCacheNodes")(ReservedCacheNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedCacheNodeMessage]
  }
}

