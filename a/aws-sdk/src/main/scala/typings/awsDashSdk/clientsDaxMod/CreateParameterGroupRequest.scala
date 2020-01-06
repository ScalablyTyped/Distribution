package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParameterGroupRequest extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group to apply to all of the clusters in this replication group.
    */
  var ParameterGroupName: String = js.native
}

object CreateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String, Description: String = null): CreateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupRequest]
  }
}

