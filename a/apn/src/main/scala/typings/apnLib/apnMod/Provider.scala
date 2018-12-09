package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apn", "Provider")
@js.native
class Provider protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: ProviderOptions) = this()
  /**
     * This is main interface for sending notifications. Create a Notification object and pass it in, along with a single recipient or an array of them and node-apn will take care of the rest, delivering a copy of the notification to each recipient.
     *
     * A "recipient" is a String containing the hex-encoded device token.
     */
  def send(notification: Notification, recipients: java.lang.String): js.Promise[Responses] = js.native
  /**
     * This is main interface for sending notifications. Create a Notification object and pass it in, along with a single recipient or an array of them and node-apn will take care of the rest, delivering a copy of the notification to each recipient.
     *
     * A "recipient" is a String containing the hex-encoded device token.
     */
  def send(notification: Notification, recipients: js.Array[java.lang.String]): js.Promise[Responses] = js.native
  /**
     * Indicate to node-apn that it should close all open connections when the queue of pending notifications is fully drained. This will allow your application to terminate.
     */
  def shutdown(): scala.Unit = js.native
}

