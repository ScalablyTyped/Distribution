package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBotRecommendationResponse extends StObject {
  
  /**
    * The unique identifier of the bot containing the bot recommendation that is being stopped.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The unique identifier of the bot recommendation that is being stopped.
    */
  var botRecommendationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the bot recommendation. If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
    */
  var botRecommendationStatus: js.UndefOr[BotRecommendationStatus] = js.undefined
  
  /**
    * The version of the bot containing the recommendation that is being stopped.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The identifier of the language and locale of the bot response to stop. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
}
object StopBotRecommendationResponse {
  
  inline def apply(): StopBotRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBotRecommendationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopBotRecommendationResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationIdUndefined: Self = StObject.set(x, "botRecommendationId", js.undefined)
    
    inline def setBotRecommendationStatus(value: BotRecommendationStatus): Self = StObject.set(x, "botRecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationStatusUndefined: Self = StObject.set(x, "botRecommendationStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
  }
}
