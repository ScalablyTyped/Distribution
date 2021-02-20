package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.ContactData
import typings.awsLambda.awsLambdaStrings.ContactFlowEvent
import typings.awsLambda.awsLambdaStrings.TELEPHONE_NUMBER
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectContactFlowMod {
  
  type ConnectContactFlowCallback = Callback[ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.VOICE
    - typings.awsLambda.awsLambdaStrings.CHAT
  */
  trait ConnectContactFlowChannel extends StObject
  object ConnectContactFlowChannel {
    
    @scala.inline
    def CHAT: typings.awsLambda.awsLambdaStrings.CHAT = "CHAT".asInstanceOf[typings.awsLambda.awsLambdaStrings.CHAT]
    
    @scala.inline
    def VOICE: typings.awsLambda.awsLambdaStrings.VOICE = "VOICE".asInstanceOf[typings.awsLambda.awsLambdaStrings.VOICE]
  }
  
  @js.native
  trait ConnectContactFlowEndpoint extends StObject {
    
    var Address: String = js.native
    
    var Type: TELEPHONE_NUMBER = js.native
  }
  object ConnectContactFlowEndpoint {
    
    @scala.inline
    def apply(Address: String, Type: TELEPHONE_NUMBER): ConnectContactFlowEndpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowEndpoint]
    }
    
    @scala.inline
    implicit class ConnectContactFlowEndpointMutableBuilder[Self <: ConnectContactFlowEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TELEPHONE_NUMBER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectContactFlowEvent extends StObject {
    
    var Details: ContactData = js.native
    
    var Name: ContactFlowEvent = js.native
  }
  object ConnectContactFlowEvent {
    
    @scala.inline
    def apply(Details: ContactData, Name: ContactFlowEvent): ConnectContactFlowEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowEvent]
    }
    
    @scala.inline
    implicit class ConnectContactFlowEventMutableBuilder[Self <: ConnectContactFlowEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: ContactData): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: ContactFlowEvent): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def API: typings.awsLambda.awsLambdaStrings.API = "API".asInstanceOf[typings.awsLambda.awsLambdaStrings.API]
    
    @scala.inline
    def CALLBACK: typings.awsLambda.awsLambdaStrings.CALLBACK = "CALLBACK".asInstanceOf[typings.awsLambda.awsLambdaStrings.CALLBACK]
    
    @scala.inline
    def INBOUND: typings.awsLambda.awsLambdaStrings.INBOUND = "INBOUND".asInstanceOf[typings.awsLambda.awsLambdaStrings.INBOUND]
    
    @scala.inline
    def OUTBOUND: typings.awsLambda.awsLambdaStrings.OUTBOUND = "OUTBOUND".asInstanceOf[typings.awsLambda.awsLambdaStrings.OUTBOUND]
    
    @scala.inline
    def TRANSFER: typings.awsLambda.awsLambdaStrings.TRANSFER = "TRANSFER".asInstanceOf[typings.awsLambda.awsLambdaStrings.TRANSFER]
  }
  
  type ConnectContactFlowResult = StringDictionary[String | Null]
}
