package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotRequest extends StObject {
  
  /**
    * The list of bot members in a network to be created.
    */
  var botMembers: js.UndefOr[BotMembers] = js.undefined
  
  /**
    * The name of the bot. The bot name must be unique in the account that creates the bot.
    */
  var botName: Name
  
  /**
    * A list of tags to add to the bot. You can only add tags when you create a bot. You can't use the UpdateBot operation to update tags. To update tags, use the TagResource operation.
    */
  var botTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of a bot to create.
    */
  var botType: js.UndefOr[BotType] = js.undefined
  
  /**
    * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
    */
  var dataPrivacy: DataPrivacy
  
  /**
    * A description of the bot. It appears in lists to help you identify a particular bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.  A user interaction remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
    */
  var idleSessionTTLInSeconds: SessionTTL
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
    */
  var roleArn: RoleArn
  
  /**
    * A list of tags to add to the test alias for a bot. You can only add tags when you create a bot. You can't use the UpdateAlias operation to update tags. To update tags on the test alias, use the TagResource operation.
    */
  var testBotAliasTags: js.UndefOr[TagMap] = js.undefined
}
object CreateBotRequest {
  
  inline def apply(botName: Name, dataPrivacy: DataPrivacy, idleSessionTTLInSeconds: SessionTTL, roleArn: RoleArn): CreateBotRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], dataPrivacy = dataPrivacy.asInstanceOf[js.Any], idleSessionTTLInSeconds = idleSessionTTLInSeconds.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBotRequest] (val x: Self) extends AnyVal {
    
    inline def setBotMembers(value: BotMembers): Self = StObject.set(x, "botMembers", value.asInstanceOf[js.Any])
    
    inline def setBotMembersUndefined: Self = StObject.set(x, "botMembers", js.undefined)
    
    inline def setBotMembersVarargs(value: BotMember*): Self = StObject.set(x, "botMembers", js.Array(value*))
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotTags(value: TagMap): Self = StObject.set(x, "botTags", value.asInstanceOf[js.Any])
    
    inline def setBotTagsUndefined: Self = StObject.set(x, "botTags", js.undefined)
    
    inline def setBotType(value: BotType): Self = StObject.set(x, "botType", value.asInstanceOf[js.Any])
    
    inline def setBotTypeUndefined: Self = StObject.set(x, "botType", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTestBotAliasTags(value: TagMap): Self = StObject.set(x, "testBotAliasTags", value.asInstanceOf[js.Any])
    
    inline def setTestBotAliasTagsUndefined: Self = StObject.set(x, "testBotAliasTags", js.undefined)
  }
}
