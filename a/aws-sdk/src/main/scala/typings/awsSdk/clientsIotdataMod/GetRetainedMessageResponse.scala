package typings.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRetainedMessageResponse extends StObject {
  
  /**
    * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
    */
  var lastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Base64-encoded message payload of the retained message body.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * The quality of service (QoS) level used to publish the retained message.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  
  /**
    * The topic name to which the retained message was published.
    */
  var topic: js.UndefOr[Topic] = js.undefined
  
  /**
    * A base64-encoded JSON string that includes an array of JSON objects, or null if the retained message doesn't include any user properties. The following example userProperties parameter is a JSON string that represents two user properties. Note that it will be base64-encoded:  [{"deviceName": "alpha"}, {"deviceCnt": "45"}] 
    */
  var userProperties: js.UndefOr[UserPropertiesBlob] = js.undefined
}
object GetRetainedMessageResponse {
  
  inline def apply(): GetRetainedMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRetainedMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRetainedMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setUserProperties(value: UserPropertiesBlob): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
  }
}
