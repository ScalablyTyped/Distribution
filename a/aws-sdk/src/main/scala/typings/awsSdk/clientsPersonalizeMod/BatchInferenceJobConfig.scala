package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchInferenceJobConfig extends StObject {
  
  /**
    * A string to string map specifying the exploration configuration hyperparameters, including explorationWeight and explorationItemAgeCutOff, you want to use to configure the amount of item exploration Amazon Personalize uses when recommending items. See User-Personalization.
    */
  var itemExplorationConfig: js.UndefOr[HyperParameters] = js.undefined
}
object BatchInferenceJobConfig {
  
  inline def apply(): BatchInferenceJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchInferenceJobConfig]
  }
  
  extension [Self <: BatchInferenceJobConfig](x: Self) {
    
    inline def setItemExplorationConfig(value: HyperParameters): Self = StObject.set(x, "itemExplorationConfig", value.asInstanceOf[js.Any])
    
    inline def setItemExplorationConfigUndefined: Self = StObject.set(x, "itemExplorationConfig", js.undefined)
  }
}
