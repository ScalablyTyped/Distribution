package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTargets extends js.Object {
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.undefined
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}

object ResolvedTargets {
  @scala.inline
  def apply(ParameterValues: TargetParameterList = null, Truncated: js.UndefOr[Boolean] = js.undefined): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    if (ParameterValues != null) __obj.updateDynamic("ParameterValues")(ParameterValues)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ResolvedTargets]
  }
}

