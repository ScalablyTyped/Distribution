package typings.apn.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apn", "Provider")
@js.native
class Provider protected () extends EventEmitter {
  def this(options: ProviderOptions) = this()
  
  /**
    * This is main interface for sending notifications. Create a Notification object and pass it in, along with a single recipient or an array of them and node-apn will take care of the rest, delivering a copy of the notification to each recipient.
    *
    * A "recipient" is a String containing the hex-encoded device token.
    */
  def send(notification: Notification, recipients: String): js.Promise[Responses] = js.native
  def send(notification: Notification, recipients: js.Array[String]): js.Promise[Responses] = js.native
  
  /**
    * Indicate to node-apn that it should close all open connections when the queue of pending notifications is fully drained. This will allow your application to terminate.
    */
  def shutdown(): Unit = js.native
}
