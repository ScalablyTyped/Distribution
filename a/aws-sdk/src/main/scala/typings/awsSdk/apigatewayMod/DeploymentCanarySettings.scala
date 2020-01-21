package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentCanarySettings extends js.Object {
  /**
    * The percentage (0.0-100.0) of traffic routed to the canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.native
  /**
    * A stage variable overrides used for the canary release deployment. They can override existing stage variables or add new stage variables for the canary release deployment. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.native
}

object DeploymentCanarySettings {
  @scala.inline
  def apply(
    percentTraffic: Int | scala.Double = null,
    stageVariableOverrides: MapOfStringToString = null,
    useStageCache: js.UndefOr[scala.Boolean] = js.undefined
  ): DeploymentCanarySettings = {
    val __obj = js.Dynamic.literal()
    if (percentTraffic != null) __obj.updateDynamic("percentTraffic")(percentTraffic.asInstanceOf[js.Any])
    if (stageVariableOverrides != null) __obj.updateDynamic("stageVariableOverrides")(stageVariableOverrides.asInstanceOf[js.Any])
    if (!js.isUndefined(useStageCache)) __obj.updateDynamic("useStageCache")(useStageCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCanarySettings]
  }
}

