package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnsubackReasonCode extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "UnsubackReasonCode")
@js.native
object UnsubackReasonCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnsubackReasonCode & Double] = js.native
  
  /**
    * Returned when the topic filter was valid but the server does not accept an unsubscribe for it.
    */
  @js.native
  sealed trait ImplementationSpecificError
    extends StObject
       with UnsubackReasonCode
  /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.ImplementationSpecificError & Double = js.native
  
  /**
    * Returned when the topic filter did not match one of the client's existing subscriptions on the server.
    */
  @js.native
  sealed trait NoSubscriptionExisted
    extends StObject
       with UnsubackReasonCode
  /* 17 */ val NoSubscriptionExisted: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.NoSubscriptionExisted & Double = js.native
  
  /**
    * Returned when the client was not authorized to unsubscribe from that topic filter on the server.
    */
  @js.native
  sealed trait NotAuthorized
    extends StObject
       with UnsubackReasonCode
  /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.NotAuthorized & Double = js.native
  
  /**
    * Returned when the packet identifier was already in use on the server.
    */
  @js.native
  sealed trait PacketIdentifierInUse
    extends StObject
       with UnsubackReasonCode
  /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.PacketIdentifierInUse & Double = js.native
  
  /**
    * Returned when the unsubscribe was successful and the client is no longer subscribed to the topic filter on the server.
    */
  @js.native
  sealed trait Success
    extends StObject
       with UnsubackReasonCode
  /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.Success & Double = js.native
  
  /**
    * Returned when the topic filter was correctly formed but is not allowed for the client on the server.
    */
  @js.native
  sealed trait TopicFilterInvalid
    extends StObject
       with UnsubackReasonCode
  /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.TopicFilterInvalid & Double = js.native
  
  /**
    * Returned when the unsubscribe of the topic filter was not accepted and the server does not want to specify a
    * reason or none of the other reason codes apply.
    */
  @js.native
  sealed trait UnspecifiedError
    extends StObject
       with UnsubackReasonCode
  /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.UnspecifiedError & Double = js.native
}
