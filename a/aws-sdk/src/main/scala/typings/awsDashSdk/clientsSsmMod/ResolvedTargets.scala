package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedTargets extends js.Object {
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.native
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.native
}

object ResolvedTargets {
  @scala.inline
  def apply(ParameterValues: TargetParameterList = null, Truncated: js.UndefOr[scala.Boolean] = js.undefined): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    if (ParameterValues != null) __obj.updateDynamic("ParameterValues")(ParameterValues.asInstanceOf[js.Any])
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTargets]
  }
}

