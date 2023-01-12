package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Chatbot topic or Chatbot client.
    */
  var TargetAddress: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.TargetAddress] = js.undefined
  
  /**
    * The target type. Can be an Chatbot topic or Chatbot client.   Chatbot topics are specified as SNS.   Chatbot clients are specified as AWSChatbotSlack.  
    */
  var TargetType: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.TargetType] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
    
    inline def setTargetAddressUndefined: Self = StObject.set(x, "TargetAddress", js.undefined)
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
