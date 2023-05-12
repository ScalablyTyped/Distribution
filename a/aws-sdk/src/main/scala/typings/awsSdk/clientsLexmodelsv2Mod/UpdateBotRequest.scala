package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotRequest extends StObject {
  
  /**
    * The unique identifier of the bot to update. This identifier is returned by the CreateBot operation.
    */
  var botId: Id
  
  /**
    * The list of bot members in the network associated with the update action.
    */
  var botMembers: js.UndefOr[BotMembers] = js.undefined
  
  /**
    * The new name of the bot. The name must be unique in the account that creates the bot.
    */
  var botName: Name
  
  /**
    * The type of the bot to be updated.
    */
  var botType: js.UndefOr[BotType] = js.undefined
  
  /**
    * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
    */
  var dataPrivacy: DataPrivacy
  
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot. A user interaction remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
    */
  var idleSessionTTLInSeconds: SessionTTL
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
    */
  var roleArn: RoleArn
}
object UpdateBotRequest {
  
  inline def apply(
    botId: Id,
    botName: Name,
    dataPrivacy: DataPrivacy,
    idleSessionTTLInSeconds: SessionTTL,
    roleArn: RoleArn
  ): UpdateBotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], dataPrivacy = dataPrivacy.asInstanceOf[js.Any], idleSessionTTLInSeconds = idleSessionTTLInSeconds.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBotRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotMembers(value: BotMembers): Self = StObject.set(x, "botMembers", value.asInstanceOf[js.Any])
    
    inline def setBotMembersUndefined: Self = StObject.set(x, "botMembers", js.undefined)
    
    inline def setBotMembersVarargs(value: BotMember*): Self = StObject.set(x, "botMembers", js.Array(value*))
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotType(value: BotType): Self = StObject.set(x, "botType", value.asInstanceOf[js.Any])
    
    inline def setBotTypeUndefined: Self = StObject.set(x, "botType", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
