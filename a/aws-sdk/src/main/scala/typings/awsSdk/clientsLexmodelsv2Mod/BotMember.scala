package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotMember extends StObject {
  
  /**
    * The alias ID of a bot that is a member of this network of bots.
    */
  var botMemberAliasId: BotAliasId
  
  /**
    * The alias name of a bot that is a member of this network of bots.
    */
  var botMemberAliasName: BotAliasName
  
  /**
    * The unique ID of a bot that is a member of this network of bots.
    */
  var botMemberId: Id
  
  /**
    * The unique name of a bot that is a member of this network of bots.
    */
  var botMemberName: Name
  
  /**
    * The version of a bot that is a member of this network of bots.
    */
  var botMemberVersion: BotVersion
}
object BotMember {
  
  inline def apply(
    botMemberAliasId: BotAliasId,
    botMemberAliasName: BotAliasName,
    botMemberId: Id,
    botMemberName: Name,
    botMemberVersion: BotVersion
  ): BotMember = {
    val __obj = js.Dynamic.literal(botMemberAliasId = botMemberAliasId.asInstanceOf[js.Any], botMemberAliasName = botMemberAliasName.asInstanceOf[js.Any], botMemberId = botMemberId.asInstanceOf[js.Any], botMemberName = botMemberName.asInstanceOf[js.Any], botMemberVersion = botMemberVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotMember] (val x: Self) extends AnyVal {
    
    inline def setBotMemberAliasId(value: BotAliasId): Self = StObject.set(x, "botMemberAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotMemberAliasName(value: BotAliasName): Self = StObject.set(x, "botMemberAliasName", value.asInstanceOf[js.Any])
    
    inline def setBotMemberId(value: Id): Self = StObject.set(x, "botMemberId", value.asInstanceOf[js.Any])
    
    inline def setBotMemberName(value: Name): Self = StObject.set(x, "botMemberName", value.asInstanceOf[js.Any])
    
    inline def setBotMemberVersion(value: BotVersion): Self = StObject.set(x, "botMemberVersion", value.asInstanceOf[js.Any])
  }
}
