package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishPacket
  extends StObject
     with IPacket {
  
  /**
    * Property specifying the content type of the payload.  Not internally meaningful to MQTT5.
    *
    * See [MQTT5 Content Type](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Opaque binary data used to correlate between publish messages, as a potential method for request-response
    * implementation.  Not internally meaningful to MQTT5.
    *
    * See [MQTT5 Correlation Data](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
    */
  var correlationData: js.UndefOr[BinaryData] = js.undefined
  
  /**
    * Sent publishes - indicates the maximum amount of time allowed to elapse for message delivery before the server
    * should instead delete the message (relative to a recipient).
    *
    * Received publishes - indicates the remaining amount of time (from the server's perspective) before the message would
    * have been deleted relative to the subscribing client.
    *
    * If left undefined, indicates no expiration timeout.
    *
    * See [MQTT5 Message Expiry Interval](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901112)
    */
  var messageExpiryIntervalSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * The payload of the publish message.
    *
    * See [MQTT5 Publish Payload](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901119)
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * Property specifying the format of the payload data.  The mqtt5 client does not enforce or use this
    * value in a meaningful way.
    *
    * See [MQTT5 Payload Format Indicator](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
    */
  var payloadFormat: js.UndefOr[PayloadFormatIndicator] = js.undefined
  
  /**
    * Sent publishes - The MQTT quality of service level this message should be delivered with.
    *
    * Received publishes - The MQTT quality of service level this message was delivered at.
    *
    * See [MQTT5 QoS](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901103)
    */
  var qos: QoS
  
  /**
    * Opaque topic string intended to assist with request/response implementations.  Not internally meaningful to
    * MQTT5 or this client.
    *
    * See [MQTT5 Response Topic](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
    */
  var responseTopic: js.UndefOr[String] = js.undefined
  
  /**
    * True if this is a retained message, false otherwise.
    *
    * Always set on received publishes; on sent publishes, undefined implies false.
    *
    * See [MQTT5 Retain](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901104)
    */
  var retain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sent publishes - ignored
    *
    * Received publishes - the subscription identifiers of all the subscriptions this message matched.
    *
    * See [MQTT5 Subscription Identifier](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901117)
    */
  var subscriptionIdentifiers: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Sent publishes - The topic this message should be published to.
    *
    * Received publishes - The topic this message was published to.
    *
    * See [MQTT5 Topic Name](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901107)
    */
  var topicName: String
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901116)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
}
object PublishPacket {
  
  inline def apply(qos: QoS, topicName: String): PublishPacket = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topicName = topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishPacket] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCorrelationData(value: BinaryData): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
    
    inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
    
    inline def setMessageExpiryIntervalSeconds(value: Double): Self = StObject.set(x, "messageExpiryIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setMessageExpiryIntervalSecondsUndefined: Self = StObject.set(x, "messageExpiryIntervalSeconds", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormat(value: PayloadFormatIndicator): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
    
    inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
    
    inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    
    inline def setSubscriptionIdentifiers(value: js.Array[Double]): Self = StObject.set(x, "subscriptionIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdentifiersUndefined: Self = StObject.set(x, "subscriptionIdentifiers", js.undefined)
    
    inline def setSubscriptionIdentifiersVarargs(value: Double*): Self = StObject.set(x, "subscriptionIdentifiers", js.Array(value*))
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
