package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheParameterGroupsMessage extends js.Object {
  /**
    * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
    */
  var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object CacheParameterGroupsMessage {
  @scala.inline
  def apply(CacheParameterGroups: CacheParameterGroupList = null, Marker: String = null): CacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroups != null) __obj.updateDynamic("CacheParameterGroups")(CacheParameterGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[CacheParameterGroupsMessage]
  }
}

