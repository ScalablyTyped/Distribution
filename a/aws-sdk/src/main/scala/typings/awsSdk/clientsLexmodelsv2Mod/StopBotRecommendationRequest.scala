package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBotRecommendationRequest extends StObject {
  
  /**
    * The unique identifier of the bot containing the bot recommendation to be stopped.
    */
  var botId: Id
  
  /**
    * The unique identifier of the bot recommendation to be stopped.
    */
  var botRecommendationId: Id
  
  /**
    * The version of the bot containing the bot recommendation.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale of the bot recommendation to stop. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: LocaleId
}
object StopBotRecommendationRequest {
  
  inline def apply(botId: Id, botRecommendationId: Id, botVersion: DraftBotVersion, localeId: LocaleId): StopBotRecommendationRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBotRecommendationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopBotRecommendationRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
