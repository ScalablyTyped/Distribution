package typings.amqpRpc

import typings.amqpRpc.anon.AutoDelete
import typings.amqpRpc.anon.DefaultExchangeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqp-rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("amqp-rpc", "amqpRPC")
  @js.native
  class amqpRPC () extends StObject {
    def this(opt: Options) = this()
    
    def call[T](cmd: String, params: T): String = js.native
    def call[T](cmd: String, params: T, cb: Unit, context: js.Any): String = js.native
    def call[T](cmd: String, params: T, cb: Unit, context: js.Any, options: CallOptions): String = js.native
    def call[T](cmd: String, params: T, cb: Unit, context: Unit, options: CallOptions): String = js.native
    def call[T](cmd: String, params: T, cb: Callback): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: js.Any): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: js.Any, options: CallOptions): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: Unit, options: CallOptions): String = js.native
    
    def callBroadcast[T](cmd: String, params: T): Unit = js.native
    def callBroadcast[T](cmd: String, params: T, options: BroadcastOptions): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def generateQueueName(`type`: String): String = js.native
    
    def off(cmd: String): Boolean = js.native
    
    def offBroadcast(cmd: String): Boolean = js.native
    
    def on[T](
      cmd: String,
      cb: js.Function3[
          /* param */ js.UndefOr[T], 
          /* cb */ js.UndefOr[Callback], 
          /* info */ js.UndefOr[CommandInfo], 
          Unit
        ]
    ): Boolean = js.native
    def on[T](
      cmd: String,
      cb: js.Function3[
          /* param */ js.UndefOr[T], 
          /* cb */ js.UndefOr[Callback], 
          /* info */ js.UndefOr[CommandInfo], 
          Unit
        ],
      context: js.Any
    ): Boolean = js.native
    def on[T](
      cmd: String,
      cb: js.Function3[
          /* param */ js.UndefOr[T], 
          /* cb */ js.UndefOr[Callback], 
          /* info */ js.UndefOr[CommandInfo], 
          Unit
        ],
      context: js.Any,
      options: HandlerOptions
    ): Boolean = js.native
    def on[T](
      cmd: String,
      cb: js.Function3[
          /* param */ js.UndefOr[T], 
          /* cb */ js.UndefOr[Callback], 
          /* info */ js.UndefOr[CommandInfo], 
          Unit
        ],
      context: Unit,
      options: HandlerOptions
    ): Boolean = js.native
    
    def onBroadcast[T](cmd: String): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit]
    ): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
      context: js.Any
    ): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
      context: js.Any,
      options: js.Any
    ): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
      context: Unit,
      options: js.Any
    ): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: Unit, context: js.Any): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: Unit, context: js.Any, options: js.Any): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: Unit, context: Unit, options: js.Any): Boolean = js.native
  }
  
  inline def factory(): amqpRPC = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")().asInstanceOf[amqpRPC]
  inline def factory(opt: Options): amqpRPC = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(opt.asInstanceOf[js.Any]).asInstanceOf[amqpRPC]
  
  trait BroadcastOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var onComplete: js.UndefOr[js.Any] = js.undefined
    
    var onResponse: js.UndefOr[js.Any] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object BroadcastOptions {
    
    inline def apply(): BroadcastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastOptions]
    }
    
    extension [Self <: BroadcastOptions](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setOnComplete(value: js.Any): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnResponse(value: js.Any): Self = StObject.set(x, "onResponse", value.asInstanceOf[js.Any])
      
      inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait CallOptions extends StObject {
    
    var autoDeleteCallback: js.UndefOr[js.Any] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
  }
  object CallOptions {
    
    inline def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    extension [Self <: CallOptions](x: Self) {
      
      inline def setAutoDeleteCallback(value: js.Any): Self = StObject.set(x, "autoDeleteCallback", value.asInstanceOf[js.Any])
      
      inline def setAutoDeleteCallbackUndefined: Self = StObject.set(x, "autoDeleteCallback", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  
  type CallbackWithError = js.Function2[/* err */ js.Any, /* repeated */ js.Any, Unit]
  
  trait CommandInfo extends StObject {
    
    var cmd: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var exchange: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object CommandInfo {
    
    inline def apply(): CommandInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandInfo]
    }
    
    extension [Self <: CommandInfo](x: Self) {
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HandlerOptions extends StObject {
    
    var autoDelete: js.UndefOr[Boolean] = js.undefined
    
    var durable: js.UndefOr[Boolean] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var queueName: js.UndefOr[String] = js.undefined
  }
  object HandlerOptions {
    
    inline def apply(): HandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerOptions]
    }
    
    extension [Self <: HandlerOptions](x: Self) {
      
      inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      inline def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      inline def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      inline def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var conn_options: js.UndefOr[js.Any] = js.undefined
    
    var connection: js.UndefOr[js.Any] = js.undefined
    
    var exchange: js.UndefOr[String] = js.undefined
    
    var exchangeInstance: js.UndefOr[js.Any] = js.undefined
    
    var exchange_options: js.UndefOr[AutoDelete] = js.undefined
    
    var ipml_options: js.UndefOr[DefaultExchangeName] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConn_options(value: js.Any): Self = StObject.set(x, "conn_options", value.asInstanceOf[js.Any])
      
      inline def setConn_optionsUndefined: Self = StObject.set(x, "conn_options", js.undefined)
      
      inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      inline def setExchangeInstance(value: js.Any): Self = StObject.set(x, "exchangeInstance", value.asInstanceOf[js.Any])
      
      inline def setExchangeInstanceUndefined: Self = StObject.set(x, "exchangeInstance", js.undefined)
      
      inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
      
      inline def setExchange_options(value: AutoDelete): Self = StObject.set(x, "exchange_options", value.asInstanceOf[js.Any])
      
      inline def setExchange_optionsUndefined: Self = StObject.set(x, "exchange_options", js.undefined)
      
      inline def setIpml_options(value: DefaultExchangeName): Self = StObject.set(x, "ipml_options", value.asInstanceOf[js.Any])
      
      inline def setIpml_optionsUndefined: Self = StObject.set(x, "ipml_options", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
