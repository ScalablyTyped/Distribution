package typings.awsCrt

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMqttMod {
  
  @JSImport("aws-crt/dist/common/mqtt", "DEFAULT_RECONNECT_MAX_SEC")
  @js.native
  val DEFAULT_RECONNECT_MAX_SEC: /* 128 */ Double = js.native
  
  @JSImport("aws-crt/dist/common/mqtt", "DEFAULT_RECONNECT_MIN_SEC")
  @js.native
  val DEFAULT_RECONNECT_MIN_SEC: /* 1 */ Double = js.native
  
  @JSImport("aws-crt/dist/common/mqtt", "MqttWill")
  @js.native
  open class MqttWill protected () extends StObject {
    def this(
      /** Topic to publish Will message on. */
    topic: String,
      /** QoS used when publishing the Will message. */
    qos: QoS,
      /** Content of Will message. */
    payload: Payload
    ) = this()
    def this(
      /** Topic to publish Will message on. */
    topic: String,
      /** QoS used when publishing the Will message. */
    qos: QoS,
      /** Content of Will message. */
    payload: Payload,
      /** Whether the Will message is to be retained when it is published. */
    retain: Boolean
    ) = this()
    
    /** Content of Will message. */
    val payload: Payload = js.native
    
    /** QoS used when publishing the Will message. */
    val qos: QoS = js.native
    
    /** Whether the Will message is to be retained when it is published. */
    val retain: Boolean = js.native
    
    /** Topic to publish Will message on. */
    val topic: String = js.native
  }
  
  @js.native
  sealed trait QoS extends StObject
  @JSImport("aws-crt/dist/common/mqtt", "QoS")
  @js.native
  object QoS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QoS & Double] = js.native
    
    /**
      * QoS 1 - At least once delivery
      * This quality of service ensures that the message arrives at the receiver at least once.
      */
    @js.native
    sealed trait AtLeastOnce
      extends StObject
         with QoS
    /* 1 */ val AtLeastOnce: typings.awsCrt.distCommonMqttMod.QoS.AtLeastOnce & Double = js.native
    
    /**
      * QoS 0 - At most once delivery
      * The message is delivered according to the capabilities of the underlying network.
      * No response is sent by the receiver and no retry is performed by the sender.
      * The message arrives at the receiver either once or not at all.
      */
    @js.native
    sealed trait AtMostOnce
      extends StObject
         with QoS
    /* 0 */ val AtMostOnce: typings.awsCrt.distCommonMqttMod.QoS.AtMostOnce & Double = js.native
    
    /**
      * QoS 2 - Exactly once delivery
      * This is the highest quality of service, for use when neither loss nor
      * duplication of messages are acceptable. There is an increased overhead
      * associated with this quality of service.
      * Note that, while this client supports QoS 2, the AWS IoT Core service
      * does not support QoS 2 at time of writing (May 2020).
      */
    @js.native
    sealed trait ExactlyOnce
      extends StObject
         with QoS
    /* 2 */ val ExactlyOnce: typings.awsCrt.distCommonMqttMod.QoS.ExactlyOnce & Double = js.native
  }
  
  type MqttConnectionConnected = js.Function1[/* session_present */ Boolean, Unit]
  
  type MqttConnectionDisconnected = js.Function0[Unit]
  
  type MqttConnectionResumed = js.Function2[/* return_code */ Double, /* session_present */ Boolean, Unit]
  
  trait MqttRequest extends StObject {
    
    /** Packet ID being acknowledged when the request completes */
    var packet_id: js.UndefOr[Double] = js.undefined
  }
  object MqttRequest {
    
    inline def apply(): MqttRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MqttRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MqttRequest] (val x: Self) extends AnyVal {
      
      inline def setPacket_id(value: Double): Self = StObject.set(x, "packet_id", value.asInstanceOf[js.Any])
      
      inline def setPacket_idUndefined: Self = StObject.set(x, "packet_id", js.undefined)
    }
  }
  
  trait MqttSubscribeRequest
    extends StObject
       with MqttRequest {
    
    /** If an error occurred, the error code */
    var error_code: js.UndefOr[Double] = js.undefined
    
    /** Maximum QoS granted by the server. This may be lower than the requested QoS. */
    var qos: QoS
    
    /** Topic filter of the SUBSCRIBE packet being acknowledged */
    var topic: String
  }
  object MqttSubscribeRequest {
    
    inline def apply(qos: QoS, topic: String): MqttSubscribeRequest = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[MqttSubscribeRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MqttSubscribeRequest] (val x: Self) extends AnyVal {
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type OnMessageCallback = js.Function5[
    /* topic */ String, 
    /* payload */ js.typedarray.ArrayBuffer, 
    /* dup */ Boolean, 
    /* qos */ QoS, 
    /* retain */ Boolean, 
    Unit
  ]
  
  type Payload = String | (Record[String, Any]) | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
}
