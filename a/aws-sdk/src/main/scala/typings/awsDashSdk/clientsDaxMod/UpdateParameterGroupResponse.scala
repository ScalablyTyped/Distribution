package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParameterGroupResponse extends js.Object {
  /**
    * The parameter group that has been modified.
    */
  var ParameterGroup: js.UndefOr[typings.awsDashSdk.clientsDaxMod.ParameterGroup] = js.undefined
}

object UpdateParameterGroupResponse {
  @scala.inline
  def apply(ParameterGroup: ParameterGroup = null): UpdateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ParameterGroup != null) __obj.updateDynamic("ParameterGroup")(ParameterGroup)
    __obj.asInstanceOf[UpdateParameterGroupResponse]
  }
}

