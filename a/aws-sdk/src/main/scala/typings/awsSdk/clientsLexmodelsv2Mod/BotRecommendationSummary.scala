package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotRecommendationSummary extends StObject {
  
  /**
    * The unique identifier of the bot recommendation to be updated.
    */
  var botRecommendationId: Id
  
  /**
    * The status of the bot recommendation. If the status is Failed, then the reasons for the failure are listed in the failureReasons field. 
    */
  var botRecommendationStatus: BotRecommendationStatus
  
  /**
    * A timestamp of the date and time that the bot recommendation was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot recommendation was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
}
object BotRecommendationSummary {
  
  inline def apply(botRecommendationId: Id, botRecommendationStatus: BotRecommendationStatus): BotRecommendationSummary = {
    val __obj = js.Dynamic.literal(botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botRecommendationStatus = botRecommendationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotRecommendationSummary]
  }
  
  extension [Self <: BotRecommendationSummary](x: Self) {
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationStatus(value: BotRecommendationStatus): Self = StObject.set(x, "botRecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
  }
}
