package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotLocaleResponse extends StObject {
  
  /**
    * The identifier of the bot associated with the locale.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
    */
  var botLocaleHistoryEvents: js.UndefOr[BotLocaleHistoryEventsList] = js.undefined
  
  /**
    * The status of the bot. If the status is Failed, the reasons for the failure are listed in the failureReasons field.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The identifier of the version of the bot associated with the locale.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The date and time that the locale was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the locale.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * if botLocaleStatus is Failed, Amazon Lex explains why it failed to build the bot.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * The number of intents defined for the locale.
    */
  var intentsCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The date and time that the locale was last submitted for building.
    */
  var lastBuildSubmittedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the locale was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the described locale.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The name of the locale.
    */
  var localeName: js.UndefOr[LocaleName] = js.undefined
  
  /**
    * The confidence threshold where Amazon Lex inserts the AMAZON.FallbackIntent and AMAZON.KendraSearchIntent intents in the list of possible intents for an utterance.
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  /**
    * Recommended actions to take to resolve an error in the failureReasons field.
    */
  var recommendedActions: js.UndefOr[RecommendedActions] = js.undefined
  
  /**
    * The number of slot types defined for the locale.
    */
  var slotTypesCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
    */
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object DescribeBotLocaleResponse {
  
  inline def apply(): DescribeBotLocaleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBotLocaleResponse]
  }
  
  extension [Self <: DescribeBotLocaleResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotLocaleHistoryEvents(value: BotLocaleHistoryEventsList): Self = StObject.set(x, "botLocaleHistoryEvents", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleHistoryEventsUndefined: Self = StObject.set(x, "botLocaleHistoryEvents", js.undefined)
    
    inline def setBotLocaleHistoryEventsVarargs(value: BotLocaleHistoryEvent*): Self = StObject.set(x, "botLocaleHistoryEvents", js.Array(value*))
    
    inline def setBotLocaleStatus(value: BotLocaleStatus): Self = StObject.set(x, "botLocaleStatus", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleStatusUndefined: Self = StObject.set(x, "botLocaleStatus", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setIntentsCount(value: ResourceCount): Self = StObject.set(x, "intentsCount", value.asInstanceOf[js.Any])
    
    inline def setIntentsCountUndefined: Self = StObject.set(x, "intentsCount", js.undefined)
    
    inline def setLastBuildSubmittedDateTime(value: js.Date): Self = StObject.set(x, "lastBuildSubmittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastBuildSubmittedDateTimeUndefined: Self = StObject.set(x, "lastBuildSubmittedDateTime", js.undefined)
    
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
    
    inline def setSlotTypesCount(value: ResourceCount): Self = StObject.set(x, "slotTypesCount", value.asInstanceOf[js.Any])
    
    inline def setSlotTypesCountUndefined: Self = StObject.set(x, "slotTypesCount", js.undefined)
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
