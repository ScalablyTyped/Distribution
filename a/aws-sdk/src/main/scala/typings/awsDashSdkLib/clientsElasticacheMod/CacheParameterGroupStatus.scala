package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheParameterGroupStatus extends js.Object {
  /**
    * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
}

object CacheParameterGroupStatus {
  @scala.inline
  def apply(
    CacheNodeIdsToReboot: CacheNodeIdsList = null,
    CacheParameterGroupName: String = null,
    ParameterApplyStatus: String = null
  ): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeIdsToReboot != null) __obj.updateDynamic("CacheNodeIdsToReboot")(CacheNodeIdsToReboot)
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName)
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus)
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
}

