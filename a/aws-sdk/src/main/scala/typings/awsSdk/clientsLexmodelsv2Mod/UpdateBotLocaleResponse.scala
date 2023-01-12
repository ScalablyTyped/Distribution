package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotLocaleResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the updated locale.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the locale. When the bot status is Built the locale is ready for use.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The version of the bot that contains the updated locale.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the locale was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The updated description of the locale.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * If the botLocaleStatus is Failed, the failureReasons field lists the errors that occurred while building the bot.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * A timestamp of the date and time that the locale was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale of the updated bot locale.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The updated locale name for the locale.
    */
  var localeName: js.UndefOr[LocaleName] = js.undefined
  
  /**
    * The updated confidence threshold for inserting the AMAZON.FallbackIntent and AMAZON.KendraSearchIntent intents in the list of possible intents for an utterance.
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  /**
    * Recommended actions to take to resolve an error in the failureReasons field.
    */
  var recommendedActions: js.UndefOr[RecommendedActions] = js.undefined
  
  /**
    * The updated Amazon Polly voice to use for voice interaction with the user.
    */
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object UpdateBotLocaleResponse {
  
  inline def apply(): UpdateBotLocaleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBotLocaleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBotLocaleResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotLocaleStatus(value: BotLocaleStatus): Self = StObject.set(x, "botLocaleStatus", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleStatusUndefined: Self = StObject.set(x, "botLocaleStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setLocaleName(value: LocaleName): Self = StObject.set(x, "localeName", value.asInstanceOf[js.Any])
    
    inline def setLocaleNameUndefined: Self = StObject.set(x, "localeName", js.undefined)
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    inline def setRecommendedActions(value: RecommendedActions): Self = StObject.set(x, "recommendedActions", value.asInstanceOf[js.Any])
    
    inline def setRecommendedActionsUndefined: Self = StObject.set(x, "recommendedActions", js.undefined)
    
    inline def setRecommendedActionsVarargs(value: RecommendedAction*): Self = StObject.set(x, "recommendedActions", js.Array(value*))
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
