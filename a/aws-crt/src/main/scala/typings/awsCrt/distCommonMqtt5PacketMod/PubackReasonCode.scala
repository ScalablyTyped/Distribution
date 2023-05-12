package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PubackReasonCode extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "PubackReasonCode")
@js.native
object PubackReasonCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PubackReasonCode & Double] = js.native
  
  /**
    * Returned when the (QoS 1) publish was valid but the receiver was not willing to accept it.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait ImplementationSpecificError
    extends StObject
       with PubackReasonCode
  /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.ImplementationSpecificError & Double = js.native
  
  /**
    * Returned when the (QoS 1) publish was accepted but there were no matching subscribers.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait NoMatchingSubscribers
    extends StObject
       with PubackReasonCode
  /* 16 */ val NoMatchingSubscribers: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.NoMatchingSubscribers & Double = js.native
  
  /**
    * Returned when the (QoS 1) publish was not authorized by the receiver.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait NotAuthorized
    extends StObject
       with PubackReasonCode
  /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.NotAuthorized & Double = js.native
  
  /**
    * Returned when the packet identifier used in the associated PUBLISH was already in use.
    * This can indicate a mismatch in the session state between client and server.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait PacketIdentifierInUse
    extends StObject
       with PubackReasonCode
  /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.PacketIdentifierInUse & Double = js.native
  
  /**
    * Returned when the PUBLISH packet's payload format did not match its payload format indicator property.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait PayloadFormatInvalid
    extends StObject
       with PubackReasonCode
  /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.PayloadFormatInvalid & Double = js.native
  
  /**
    * Returned when the associated PUBLISH failed because an internal quota on the recipient was exceeded.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait QuotaExceeded
    extends StObject
       with PubackReasonCode
  /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.QuotaExceeded & Double = js.native
  
  /**
    * Returned when the (QoS 1) publish was accepted by the recipient.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait Success
    extends StObject
       with PubackReasonCode
  /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.Success & Double = js.native
  
  /**
    * Returned when the topic name was valid but the receiver was not willing to accept it.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait TopicNameInvalid
    extends StObject
       with PubackReasonCode
  /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.TopicNameInvalid & Double = js.native
  
  /**
    * Returned when the (QoS 1) publish was not accepted and the receiver does not want to specify a reason or none
    * of the other reason codes apply.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait UnspecifiedError
    extends StObject
       with PubackReasonCode
  /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.UnspecifiedError & Double = js.native
}
