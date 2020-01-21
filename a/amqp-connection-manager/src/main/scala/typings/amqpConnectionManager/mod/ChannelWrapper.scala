package typings.amqpConnectionManager.mod

import typings.amqpConnectionManager.AnonName
import typings.amqpConnectionManager.amqpConnectionManagerStrings.close
import typings.amqpConnectionManager.amqpConnectionManagerStrings.error
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.Options.Publish
import typings.amqplib.propertiesMod.Replies.Empty
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelWrapper extends EventEmitter {
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 */
  def ack(message: Message): Unit = js.native
  def ack(message: Message, allUpTo: Boolean): Unit = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function0[Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function2[/* err */ Error, /* info */ AnonName, Unit]): this.type = js.native
  /**
  	 * Adds a new 'setup handler'. setup(channel, [cb]) is a function to call when a new underlying channel is created -
  	 * handy for asserting exchanges and queues exists, and whatnot. The channel object here is a ConfirmChannel from amqplib.
  	 * The setup function should return a Promise (or optionally take a callback) - no messages will be sent until this Promise resolves.
  	 * If there is a connection, setup() will be run immediately, and the addSetup Promise/callback won't resolve until setup is complete.
  	 * Note that in this case, if the setup throws an error, no 'error' event will be emitted, since you can just handle the error here
  	 * (although the setup will still be added for future reconnects, even if it throws an error.)
  	 * Setup functions should, ideally, not throw errors, but if they do then the ChannelWrapper will emit an 'error' event.
  	 * @param func
  	 */
  def addSetup(func: SetupFunc): js.Promise[Unit] = js.native
  /**
  	 * Close a channel, clean up resources associated with it.
  	 */
  def close(): js.Promise[Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 * @param requeue
  	 */
  def nack(message: Message): Unit = js.native
  def nack(message: Message, allUpTo: Boolean): Unit = js.native
  def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function0[Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ Error, /* info */ AnonName, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function0[Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function2[/* err */ Error, /* info */ AnonName, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function0[Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function2[/* err */ Error, /* info */ AnonName, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typings.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function0[Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function2[/* err */ Error, /* info */ AnonName, Unit]): this.type = js.native
  def publish(exchange: String, routingKey: String, content: js.Object): js.Promise[Unit] = js.native
  def publish(exchange: String, routingKey: String, content: js.Object, options: Publish): js.Promise[Unit] = js.native
  def publish(
    exchange: String,
    routingKey: String,
    content: js.Object,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): js.Promise[Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param exchange
  	 * @param routingKey
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def publish(exchange: String, routingKey: String, content: Buffer): js.Promise[Unit] = js.native
  def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): js.Promise[Unit] = js.native
  def publish(
    exchange: String,
    routingKey: String,
    content: Buffer,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): js.Promise[Unit] = js.native
  /**
  	 * Returns a count of messages currently waiting to be sent to the underlying channel.
  	 */
  def queueLength(): Double = js.native
  /**
    * Remove a setup function added with `addSetup`.  If there is currently a
    * connection, `teardown(channel, [cb])` will be run immediately, and the
    * returned Promise will not resolve until it completes.
    * @param func
    * @param [tearDown]
    */
  def removeSetup(func: SetupFunc): js.Promise[Unit] = js.native
  def removeSetup(func: SetupFunc, tearDown: SetupFunc): js.Promise[Unit] = js.native
  def sendToQueue(queue: String, content: js.Object): js.Promise[Unit] = js.native
  def sendToQueue(queue: String, content: js.Object, options: Publish): js.Promise[Unit] = js.native
  def sendToQueue(
    queue: String,
    content: js.Object,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): js.Promise[Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param queue
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def sendToQueue(queue: String, content: Buffer): js.Promise[Unit] = js.native
  def sendToQueue(queue: String, content: Buffer, options: Publish): js.Promise[Unit] = js.native
  def sendToQueue(
    queue: String,
    content: Buffer,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): js.Promise[Unit] = js.native
}

