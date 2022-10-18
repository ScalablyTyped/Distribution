package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationComponentStrategy extends StObject {
  
  /**
    *  Set to true if the recommendation is set as preferred. 
    */
  var isPreferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Strategy recommendation for the application component. 
    */
  var recommendation: js.UndefOr[RecommendationSet] = js.undefined
  
  /**
    *  The recommendation status of a strategy for an application component. 
    */
  var status: js.UndefOr[StrategyRecommendation] = js.undefined
}
object ApplicationComponentStrategy {
  
  inline def apply(): ApplicationComponentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponentStrategy]
  }
  
  extension [Self <: ApplicationComponentStrategy](x: Self) {
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setRecommendation(value: RecommendationSet): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setStatus(value: StrategyRecommendation): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
