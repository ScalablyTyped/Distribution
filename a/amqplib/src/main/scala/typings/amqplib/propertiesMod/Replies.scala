package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Replies {
  
  trait AssertExchange extends StObject {
    
    var exchange: String
  }
  object AssertExchange {
    
    inline def apply(exchange: String): AssertExchange = {
      val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertExchange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertExchange] (val x: Self) extends AnyVal {
      
      inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssertQueue extends StObject {
    
    var consumerCount: Double
    
    var messageCount: Double
    
    var queue: String
  }
  object AssertQueue {
    
    inline def apply(consumerCount: Double, messageCount: Double, queue: String): AssertQueue = {
      val __obj = js.Dynamic.literal(consumerCount = consumerCount.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertQueue] (val x: Self) extends AnyVal {
      
      inline def setConsumerCount(value: Double): Self = StObject.set(x, "consumerCount", value.asInstanceOf[js.Any])
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Consume extends StObject {
    
    var consumerTag: String
  }
  object Consume {
    
    inline def apply(consumerTag: String): Consume = {
      val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consume]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consume] (val x: Self) extends AnyVal {
      
      inline def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteQueue extends StObject {
    
    var messageCount: Double
  }
  object DeleteQueue {
    
    inline def apply(messageCount: Double): DeleteQueue = {
      val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteQueue] (val x: Self) extends AnyVal {
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Empty extends StObject
  
  trait PurgeQueue extends StObject {
    
    var messageCount: Double
  }
  object PurgeQueue {
    
    inline def apply(messageCount: Double): PurgeQueue = {
      val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurgeQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurgeQueue] (val x: Self) extends AnyVal {
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    }
  }
}
