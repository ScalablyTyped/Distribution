package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * Should the server not send publishes to a client when that client was the one who sent the publish?  If
    * undefined, this is assumed to be false.
    *
    * See [MQTT5 Subscription Options](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901169)
    */
  var noLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum QoS on which the subscriber will accept publish messages.  Negotiated QoS may be different.
    *
    * See [MQTT5 Subscription Options](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901169)
    */
  var qos: QoS
  
  /**
    * Should messages sent due to this subscription keep the retain flag preserved on the message?  If undefined,
    * this is assumed to be false.
    *
    * See [MQTT5 Subscription Options](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901169)
    */
  var retainAsPublished: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should retained messages on matching topics be sent in reaction to this subscription?  If undefined,
    * this is assumed to be RetainHandlingType.SendOnSubscribe.
    *
    * See [MQTT5 Subscription Options](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901169)
    */
  var retainHandlingType: js.UndefOr[RetainHandlingType] = js.undefined
  
  /**
    * Topic filter to subscribe to
    *
    * See [MQTT5 Subscription Options](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901169)
    */
  var topicFilter: String
}
object Subscription {
  
  inline def apply(qos: QoS, topicFilter: String): Subscription = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topicFilter = topicFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setNoLocal(value: Boolean): Self = StObject.set(x, "noLocal", value.asInstanceOf[js.Any])
    
    inline def setNoLocalUndefined: Self = StObject.set(x, "noLocal", js.undefined)
    
    inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setRetainAsPublished(value: Boolean): Self = StObject.set(x, "retainAsPublished", value.asInstanceOf[js.Any])
    
    inline def setRetainAsPublishedUndefined: Self = StObject.set(x, "retainAsPublished", js.undefined)
    
    inline def setRetainHandlingType(value: RetainHandlingType): Self = StObject.set(x, "retainHandlingType", value.asInstanceOf[js.Any])
    
    inline def setRetainHandlingTypeUndefined: Self = StObject.set(x, "retainHandlingType", js.undefined)
    
    inline def setTopicFilter(value: String): Self = StObject.set(x, "topicFilter", value.asInstanceOf[js.Any])
  }
}
