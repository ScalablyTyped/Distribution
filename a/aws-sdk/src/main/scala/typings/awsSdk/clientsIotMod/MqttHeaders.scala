package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MqttHeaders extends StObject {
  
  /**
    * A UTF-8 encoded string that describes the content of the publishing message. For more information, see  Content Type from the MQTT Version 5.0 specification. Supports substitution templates.
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * The base64-encoded binary data used by the sender of the request message to identify which request the response message is for when it's received. For more information, see  Correlation Data from the MQTT Version 5.0 specification.   This binary data must be based64-encoded.   Supports substitution templates.
    */
  var correlationData: js.UndefOr[CorrelationData] = js.undefined
  
  /**
    * A user-defined integer value that will persist a message at the message broker for a specified amount of time to ensure that the message will expire if it's no longer relevant to the subscriber. The value of messageExpiry represents the number of seconds before it expires. For more information about the limits of messageExpiry, see Amazon Web Services IoT Core message broker and protocol limits and quotas  from the Amazon Web Services Reference Guide. Supports substitution templates.
    */
  var messageExpiry: js.UndefOr[MessageExpiry] = js.undefined
  
  /**
    * An Enum string value that indicates whether the payload is formatted as UTF-8. Valid values are UNSPECIFIED_BYTES and UTF8_DATA. For more information, see  Payload Format Indicator from the MQTT Version 5.0 specification. Supports substitution templates.
    */
  var payloadFormatIndicator: js.UndefOr[PayloadFormatIndicator] = js.undefined
  
  /**
    * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to describe the topic which the receiver should publish to as part of the request-response flow. The topic must not contain wildcard characters. For more information, see  Response Topic from the MQTT Version 5.0 specification. Supports substitution templates.
    */
  var responseTopic: js.UndefOr[ResponseTopic] = js.undefined
  
  /**
    * An array of key-value pairs that you define in the MQTT5 header.
    */
  var userProperties: js.UndefOr[UserProperties] = js.undefined
}
object MqttHeaders {
  
  inline def apply(): MqttHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MqttHeaders] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCorrelationData(value: CorrelationData): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
    
    inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
    
    inline def setMessageExpiry(value: MessageExpiry): Self = StObject.set(x, "messageExpiry", value.asInstanceOf[js.Any])
    
    inline def setMessageExpiryUndefined: Self = StObject.set(x, "messageExpiry", js.undefined)
    
    inline def setPayloadFormatIndicator(value: PayloadFormatIndicator): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
    
    inline def setResponseTopic(value: ResponseTopic): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
    
    inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
    
    inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
