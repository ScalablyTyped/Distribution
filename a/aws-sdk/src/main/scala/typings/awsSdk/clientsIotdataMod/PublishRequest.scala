package typings.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishRequest extends StObject {
  
  /**
    * A UTF-8 encoded string that describes the content of the publishing message.
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * The base64-encoded binary data used by the sender of the request message to identify which request the response message is for when it's received. correlationData is an HTTP header value in the API.
    */
  var correlationData: js.UndefOr[CorrelationData] = js.undefined
  
  /**
    * A user-defined integer value that represents the message expiry interval in seconds. If absent, the message doesn't expire. For more information about the limits of messageExpiry, see Amazon Web Services IoT Core message broker and protocol limits and quotas  from the Amazon Web Services Reference Guide.
    */
  var messageExpiry: js.UndefOr[MessageExpiry] = js.undefined
  
  /**
    * The message body. MQTT accepts text, binary, and empty (null) message payloads. Publishing an empty (null) payload with retain = true deletes the retained message identified by topic from Amazon Web Services IoT Core.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * An Enum string value that indicates whether the payload is formatted as UTF-8. payloadFormatIndicator is an HTTP header value in the API.
    */
  var payloadFormatIndicator: js.UndefOr[PayloadFormatIndicator] = js.undefined
  
  /**
    * The Quality of Service (QoS) level. The default QoS level is 0.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  
  /**
    * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to describe the topic which the receiver should publish to as part of the request-response flow. The topic must not contain wildcard characters.
    */
  var responseTopic: js.UndefOr[ResponseTopic] = js.undefined
  
  /**
    * A Boolean value that determines whether to set the RETAIN flag when the message is published. Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic. Valid values: true | false  Default value: false 
    */
  var retain: js.UndefOr[Retain] = js.undefined
  
  /**
    * The name of the MQTT topic.
    */
  var topic: Topic
  
  /**
    * A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you must encode the JSON string to base64 format before adding it to the HTTP header. userProperties is an HTTP header value in the API. The following example userProperties parameter is a JSON string which represents two User Properties. Note that it needs to be base64-encoded:  [{"deviceName": "alpha"}, {"deviceCnt": "45"}] 
    */
  var userProperties: js.UndefOr[UserProperties] = js.undefined
}
object PublishRequest {
  
  inline def apply(topic: Topic): PublishRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishRequest] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCorrelationData(value: CorrelationData): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
    
    inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
    
    inline def setMessageExpiry(value: MessageExpiry): Self = StObject.set(x, "messageExpiry", value.asInstanceOf[js.Any])
    
    inline def setMessageExpiryUndefined: Self = StObject.set(x, "messageExpiry", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatIndicator(value: PayloadFormatIndicator): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setResponseTopic(value: ResponseTopic): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
    
    inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
    
    inline def setRetain(value: Retain): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
  }
}
