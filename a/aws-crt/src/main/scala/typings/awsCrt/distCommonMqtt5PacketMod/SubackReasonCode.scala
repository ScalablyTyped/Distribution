package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubackReasonCode extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "SubackReasonCode")
@js.native
object SubackReasonCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubackReasonCode & Double] = js.native
  
  /**
    * Returned when the subscription was accepted and the maximum QOS sent will be QOS 0.
    */
  @js.native
  sealed trait GrantedQoS0
    extends StObject
       with SubackReasonCode
  /* 0 */ val GrantedQoS0: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS0 & Double = js.native
  
  /**
    * Returned when the subscription was accepted and the maximum QOS sent will be QOS 1.
    */
  @js.native
  sealed trait GrantedQoS1
    extends StObject
       with SubackReasonCode
  /* 1 */ val GrantedQoS1: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS1 & Double = js.native
  
  /**
    * Returned when the subscription was accepted and the maximum QOS sent will be QOS 2.
    */
  @js.native
  sealed trait GrantedQoS2
    extends StObject
       with SubackReasonCode
  /* 2 */ val GrantedQoS2: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS2 & Double = js.native
  
  /**
    * Returned when the subscription was valid but the server did not accept it.
    */
  @js.native
  sealed trait ImplementationSpecificError
    extends StObject
       with SubackReasonCode
  /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.ImplementationSpecificError & Double = js.native
  
  /**
    * Returned when the client was not authorized to make the subscription on the server.
    */
  @js.native
  sealed trait NotAuthorized
    extends StObject
       with SubackReasonCode
  /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.NotAuthorized & Double = js.native
  
  /**
    * Returned when the packet identifier was already in use on the server.
    */
  @js.native
  sealed trait PacketIdentifierInUse
    extends StObject
       with SubackReasonCode
  /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.PacketIdentifierInUse & Double = js.native
  
  /**
    * Returned when a subscribe-related quota set on the server was exceeded.
    */
  @js.native
  sealed trait QuotaExceeded
    extends StObject
       with SubackReasonCode
  /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.QuotaExceeded & Double = js.native
  
  /**
    * Returned when the subscription's topic filter was a shared subscription and the server does not support
    * shared subscriptions.
    */
  @js.native
  sealed trait SharedSubscriptionsNotSupported
    extends StObject
       with SubackReasonCode
  /* 158 */ val SharedSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.SharedSubscriptionsNotSupported & Double = js.native
  
  /**
    * Returned when the SUBSCRIBE packet contained a subscription identifier and the server does not support
    * subscription identifiers.
    */
  @js.native
  sealed trait SubscriptionIdentifiersNotSupported
    extends StObject
       with SubackReasonCode
  /* 161 */ val SubscriptionIdentifiersNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.SubscriptionIdentifiersNotSupported & Double = js.native
  
  /**
    * Returned when the subscription topic filter was correctly formed but not allowed for the client.
    */
  @js.native
  sealed trait TopicFilterInvalid
    extends StObject
       with SubackReasonCode
  /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.TopicFilterInvalid & Double = js.native
  
  /**
    * Returned when the connection was closed but the sender does not want to specify a reason or none
    * of the other reason codes apply.
    */
  @js.native
  sealed trait UnspecifiedError
    extends StObject
       with SubackReasonCode
  /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.UnspecifiedError & Double = js.native
  
  /**
    * Returned when the subscription's topic filter contains a wildcard but the server does not support
    * wildcard subscriptions.
    */
  @js.native
  sealed trait WildcardSubscriptionsNotSupported
    extends StObject
       with SubackReasonCode
  /* 162 */ val WildcardSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.WildcardSubscriptionsNotSupported & Double = js.native
}
