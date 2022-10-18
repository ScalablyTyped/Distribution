package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * Text of the recommendations that are provided to make an application more recovery resilient.
    */
  var RecommendationText: string
}
object Recommendation {
  
  inline def apply(RecommendationText: string): Recommendation = {
    val __obj = js.Dynamic.literal(RecommendationText = RecommendationText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recommendation]
  }
  
  extension [Self <: Recommendation](x: Self) {
    
    inline def setRecommendationText(value: string): Self = StObject.set(x, "RecommendationText", value.asInstanceOf[js.Any])
  }
}
