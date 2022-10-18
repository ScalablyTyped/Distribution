package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobStrategyConfig extends StObject {
  
  /**
    * The configuration for the object that specifies the Hyperband strategy. This parameter is only supported for the Hyperband selection for Strategy within the HyperParameterTuningJobConfig API.
    */
  var HyperbandStrategyConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperbandStrategyConfig] = js.undefined
}
object HyperParameterTuningJobStrategyConfig {
  
  inline def apply(): HyperParameterTuningJobStrategyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobStrategyConfig]
  }
  
  extension [Self <: HyperParameterTuningJobStrategyConfig](x: Self) {
    
    inline def setHyperbandStrategyConfig(value: HyperbandStrategyConfig): Self = StObject.set(x, "HyperbandStrategyConfig", value.asInstanceOf[js.Any])
    
    inline def setHyperbandStrategyConfigUndefined: Self = StObject.set(x, "HyperbandStrategyConfig", js.undefined)
  }
}
