package typings.arbiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArbiterDef {
  
  @js.native
  trait ArbiterStatic extends StObject {
    
    /**
      * Creates a separate Arbiter instance.
      */
    def create(): ArbiterStatic = js.native
    
    /**
      * Publishes a message to all subscribers.
      * Returns: true on success, false if any subscriber has thrown a js exception.
      *
      * @param msg Message may be in any format, but may not contain [ ,*]. A structure like a/b/c is recommended by convention, to allow messages to be categorized.
      * @param data Pass data to subscribers that contains details about the message.
      */
    def publish(msg: String): Boolean = js.native
    def publish(msg: String, data: Any): Boolean = js.native
    def publish(msg: String, data: Any, options: PublishOptions): Boolean = js.native
    def publish(msg: String, data: Unit, options: PublishOptions): Boolean = js.native
    
    /**
      * After unsubscribing, you can later re-subscribe to begin receiving messages again.
      */
    def resubscribe(subscription_id: Double): Boolean = js.native
    
    /**
      * Subscribes to messages.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      *
      * @param msg comma separated messages or use wildcard like a/b/ *
      */
    def subscribe(msg: String, func: SubscribeHandler): Any = js.native
    /**
      * Subscribes to messages. Can use comma separated or wildcards in message.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      */
    def subscribe(msg: String, options: SubscribeOptions, context: Any, func: SubscribeHandler): Any = js.native
    /**
      * Subscribes to messages.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      *
      * @param msg comma separated messages or use wildcard like a/b/ *
      */
    def subscribe(msg: String, options: SubscribeOptions, func: SubscribeHandler): Any = js.native
    /**
      * Subscribes to messages.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      *
      * @param msg comma separated messages or use wildcard like a/b/ *
      */
    def subscribe(msg: js.Array[String], func: SubscribeHandler): Any = js.native
    /**
      * Subscribes to messages.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      *
      * @param msg comma separated messages or use wildcard like a/b/ *
      */
    def subscribe(msg: js.Array[String], options: SubscribeOptions, context: Any, func: SubscribeHandler): Any = js.native
    /**
      * Subscribes to messages.
      * Returns: subscription id or [id1,id2] if subscribing to multiple messages
      *
      * @param msg comma separated messages or use wildcard like a/b/ *
      */
    def subscribe(msg: js.Array[String], options: SubscribeOptions, func: SubscribeHandler): Any = js.native
    
    /**
      * Unsubscribing simply sets a flag which prevents the subscriber from executing, in case you want to re-subscribe later.
      */
    def unsubscribe(subscription_id: Double): Boolean = js.native
    
    var updated_on: String = js.native
    
    var version: String = js.native
  }
  
  trait PublishOptions extends StObject {
    
    /**
      * If you wish to notify the subscribers but return from the publish() call before
      * the subscriber functions execute, use asynchronous mode
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, subscribers can return "false" to prevent subsequent subscribers from
      * receiving the message. By passing cancelable:false in the options, the publisher
      * can prevent canceling.
      */
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the publishers wants subscribers to be notified even if they subscribe later,
      * setting the persist flag will do that.
      */
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    extension [Self <: PublishOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
  
  type SubscribeHandler = js.Function3[/* data */ Any, /* message */ String, /* subscriber_context */ Any, Unit]
  
  trait SubscribeOptions extends StObject {
    
    /**
      * A subscriber can be set to execute asynchronously, even if the message wasn't published as async.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If your subscriber is not interested in any past messages that may have been
      * persisted, you can force them to be ignored.
      */
    var persist: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, all subscribers have a priority of 0. Higher values get higher
      * priority and are executed first. Negative values are allowed.
      */
    var priority: js.UndefOr[Double] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    extension [Self <: SubscribeOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
