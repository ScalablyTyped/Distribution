package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.ContactData
import typings.awsLambda.awsLambdaStrings.ContactFlowEvent
import typings.awsLambda.awsLambdaStrings.TELEPHONE_NUMBER
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectContactFlowMod {
  
  type ConnectContactFlowCallback = Callback[ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.VOICE
    - typings.awsLambda.awsLambdaStrings.CHAT
  */
  trait ConnectContactFlowChannel extends StObject
  object ConnectContactFlowChannel {
    
    inline def CHAT: typings.awsLambda.awsLambdaStrings.CHAT = "CHAT".asInstanceOf[typings.awsLambda.awsLambdaStrings.CHAT]
    
    inline def VOICE: typings.awsLambda.awsLambdaStrings.VOICE = "VOICE".asInstanceOf[typings.awsLambda.awsLambdaStrings.VOICE]
  }
  
  trait ConnectContactFlowEndpoint extends StObject {
    
    var Address: String
    
    var Type: TELEPHONE_NUMBER
  }
  object ConnectContactFlowEndpoint {
    
    inline def apply(Address: String): ConnectContactFlowEndpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Type = "TELEPHONE_NUMBER")
      __obj.asInstanceOf[ConnectContactFlowEndpoint]
    }
    
    extension [Self <: ConnectContactFlowEndpoint](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setType(value: TELEPHONE_NUMBER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectContactFlowEvent extends StObject {
    
    var Details: ContactData
    
    var Name: ContactFlowEvent
  }
  object ConnectContactFlowEvent {
    
    inline def apply(Details: ContactData): ConnectContactFlowEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = "ContactFlowEvent")
      __obj.asInstanceOf[ConnectContactFlowEvent]
    }
    
    extension [Self <: ConnectContactFlowEvent](x: Self) {
      
      inline def setDetails(value: ContactData): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setName(value: ContactFlowEvent): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectContactFlowHandler = Handler[ConnectContactFlowEvent, ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.INBOUND
    - typings.awsLambda.awsLambdaStrings.OUTBOUND
    - typings.awsLambda.awsLambdaStrings.TRANSFER
    - typings.awsLambda.awsLambdaStrings.CALLBACK
    - typings.awsLambda.awsLambdaStrings.API
  */
  trait ConnectContactFlowInitiationMethod extends StObject
  object ConnectContactFlowInitiationMethod {
    
    inline def API: typings.awsLambda.awsLambdaStrings.API = "API".asInstanceOf[typings.awsLambda.awsLambdaStrings.API]
    
    inline def CALLBACK: typings.awsLambda.awsLambdaStrings.CALLBACK = "CALLBACK".asInstanceOf[typings.awsLambda.awsLambdaStrings.CALLBACK]
    
    inline def INBOUND: typings.awsLambda.awsLambdaStrings.INBOUND = "INBOUND".asInstanceOf[typings.awsLambda.awsLambdaStrings.INBOUND]
    
    inline def OUTBOUND: typings.awsLambda.awsLambdaStrings.OUTBOUND = "OUTBOUND".asInstanceOf[typings.awsLambda.awsLambdaStrings.OUTBOUND]
    
    inline def TRANSFER: typings.awsLambda.awsLambdaStrings.TRANSFER = "TRANSFER".asInstanceOf[typings.awsLambda.awsLambdaStrings.TRANSFER]
  }
  
  type ConnectContactFlowResult = StringDictionary[String | Null]
}
