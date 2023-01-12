package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommenderConfig extends StObject {
  
  /**
    * Specifies the exploration configuration hyperparameters, including explorationWeight and explorationItemAgeCutOff, you want to use to configure the amount of item exploration Amazon Personalize uses when recommending items. Provide itemExplorationConfig data only if your recommenders generate personalized recommendations for a user (not popular items or similar items).
    */
  var itemExplorationConfig: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will support.
    */
  var minRecommendationRequestsPerSecond: js.UndefOr[TransactionsPerSecond] = js.undefined
}
object RecommenderConfig {
  
  inline def apply(): RecommenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommenderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommenderConfig] (val x: Self) extends AnyVal {
    
    inline def setItemExplorationConfig(value: HyperParameters): Self = StObject.set(x, "itemExplorationConfig", value.asInstanceOf[js.Any])
    
    inline def setItemExplorationConfigUndefined: Self = StObject.set(x, "itemExplorationConfig", js.undefined)
    
    inline def setMinRecommendationRequestsPerSecond(value: TransactionsPerSecond): Self = StObject.set(x, "minRecommendationRequestsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMinRecommendationRequestsPerSecondUndefined: Self = StObject.set(x, "minRecommendationRequestsPerSecond", js.undefined)
  }
}
