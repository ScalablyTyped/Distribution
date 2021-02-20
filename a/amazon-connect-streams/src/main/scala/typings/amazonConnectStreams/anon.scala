package typings.amazonConnectStreams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChatAutoAccept extends StObject {
    
    val chatAutoAccept: Boolean = js.native
    
    val connectionData: String = js.native
    
    val customerName: String | Null = js.native
  }
  object ChatAutoAccept {
    
    @scala.inline
    def apply(chatAutoAccept: Boolean, connectionData: String): ChatAutoAccept = {
      val __obj = js.Dynamic.literal(chatAutoAccept = chatAutoAccept.asInstanceOf[js.Any], connectionData = connectionData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChatAutoAccept]
    }
    
    @scala.inline
    implicit class ChatAutoAcceptMutableBuilder[Self <: ChatAutoAccept] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChatAutoAccept(value: Boolean): Self = StObject.set(x, "chatAutoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionData(value: String): Self = StObject.set(x, "connectionData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    }
  }
  
  @js.native
  trait Expiry extends StObject {
    
    val expiry: String = js.native
    
    val participantToken: String = js.native
  }
  object Expiry {
    
    @scala.inline
    def apply(expiry: String, participantToken: String): Expiry = {
      val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expiry]
    }
    
    @scala.inline
    implicit class ExpiryMutableBuilder[Self <: Expiry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantToken(value: String): Self = StObject.set(x, "participantToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
