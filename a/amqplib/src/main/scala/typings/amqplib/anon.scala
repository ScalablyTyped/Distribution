package typings.amqplib

import typings.amqplib.amqplibStrings.timestamp
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Mechanism extends StObject {
    
    var mechanism: String = js.native
    
    def response(): Buffer = js.native
  }
  object Mechanism {
    
    @scala.inline
    def apply(mechanism: String, response: () => Buffer): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: () => Buffer): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var mechanism: String = js.native
    
    var password: String = js.native
    
    def response(): Buffer = js.native
    
    var username: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(mechanism: String, password: String, response: () => Buffer, username: String): Password = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = js.Any.fromFunction0(response), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: () => Buffer): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("!")
    var Exclamationmark: timestamp = js.native
    
    var value: Double = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(Exclamationmark: timestamp, value: Double): _empty = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclamationmark(value: timestamp): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
