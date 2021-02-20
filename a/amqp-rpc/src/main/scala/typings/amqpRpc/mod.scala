package typings.amqpRpc

import typings.amqpRpc.anon.AutoDelete
import typings.amqpRpc.anon.DefaultExchangeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqp-rpc", "amqpRPC")
  @js.native
  class amqpRPC () extends StObject {
    def this(opt: Options) = this()
    
    def call[T](cmd: String, params: T): String = js.native
    def call[T](
      cmd: String,
      params: T,
      cb: js.UndefOr[scala.Nothing],
      context: js.UndefOr[scala.Nothing],
      options: CallOptions
    ): String = js.native
    def call[T](cmd: String, params: T, cb: js.UndefOr[scala.Nothing], context: js.Any): String = js.native
    def call[T](cmd: String, params: T, cb: js.UndefOr[scala.Nothing], context: js.Any, options: CallOptions): String = js.native
    def call[T](cmd: String, params: T, cb: Callback): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: js.UndefOr[scala.Nothing], options: CallOptions): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: js.Any): String = js.native
    def call[T](cmd: String, params: T, cb: Callback, context: js.Any, options: CallOptions): String = js.native
    
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
      context: js.UndefOr[scala.Nothing],
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
    
    def onBroadcast[T](cmd: String): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], options: js.Any): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: js.UndefOr[scala.Nothing], context: js.Any): Boolean = js.native
    def onBroadcast[T](cmd: String, cb: js.UndefOr[scala.Nothing], context: js.Any, options: js.Any): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit]
    ): Boolean = js.native
    def onBroadcast[T](
      cmd: String,
      cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
      context: js.UndefOr[scala.Nothing],
      options: js.Any
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
  }
  
  @JSImport("amqp-rpc", "factory")
  @js.native
  def factory(): amqpRPC = js.native
  @JSImport("amqp-rpc", "factory")
  @js.native
  def factory(opt: Options): amqpRPC = js.native
  
  @js.native
  trait BroadcastOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var onComplete: js.UndefOr[js.Any] = js.native
    
    var onResponse: js.UndefOr[js.Any] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object BroadcastOptions {
    
    @scala.inline
    def apply(): BroadcastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastOptions]
    }
    
    @scala.inline
    implicit class BroadcastOptionsMutableBuilder[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setOnComplete(value: js.Any): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnResponse(value: js.Any): Self = StObject.set(x, "onResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait CallOptions extends StObject {
    
    var autoDeleteCallback: js.UndefOr[js.Any] = js.native
    
    var correlationId: js.UndefOr[String] = js.native
  }
  object CallOptions {
    
    @scala.inline
    def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    @scala.inline
    implicit class CallOptionsMutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDeleteCallback(value: js.Any): Self = StObject.set(x, "autoDeleteCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteCallbackUndefined: Self = StObject.set(x, "autoDeleteCallback", js.undefined)
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  
  type CallbackWithError = js.Function2[/* err */ js.Any, /* repeated */ js.Any, Unit]
  
  @js.native
  trait CommandInfo extends StObject {
    
    var cmd: js.UndefOr[String] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var exchange: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object CommandInfo {
    
    @scala.inline
    def apply(): CommandInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandInfo]
    }
    
    @scala.inline
    implicit class CommandInfoMutableBuilder[Self <: CommandInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait HandlerOptions extends StObject {
    
    var autoDelete: js.UndefOr[Boolean] = js.native
    
    var durable: js.UndefOr[Boolean] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var queueName: js.UndefOr[String] = js.native
  }
  object HandlerOptions {
    
    @scala.inline
    def apply(): HandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerOptions]
    }
    
    @scala.inline
    implicit class HandlerOptionsMutableBuilder[Self <: HandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var conn_options: js.UndefOr[js.Any] = js.native
    
    var connection: js.UndefOr[js.Any] = js.native
    
    var exchange: js.UndefOr[String] = js.native
    
    var exchangeInstance: js.UndefOr[js.Any] = js.native
    
    var exchange_options: js.UndefOr[AutoDelete] = js.native
    
    var ipml_options: js.UndefOr[DefaultExchangeName] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConn_options(value: js.Any): Self = StObject.set(x, "conn_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConn_optionsUndefined: Self = StObject.set(x, "conn_options", js.undefined)
      
      @scala.inline
      def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchangeInstance(value: js.Any): Self = StObject.set(x, "exchangeInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchangeInstanceUndefined: Self = StObject.set(x, "exchangeInstance", js.undefined)
      
      @scala.inline
      def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
      
      @scala.inline
      def setExchange_options(value: AutoDelete): Self = StObject.set(x, "exchange_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchange_optionsUndefined: Self = StObject.set(x, "exchange_options", js.undefined)
      
      @scala.inline
      def setIpml_options(value: DefaultExchangeName): Self = StObject.set(x, "ipml_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpml_optionsUndefined: Self = StObject.set(x, "ipml_options", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
