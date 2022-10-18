package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLexBotRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The Amazon Lex bot to associate with the instance.
    */
  var LexBot: typings.awsSdk.clientsConnectMod.LexBot
}
object AssociateLexBotRequest {
  
  inline def apply(InstanceId: InstanceId, LexBot: LexBot): AssociateLexBotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LexBot = LexBot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLexBotRequest]
  }
  
  extension [Self <: AssociateLexBotRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLexBot(value: LexBot): Self = StObject.set(x, "LexBot", value.asInstanceOf[js.Any])
  }
}
