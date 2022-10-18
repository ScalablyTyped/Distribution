package typings.amqpConnectionManager

import typings.amqpConnectionManager.amqpConnectionManagerStrings.blocked
import typings.amqpConnectionManager.amqpConnectionManagerStrings.connect
import typings.amqpConnectionManager.amqpConnectionManagerStrings.connectFailed
import typings.amqpConnectionManager.amqpConnectionManagerStrings.disconnect
import typings.amqpConnectionManager.amqpConnectionManagerStrings.unblocked
import typings.amqpConnectionManager.anon.ConnectionOptions
import typings.amqpConnectionManager.anon.Err
import typings.amqpConnectionManager.anon.ErrError
import typings.amqpConnectionManager.anon.Reason
import typings.amqpConnectionManager.anon.Timeout
import typings.amqpConnectionManager.distEsmChannelWrapperMod.CreateChannelOpts
import typings.amqplib.mod.Connection
import typings.amqplib.propertiesMod.Options.Connect
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmAmqpConnectionManagerMod {
  
  @JSImport("amqp-connection-manager/dist/esm/AmqpConnectionManager", JSImport.Default)
  @js.native
  /**
    *  Create a new AmqplibConnectionManager.
    *
    * @param urls - An array of brokers to connect to.
    *   Takes url strings or objects {url: string, connectionOptions?: object}
    *   If present, a broker's [connectionOptions] will be used instead
    *   of [options.connectionOptions] when passed to the amqplib connect method.
    *   AmqplibConnectionManager will round-robin between them whenever it
    *   needs to create a new connection.
    * @param [options={}] -
    * @param [options.heartbeatIntervalInSeconds=5] - The interval,
    *   in seconds, to send heartbeats.
    * @param [options.reconnectTimeInSeconds] - The time to wait
    *   before trying to reconnect.  If not specified, defaults to
    *   `heartbeatIntervalInSeconds`.
    * @param [options.connectionOptions] - Passed to the amqplib
    *   connect method.
    * @param [options.findServers] - A `fn(callback)` or a `fn()`
    *   which returns a Promise.  This should resolve to one or more servers
    *   to connect to, either a single URL or an array of URLs.  This is handy
    *   when you're using a service discovery mechanism such as Consul or etcd.
    *   Note that if this is supplied, then `urls` is ignored.
    */
  open class default () extends AmqpConnectionManager {
    def this(urls: js.Array[ConnectionUrl]) = this()
    def this(urls: ConnectionUrl) = this()
    def this(urls: js.Array[ConnectionUrl], options: AmqpConnectionManagerOptions) = this()
    def this(urls: Null, options: AmqpConnectionManagerOptions) = this()
    def this(urls: Unit, options: AmqpConnectionManagerOptions) = this()
    def this(urls: ConnectionUrl, options: AmqpConnectionManagerOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amqpConnectionManager.anon.ConnectionOptionsnoDelayb
    - typings.amqpConnectionManager.anon.TcpSocketConnectOptsnoDel
  */
  trait AmpqConnectionOptions extends StObject
  object AmpqConnectionOptions {
    
    inline def ConnectionOptionsnoDelayb(): typings.amqpConnectionManager.anon.ConnectionOptionsnoDelayb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.amqpConnectionManager.anon.ConnectionOptionsnoDelayb]
    }
    
    inline def TcpSocketConnectOptsnoDel(port: Double): typings.amqpConnectionManager.anon.TcpSocketConnectOptsnoDel = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amqpConnectionManager.anon.TcpSocketConnectOptsnoDel]
    }
  }
  
  @js.native
  trait AmqpConnectionManager
    extends EventEmitter
       with IAmqpConnectionManager {
    
    /* private */ var _cancelRetriesHandler: Any = js.native
    
    /* private */ var _channels: Any = js.native
    
    /* private */ var _closed: Any = js.native
    
    /* private */ var _connect: Any = js.native
    
    /* private */ var _connectPromise: Any = js.native
    
    /* private */ var _currentConnection: Any = js.native
    
    /* private */ var _currentUrl: Any = js.native
    
    /* private */ var _findServers: Any = js.native
    
    /* private */ var _urls: Any = js.native
    
    /**
      * Alias for `emitter.on(eventName, listener)`.
      * @since v0.1.26
      */
    /* InferMemberOverrides */
    override def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /** Returns the number of registered channels. */
    @JSName("channelCount")
    def channelCount_MAmqpConnectionManager: Double = js.native
    
    /** The current connection. */
    @JSName("connection")
    def connection_MAmqpConnectionManager: js.UndefOr[Connection] = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * console.log(util.inspect(server.listeners('connection')));
      * // Prints: [ [Function] ]
      * ```
      * @since v0.1.26
      */
    /* InferMemberOverrides */
    override def listeners(eventName: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Adds the `listener` function to the end of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => console.log('a'));
      * myEE.prependListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.1.101
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName`. The
      * next time `eventName` is triggered, this listener is removed and then invoked.
      *
      * ```js
      * server.once('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.once('foo', () => console.log('a'));
      * myEE.prependOnceListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.3.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds the `listener` function to the _beginning_ of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.prependListener('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
      * listener is removed, and then invoked.
      *
      * ```js
      * server.prependOnceListener('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Removes the specified `listener` from the listener array for the event named`eventName`.
      *
      * ```js
      * const callback = (stream) => {
      *   console.log('someone connected!');
      * };
      * server.on('connection', callback);
      * // ...
      * server.removeListener('connection', callback);
      * ```
      *
      * `removeListener()` will remove, at most, one instance of a listener from the
      * listener array. If any single listener has been added multiple times to the
      * listener array for the specified `eventName`, then `removeListener()` must be
      * called multiple times to remove each instance.
      *
      * Once an event is emitted, all listeners attached to it at the
      * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
      * will not remove them from`emit()` in progress. Subsequent events behave as expected.
      *
      * ```js
      * const myEmitter = new MyEmitter();
      *
      * const callbackA = () => {
      *   console.log('A');
      *   myEmitter.removeListener('event', callbackB);
      * };
      *
      * const callbackB = () => {
      *   console.log('B');
      * };
      *
      * myEmitter.on('event', callbackA);
      *
      * myEmitter.on('event', callbackB);
      *
      * // callbackA removes listener callbackB but it will still be called.
      * // Internal listener array at time of emit [callbackA, callbackB]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * //   B
      *
      * // callbackB is now removed.
      * // Internal listener array [callbackA]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * ```
      *
      * Because listeners are managed using an internal array, calling this will
      * change the position indices of any listener registered _after_ the listener
      * being removed. This will not impact the order in which listeners are called,
      * but it means that any copies of the listener array as returned by
      * the `emitter.listeners()` method will need to be recreated.
      *
      * When a single function has been added as a handler multiple times for a single
      * event (as in the example below), `removeListener()` will remove the most
      * recently added instance. In the example the `once('ping')`listener is removed:
      *
      * ```js
      * const ee = new EventEmitter();
      *
      * function pong() {
      *   console.log('pong');
      * }
      *
      * ee.on('ping', pong);
      * ee.once('ping', pong);
      * ee.removeListener('ping', pong);
      *
      * ee.emit('ping');
      * ee.emit('ping');
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.1.26
      */
    /* InferMemberOverrides */
    override def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  }
  
  trait AmqpConnectionManagerOptions extends StObject {
    
    /** Connection options, passed as options to the amqplib.connect() method. */
    var connectionOptions: js.UndefOr[AmpqConnectionOptions] = js.undefined
    
    /**
      * `findServers` is a function that which returns one or more servers to
      * connect to. This should return either a single URL or an array of URLs.
      * This is handy when you're using a service discovery mechanism such as
      * Consul or etcd. Instead of taking a callback, this can also return a
      * Promise. Note that if this is supplied, then `urls` is ignored.
      */
    var findServers: js.UndefOr[
        (js.Function1[
          /* callback */ js.Function1[/* urls */ ConnectionUrl | js.Array[ConnectionUrl], Unit], 
          Unit
        ]) | (js.Function0[js.Promise[ConnectionUrl | js.Array[ConnectionUrl]]])
      ] = js.undefined
    
    /** Interval to send heartbeats to broker. Defaults to 5 seconds. */
    var heartbeatIntervalInSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The time to wait before trying to reconnect. If not specified, defaults
      * to `heartbeatIntervalInSeconds`.
      */
    var reconnectTimeInSeconds: js.UndefOr[Double] = js.undefined
  }
  object AmqpConnectionManagerOptions {
    
    inline def apply(): AmqpConnectionManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmqpConnectionManagerOptions]
    }
    
    extension [Self <: AmqpConnectionManagerOptions](x: Self) {
      
      inline def setConnectionOptions(value: AmpqConnectionOptions): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
      
      inline def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
      
      inline def setFindServers(
        value: (js.Function1[
              /* callback */ js.Function1[/* urls */ ConnectionUrl | js.Array[ConnectionUrl], Unit], 
              Unit
            ]) | (js.Function0[js.Promise[ConnectionUrl | js.Array[ConnectionUrl]]])
      ): Self = StObject.set(x, "findServers", value.asInstanceOf[js.Any])
      
      inline def setFindServersFunction0(value: () => js.Promise[ConnectionUrl | js.Array[ConnectionUrl]]): Self = StObject.set(x, "findServers", js.Any.fromFunction0(value))
      
      inline def setFindServersFunction1(
        value: /* callback */ js.Function1[/* urls */ ConnectionUrl | js.Array[ConnectionUrl], Unit] => Unit
      ): Self = StObject.set(x, "findServers", js.Any.fromFunction1(value))
      
      inline def setFindServersUndefined: Self = StObject.set(x, "findServers", js.undefined)
      
      inline def setHeartbeatIntervalInSeconds(value: Double): Self = StObject.set(x, "heartbeatIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatIntervalInSecondsUndefined: Self = StObject.set(x, "heartbeatIntervalInSeconds", js.undefined)
      
      inline def setReconnectTimeInSeconds(value: Double): Self = StObject.set(x, "reconnectTimeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setReconnectTimeInSecondsUndefined: Self = StObject.set(x, "reconnectTimeInSeconds", js.undefined)
    }
  }
  
  type ConnectFailedListener = js.Function1[/* arg */ Err, Unit]
  
  type ConnectListener = js.Function1[/* arg */ typings.amqpConnectionManager.anon.Connection, Unit]
  
  type ConnectionUrl = String | Connect | ConnectionOptions
  
  @js.native
  trait IAmqpConnectionManager extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_blocked(event: blocked, listener: js.Function1[/* arg */ Reason, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(event: connect, listener: ConnectListener): this.type = js.native
    @JSName("addListener")
    def addListener_connectFailed(event: connectFailed, listener: ConnectFailedListener): this.type = js.native
    @JSName("addListener")
    def addListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ ErrError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unblocked(event: unblocked, listener: js.Function0[Unit]): this.type = js.native
    
    /** Returns the number of registered channels. */
    val channelCount: Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    def connect(options: Timeout): js.Promise[Unit] = js.native
    
    /** The current connection. */
    val connection: js.UndefOr[Connection] = js.native
    
    var connectionOptions: js.UndefOr[AmpqConnectionOptions] = js.native
    
    def createChannel(): typings.amqpConnectionManager.distEsmChannelWrapperMod.default = js.native
    def createChannel(options: CreateChannelOpts): typings.amqpConnectionManager.distEsmChannelWrapperMod.default = js.native
    
    var heartbeatIntervalInSeconds: Double = js.native
    
    def isConnected(): Boolean = js.native
    
    def listeners(eventName: String): js.Array[js.Function] = js.native
    def listeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_blocked(event: blocked, listener: js.Function1[/* arg */ Reason, Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: ConnectListener): this.type = js.native
    @JSName("on")
    def on_connectFailed(event: connectFailed, listener: ConnectFailedListener): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* arg */ ErrError, Unit]): this.type = js.native
    @JSName("on")
    def on_unblocked(event: unblocked, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_blocked(event: blocked, listener: js.Function1[/* arg */ Reason, Unit]): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: ConnectListener): this.type = js.native
    @JSName("once")
    def once_connectFailed(event: connectFailed, listener: ConnectFailedListener): this.type = js.native
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* arg */ ErrError, Unit]): this.type = js.native
    @JSName("once")
    def once_unblocked(event: unblocked, listener: js.Function0[Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_blocked(event: blocked, listener: js.Function1[/* arg */ Reason, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: ConnectListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_connectFailed(event: connectFailed, listener: ConnectFailedListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ ErrError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unblocked(event: unblocked, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_blocked(event: blocked, listener: js.Function1[/* arg */ Reason, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: ConnectListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connectFailed(event: connectFailed, listener: ConnectFailedListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ ErrError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unblocked(event: unblocked, listener: js.Function0[Unit]): this.type = js.native
    
    def reconnect(): Unit = js.native
    
    var reconnectTimeInSeconds: Double = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  }
}
