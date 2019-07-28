package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSubnetGroupMessage extends js.Object {
  /**
    * A list of cache subnet groups. Each element in the list contains detailed information about one group.
    */
  var CacheSubnetGroups: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheSubnetGroups] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object CacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroups: CacheSubnetGroups = null, Marker: String = null): CacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroups != null) __obj.updateDynamic("CacheSubnetGroups")(CacheSubnetGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[CacheSubnetGroupMessage]
  }
}

