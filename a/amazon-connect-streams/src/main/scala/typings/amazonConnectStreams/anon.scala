package typings.amazonConnectStreams

import typings.amazonConnectStreams.connect.ReferenceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChatAutoAccept extends StObject {
    
    val chatAutoAccept: Boolean
    
    val connectionData: String
    
    val customerName: String | Null
  }
  object ChatAutoAccept {
    
    inline def apply(chatAutoAccept: Boolean, connectionData: String): ChatAutoAccept = {
      val __obj = js.Dynamic.literal(chatAutoAccept = chatAutoAccept.asInstanceOf[js.Any], connectionData = connectionData.asInstanceOf[js.Any], customerName = null)
      __obj.asInstanceOf[ChatAutoAccept]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChatAutoAccept] (val x: Self) extends AnyVal {
      
      inline def setChatAutoAccept(value: Boolean): Self = StObject.set(x, "chatAutoAccept", value.asInstanceOf[js.Any])
      
      inline def setConnectionData(value: String): Self = StObject.set(x, "connectionData", value.asInstanceOf[js.Any])
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    }
  }
  
  trait Expiry extends StObject {
    
    val expiry: String
    
    val participantToken: String
  }
  object Expiry {
    
    inline def apply(expiry: String, participantToken: String): Expiry = {
      val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expiry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expiry] (val x: Self) extends AnyVal {
      
      inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setParticipantToken(value: String): Self = StObject.set(x, "participantToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var value: String
  }
  object Name {
    
    inline def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: ReferenceType
    
    var value: String
  }
  object Type {
    
    inline def apply(`type`: ReferenceType, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: ReferenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
