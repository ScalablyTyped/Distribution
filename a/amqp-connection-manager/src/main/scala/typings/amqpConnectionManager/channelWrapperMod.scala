package typings.amqpConnectionManager

import typings.amqpConnectionManager.amqpConnectionManagerBooleans.`false`
import typings.amqpConnectionManager.amqpConnectionManagerMod.IAmqpConnectionManager
import typings.amqpConnectionManager.amqpConnectionManagerStrings.`match`
import typings.amqpConnectionManager.amqpConnectionManagerStrings.close
import typings.amqpConnectionManager.amqpConnectionManagerStrings.connect
import typings.amqpConnectionManager.amqpConnectionManagerStrings.direct
import typings.amqpConnectionManager.amqpConnectionManagerStrings.error
import typings.amqpConnectionManager.amqpConnectionManagerStrings.fanout
import typings.amqpConnectionManager.amqpConnectionManagerStrings.headers
import typings.amqpConnectionManager.amqpConnectionManagerStrings.topic
import typings.amqpConnectionManager.anon.Name
import typings.amqplib.mod.ConfirmChannel
import typings.amqplib.propertiesMod.ConsumeMessage
import typings.amqplib.propertiesMod.GetMessage
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.Options.DeleteExchange
import typings.amqplib.propertiesMod.Options.Get
import typings.amqplib.propertiesMod.Options.Publish
import typings.amqplib.propertiesMod.Replies.AssertExchange
import typings.amqplib.propertiesMod.Replies.AssertQueue
import typings.amqplib.propertiesMod.Replies.Consume
import typings.amqplib.propertiesMod.Replies.DeleteQueue
import typings.amqplib.propertiesMod.Replies.Empty
import typings.amqplib.propertiesMod.Replies.PurgeQueue
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.promiseBreaker.mod.PromiseBreaker.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelWrapperMod {
  
  @JSImport("amqp-connection-manager/dist/esm/ChannelWrapper", JSImport.Default)
  @js.native
  open class default protected () extends ChannelWrapper {
    /**
      * Create a new ChannelWrapper.
      *
      * @param connectionManager - connection manager which
      *   created this channel.
      * @param [options] -
      * @param [options.name] - A name for this channel.  Handy for debugging.
      * @param [options.setup] - A default setup function to call.  See
      *   `addSetup` for details.
      * @param [options.json] - if true, then ChannelWrapper assumes all
      *   messages passed to `publish()` and `sendToQueue()` are plain JSON objects.
      *   These will be encoded automatically before being sent.
      *
      */
    def this(connectionManager: IAmqpConnectionManager) = this()
    def this(connectionManager: IAmqpConnectionManager, options: CreateChannelOpts) = this()
  }
  
  type Channel = ConfirmChannel | typings.amqplib.mod.Channel
  
  @js.native
  trait ChannelWrapper extends EventEmitter {
    
    /* private */ var _canWaitReconnection: Any = js.native
    
    /**
      * The currently connected channel.  Note that not all setup functions
      * have been run on this channel until `@_settingUp` is either null or
      * resolved.
      */
    /* private */ var _channel: Any = js.native
    
    /**
      * True if the underlying channel has room for more messages.
      */
    /* private */ var _channelHasRoom: Any = js.native
    
    /**
      * True to create a ConfirmChannel. False to create a regular Channel.
      */
    /* private */ var _confirm: Any = js.native
    
    /* private */ var _connectionManager: Any = js.native
    
    /* private */ var _consume: Any = js.native
    
    /** Consumers which will be reconnected on channel errors etc. */
    /* private */ var _consumers: Any = js.native
    
    /* private */ var _enqueueMessage: Any = js.native
    
    /* private */ var _getEncodedMessage: Any = js.native
    
    /** Reason code during publish or sendtoqueue messages. */
    /* private */ var _irrecoverableCode: Any = js.native
    
    /* private */ var _json: Any = js.native
    
    /* private */ var _messageRejected: Any = js.native
    
    /* private */ var _messageResolved: Any = js.native
    
    /** Queued messages, not yet sent. */
    /* private */ var _messages: Any = js.native
    
    /* private */ var _onChannelClose: Any = js.native
    
    /** Called whenever the channel drains. */
    /* private */ var _onChannelDrain: Any = js.native
    
    /* private */ var _onConnect: Any = js.native
    
    /* private */ var _onDisconnect: Any = js.native
    
    /* private */ var _publishQueuedMessages: Any = js.native
    
    /**
      * Default publish timeout
      */
    /* private */ var _publishTimeout: Any = js.native
    
    /* private */ var _reconnectConsumer: Any = js.native
    
    /** If we're in the process of creating a channel, this is a Promise which
      * will resolve when the channel is set up.  Otherwise, this is `null`.
      */
    /* private */ var _settingUp: Any = js.native
    
    /* private */ var _setups: Any = js.native
    
    /* private */ var _shouldPublish: Any = js.native
    
    /* private */ var _startWorker: Any = js.native
    
    /** Oublished, but not yet confirmed messages. */
    /* private */ var _unconfirmedMessages: Any = js.native
    
    /**
      *  We kill off workers when we disconnect.  Whenever we start a new
      * worker, we bump up the `_workerNumber` - this makes it so if stale
      * workers ever do wake up, they'll know to stop working.
      */
    /* private */ var _workerNumber: Any = js.native
    
    /**
      * True if the "worker" is busy sending messages.  False if we need to
      * start the worker to get stuff done.
      */
    /* private */ var _working: Any = js.native
    
    /** Send an `ack` to the underlying channel. */
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    /** Send an `ackAll` to the underlying channel. */
    def ackAll(): Unit = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    /**
      *  Adds a new 'setup handler'.
      *
      * `setup(channel, [cb])` is a function to call when a new underlying channel is created - handy for asserting
      * exchanges and queues exists, and whatnot.  The `channel` object here is a ConfigChannel from amqplib.
      * The `setup` function should return a Promise (or optionally take a callback) - no messages will be sent until
      * this Promise resolves.
      *
      * If there is a connection, `setup()` will be run immediately, and the addSetup Promise/callback won't resolve
      * until `setup` is complete.  Note that in this case, if the setup throws an error, no 'error' event will
      * be emitted, since you can just handle the error here (although the `setup` will still be added for future
      * reconnects, even if it throws an error.)
      *
      * Setup functions should, ideally, not throw errors, but if they do then the ChannelWrapper will emit an 'error'
      * event.
      *
      * @param setup - setup function.
      * @param [done] - callback.
      * @returns - Resolves when complete.
      */
    def addSetup(setup: SetupFunc): js.Promise[Unit] = js.native
    def addSetup(setup: SetupFunc, done: Callback[Unit]): js.Promise[Unit] = js.native
    
    def assertExchange(exchange: String, `type`: direct | topic | headers | fanout | `match`): js.Promise[AssertExchange] = js.native
    def assertExchange(
      exchange: String,
      `type`: direct | topic | headers | fanout | `match`,
      options: typings.amqplib.propertiesMod.Options.AssertExchange
    ): js.Promise[AssertExchange] = js.native
    /** Send a `assertExchange` to the underlying channel. */
    def assertExchange(exchange: String, `type`: String): js.Promise[AssertExchange] = js.native
    def assertExchange(exchange: String, `type`: String, options: typings.amqplib.propertiesMod.Options.AssertExchange): js.Promise[AssertExchange] = js.native
    
    /** Send a `assertQueue` to the underlying channel. */
    def assertQueue(queue: String): js.Promise[AssertQueue] = js.native
    def assertQueue(queue: String, options: typings.amqplib.propertiesMod.Options.AssertQueue): js.Promise[AssertQueue] = js.native
    
    /** Send a `bindExchange` to the underlying channel. */
    def bindExchange(destination: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
    
    /** Send a `bindQueue` to the underlying channel. */
    def bindQueue(queue: String, source: String, pattern: String): js.Promise[Unit] = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: Any): js.Promise[Unit] = js.native
    
    def cancel(consumerTag: String): js.Promise[Unit] = js.native
    
    /**
      * Cancel all consumers
      */
    def cancelAll(): js.Promise[Unit] = js.native
    
    /** Send a `checkExchange` to the underlying channel. */
    def checkExchange(exchange: String): js.Promise[Empty] = js.native
    
    /** Send a `checkQueue` to the underlying channel. */
    def checkQueue(queue: String): js.Promise[AssertQueue] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Setup a consumer
      * This consumer will be reconnected on cancellation and channel errors.
      */
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage, Unit]): js.Promise[Consume] = js.native
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage, Unit], options: ConsumerOptions): js.Promise[Consume] = js.native
    
    /** Send a `deleteExchange` to the underlying channel. */
    def deleteExchange(exchange: String): js.Promise[Empty] = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): js.Promise[Empty] = js.native
    
    /** Send a `deleteQueue` to the underlying channel. */
    def deleteQueue(queue: String): js.Promise[DeleteQueue] = js.native
    def deleteQueue(queue: String, options: typings.amqplib.propertiesMod.Options.DeleteQueue): js.Promise[DeleteQueue] = js.native
    
    /** Send a `get` to the underlying channel. */
    def get(queue: String): js.Promise[GetMessage | `false`] = js.native
    def get(queue: String, options: Get): js.Promise[GetMessage | `false`] = js.native
    
    /** Send a `nack` to the underlying channel. */
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Unit, requeue: Boolean): Unit = js.native
    
    /** Send a `nackAll` to the underlying channel. */
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    def publish(exchange: String, routingKey: String, content: String): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: String, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: String, options: PublishOptions): js.Promise[Boolean] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: String,
      options: PublishOptions,
      done: Callback[Boolean]
    ): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Any): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Any, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Any, options: PublishOptions): js.Promise[Boolean] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Any,
      options: PublishOptions,
      done: Callback[Boolean]
    ): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Buffer): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: PublishOptions): js.Promise[Boolean] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: PublishOptions,
      done: Callback[Boolean]
    ): js.Promise[Boolean] = js.native
    
    /** Send a `purgeQueue` to the underlying channel. */
    def purgeQueue(queue: String): js.Promise[PurgeQueue] = js.native
    
    def queueLength(): Double = js.native
    
    /**
      * Remove a setup function added with `addSetup`.  If there is currently a
      * connection, `teardown(channel, [cb])` will be run immediately, and the
      * returned Promise will not resolve until it completes.
      *
      * @param {function} setup - the setup function to remove.
      * @param {function} [teardown] - `function(channel, [cb])` to run to tear
      *   down the channel.
      * @param {function} [done] - Optional callback.
      * @returns {void | Promise} - Resolves when complete.
      */
    def removeSetup(setup: SetupFunc): js.Promise[Unit] = js.native
    def removeSetup(setup: SetupFunc, teardown: Unit, done: Callback[Unit]): js.Promise[Unit] = js.native
    def removeSetup(setup: SetupFunc, teardown: SetupFunc): js.Promise[Unit] = js.native
    def removeSetup(setup: SetupFunc, teardown: SetupFunc, done: Callback[Unit]): js.Promise[Unit] = js.native
    
    def sendToQueue(queue: String, content: String): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: String, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: String, options: PublishOptions): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: String, options: PublishOptions, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Any): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Any, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Any, options: PublishOptions): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Any, options: PublishOptions, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Buffer): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Buffer, options: Unit, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Buffer, options: PublishOptions): js.Promise[Boolean] = js.native
    def sendToQueue(queue: String, content: Buffer, options: PublishOptions, done: Callback[Boolean]): js.Promise[Boolean] = js.native
    
    /** Send a `unbindExchange` to the underlying channel. */
    def unbindExchange(destination: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
    
    /**
      * Returns a Promise which resolves when this channel next connects.
      * (Mainly here for unit testing...)
      *
      * @param [done] - Optional callback.
      * @returns - Resolves when connected.
      */
    def waitForConnect(): js.Promise[Unit] = js.native
    def waitForConnect(done: Callback[Unit]): js.Promise[Unit] = js.native
  }
  
  trait Consumer extends StObject {
    
    var consumerTag: String | Null
    
    def onMessage(msg: ConsumeMessage): Unit
    
    var options: ConsumerOptions
    
    var queue: String
  }
  object Consumer {
    
    inline def apply(onMessage: ConsumeMessage => Unit, options: ConsumerOptions, queue: String): Consumer = {
      val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), options = options.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], consumerTag = null)
      __obj.asInstanceOf[Consumer]
    }
    
    extension [Self <: Consumer](x: Self) {
      
      inline def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
      
      inline def setConsumerTagNull: Self = StObject.set(x, "consumerTag", null)
      
      inline def setOnMessage(value: ConsumeMessage => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOptions(value: ConsumerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConsumerOptions
    extends StObject
       with typings.amqplib.propertiesMod.Options.Consume {
    
    var prefetch: js.UndefOr[Double] = js.undefined
  }
  object ConsumerOptions {
    
    inline def apply(): ConsumerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerOptions]
    }
    
    extension [Self <: ConsumerOptions](x: Self) {
      
      inline def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    }
  }
  
  trait CreateChannelOpts extends StObject {
    
    /**
      * True to create a ConfirmChannel (default). False to create a regular Channel.
      */
    var confirm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if true, then ChannelWrapper assumes all messages passed to publish() and sendToQueue() are plain JSON objects.
      * These will be encoded automatically before being sent.
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**  Name for this channel. Used for debugging. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Default publish timeout in ms. Messages not published within the given time are rejected with a timeout error.
      */
    var publishTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * A function to call whenever we reconnect to the broker (and therefore create a new underlying channel.)
      * This function should either accept a callback, or return a Promise. See addSetup below
      */
    var setup: js.UndefOr[SetupFunc] = js.undefined
  }
  object CreateChannelOpts {
    
    inline def apply(): CreateChannelOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateChannelOpts]
    }
    
    extension [Self <: CreateChannelOpts](x: Self) {
      
      inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPublishTimeout(value: Double): Self = StObject.set(x, "publishTimeout", value.asInstanceOf[js.Any])
      
      inline def setPublishTimeoutUndefined: Self = StObject.set(x, "publishTimeout", js.undefined)
      
      inline def setSetup(value: SetupFunc): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSetupFunction1(value: (/* channel */ Channel) | (/* channel */ ConfirmChannel) => js.Promise[Unit]): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setSetupFunction2(
        value: ((/* channel */ Channel) | (/* channel */ ConfirmChannel), /* callback */ js.Function1[js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    }
  }
  
  trait PublishOptions
    extends StObject
       with Publish {
    
    /** Message will be rejected after timeout ms */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    extension [Self <: PublishOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type SetupFunc = (js.Function2[
    (/* channel */ Channel) | (/* channel */ ConfirmChannel), 
    /* callback */ js.Function1[js.UndefOr[js.Error], Unit], 
    Unit
  ]) | (js.Function1[(/* channel */ Channel) | (/* channel */ ConfirmChannel), js.Promise[Unit]])
}
