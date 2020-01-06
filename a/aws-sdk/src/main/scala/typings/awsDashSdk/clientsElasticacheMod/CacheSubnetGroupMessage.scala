package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSubnetGroupMessage extends js.Object {
  /**
    * A list of cache subnet groups. Each element in the list contains detailed information about one group.
    */
  var CacheSubnetGroups: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheSubnetGroups] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroups: CacheSubnetGroups = null, Marker: String = null): CacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroups != null) __obj.updateDynamic("CacheSubnetGroups")(CacheSubnetGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSubnetGroupMessage]
  }
}

