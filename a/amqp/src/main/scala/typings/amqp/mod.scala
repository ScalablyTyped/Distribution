package typings.amqp

import org.scalablytyped.runtime.StringDictionary
import typings.amqp.amqpNumbers.`0`
import typings.amqp.amqpNumbers.`1`
import typings.amqp.amqpNumbers.`2`
import typings.amqp.amqpNumbers.`3`
import typings.amqp.amqpNumbers.`4`
import typings.amqp.amqpNumbers.`5`
import typings.amqp.amqpNumbers.`6`
import typings.amqp.amqpNumbers.`7`
import typings.amqp.amqpNumbers.`8`
import typings.amqp.amqpNumbers.`9`
import typings.amqp.amqpStrings.ack
import typings.amqp.amqpStrings.direct
import typings.amqp.amqpStrings.error
import typings.amqp.amqpStrings.exchangeBindOk
import typings.amqp.amqpStrings.exchangeUnbindOk
import typings.amqp.amqpStrings.fanout
import typings.amqp.amqpStrings.open
import typings.amqp.amqpStrings.topic
import typings.amqp.anon.ApplicationName
import typings.amqp.anon.CaFile
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqp", "createConnection")
  @js.native
  def createConnection(options: ConnectionOptions): AMQPClient = js.native
  
  @js.native
  trait AMQPClient extends Socket {
    
    def disconnect(): Unit = js.native
    
    def exchange(): AMQPExchange = js.native
    def exchange(callback: Callback[Unit]): AMQPExchange = js.native
    def exchange(exchangeName: String): AMQPExchange = js.native
    def exchange(exchangeName: String, callback: Callback[Unit]): AMQPExchange = js.native
    def exchange(exchangeName: String, options: ExchangeOptions): AMQPExchange = js.native
    def exchange(exchangeName: String, options: ExchangeOptions, callback: Callback[Unit]): AMQPExchange = js.native
    
    def publish(
      routingKey: String,
      body: js.Any,
      options: js.Object,
      callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def queue(queueName: String): AMQPQueue = js.native
    def queue(queueName: String, callback: Callback[QueueCallback]): AMQPQueue = js.native
    def queue(queueName: String, options: QueueOptions): AMQPQueue = js.native
    def queue(queueName: String, options: QueueOptions, callback: Callback[QueueCallback]): AMQPQueue = js.native
  }
  
  @js.native
  trait AMQPExchange extends EventEmitter {
    
    def bind(sourceExchange: String, routingKey: String): Unit = js.native
    def bind(sourceExchange: String, routingKey: String, callback: Callback[Unit]): Unit = js.native
    
    def bind_headers(exchange: String, routing: String): Unit = js.native
    def bind_headers(exchange: String, routing: String, callback: Callback[Unit]): Unit = js.native
    
    /**
      * ifUnused default: true
      *
      * Deletes an exchange.
      *
      * If the optional boolean second argument is set, the server will only delete the exchange if it has no queue bindings.
      *
      * If the exchange has queue bindings the server does not delete it but raises a channel exception instead
      */
    def destroy(ifUnused: Boolean): Unit = js.native
    
    @JSName("on")
    def on_ack(event: ack, callback: Callback[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, callback: Callback[Unit]): this.type = js.native
    @JSName("on")
    def on_exchangeBindOk(event: exchangeBindOk, callback: Callback[Unit]): this.type = js.native
    @JSName("on")
    def on_exchangeUnbindOk(event: exchangeUnbindOk, callback: Callback[Unit]): this.type = js.native
    @JSName("on")
    def on_open(event: open, callback: Callback[Unit]): this.type = js.native
    
    def publish(
      routingKey: String,
      message: js.Object,
      callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def publish(routingKey: String, message: js.Object, options: ExchangePublishOptions): Unit = js.native
    def publish(
      routingKey: String,
      message: js.Object,
      options: ExchangePublishOptions,
      callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def publish(
      routingKey: String,
      message: Buffer,
      callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def publish(routingKey: String, message: Buffer, options: ExchangePublishOptions): Unit = js.native
    def publish(
      routingKey: String,
      message: Buffer,
      options: ExchangePublishOptions,
      callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def unbind(sourceExchange: String, routingKey: String): Unit = js.native
    def unbind(sourceExchange: String, routingKey: String, callback: Callback[Unit]): Unit = js.native
  }
  
  @js.native
  trait AMQPQueue extends EventEmitter {
    
    def bind(exchangeName: String, routingKey: String): Unit = js.native
    def bind(exchangeName: String, routingKey: String, callback: Callback[AMQPQueue]): Unit = js.native
    def bind(routingKey: String): Unit = js.native
    def bind(routingKey: String, callback: Callback[AMQPQueue]): Unit = js.native
    
    def bind_headers(exchangeName: String, routingKey: String): Unit = js.native
    def bind_headers(routingKey: String): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(options: DestroyOptions): Unit = js.native
    
    def shift(reject: Boolean): Unit = js.native
    def shift(reject: Boolean, requeue: Boolean): Unit = js.native
    
    def subscribe(callback: SubscribeCallback): Unit = js.native
    def subscribe(options: SubscribeOptions, callback: SubscribeCallback): Unit = js.native
    
    def unbind(exchangeName: String, routingKey: String): Unit = js.native
    def unbind(routingKey: String): Unit = js.native
    
    def unbind_headers(exchangeName: String, routingKey: String): Unit = js.native
    def unbind_headers(routingKey: String): Unit = js.native
    
    def unsubscribe(consumerTag: String): Unit = js.native
  }
  
  @js.native
  trait Ack extends DeliveryInfo {
    
    def acknowledge(all: Boolean): Unit = js.native
    
    def reject(requeue: Boolean): Unit = js.native
  }
  object Ack {
    
    @scala.inline
    def apply(
      acknowledge: Boolean => Unit,
      consumerTag: String,
      contentType: String,
      deliveryTag: Uint8Array,
      exchange: String,
      queue: String,
      redelivered: Boolean,
      reject: Boolean => Unit,
      routingKey: String
    ): Ack = {
      val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), routingKey = routingKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ack]
    }
    
    @scala.inline
    implicit class AckMutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcknowledge(value: Boolean => Unit): Self = StObject.set(x, "acknowledge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: Boolean => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    }
  }
  
  type Callback[T] = js.Function1[/* value */ T, Unit]
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var authMechanism: js.UndefOr[String] = js.native
    
    var clientProperties: js.UndefOr[ApplicationName] = js.native
    
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    var defaultExchangeName: js.UndefOr[String] = js.native
    
    var heartbeat: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var login: js.UndefOr[String] = js.native
    
    var noDelay: js.UndefOr[Boolean] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    /** Default: 'node-{NODE_VERSION}' */
    var platform: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    /** Default: 'node-amqp' */
    var product: js.UndefOr[String] = js.native
    
    /** Default: true */
    var reconnect: js.UndefOr[Boolean] = js.native
    
    /** Default: 'linear' */
    var reconnectBackoffStrategy: js.UndefOr[String] = js.native
    
    /** Default: 1000 */
    var reconnectBackoffTime: js.UndefOr[Double] = js.native
    
    /** Default: 120000 */
    var reconnectExponentialLimit: js.UndefOr[Double] = js.native
    
    var ssl: js.UndefOr[CaFile] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    /** Default: node-amqp/package.json version */
    var version: js.UndefOr[String] = js.native
    
    var vhost: js.UndefOr[String] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      @scala.inline
      def setClientProperties(value: ApplicationName): Self = StObject.set(x, "clientProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientPropertiesUndefined: Self = StObject.set(x, "clientProperties", js.undefined)
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setDefaultExchangeName(value: String): Self = StObject.set(x, "defaultExchangeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExchangeNameUndefined: Self = StObject.set(x, "defaultExchangeName", js.undefined)
      
      @scala.inline
      def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      @scala.inline
      def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectBackoffStrategy(value: String): Self = StObject.set(x, "reconnectBackoffStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectBackoffStrategyUndefined: Self = StObject.set(x, "reconnectBackoffStrategy", js.undefined)
      
      @scala.inline
      def setReconnectBackoffTime(value: Double): Self = StObject.set(x, "reconnectBackoffTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectBackoffTimeUndefined: Self = StObject.set(x, "reconnectBackoffTime", js.undefined)
      
      @scala.inline
      def setReconnectExponentialLimit(value: Double): Self = StObject.set(x, "reconnectExponentialLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectExponentialLimitUndefined: Self = StObject.set(x, "reconnectExponentialLimit", js.undefined)
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setSsl(value: CaFile): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    }
  }
  
  @js.native
  trait DeliveryInfo extends StObject {
    
    var consumerTag: String = js.native
    
    var contentType: String = js.native
    
    var deliveryTag: Uint8Array = js.native
    
    var exchange: String = js.native
    
    var queue: String = js.native
    
    var redelivered: Boolean = js.native
    
    var routingKey: String = js.native
  }
  object DeliveryInfo {
    
    @scala.inline
    def apply(
      consumerTag: String,
      contentType: String,
      deliveryTag: Uint8Array,
      exchange: String,
      queue: String,
      redelivered: Boolean,
      routingKey: String
    ): DeliveryInfo = {
      val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryInfo]
    }
    
    @scala.inline
    implicit class DeliveryInfoMutableBuilder[Self <: DeliveryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryTag(value: Uint8Array): Self = StObject.set(x, "deliveryTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedelivered(value: Boolean): Self = StObject.set(x, "redelivered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DestroyOptions extends StObject {
    
    /**
      * Default: false
      *
      * Will ony be deleted if the queue has no messages
      */
    var ifEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * Will only destroy the queue if it has no consumers
      */
    var ifUnused: js.UndefOr[Boolean] = js.native
  }
  object DestroyOptions {
    
    @scala.inline
    def apply(): DestroyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyOptions]
    }
    
    @scala.inline
    implicit class DestroyOptionsMutableBuilder[Self <: DestroyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfEmpty(value: Boolean): Self = StObject.set(x, "ifEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfEmptyUndefined: Self = StObject.set(x, "ifEmpty", js.undefined)
      
      @scala.inline
      def setIfUnused(value: Boolean): Self = StObject.set(x, "ifUnused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUnusedUndefined: Self = StObject.set(x, "ifUnused", js.undefined)
    }
  }
  
  @js.native
  trait ExchangeOptions extends StObject {
    
    /**
      * a map of additional arguments to pass in when creating an exchange
      */
    var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Default: true
      *
      * If set, the exchange is deleted when there are no longer queues bound to it
      */
    var autoDelete: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * If set, the exchange will be in confirm mode, and you will get a 'ack'|'error' event emitted on a publish,
      * or the callback on the publish will be called
      */
    var confirm: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true
      *
      * If set when creating a new exchange, the exchange will be marked as durable.
      *
      * Durable exchanges remain active when a server restarts.
      *
      * Non-durable exchanges (transient exchanges) are purged if/when a server restarts
      */
    var durable: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * If set, the exchange will not be declared,
      * this will allow the exchange to be deleted if you dont know its previous options
      */
    var noDeclare: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * f set, the server will not create the exchange. The client can use this to check whether an exchange exists without modifying the server state
      */
    var passive: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: 'topic'
      */
    var `type`: js.UndefOr[direct | fanout | topic] = js.native
  }
  object ExchangeOptions {
    
    @scala.inline
    def apply(): ExchangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExchangeOptions]
    }
    
    @scala.inline
    implicit class ExchangeOptionsMutableBuilder[Self <: ExchangeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: StringDictionary[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setNoDeclare(value: Boolean): Self = StObject.set(x, "noDeclare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDeclareUndefined: Self = StObject.set(x, "noDeclare", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      @scala.inline
      def setType(value: direct | fanout | topic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExchangePublishOptions extends StObject {
    
    /**
      * Default: null
      *
      * Creating application id
      */
    var appId: js.UndefOr[String] = js.native
    
    /**
      * Default: null
      */
    var contentEncoding: js.UndefOr[String] = js.native
    
    /**
      * Default: 'application/octet-stream'
      */
    var contentType: js.UndefOr[String] = js.native
    
    /**
      * Application correlation identifier
      */
    var correlationId: js.UndefOr[String] = js.native
    
    /**
      * 1: Non-persistent
      * 2: Persistent
      */
    var deliveryMode: js.UndefOr[`1` | `2`] = js.native
    
    /**
      * Default: null
      *
      * Message expiration specification -- ISO date string?
      */
    var expiration: js.UndefOr[String] = js.native
    
    /**
      * Default: {}
      *
      * Arbitrary application-specific message headers
      */
    var headers: js.UndefOr[js.Any] = js.native
    
    /**
      * Default: false
      *
      * This flag tells the server how to react if the message cannot be routed to a queue consumer immediately.
      *
      * If this flag is set, the server will return an undeliverable message with a Return method.
      *
      * If this flag is false, the server will queue the message, but with no guarantee that it will ever be consumed
      */
    var immediate: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * This flag tells the server how to react if the message cannot be routed to a queue.
      *
      * If this flag is set, the server will return an unroutable message with a Return method.
      *
      * If this flag is false, the server silently drops the message
      */
    var mandatory: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: null
      *
      * Application message identifier
      */
    var messageId: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
    
    /**
      * Usually used to name a reply queue for a request message
      */
    var replyTo: js.UndefOr[String] = js.native
    
    /**
      * Default: null
      *
      * Message timestamp
      *
      * ISO date string?
      */
    var timestamp: js.UndefOr[String] = js.native
    
    /**
      * Default: null
      *
      * Message type name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Default: null
      *
      * Creating user id
      */
    var userId: js.UndefOr[String] = js.native
  }
  object ExchangePublishOptions {
    
    @scala.inline
    def apply(): ExchangePublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExchangePublishOptions]
    }
    
    @scala.inline
    implicit class ExchangePublishOptionsMutableBuilder[Self <: ExchangePublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setDeliveryMode(value: `1` | `2`): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryModeUndefined: Self = StObject.set(x, "deliveryMode", js.undefined)
      
      @scala.inline
      def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setPriority(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait QueueCallback extends StObject {
    
    var channel: Double = js.native
    
    var consumerTagListeners: StringDictionary[js.Any] = js.native
    
    var consumerTagOptions: StringDictionary[js.Any] = js.native
    
    var name: String = js.native
    
    var options: QueueOptions = js.native
    
    var state: String = js.native
  }
  object QueueCallback {
    
    @scala.inline
    def apply(
      channel: Double,
      consumerTagListeners: StringDictionary[js.Any],
      consumerTagOptions: StringDictionary[js.Any],
      name: String,
      options: QueueOptions,
      state: String
    ): QueueCallback = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], consumerTagListeners = consumerTagListeners.asInstanceOf[js.Any], consumerTagOptions = consumerTagOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueCallback]
    }
    
    @scala.inline
    implicit class QueueCallbackMutableBuilder[Self <: QueueCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerTagListeners(value: StringDictionary[js.Any]): Self = StObject.set(x, "consumerTagListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerTagOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "consumerTagOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: QueueOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueueOptions extends StObject {
    
    /**
      * a map of additional arguments to pass in when creating a queue
      */
    var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Default: true
      *
      * If set, the queue is deleted when all consumers have finished using it.
      *
      * Last consumer can be cancelled either explicitly or because its channel is closed.
      *
      * If there was no consumer ever on the queue, it won't be deleted
      */
    var autoDelete: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * when true the channel will close on unsubscribe
      */
    var closeChannelOnUnsubscribe: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * Durable queues remain active when a server restarts.
      *
      * Non-durable queues (transient queues) are purged if/when a server restarts.
      *
      * Note that durable queues do not necessarily hold persistent messages,
      * although it does not make sense to send persistent messages to a transient queue
      */
    var durable: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * Exclusive queues may only be consumed from by the current connection.
      *
      * Setting the 'exclusive' flag always implies 'autoDelete'
      */
    var exclusive: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * If set, the queue will not be declared, this will allow a queue to be deleted if you don't know its previous options
      */
    var noDeclare: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * If set, the server will not create the queue.
      *
      * The client can use this to check whether a queue exists without modifying the server state
      */
    var passive: js.UndefOr[Boolean] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: StringDictionary[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setCloseChannelOnUnsubscribe(value: Boolean): Self = StObject.set(x, "closeChannelOnUnsubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseChannelOnUnsubscribeUndefined: Self = StObject.set(x, "closeChannelOnUnsubscribe", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setNoDeclare(value: Boolean): Self = StObject.set(x, "noDeclare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDeclareUndefined: Self = StObject.set(x, "noDeclare", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  type SubscribeCallback = js.Function4[
    /* message */ js.Any, 
    /* headers */ StringDictionary[js.Any], 
    /* deliveryInfo */ DeliveryInfo, 
    /* ack */ Ack, 
    Unit
  ]
  
  @js.native
  trait SubscribeOptions extends StObject {
    
    /**
      * Default: false
      *
      * Make it so that the AMQP server only delivers single messages at a time.
      * When you want the next message, call queue.shift()
      *
      * When false, you will receive messages as fast as they are emitted
      */
    var ack: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: undefined
      *
      * Will inject the routingKey into the payload received
      */
    var deliveryKeyInPayload: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      *
      * If set to true, only one subscriber is allowed at a time
      */
    var exclusive: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: 1
      *
      * Will only send you N messages before you 'ack'.
      *
      * Setting to zero will widen that window to 'unlimited'. If this is set, queue.shift() should not be used
      */
    var prefetchCount: js.UndefOr[Double] = js.native
    
    /**
      * Default: undefined
      *
      * Will inject the routingKey into the payload received
      */
    var routingKeyInPayload: js.UndefOr[Boolean] = js.native
  }
  object SubscribeOptions {
    
    @scala.inline
    def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
      
      @scala.inline
      def setDeliveryKeyInPayload(value: Boolean): Self = StObject.set(x, "deliveryKeyInPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryKeyInPayloadUndefined: Self = StObject.set(x, "deliveryKeyInPayload", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setPrefetchCount(value: Double): Self = StObject.set(x, "prefetchCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetchCountUndefined: Self = StObject.set(x, "prefetchCount", js.undefined)
      
      @scala.inline
      def setRoutingKeyInPayload(value: Boolean): Self = StObject.set(x, "routingKeyInPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingKeyInPayloadUndefined: Self = StObject.set(x, "routingKeyInPayload", js.undefined)
    }
  }
}
