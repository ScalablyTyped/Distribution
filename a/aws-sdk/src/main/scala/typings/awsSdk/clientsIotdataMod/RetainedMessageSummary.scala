package typings.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetainedMessageSummary extends StObject {
  
  /**
    * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
    */
  var lastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The size of the retained message's payload in bytes.
    */
  var payloadSize: js.UndefOr[PayloadSize] = js.undefined
  
  /**
    * The quality of service (QoS) level used to publish the retained message.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  
  /**
    * The topic name to which the retained message was published.
    */
  var topic: js.UndefOr[Topic] = js.undefined
}
object RetainedMessageSummary {
  
  inline def apply(): RetainedMessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainedMessageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetainedMessageSummary] (val x: Self) extends AnyVal {
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setPayloadSize(value: PayloadSize): Self = StObject.set(x, "payloadSize", value.asInstanceOf[js.Any])
    
    inline def setPayloadSizeUndefined: Self = StObject.set(x, "payloadSize", js.undefined)
    
    inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
