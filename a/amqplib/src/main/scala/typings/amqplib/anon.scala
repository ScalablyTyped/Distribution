package typings.amqplib

import typings.amqplib.amqplibStrings.timestamp
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mechanism extends StObject {
    
    var mechanism: String
    
    def response(): Buffer
  }
  object Mechanism {
    
    inline def apply(mechanism: String, response: () => Buffer): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
      __obj.asInstanceOf[Mechanism]
    }
    
    extension [Self <: Mechanism](x: Self) {
      
      inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: () => Buffer): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
    }
  }
  
  trait Password extends StObject {
    
    var mechanism: String
    
    var password: String
    
    def response(): Buffer
    
    var username: String
  }
  object Password {
    
    inline def apply(mechanism: String, password: String, response: () => Buffer, username: String): Password = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = js.Any.fromFunction0(response), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: () => Buffer): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("!")
    var Exclamationmark: timestamp
    
    var value: Double
  }
  object _empty {
    
    inline def apply(value: Double): _empty = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("!")("timestamp")
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setExclamationmark(value: timestamp): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
