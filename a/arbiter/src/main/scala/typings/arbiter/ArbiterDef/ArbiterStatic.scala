package typings.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArbiterStatic extends js.Object {
  var updated_on: String = js.native
  var version: String = js.native
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
  def publish(msg: String, data: js.UndefOr[scala.Nothing], options: PublishOptions): Boolean = js.native
  def publish(msg: String, data: js.Any): Boolean = js.native
  def publish(msg: String, data: js.Any, options: PublishOptions): Boolean = js.native
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
  def subscribe(msg: String, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages. Can use comma separated or wildcards in message.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    */
  def subscribe(msg: String, options: SubscribeOptions, context: js.Any, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: String, options: SubscribeOptions, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: js.Array[String], func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: js.Array[String], options: SubscribeOptions, context: js.Any, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: js.Array[String], options: SubscribeOptions, func: SubscribeHandler): js.Any = js.native
  /**
    * Unsubscribing simply sets a flag which prevents the subscriber from executing, in case you want to re-subscribe later.
    */
  def unsubscribe(subscription_id: Double): Boolean = js.native
}

