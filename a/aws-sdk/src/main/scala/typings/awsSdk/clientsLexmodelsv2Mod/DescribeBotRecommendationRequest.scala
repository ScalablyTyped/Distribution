package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotRecommendationRequest extends StObject {
  
  /**
    * The unique identifier of the bot associated with the bot recommendation.
    */
  var botId: Id
  
  /**
    * The identifier of the bot recommendation to describe.
    */
  var botRecommendationId: Id
  
  /**
    * The version of the bot associated with the bot recommendation.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale of the bot recommendation to describe. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
}
object DescribeBotRecommendationRequest {
  
  inline def apply(botId: Id, botRecommendationId: Id, botVersion: DraftBotVersion, localeId: LocaleId): DescribeBotRecommendationRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBotRecommendationRequest]
  }
  
  extension [Self <: DescribeBotRecommendationRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
