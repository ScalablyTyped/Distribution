package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanarySettings extends js.Object {
  /**
    * The ID of the canary deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The percent (0-100) of traffic diverted to a canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.native
  /**
    * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.native
}

object CanarySettings {
  @scala.inline
  def apply(): CanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanarySettings]
  }
  @scala.inline
  implicit class CanarySettingsOps[Self <: CanarySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setPercentTraffic(value: Double): Self = this.set("percentTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentTraffic: Self = this.set("percentTraffic", js.undefined)
    @scala.inline
    def setStageVariableOverrides(value: MapOfStringToString): Self = this.set("stageVariableOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageVariableOverrides: Self = this.set("stageVariableOverrides", js.undefined)
    @scala.inline
    def setUseStageCache(value: Boolean): Self = this.set("useStageCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStageCache: Self = this.set("useStageCache", js.undefined)
  }
  
}

