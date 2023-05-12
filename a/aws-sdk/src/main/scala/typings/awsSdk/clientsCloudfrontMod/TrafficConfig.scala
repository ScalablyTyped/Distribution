package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficConfig extends StObject {
  
  /**
    * Determines which HTTP requests are sent to the staging distribution.
    */
  var SingleHeaderConfig: js.UndefOr[ContinuousDeploymentSingleHeaderConfig] = js.undefined
  
  /**
    * Contains the percentage of traffic to send to the staging distribution.
    */
  var SingleWeightConfig: js.UndefOr[ContinuousDeploymentSingleWeightConfig] = js.undefined
  
  /**
    * The type of traffic configuration.
    */
  var Type: ContinuousDeploymentPolicyType
}
object TrafficConfig {
  
  inline def apply(Type: ContinuousDeploymentPolicyType): TrafficConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficConfig] (val x: Self) extends AnyVal {
    
    inline def setSingleHeaderConfig(value: ContinuousDeploymentSingleHeaderConfig): Self = StObject.set(x, "SingleHeaderConfig", value.asInstanceOf[js.Any])
    
    inline def setSingleHeaderConfigUndefined: Self = StObject.set(x, "SingleHeaderConfig", js.undefined)
    
    inline def setSingleWeightConfig(value: ContinuousDeploymentSingleWeightConfig): Self = StObject.set(x, "SingleWeightConfig", value.asInstanceOf[js.Any])
    
    inline def setSingleWeightConfigUndefined: Self = StObject.set(x, "SingleWeightConfig", js.undefined)
    
    inline def setType(value: ContinuousDeploymentPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
