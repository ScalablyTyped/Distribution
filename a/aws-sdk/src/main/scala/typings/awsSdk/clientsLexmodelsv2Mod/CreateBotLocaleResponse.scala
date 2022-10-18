package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotLocaleResponse extends StObject {
  
  /**
    * The specified bot identifier.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the bot. When the status is Creating the bot locale is being configured. When the status is Building Amazon Lex is building the bot for testing and use. If the status of the bot is ReadyExpressTesting, you can test the bot using the exact utterances specified in the bots' intents. When the bot is ready for full testing or to run, the status is Built. If there was a problem with building the bot, the status is Failed. If the bot was saved but not built, the status is NotBuilt.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The specified bot version.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp specifying the date and time that the bot locale was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The specified description of the bot locale.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The specified locale identifier.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The specified locale name.
    */
  var localeName: js.UndefOr[LocaleName] = js.undefined
  
  /**
    * The specified confidence threshold for inserting the AMAZON.FallbackIntent and AMAZON.KendraSearchIntent intents.
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
    */
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object CreateBotLocaleResponse {
  
  inline def apply(): CreateBotLocaleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotLocaleResponse]
  }
  
  extension [Self <: CreateBotLocaleResponse](x: Self) {
    
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
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setLocaleName(value: LocaleName): Self = StObject.set(x, "localeName", value.asInstanceOf[js.Any])
    
    inline def setLocaleNameUndefined: Self = StObject.set(x, "localeName", js.undefined)
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
