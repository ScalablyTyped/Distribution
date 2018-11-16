package typings
package amplifyLib.amplifyMod.amplifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  @JSName("request")
  var request_Original: Request = js.native
  var store: Store = js.native
  @JSName("subscribe")
  var subscribe_Original: Subscribe = js.native
  /***
          * Publish a message.
          * topic: The name of the message to publish.
          * Any additional parameters will be passed to the subscriptions.
          * amplify.publish returns a boolean indicating whether any subscriptions returned false.
          * The return value is true if none of the subscriptions returned false, and false otherwise.
          * Note that only one subscription can return false because doing so will prevent additional subscriptions from being invoked.
          */
  def publish(topic: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def request(resourceId: java.lang.String): scala.Unit = js.native
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def request(resourceId: java.lang.String, hash: js.Any): scala.Unit = js.native
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def request(resourceId: java.lang.String, hash: js.Any, callback: js.Function): scala.Unit = js.native
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
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def subscribe(topic: java.lang.String, callback: js.Function): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def subscribe(topic: java.lang.String, callback: js.Function, priority: scala.Double): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * context: What this will be when the callback is invoked.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def subscribe(topic: java.lang.String, context: js.Any, callback: js.Function): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * context: What this will be when the callback is invoked.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def subscribe(topic: java.lang.String, context: js.Any, callback: js.Function, priority: scala.Double): scala.Unit = js.native
  /***
          * Remove a subscription.
          * topic: The topic being unsubscribed from.
          * callback: The callback that was originally subscribed.
          */
  def unsubscribe(topic: java.lang.String, callback: js.Function): scala.Unit = js.native
}

