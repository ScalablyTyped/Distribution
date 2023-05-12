package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotResponse extends StObject {
  
  /**
    * A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex API operations.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The list of bots in a network that was created.
    */
  var botMembers: js.UndefOr[BotMembers] = js.undefined
  
  /**
    * The name specified for the bot.
    */
  var botName: js.UndefOr[Name] = js.undefined
  
  /**
    * Shows the current status of the bot. The bot is first in the Creating status. Once the bot is read for use, it changes to the Available status. After the bot is created, you can use the DRAFT version of the bot.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * A list of tags associated with the bot.
    */
  var botTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of a bot that was created.
    */
  var botType: js.UndefOr[BotType] = js.undefined
  
  /**
    * A timestamp indicating the date and time that the bot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The data privacy settings specified for the bot.
    */
  var dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined
  
  /**
    * The description specified for the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The session idle time specified for the bot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  
  /**
    * The IAM role specified for the bot.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * A list of tags associated with the test alias for the bot.
    */
  var testBotAliasTags: js.UndefOr[TagMap] = js.undefined
}
object CreateBotResponse {
  
  inline def apply(): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBotResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotMembers(value: BotMembers): Self = StObject.set(x, "botMembers", value.asInstanceOf[js.Any])
    
    inline def setBotMembersUndefined: Self = StObject.set(x, "botMembers", js.undefined)
    
    inline def setBotMembersVarargs(value: BotMember*): Self = StObject.set(x, "botMembers", js.Array(value*))
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotTags(value: TagMap): Self = StObject.set(x, "botTags", value.asInstanceOf[js.Any])
    
    inline def setBotTagsUndefined: Self = StObject.set(x, "botTags", js.undefined)
    
    inline def setBotType(value: BotType): Self = StObject.set(x, "botType", value.asInstanceOf[js.Any])
    
    inline def setBotTypeUndefined: Self = StObject.set(x, "botType", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setDataPrivacyUndefined: Self = StObject.set(x, "dataPrivacy", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setTestBotAliasTags(value: TagMap): Self = StObject.set(x, "testBotAliasTags", value.asInstanceOf[js.Any])
    
    inline def setTestBotAliasTagsUndefined: Self = StObject.set(x, "testBotAliasTags", js.undefined)
  }
}
