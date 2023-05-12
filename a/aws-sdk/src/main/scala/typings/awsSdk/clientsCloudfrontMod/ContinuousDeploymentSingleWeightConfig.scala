package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentSingleWeightConfig extends StObject {
  
  var SessionStickinessConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.SessionStickinessConfig] = js.undefined
  
  /**
    * The percentage of traffic to send to a staging distribution, expressed as a decimal number between 0 and .15.
    */
  var Weight: float
}
object ContinuousDeploymentSingleWeightConfig {
  
  inline def apply(Weight: float): ContinuousDeploymentSingleWeightConfig = {
    val __obj = js.Dynamic.literal(Weight = Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentSingleWeightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentSingleWeightConfig] (val x: Self) extends AnyVal {
    
    inline def setSessionStickinessConfig(value: SessionStickinessConfig): Self = StObject.set(x, "SessionStickinessConfig", value.asInstanceOf[js.Any])
    
    inline def setSessionStickinessConfigUndefined: Self = StObject.set(x, "SessionStickinessConfig", js.undefined)
    
    inline def setWeight(value: float): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
