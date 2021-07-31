package typings.asyncRedis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.asyncRedis.asyncRedisStrings.message
import typings.node.streamMod.Duplex
import typings.redis.mod.ClientOpts
import typings.redis.mod.Commands
import typings.redis.mod.Multi
import typings.redis.mod.RedisClient
import typings.redis.mod.ServerInfo
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Promisified[RedisClient] {
    def this(options: ClientOpts) = this()
    def this(port: Double) = this()
    def this(unix_socket: String) = this()
    def this(port: Double, host: String) = this()
    def this(unix_socket: String, options: ClientOpts) = this()
    def this(port: Double, host: String, options: ClientOpts) = this()
    def this(port: Double, host: Unit, options: ClientOpts) = this()
    
    /* CompleteClass */
    override def BATCH(): Multi = js.native
    /* CompleteClass */
    @JSName("BATCH")
    var BATCH_Original: js.Function0[Multi] = js.native
    
    /* CompleteClass */
    override def MULTI(): Multi = js.native
    /* CompleteClass */
    @JSName("MULTI")
    var MULTI_Original: js.Function0[Multi] = js.native
    
    /* CompleteClass */
    override def addCommand(command: String): Unit = js.native
    /* CompleteClass */
    @JSName("addCommand")
    var addCommand_Original: js.Function1[/* command */ String, Unit] = js.native
    
    /* CompleteClass */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("addListener")
    var addListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    override def add_command(command: String): Unit = js.native
    /* CompleteClass */
    @JSName("add_command")
    var add_command_Original: js.Function1[/* command */ String, Unit] = js.native
    
    /* CompleteClass */
    override def batch(): Multi = js.native
    /* CompleteClass */
    @JSName("batch")
    var batch_Original: js.Function0[Multi] = js.native
    
    /* CompleteClass */
    var command_queue: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var command_queue_length: Double = js.native
    
    /* CompleteClass */
    var connected: Boolean = js.native
    
    /* CompleteClass */
    var connection_id: Double = js.native
    
    /* CompleteClass */
    @JSName("constructor")
    var constructor_Original: js.Function0[js.Any] = js.native
    
    /* CompleteClass */
    override def cork(): Unit = js.native
    /* CompleteClass */
    @JSName("cork")
    var cork_Original: js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def duplicate(): RedisClient = js.native
    /* CompleteClass */
    @JSName("duplicate")
    var duplicate_Original: js.Function0[RedisClient] = js.native
    
    /* CompleteClass */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* CompleteClass */
    @JSName("emit")
    var emit_Original: js.Function2[/* event */ String, /* repeated */ js.Any, Boolean] = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    /* CompleteClass */
    @JSName("end")
    var end_Original: js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    /* CompleteClass */
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]] = js.native
    
    /* CompleteClass */
    override def getMaxListeners(): Double = js.native
    /* CompleteClass */
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def listenerCount(event: String): Double = js.native
    /* CompleteClass */
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* event */ String, Double] = js.native
    
    /* CompleteClass */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* CompleteClass */
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    
    /* CompleteClass */
    override def multi(): Multi = js.native
    /* CompleteClass */
    @JSName("multi")
    var multi_Original: js.Function0[Multi] = js.native
    
    /* CompleteClass */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    var offline_queue: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var offline_queue_length: Double = js.native
    
    /* CompleteClass */
    @JSName("on")
    var on_Original: js.Function2[
        message, 
        /* listener */ js.Function2[/* channel */ String, /* message */ String, Unit], 
        this.type
      ] = js.native
    /* CompleteClass */
    @JSName("on")
    override def on_message(event: message, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("once")
    var once_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("prependListener")
    var prependListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* CompleteClass */
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    
    /* CompleteClass */
    override def removeAllListeners(): this.type = js.native
    /* CompleteClass */
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type] = js.native
    
    /* CompleteClass */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* CompleteClass */
    @JSName("removeListener")
    var removeListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    /* CompleteClass */
    var retry_backoff: Double = js.native
    
    /* CompleteClass */
    var retry_delay: Double | Error = js.native
    
    /* CompleteClass */
    override def sendCommand(command: String): Boolean = js.native
    /* CompleteClass */
    @JSName("sendCommand")
    var sendCommand_Original: js.Function1[/* command */ String, Boolean] = js.native
    
    /* CompleteClass */
    override def send_command(command: String): Boolean = js.native
    /* CompleteClass */
    @JSName("send_command")
    var send_command_Original: js.Function1[/* command */ String, Boolean] = js.native
    
    /* CompleteClass */
    var server_info: ServerInfo = js.native
    
    /* CompleteClass */
    override def setMaxListeners(n: Double): this.type = js.native
    /* CompleteClass */
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
    
    /* CompleteClass */
    var stream: Duplex = js.native
    
    /* CompleteClass */
    override def uncork(): Unit = js.native
    /* CompleteClass */
    @JSName("uncork")
    var uncork_Original: js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def unref(): Unit = js.native
    /* CompleteClass */
    @JSName("unref")
    var unref_Original: js.Function0[Unit] = js.native
  }
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AsyncRedisConstructor = js.native
  
  @js.native
  trait AsyncRedisConstructor
    extends StObject
       with Instantiable0[Promisified[RedisClient]]
       with Instantiable1[
          (/* options */ ClientOpts) | (/* port */ Double) | (/* unix_socket */ String), 
          Promisified[RedisClient]
        ]
       with Instantiable2[
          (/* port */ Double) | (/* unix_socket */ String), 
          (/* options */ ClientOpts) | (/* host */ String), 
          Promisified[RedisClient]
        ]
       with Instantiable3[
          /* port */ Double, 
          (/* host */ String) | (/* host */ Unit), 
          /* options */ ClientOpts, 
          Promisified[RedisClient]
        ] {
    
    def createClient(): Promisified[RedisClient] = js.native
    def createClient(options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(port: Double): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: String): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: String, options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: Unit, options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(unix_socket: String): Promisified[RedisClient] = js.native
    def createClient(unix_socket: String, options: ClientOpts): Promisified[RedisClient] = js.native
    
    def decorate(client: RedisClient): Promisified[RedisClient] = js.native
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Inlined async-redis.async-redis.Omit<redis.redis.RedisClient, keyof redis.redis.Commands<boolean>> */
  trait Omitted extends StObject {
    
    def BATCH(): Multi
    @JSName("BATCH")
    var BATCH_Original: js.Function0[Multi]
    
    def MULTI(): Multi
    @JSName("MULTI")
    var MULTI_Original: js.Function0[Multi]
    
    def addCommand(command: String): Unit
    @JSName("addCommand")
    var addCommand_Original: js.Function1[/* command */ String, Unit]
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("addListener")
    var addListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    def add_command(command: String): Unit
    @JSName("add_command")
    var add_command_Original: js.Function1[/* command */ String, Unit]
    
    def batch(): Multi
    @JSName("batch")
    var batch_Original: js.Function0[Multi]
    
    var command_queue: js.Array[js.Any]
    
    var command_queue_length: Double
    
    var connected: Boolean
    
    var connection_id: Double
    
    @JSName("constructor")
    var constructor_Original: js.Function0[js.Any]
    
    def cork(): Unit
    @JSName("cork")
    var cork_Original: js.Function0[Unit]
    
    def duplicate(): RedisClient
    @JSName("duplicate")
    var duplicate_Original: js.Function0[RedisClient]
    
    def emit(event: String, args: js.Any*): Boolean
    @JSName("emit")
    var emit_Original: js.Function2[/* event */ String, /* repeated */ js.Any, Boolean]
    
    def end(): Unit
    @JSName("end")
    var end_Original: js.Function0[Unit]
    
    def eventNames(): js.Array[String | js.Symbol]
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]]
    
    def getMaxListeners(): Double
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double]
    
    def listenerCount(event: String): Double
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* event */ String, Double]
    
    def listeners(event: String): js.Array[js.Function]
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]]
    
    def multi(): Multi
    @JSName("multi")
    var multi_Original: js.Function0[Multi]
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    var offline_queue: js.Array[js.Any]
    
    var offline_queue_length: Double
    
    @JSName("on")
    var on_Original: js.Function2[
        message, 
        /* listener */ js.Function2[/* channel */ String, /* message */ String, Unit], 
        this.type
      ]
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("once")
    var once_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("prependListener")
    var prependListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    def rawListeners(event: String): js.Array[js.Function]
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]]
    
    def removeAllListeners(): this.type
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type]
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("removeListener")
    var removeListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    var retry_backoff: Double
    
    var retry_delay: Double | Error
    
    def sendCommand(command: String): Boolean
    @JSName("sendCommand")
    var sendCommand_Original: js.Function1[/* command */ String, Boolean]
    
    def send_command(command: String): Boolean
    @JSName("send_command")
    var send_command_Original: js.Function1[/* command */ String, Boolean]
    
    var server_info: ServerInfo
    
    def setMaxListeners(n: Double): this.type
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type]
    
    var stream: Duplex
    
    def uncork(): Unit
    @JSName("uncork")
    var uncork_Original: js.Function0[Unit]
    
    def unref(): Unit
    @JSName("unref")
    var unref_Original: js.Function0[Unit]
  }
  object Omitted {
    
    @scala.inline
    def apply(
      BATCH: () => Multi,
      MULTI: () => Multi,
      addCommand: /* command */ String => Unit,
      addListener: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      add_command: /* command */ String => Unit,
      batch: () => Multi,
      command_queue: js.Array[js.Any],
      command_queue_length: Double,
      connected: Boolean,
      connection_id: Double,
      constructor: () => js.Any,
      cork: () => Unit,
      duplicate: () => RedisClient,
      emit: (/* event */ String, /* repeated */ js.Any) => Boolean,
      end: () => Unit,
      eventNames: () => js.Array[String | js.Symbol],
      getMaxListeners: () => Double,
      listenerCount: /* event */ String => Double,
      listeners: /* event */ String => js.Array[js.Function],
      multi: () => Multi,
      off: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      offline_queue: js.Array[js.Any],
      offline_queue_length: Double,
      on: (message, /* listener */ js.Function2[/* channel */ String, /* message */ String, Unit]) => Omitted,
      once: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      prependListener: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      prependOnceListener: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      rawListeners: /* event */ String => js.Array[js.Function],
      removeAllListeners: () => Omitted,
      removeListener: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted,
      retry_backoff: Double,
      retry_delay: Double | Error,
      sendCommand: /* command */ String => Boolean,
      send_command: /* command */ String => Boolean,
      server_info: ServerInfo,
      setMaxListeners: /* n */ Double => Omitted,
      stream: Duplex,
      uncork: () => Unit,
      unref: () => Unit
    ): Omitted = {
      val __obj = js.Dynamic.literal(BATCH = js.Any.fromFunction0(BATCH), MULTI = js.Any.fromFunction0(MULTI), addCommand = js.Any.fromFunction1(addCommand), addListener = js.Any.fromFunction2(addListener), add_command = js.Any.fromFunction1(add_command), batch = js.Any.fromFunction0(batch), command_queue = command_queue.asInstanceOf[js.Any], command_queue_length = command_queue_length.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], connection_id = connection_id.asInstanceOf[js.Any], constructor = js.Any.fromFunction0(constructor), cork = js.Any.fromFunction0(cork), duplicate = js.Any.fromFunction0(duplicate), emit = js.Any.fromFunction2(emit), end = js.Any.fromFunction0(end), eventNames = js.Any.fromFunction0(eventNames), getMaxListeners = js.Any.fromFunction0(getMaxListeners), listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), multi = js.Any.fromFunction0(multi), off = js.Any.fromFunction2(off), offline_queue = offline_queue.asInstanceOf[js.Any], offline_queue_length = offline_queue_length.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), rawListeners = js.Any.fromFunction1(rawListeners), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), retry_backoff = retry_backoff.asInstanceOf[js.Any], retry_delay = retry_delay.asInstanceOf[js.Any], sendCommand = js.Any.fromFunction1(sendCommand), send_command = js.Any.fromFunction1(send_command), server_info = server_info.asInstanceOf[js.Any], setMaxListeners = js.Any.fromFunction1(setMaxListeners), stream = stream.asInstanceOf[js.Any], uncork = js.Any.fromFunction0(uncork), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Omitted]
    }
    
    @scala.inline
    implicit class OmittedMutableBuilder[Self <: Omitted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCommand(value: /* command */ String => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddListener(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAdd_command(value: /* command */ String => Unit): Self = StObject.set(x, "add_command", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBATCH(value: () => Multi): Self = StObject.set(x, "BATCH", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCommand_queue(value: js.Array[js.Any]): Self = StObject.set(x, "command_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand_queueVarargs(value: js.Any*): Self = StObject.set(x, "command_queue", js.Array(value :_*))
      
      @scala.inline
      def setCommand_queue_length(value: Double): Self = StObject.set(x, "command_queue_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection_id(value: Double): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructor(value: () => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCork(value: () => Unit): Self = StObject.set(x, "cork", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDuplicate(value: () => RedisClient): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmit(value: (/* event */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEventNames(value: () => js.Array[String | js.Symbol]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMULTI(value: () => Multi): Self = StObject.set(x, "MULTI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOff(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffline_queue(value: js.Array[js.Any]): Self = StObject.set(x, "offline_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffline_queueVarargs(value: js.Any*): Self = StObject.set(x, "offline_queue", js.Array(value :_*))
      
      @scala.inline
      def setOffline_queue_length(value: Double): Self = StObject.set(x, "offline_queue_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(
        value: (message, /* listener */ js.Function2[/* channel */ String, /* message */ String, Unit]) => Omitted
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependListener(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependOnceListener(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "rawListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAllListeners(value: () => Omitted): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => Omitted): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRetry_backoff(value: Double): Self = StObject.set(x, "retry_backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_delay(value: Double | Error): Self = StObject.set(x, "retry_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendCommand(value: /* command */ String => Boolean): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSend_command(value: /* command */ String => Boolean): Self = StObject.set(x, "send_command", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServer_info(value: ServerInfo): Self = StObject.set(x, "server_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetMaxListeners(value: /* n */ Double => Omitted): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStream(value: Duplex): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncork(value: () => Unit): Self = StObject.set(x, "uncork", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Promisified[T]
    extends StObject
       with Omitted
       with Commands[js.Promise[Boolean]]
  
  type _To = js.Object & AsyncRedisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AsyncRedisConstructor = ^
}
