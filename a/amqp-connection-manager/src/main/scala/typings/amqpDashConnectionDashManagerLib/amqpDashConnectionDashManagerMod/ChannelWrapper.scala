package typings
package amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelWrapper
  extends nodeLib.eventsMod.EventEmitter {
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 */
  def ack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 */
  def ack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  @JSName("addListener")
  def addListener_close(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.error,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* info */ amqpDashConnectionDashManagerLib.Anon_Name, 
      scala.Unit
    ]
  ): this.type = js.native
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
  def addSetup(func: SetupFunc): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * Close a channel, clean up resources associated with it.
  	 */
  def close(): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 * @param requeue
  	 */
  def nack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 * @param requeue
  	 */
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  /**
  	 * @see amqplib
  	 * @param message
  	 * @param allUpTo
  	 * @param requeue
  	 */
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean, requeue: scala.Boolean): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.error,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* info */ amqpDashConnectionDashManagerLib.Anon_Name, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.error,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* info */ amqpDashConnectionDashManagerLib.Anon_Name, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.error,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* info */ amqpDashConnectionDashManagerLib.Anon_Name, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.error,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* info */ amqpDashConnectionDashManagerLib.Anon_Name, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
  	 * @see amqplib
  	 * @param exchange
  	 * @param routingKey
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def publish(exchange: java.lang.String, routingKey: java.lang.String, content: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param exchange
  	 * @param routingKey
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def publish(
    exchange: java.lang.String,
    routingKey: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param exchange
  	 * @param routingKey
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def publish(
    exchange: java.lang.String,
    routingKey: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * Returns a count of messages currently waiting to be sent to the underlying channel.
  	 */
  def queueLength(): scala.Double = js.native
  /**
       * Remove a setup function added with `addSetup`.  If there is currently a
       * connection, `teardown(channel, [cb])` will be run immediately, and the
       * returned Promise will not resolve until it completes.
       * @param func
       * @param [tearDown]
       */
  def removeSetup(func: SetupFunc): stdLib.Promise[scala.Unit] = js.native
  /**
       * Remove a setup function added with `addSetup`.  If there is currently a
       * connection, `teardown(channel, [cb])` will be run immediately, and the
       * returned Promise will not resolve until it completes.
       * @param func
       * @param [tearDown]
       */
  def removeSetup(func: SetupFunc, tearDown: SetupFunc): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param queue
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def sendToQueue(queue: java.lang.String, content: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param queue
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def sendToQueue(
    queue: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * @see amqplib
  	 * @param queue
  	 * @param content
  	 * @param options
  	 * @param callback
  	 */
  def sendToQueue(
    queue: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
}

