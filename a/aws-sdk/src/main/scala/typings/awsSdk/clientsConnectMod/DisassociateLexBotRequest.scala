package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLexBotRequest extends StObject {
  
  /**
    * The name of the Amazon Lex bot. Maximum character limit of 50.
    */
  var BotName: typings.awsSdk.clientsConnectMod.BotName
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The Region in which the Amazon Lex bot has been created.
    */
  var LexRegion: typings.awsSdk.clientsConnectMod.LexRegion
}
object DisassociateLexBotRequest {
  
  inline def apply(BotName: BotName, InstanceId: InstanceId, LexRegion: LexRegion): DisassociateLexBotRequest = {
    val __obj = js.Dynamic.literal(BotName = BotName.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LexRegion = LexRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLexBotRequest]
  }
  
  extension [Self <: DisassociateLexBotRequest](x: Self) {
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "BotName", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLexRegion(value: LexRegion): Self = StObject.set(x, "LexRegion", value.asInstanceOf[js.Any])
  }
}
