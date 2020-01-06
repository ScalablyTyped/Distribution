package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupsMessage extends js.Object {
  /**
    * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
    */
  var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheParameterGroupsMessage {
  @scala.inline
  def apply(CacheParameterGroups: CacheParameterGroupList = null, Marker: String = null): CacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroups != null) __obj.updateDynamic("CacheParameterGroups")(CacheParameterGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheParameterGroupsMessage]
  }
}

