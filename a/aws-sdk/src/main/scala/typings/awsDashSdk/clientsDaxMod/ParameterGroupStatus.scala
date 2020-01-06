package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupStatus extends js.Object {
  /**
    * The node IDs of one or more nodes to be rebooted.
    */
  var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.native
  /**
    * The status of parameter updates. 
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ParameterGroupStatus {
  @scala.inline
  def apply(
    NodeIdsToReboot: NodeIdentifierList = null,
    ParameterApplyStatus: String = null,
    ParameterGroupName: String = null
  ): ParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (NodeIdsToReboot != null) __obj.updateDynamic("NodeIdsToReboot")(NodeIdsToReboot.asInstanceOf[js.Any])
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus.asInstanceOf[js.Any])
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupStatus]
  }
}

