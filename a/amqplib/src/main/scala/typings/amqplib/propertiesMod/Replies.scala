package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Replies {
  
  @js.native
  trait AssertExchange extends StObject {
    
    var exchange: String = js.native
  }
  object AssertExchange {
    
    @scala.inline
    def apply(exchange: String): AssertExchange = {
      val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertExchange]
    }
    
    @scala.inline
    implicit class AssertExchangeMutableBuilder[Self <: AssertExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssertQueue extends StObject {
    
    var consumerCount: Double = js.native
    
    var messageCount: Double = js.native
    
    var queue: String = js.native
  }
  object AssertQueue {
    
    @scala.inline
    def apply(consumerCount: Double, messageCount: Double, queue: String): AssertQueue = {
      val __obj = js.Dynamic.literal(consumerCount = consumerCount.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertQueue]
    }
    
    @scala.inline
    implicit class AssertQueueMutableBuilder[Self <: AssertQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumerCount(value: Double): Self = StObject.set(x, "consumerCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Consume extends StObject {
    
    var consumerTag: String = js.native
  }
  object Consume {
    
    @scala.inline
    def apply(consumerTag: String): Consume = {
      val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consume]
    }
    
    @scala.inline
    implicit class ConsumeMutableBuilder[Self <: Consume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteQueue extends StObject {
    
    var messageCount: Double = js.native
  }
  object DeleteQueue {
    
    @scala.inline
    def apply(messageCount: Double): DeleteQueue = {
      val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteQueue]
    }
    
    @scala.inline
    implicit class DeleteQueueMutableBuilder[Self <: DeleteQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Empty extends StObject
  
  @js.native
  trait PurgeQueue extends StObject {
    
    var messageCount: Double = js.native
  }
  object PurgeQueue {
    
    @scala.inline
    def apply(messageCount: Double): PurgeQueue = {
      val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurgeQueue]
    }
    
    @scala.inline
    implicit class PurgeQueueMutableBuilder[Self <: PurgeQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    }
  }
}
