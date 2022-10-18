package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleImportSpecification extends StObject {
  
  /**
    * The identifier of the bot to import the locale to.
    */
  var botId: Id
  
  /**
    * The version of the bot to import the locale to. This can only be the DRAFT version of the bot.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.  For example, suppose a bot is configured with the confidence threshold of 0.80 and the AMAZON.FallbackIntent. Amazon Lex returns three alternative intents with the following confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:    AMAZON.FallbackIntent     IntentA     IntentB     IntentC   
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object BotLocaleImportSpecification {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId): BotLocaleImportSpecification = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotLocaleImportSpecification]
  }
  
  extension [Self <: BotLocaleImportSpecification](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
