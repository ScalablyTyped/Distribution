package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStrategy extends StObject {
  
  /**
    *  Set to true if the recommendation is set as preferred. 
    */
  var isPreferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The number of application components with this strategy recommendation running on the server. 
    */
  var numberOfApplicationComponents: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Strategy recommendation for the server. 
    */
  var recommendation: js.UndefOr[RecommendationSet] = js.undefined
  
  /**
    *  The recommendation status of the strategy for the server. 
    */
  var status: js.UndefOr[StrategyRecommendation] = js.undefined
}
object ServerStrategy {
  
  inline def apply(): ServerStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStrategy]
  }
  
  extension [Self <: ServerStrategy](x: Self) {
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setNumberOfApplicationComponents(value: Integer): Self = StObject.set(x, "numberOfApplicationComponents", value.asInstanceOf[js.Any])
    
    inline def setNumberOfApplicationComponentsUndefined: Self = StObject.set(x, "numberOfApplicationComponents", js.undefined)
    
    inline def setRecommendation(value: RecommendationSet): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setStatus(value: StrategyRecommendation): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
