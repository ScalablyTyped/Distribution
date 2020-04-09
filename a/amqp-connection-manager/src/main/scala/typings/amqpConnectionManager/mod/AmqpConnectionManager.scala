package typings.amqpConnectionManager.mod

import typings.amqpConnectionManager.AnonConnection
import typings.amqpConnectionManager.AnonErr
import typings.amqpConnectionManager.amqpConnectionManagerStrings.disconnect
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmqpConnectionManager extends EventEmitter {
  @JSName("addListener")
  def addListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ AnonConnection, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ AnonErr, Unit]): this.type = js.native
  /**
  	 * Close this AmqpConnectionManager and free all associated resources.
  	 */
  def close(): js.Promise[Unit] = js.native
  /**
  	 * Create a new ChannelWrapper. This is a proxy for the actual channel (which may or may not exist at any moment, depending on whether or not we are currently connected.)
  	 * @param opts
  	 */
  def createChannel(): ChannelWrapper = js.native
  def createChannel(opts: CreateChannelOpts): ChannelWrapper = js.native
  /**
  	 * Returns true if the AmqpConnectionManager is connected to a broker, false otherwise.
  	 */
  def isConnected(): Boolean = js.native
  @JSName("on")
  def on_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ AnonConnection, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function1[/* arg */ AnonErr, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ AnonConnection, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function1[/* arg */ AnonErr, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ AnonConnection, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ AnonErr, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ AnonConnection, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ AnonErr, Unit]): this.type = js.native
}

