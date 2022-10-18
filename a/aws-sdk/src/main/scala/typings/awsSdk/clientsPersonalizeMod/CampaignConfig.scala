package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignConfig extends StObject {
  
  /**
    * Specifies the exploration configuration hyperparameters, including explorationWeight and explorationItemAgeCutOff, you want to use to configure the amount of item exploration Amazon Personalize uses when recommending items. Provide itemExplorationConfig data only if your solution uses the User-Personalization recipe.
    */
  var itemExplorationConfig: js.UndefOr[HyperParameters] = js.undefined
}
object CampaignConfig {
  
  inline def apply(): CampaignConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignConfig]
  }
  
  extension [Self <: CampaignConfig](x: Self) {
    
    inline def setItemExplorationConfig(value: HyperParameters): Self = StObject.set(x, "itemExplorationConfig", value.asInstanceOf[js.Any])
    
    inline def setItemExplorationConfigUndefined: Self = StObject.set(x, "itemExplorationConfig", js.undefined)
  }
}
