package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanarySettings extends StObject {
  
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
  
  inline def apply(): CanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanarySettings]
  }
  
  extension [Self <: CanarySettings](x: Self) {
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setPercentTraffic(value: Double): Self = StObject.set(x, "percentTraffic", value.asInstanceOf[js.Any])
    
    inline def setPercentTrafficUndefined: Self = StObject.set(x, "percentTraffic", js.undefined)
    
    inline def setStageVariableOverrides(value: MapOfStringToString): Self = StObject.set(x, "stageVariableOverrides", value.asInstanceOf[js.Any])
    
    inline def setStageVariableOverridesUndefined: Self = StObject.set(x, "stageVariableOverrides", js.undefined)
    
    inline def setUseStageCache(value: Boolean): Self = StObject.set(x, "useStageCache", value.asInstanceOf[js.Any])
    
    inline def setUseStageCacheUndefined: Self = StObject.set(x, "useStageCache", js.undefined)
  }
}
