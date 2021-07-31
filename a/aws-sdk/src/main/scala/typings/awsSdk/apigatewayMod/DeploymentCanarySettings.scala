package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentCanarySettings extends StObject {
  
  /**
    * The percentage (0.0-100.0) of traffic routed to the canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.undefined
  
  /**
    * A stage variable overrides used for the canary release deployment. They can override existing stage variables or add new stage variables for the canary release deployment. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.undefined
}
object DeploymentCanarySettings {
  
  @scala.inline
  def apply(): DeploymentCanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentCanarySettings]
  }
  
  @scala.inline
  implicit class DeploymentCanarySettingsMutableBuilder[Self <: DeploymentCanarySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentTraffic(value: Double): Self = StObject.set(x, "percentTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentTrafficUndefined: Self = StObject.set(x, "percentTraffic", js.undefined)
    
    @scala.inline
    def setStageVariableOverrides(value: MapOfStringToString): Self = StObject.set(x, "stageVariableOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariableOverridesUndefined: Self = StObject.set(x, "stageVariableOverrides", js.undefined)
    
    @scala.inline
    def setUseStageCache(value: Boolean): Self = StObject.set(x, "useStageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStageCacheUndefined: Self = StObject.set(x, "useStageCache", js.undefined)
  }
}
