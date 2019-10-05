package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanarySettings extends js.Object {
  /**
    * The ID of the canary deployment.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  /**
    * The percent (0-100) of traffic diverted to a canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.undefined
  /**
    * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.undefined
}

object CanarySettings {
  @scala.inline
  def apply(
    deploymentId: String = null,
    percentTraffic: Int | scala.Double = null,
    stageVariableOverrides: MapOfStringToString = null,
    useStageCache: js.UndefOr[scala.Boolean] = js.undefined
  ): CanarySettings = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (percentTraffic != null) __obj.updateDynamic("percentTraffic")(percentTraffic.asInstanceOf[js.Any])
    if (stageVariableOverrides != null) __obj.updateDynamic("stageVariableOverrides")(stageVariableOverrides)
    if (!js.isUndefined(useStageCache)) __obj.updateDynamic("useStageCache")(useStageCache)
    __obj.asInstanceOf[CanarySettings]
  }
}

