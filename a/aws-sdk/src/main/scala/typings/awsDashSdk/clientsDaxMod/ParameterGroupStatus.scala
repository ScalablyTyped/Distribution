package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupStatus extends js.Object {
  /**
    * The node IDs of one or more nodes to be rebooted.
    */
  var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.undefined
  /**
    * The status of parameter updates. 
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}

object ParameterGroupStatus {
  @scala.inline
  def apply(
    NodeIdsToReboot: NodeIdentifierList = null,
    ParameterApplyStatus: String = null,
    ParameterGroupName: String = null
  ): ParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (NodeIdsToReboot != null) __obj.updateDynamic("NodeIdsToReboot")(NodeIdsToReboot)
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus)
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    __obj.asInstanceOf[ParameterGroupStatus]
  }
}

