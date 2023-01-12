package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotAliasRequest extends StObject {
  
  /**
    * The unique identifier of the bot alias.
    */
  var botAliasId: BotAliasId
  
  /**
    * The new Lambda functions to use in each locale for the bot alias.
    */
  var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined
  
  /**
    * The new name to assign to the bot alias.
    */
  var botAliasName: Name
  
  /**
    * The identifier of the bot with the updated alias.
    */
  var botId: Id
  
  /**
    * The new bot version to assign to the bot alias.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
    */
  var conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined
  
  /**
    * The new description to assign to the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
}
object UpdateBotAliasRequest {
  
  inline def apply(botAliasId: BotAliasId, botAliasName: Name, botId: Id): UpdateBotAliasRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botAliasName = botAliasName.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBotAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasLocaleSettings(value: BotAliasLocaleSettingsMap): Self = StObject.set(x, "botAliasLocaleSettings", value.asInstanceOf[js.Any])
    
    inline def setBotAliasLocaleSettingsUndefined: Self = StObject.set(x, "botAliasLocaleSettings", js.undefined)
    
    inline def setBotAliasName(value: Name): Self = StObject.set(x, "botAliasName", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setConversationLogSettings(value: ConversationLogSettings): Self = StObject.set(x, "conversationLogSettings", value.asInstanceOf[js.Any])
    
    inline def setConversationLogSettingsUndefined: Self = StObject.set(x, "conversationLogSettings", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSentimentAnalysisSettings(value: SentimentAnalysisSettings): Self = StObject.set(x, "sentimentAnalysisSettings", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisSettingsUndefined: Self = StObject.set(x, "sentimentAnalysisSettings", js.undefined)
  }
}
