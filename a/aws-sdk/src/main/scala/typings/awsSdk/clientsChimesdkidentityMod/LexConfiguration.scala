package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexConfiguration extends StObject {
  
  /**
    * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format: arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS 
    */
  var LexBotAliasArn: typings.awsSdk.clientsChimesdkidentityMod.LexBotAliasArn
  
  /**
    * Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales in Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages in the Amazon Lex V2 Developer Guide.
    */
  var LocaleId: String
  
  /**
    * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
    */
  var RespondsTo: typings.awsSdk.clientsChimesdkidentityMod.RespondsTo
  
  /**
    * The name of the welcome intent configured in the Amazon Lex V2 bot.
    */
  var WelcomeIntent: js.UndefOr[LexIntentName] = js.undefined
}
object LexConfiguration {
  
  inline def apply(LexBotAliasArn: LexBotAliasArn, LocaleId: String, RespondsTo: RespondsTo): LexConfiguration = {
    val __obj = js.Dynamic.literal(LexBotAliasArn = LexBotAliasArn.asInstanceOf[js.Any], LocaleId = LocaleId.asInstanceOf[js.Any], RespondsTo = RespondsTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLexBotAliasArn(value: LexBotAliasArn): Self = StObject.set(x, "LexBotAliasArn", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: String): Self = StObject.set(x, "LocaleId", value.asInstanceOf[js.Any])
    
    inline def setRespondsTo(value: RespondsTo): Self = StObject.set(x, "RespondsTo", value.asInstanceOf[js.Any])
    
    inline def setWelcomeIntent(value: LexIntentName): Self = StObject.set(x, "WelcomeIntent", value.asInstanceOf[js.Any])
    
    inline def setWelcomeIntentUndefined: Self = StObject.set(x, "WelcomeIntent", js.undefined)
  }
}
