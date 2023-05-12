package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateBotRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  var LexBot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexBot] = js.undefined
  
  /**
    * The Amazon Lex V2 bot to disassociate from the instance.
    */
  var LexV2Bot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexV2Bot] = js.undefined
}
object DisassociateBotRequest {
  
  inline def apply(InstanceId: InstanceId): DisassociateBotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateBotRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLexBot(value: LexBot): Self = StObject.set(x, "LexBot", value.asInstanceOf[js.Any])
    
    inline def setLexBotUndefined: Self = StObject.set(x, "LexBot", js.undefined)
    
    inline def setLexV2Bot(value: LexV2Bot): Self = StObject.set(x, "LexV2Bot", value.asInstanceOf[js.Any])
    
    inline def setLexV2BotUndefined: Self = StObject.set(x, "LexV2Bot", js.undefined)
  }
}
