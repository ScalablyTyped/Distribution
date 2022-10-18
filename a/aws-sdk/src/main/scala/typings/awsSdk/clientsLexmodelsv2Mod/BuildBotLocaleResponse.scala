package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBotLocaleResponse extends StObject {
  
  /**
    * The identifier of the specified bot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The bot's build status. When the status is ReadyExpressTesting you can test the bot using the utterances defined for the intents and slot types. When the status is Built, the bot is ready for use and can be tested using any utterance.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The version of the bot that was built. This is only the draft version of the bot.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp indicating the date and time that the bot was last built for this locale.
    */
  var lastBuildSubmittedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale specified of where the bot can be used.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
}
object BuildBotLocaleResponse {
  
  inline def apply(): BuildBotLocaleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBotLocaleResponse]
  }
  
  extension [Self <: BuildBotLocaleResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotLocaleStatus(value: BotLocaleStatus): Self = StObject.set(x, "botLocaleStatus", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleStatusUndefined: Self = StObject.set(x, "botLocaleStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLastBuildSubmittedDateTime(value: js.Date): Self = StObject.set(x, "lastBuildSubmittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastBuildSubmittedDateTimeUndefined: Self = StObject.set(x, "lastBuildSubmittedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
  }
}
