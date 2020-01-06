package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParameterGroupResponse extends js.Object {
  /**
    * Represents the output of a CreateParameterGroup action.
    */
  var ParameterGroup: js.UndefOr[typings.awsDashSdk.clientsDaxMod.ParameterGroup] = js.native
}

object CreateParameterGroupResponse {
  @scala.inline
  def apply(ParameterGroup: ParameterGroup = null): CreateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ParameterGroup != null) __obj.updateDynamic("ParameterGroup")(ParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupResponse]
  }
}

