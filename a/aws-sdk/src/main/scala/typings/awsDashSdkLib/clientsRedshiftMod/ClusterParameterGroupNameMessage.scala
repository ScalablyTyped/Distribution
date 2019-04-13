package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
}

object ClusterParameterGroupNameMessage {
  @scala.inline
  def apply(ParameterGroupName: String = null, ParameterGroupStatus: String = null): ClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    if (ParameterGroupStatus != null) __obj.updateDynamic("ParameterGroupStatus")(ParameterGroupStatus)
    __obj.asInstanceOf[ClusterParameterGroupNameMessage]
  }
}

