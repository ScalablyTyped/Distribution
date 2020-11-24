package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DeploymentCanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentCanarySettings]
  }
  
  @scala.inline
  implicit class DeploymentCanarySettingsOps[Self <: DeploymentCanarySettings] (val x: Self) extends AnyVal {
    
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
