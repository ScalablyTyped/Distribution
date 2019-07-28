package typings.amplifier.amplifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  @JSName("request")
  var request_Original: Request = js.native
  @JSName("store")
  var store_Original: Store = js.native
  @JSName("subscribe")
  var subscribe_Original: Subscribe = js.native
  /***
    * Publish a message.
    * topic: The name of the message to publish.
    * Any additional parameters will be passed to the subscriptions.
    * amplifier.publish returns a boolean indicating whether any subscriptions returned false.
    * The return value is true if none of the subscriptions returned false, and false otherwise.
    * Note that only one subscription can return false because doing so will prevent additional subscriptions from being invoked.
    */
  def publish(topic: String, args: js.Any*): Boolean = js.native
  /***
    * Request a resource.
    * resourceId: Identifier string for the resource.
    * data: A set of key/value pairs of data to be sent to the resource.
    * callback: A function to invoke if the resource is retrieved successfully.
    */
  def request(resourceId: String): Unit = js.native
  def request(resourceId: String, hash: js.Any): Unit = js.native
  def request(resourceId: String, hash: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /***
    * Request a resource.
    * settings: A set of key/value pairs of settings for the request.
    *   resourceId: Identifier string for the resource.
    *   data (optional): Data associated with the request.
    *   success (optional): Function to invoke on success.
    *   error (optional): Function to invoke on error.
    */
  def request(settings: RequestSettings): js.Any = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  def store(): js.Any = js.native
  def store(key: String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  def store(key: String, value: js.Any): Unit = js.native
  def store(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * Subscribe to a message.
    * topic: Name of the message to subscribe to.
    * callback: Function to invoke when the message is published.
    * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
    */
  def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
  /***
    * Subscribe to a message.
    * topic: Name of the message to subscribe to.
    * context: What this will be when the callback is invoked.
    * callback: Function to invoke when the message is published.
    * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
    */
  def subscribe(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def subscribe(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
  /***
    * Remove a subscription.
    * topic: The topic being unsubscribed from.
    * callback: The callback that was originally subscribed.
    */
  def unsubscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

