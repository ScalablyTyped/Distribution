package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotLocaleRequest extends StObject {
  
  /**
    * The identifier of the bot to create the locale for.
    */
  var botId: Id
  
  /**
    * The version of the bot to create the locale for. This can only be the draft version of the bot.
    */
  var botVersion: DraftBotVersion
  
  /**
    * A description of the bot locale. Use this to help identify the bot locale in lists.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For example, suppose a bot is configured with the confidence threshold of 0.80 and the AMAZON.FallbackIntent. Amazon Lex returns three alternative intents with the following confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the RecognizeText operation would be:   AMAZON.FallbackIntent   IntentA   IntentB   IntentC  
    */
  var nluIntentConfidenceThreshold: ConfidenceThreshold
  
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
    */
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object CreateBotLocaleRequest {
  
  inline def apply(
    botId: Id,
    botVersion: DraftBotVersion,
    localeId: LocaleId,
    nluIntentConfidenceThreshold: ConfidenceThreshold
  ): CreateBotLocaleRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], nluIntentConfidenceThreshold = nluIntentConfidenceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotLocaleRequest]
  }
  
  extension [Self <: CreateBotLocaleRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
