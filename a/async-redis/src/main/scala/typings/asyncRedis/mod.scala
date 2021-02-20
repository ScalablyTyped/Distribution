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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  class ^ () extends Promisified[RedisClient] {
    def this(options: ClientOpts) = this()
    def this(port: Double) = this()
    def this(unix_socket: String) = this()
    def this(port: Double, host: String) = this()
    def this(unix_socket: String, options: ClientOpts) = this()
    def this(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts) = this()
    def this(port: Double, host: String, options: ClientOpts) = this()
  }
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  val ^ : AsyncRedisConstructor = js.native
  
  @js.native
  trait AsyncRedisConstructor
    extends Instantiable0[Promisified[RedisClient]]
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
          js.UndefOr[/* host */ String], 
          /* options */ ClientOpts, 
          Promisified[RedisClient]
        ] {
    
    def createClient(): Promisified[RedisClient] = js.native
    def createClient(options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(port: Double): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: String): Promisified[RedisClient] = js.native
    def createClient(port: Double, host: String, options: ClientOpts): Promisified[RedisClient] = js.native
    def createClient(unix_socket: String): Promisified[RedisClient] = js.native
    def createClient(unix_socket: String, options: ClientOpts): Promisified[RedisClient] = js.native
    
    def decorate(client: RedisClient): Promisified[RedisClient] = js.native
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Inlined async-redis.async-redis.Omit<redis.redis.RedisClient, keyof redis.redis.Commands<boolean>> */
  @js.native
  trait Omitted extends StObject {
    
    def BATCH(): Multi = js.native
    @JSName("BATCH")
    var BATCH_Original: js.Function0[Multi] = js.native
    
    def MULTI(): Multi = js.native
    @JSName("MULTI")
    var MULTI_Original: js.Function0[Multi] = js.native
    
    def addCommand(command: String): Unit = js.native
    @JSName("addCommand")
    var addCommand_Original: js.Function1[/* command */ String, Unit] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    var addListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    def add_command(command: String): Unit = js.native
    @JSName("add_command")
    var add_command_Original: js.Function1[/* command */ String, Unit] = js.native
    
    def batch(): Multi = js.native
    @JSName("batch")
    var batch_Original: js.Function0[Multi] = js.native
    
    var command_queue: js.Array[_] = js.native
    
    var command_queue_length: Double = js.native
    
    var connected: Boolean = js.native
    
    var connection_id: Double = js.native
    
    @JSName("constructor")
    var constructor_Original: js.Function0[js.Any] = js.native
    
    def cork(): Unit = js.native
    @JSName("cork")
    var cork_Original: js.Function0[Unit] = js.native
    
    def duplicate(): RedisClient = js.native
    @JSName("duplicate")
    var duplicate_Original: js.Function0[RedisClient] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    @JSName("emit")
    var emit_Original: js.Function2[/* event */ String, /* repeated */ js.Any, Boolean] = js.native
    
    def end(): Unit = js.native
    @JSName("end")
    var end_Original: js.Function0[Unit] = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]] = js.native
    
    def getMaxListeners(): Double = js.native
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double] = js.native
    
    def listenerCount(event: String): Double = js.native
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* event */ String, Double] = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    
    def multi(): Multi = js.native
    @JSName("multi")
    var multi_Original: js.Function0[Multi] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    var offline_queue: js.Array[_] = js.native
    
    var offline_queue_length: Double = js.native
    
    @JSName("on")
    var on_Original: js.Function2[
        message, 
        /* listener */ js.Function2[/* channel */ String, /* message */ String, Unit], 
        this.type
      ] = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    var once_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    var prependListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    
    def removeAllListeners(): this.type = js.native
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type] = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    var removeListener_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    
    var retry_backoff: Double = js.native
    
    var retry_delay: Double | Error = js.native
    
    def sendCommand(command: String): Boolean = js.native
    @JSName("sendCommand")
    var sendCommand_Original: js.Function1[/* command */ String, Boolean] = js.native
    
    def send_command(command: String): Boolean = js.native
    @JSName("send_command")
    var send_command_Original: js.Function1[/* command */ String, Boolean] = js.native
    
    var server_info: ServerInfo = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
    
    var stream: Duplex = js.native
    
    def uncork(): Unit = js.native
    @JSName("uncork")
    var uncork_Original: js.Function0[Unit] = js.native
    
    def unref(): Unit = js.native
    @JSName("unref")
    var unref_Original: js.Function0[Unit] = js.native
  }
  
  @js.native
  trait Promisified[T]
    extends Omitted
       with Commands[js.Promise[Boolean]]
  
  type _To = AsyncRedisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AsyncRedisConstructor = ^
}
