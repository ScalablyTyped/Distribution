package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopActivationConfig extends StObject {
  
  /**
    * Container structure for defining under what conditions SageMaker creates a human loop.
    */
  var HumanLoopActivationConditionsConfig: typings.awsSdk.clientsSagemakerMod.HumanLoopActivationConditionsConfig
}
object HumanLoopActivationConfig {
  
  inline def apply(HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig): HumanLoopActivationConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditionsConfig = HumanLoopActivationConditionsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConfig]
  }
  
  extension [Self <: HumanLoopActivationConfig](x: Self) {
    
    inline def setHumanLoopActivationConditionsConfig(value: HumanLoopActivationConditionsConfig): Self = StObject.set(x, "HumanLoopActivationConditionsConfig", value.asInstanceOf[js.Any])
  }
}
