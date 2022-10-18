package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateBotRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  var LexBot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexBot] = js.undefined
  
  /**
    * The Amazon Lex V2 bot to associate with the instance.
    */
  var LexV2Bot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexV2Bot] = js.undefined
}
object AssociateBotRequest {
  
  inline def apply(InstanceId: InstanceId): AssociateBotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateBotRequest]
  }
  
  extension [Self <: AssociateBotRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLexBot(value: LexBot): Self = StObject.set(x, "LexBot", value.asInstanceOf[js.Any])
    
    inline def setLexBotUndefined: Self = StObject.set(x, "LexBot", js.undefined)
    
    inline def setLexV2Bot(value: LexV2Bot): Self = StObject.set(x, "LexV2Bot", value.asInstanceOf[js.Any])
    
    inline def setLexV2BotUndefined: Self = StObject.set(x, "LexV2Bot", js.undefined)
  }
}
