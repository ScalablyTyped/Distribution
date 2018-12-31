package typings
package arbiterLib.ArbiterDefNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArbiterStatic extends js.Object {
  var updated_on: java.lang.String = js.native
  var version: java.lang.String = js.native
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
  def publish(msg: java.lang.String): scala.Boolean = js.native
  def publish(msg: java.lang.String, data: js.Any): scala.Boolean = js.native
  def publish(msg: java.lang.String, data: js.Any, options: PublishOptions): scala.Boolean = js.native
  /**
    * After unsubscribing, you can later re-subscribe to begin receiving messages again.
    */
  def resubscribe(subscription_id: scala.Double): scala.Boolean = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: java.lang.String, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages. Can use comma separated or wildcards in message.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    */
  def subscribe(msg: java.lang.String, options: SubscribeOptions, context: js.Any, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: java.lang.String, options: SubscribeOptions, func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: js.Array[java.lang.String], func: SubscribeHandler): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(
    msg: js.Array[java.lang.String],
    options: SubscribeOptions,
    context: js.Any,
    func: SubscribeHandler
  ): js.Any = js.native
  /**
    * Subscribes to messages.
    * Returns: subscription id or [id1,id2] if subscribing to multiple messages
    *
    * @param msg comma separated messages or use wildcard like a/b/ *
    */
  def subscribe(msg: js.Array[java.lang.String], options: SubscribeOptions, func: SubscribeHandler): js.Any = js.native
  /**
    * Unsubscribing simply sets a flag which prevents the subscriber from executing, in case you want to re-subscribe later.
    */
  def unsubscribe(subscription_id: scala.Double): scala.Boolean = js.native
}

