package typings
package amplifyLib.amplifyMod.amplifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def apply(topic: java.lang.String, callback: js.Function): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def apply(topic: java.lang.String, callback: js.Function, priority: scala.Double): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * context: What this will be when the callback is invoked.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def apply(topic: java.lang.String, context: js.Any, callback: js.Function): scala.Unit = js.native
  /***
          * Subscribe to a message.
          * topic: Name of the message to subscribe to.
          * context: What this will be when the callback is invoked.
          * callback: Function to invoke when the message is published.
          * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
          */
  def apply(topic: java.lang.String, context: js.Any, callback: js.Function, priority: scala.Double): scala.Unit = js.native
}

