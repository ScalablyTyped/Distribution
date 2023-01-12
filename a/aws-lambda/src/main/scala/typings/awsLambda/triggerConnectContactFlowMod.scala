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

object triggerConnectContactFlowMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectContactFlowEndpoint] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectContactFlowEvent] (val x: Self) extends AnyVal {
      
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
  
  trait ConnectContactFlowQueue extends StObject {
    
    var ARN: String
    
    var Name: String
  }
  object ConnectContactFlowQueue {
    
    inline def apply(ARN: String, Name: String): ConnectContactFlowQueue = {
      val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectContactFlowQueue] (val x: Self) extends AnyVal {
      
      inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectContactFlowResult = StringDictionary[String | Null]
  
  type CustomerAudio = Null | StartedCustomerAudio | (StartedCustomerAudio & StoppedCustomerAudio)
  
  trait StartedCustomerAudio extends StObject {
    
    var StartFragmentNumber: String
    
    var StartTimestamp: String
    
    var StreamARN: String
  }
  object StartedCustomerAudio {
    
    inline def apply(StartFragmentNumber: String, StartTimestamp: String, StreamARN: String): StartedCustomerAudio = {
      val __obj = js.Dynamic.literal(StartFragmentNumber = StartFragmentNumber.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartedCustomerAudio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartedCustomerAudio] (val x: Self) extends AnyVal {
      
      inline def setStartFragmentNumber(value: String): Self = StObject.set(x, "StartFragmentNumber", value.asInstanceOf[js.Any])
      
      inline def setStartTimestamp(value: String): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoppedCustomerAudio extends StObject {
    
    var StopFragmentNumber: String
    
    var StopTimestamp: String
  }
  object StoppedCustomerAudio {
    
    inline def apply(StopFragmentNumber: String, StopTimestamp: String): StoppedCustomerAudio = {
      val __obj = js.Dynamic.literal(StopFragmentNumber = StopFragmentNumber.asInstanceOf[js.Any], StopTimestamp = StopTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoppedCustomerAudio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoppedCustomerAudio] (val x: Self) extends AnyVal {
      
      inline def setStopFragmentNumber(value: String): Self = StObject.set(x, "StopFragmentNumber", value.asInstanceOf[js.Any])
      
      inline def setStopTimestamp(value: String): Self = StObject.set(x, "StopTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
