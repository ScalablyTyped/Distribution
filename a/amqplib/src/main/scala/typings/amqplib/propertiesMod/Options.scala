package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Options {
  
  trait AssertExchange extends StObject {
    
    var alternateExchange: js.UndefOr[String] = js.undefined
    
    var arguments: js.UndefOr[js.Any] = js.undefined
    
    var autoDelete: js.UndefOr[Boolean] = js.undefined
    
    var durable: js.UndefOr[Boolean] = js.undefined
    
    var internal: js.UndefOr[Boolean] = js.undefined
  }
  object AssertExchange {
    
    @scala.inline
    def apply(): AssertExchange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssertExchange]
    }
    
    @scala.inline
    implicit class AssertExchangeMutableBuilder[Self <: AssertExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternateExchange(value: String): Self = StObject.set(x, "alternateExchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateExchangeUndefined: Self = StObject.set(x, "alternateExchange", js.undefined)
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    }
  }
  
  trait AssertQueue extends StObject {
    
    var arguments: js.UndefOr[js.Any] = js.undefined
    
    var autoDelete: js.UndefOr[Boolean] = js.undefined
    
    var deadLetterExchange: js.UndefOr[String] = js.undefined
    
    var deadLetterRoutingKey: js.UndefOr[String] = js.undefined
    
    var durable: js.UndefOr[Boolean] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxPriority: js.UndefOr[Double] = js.undefined
    
    var messageTtl: js.UndefOr[Double] = js.undefined
  }
  object AssertQueue {
    
    @scala.inline
    def apply(): AssertQueue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssertQueue]
    }
    
    @scala.inline
    implicit class AssertQueueMutableBuilder[Self <: AssertQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setDeadLetterExchange(value: String): Self = StObject.set(x, "deadLetterExchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterExchangeUndefined: Self = StObject.set(x, "deadLetterExchange", js.undefined)
      
      @scala.inline
      def setDeadLetterRoutingKey(value: String): Self = StObject.set(x, "deadLetterRoutingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterRoutingKeyUndefined: Self = StObject.set(x, "deadLetterRoutingKey", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
      
      @scala.inline
      def setMessageTtl(value: Double): Self = StObject.set(x, "messageTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTtlUndefined: Self = StObject.set(x, "messageTtl", js.undefined)
    }
  }
  
  trait Connect extends StObject {
    
    /**
      * The size in bytes of the maximum frame allowed over the connection. 0 means
      * no limit (but since frames have a size field which is an unsigned 32 bit integer, it’s perforce 2^32 - 1).
      *
      * Default value: 0x1000 (4kb) - That's the allowed minimum, it will fit many purposes
      */
    var frameMax: js.UndefOr[Double] = js.undefined
    
    /**
      * The period of the connection heartbeat in seconds.
      *
      * Default value: 0
      */
    var heartbeat: js.UndefOr[Double] = js.undefined
    
    /**
      * Hostname used for connecting to the server.
      *
      * Default value: 'localhost'
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * The desired locale for error messages. RabbitMQ only ever uses en_US
      *
      * Default value: 'en_US'
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * Password used for authenticating against the server.
      *
      * Default value: 'guest'
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Port used for connecting to the server.
      *
      * Default value: 5672
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * The to be used protocol
      *
      * Default value: 'amqp'
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * Username used for authenticating against the server.
      *
      * Default value: 'guest'
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * What VHost shall be used.
      *
      * Default value: '/'
      */
    var vhost: js.UndefOr[String] = js.undefined
  }
  object Connect {
    
    @scala.inline
    def apply(): Connect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connect]
    }
    
    @scala.inline
    implicit class ConnectMutableBuilder[Self <: Connect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameMax(value: Double): Self = StObject.set(x, "frameMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameMaxUndefined: Self = StObject.set(x, "frameMax", js.undefined)
      
      @scala.inline
      def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    }
  }
  
  trait Consume extends StObject {
    
    var arguments: js.UndefOr[js.Any] = js.undefined
    
    var consumerTag: js.UndefOr[String] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var noAck: js.UndefOr[Boolean] = js.undefined
    
    var noLocal: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object Consume {
    
    @scala.inline
    def apply(): Consume = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Consume]
    }
    
    @scala.inline
    implicit class ConsumeMutableBuilder[Self <: Consume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerTagUndefined: Self = StObject.set(x, "consumerTag", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
      
      @scala.inline
      def setNoLocal(value: Boolean): Self = StObject.set(x, "noLocal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLocalUndefined: Self = StObject.set(x, "noLocal", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait DeleteExchange extends StObject {
    
    var ifUnused: js.UndefOr[Boolean] = js.undefined
  }
  object DeleteExchange {
    
    @scala.inline
    def apply(): DeleteExchange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteExchange]
    }
    
    @scala.inline
    implicit class DeleteExchangeMutableBuilder[Self <: DeleteExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfUnused(value: Boolean): Self = StObject.set(x, "ifUnused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUnusedUndefined: Self = StObject.set(x, "ifUnused", js.undefined)
    }
  }
  
  trait DeleteQueue extends StObject {
    
    var ifEmpty: js.UndefOr[Boolean] = js.undefined
    
    var ifUnused: js.UndefOr[Boolean] = js.undefined
  }
  object DeleteQueue {
    
    @scala.inline
    def apply(): DeleteQueue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteQueue]
    }
    
    @scala.inline
    implicit class DeleteQueueMutableBuilder[Self <: DeleteQueue] (val x: Self) extends AnyVal {
      
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
  
  trait Get extends StObject {
    
    var noAck: js.UndefOr[Boolean] = js.undefined
  }
  object Get {
    
    @scala.inline
    def apply(): Get = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
    }
  }
  
  trait Publish extends StObject {
    
    var BCC: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var CC: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var deliveryMode: js.UndefOr[Boolean | Double] = js.undefined
    
    var expiration: js.UndefOr[String | Double] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var mandatory: js.UndefOr[Boolean] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var persistent: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var replyTo: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object Publish {
    
    @scala.inline
    def apply(): Publish = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Publish]
    }
    
    @scala.inline
    implicit class PublishMutableBuilder[Self <: Publish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setBCC(value: String | js.Array[String]): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBCCUndefined: Self = StObject.set(x, "BCC", js.undefined)
      
      @scala.inline
      def setBCCVarargs(value: String*): Self = StObject.set(x, "BCC", js.Array(value :_*))
      
      @scala.inline
      def setCC(value: String | js.Array[String]): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      @scala.inline
      def setCCVarargs(value: String*): Self = StObject.set(x, "CC", js.Array(value :_*))
      
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
      def setDeliveryMode(value: Boolean | Double): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryModeUndefined: Self = StObject.set(x, "deliveryMode", js.undefined)
      
      @scala.inline
      def setExpiration(value: String | Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
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
}
