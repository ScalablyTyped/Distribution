package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisconnectReasonCode extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "DisconnectReasonCode")
@js.native
object DisconnectReasonCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisconnectReasonCode & Double] = js.native
  
  /**
    * Returned when the connection was closed due to an administrative action.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait AdministrativeAction
    extends StObject
       with DisconnectReasonCode
  /* 152 */ val AdministrativeAction: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.AdministrativeAction & Double = js.native
  
  /**
    * Returned when the server disconnects the client due to the connection rate being too high.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait ConnectionRateExceeded
    extends StObject
       with DisconnectReasonCode
  /* 159 */ val ConnectionRateExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ConnectionRateExceeded & Double = js.native
  
  /**
    * Returns that the client wants to disconnect but requires that the server publish the Will message configured
    * on the connection.
    *
    * May only be sent by the client.
    */
  @js.native
  sealed trait DisconnectWithWillMessage
    extends StObject
       with DisconnectReasonCode
  /* 4 */ val DisconnectWithWillMessage: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.DisconnectWithWillMessage & Double = js.native
  
  /**
    * Returned when a valid packet was received by the remote endpoint, but could not be processed by the current implementation.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait ImplementationSpecificError
    extends StObject
       with DisconnectReasonCode
  /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ImplementationSpecificError & Double = js.native
  
  /**
    * Returned when the server closes the connection because no packet from the client has been received in
    * 1.5 times the KeepAlive time set when the connection was established.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait KeepAliveTimeout
    extends StObject
       with DisconnectReasonCode
  /* 141 */ val KeepAliveTimeout: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.KeepAliveTimeout & Double = js.native
  
  /**
    * Indicates the remote endpoint received a packet that does not conform to the MQTT specification.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait MalformedPacket
    extends StObject
       with DisconnectReasonCode
  /* 129 */ val MalformedPacket: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MalformedPacket & Double = js.native
  
  /**
    * Returned by the server when the maximum connection time authorized for the connection was exceeded.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait MaximumConnectTime
    extends StObject
       with DisconnectReasonCode
  /* 160 */ val MaximumConnectTime: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MaximumConnectTime & Double = js.native
  
  /**
    * Returned when the remote endpoint's incoming data rate was too high.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait MessageRateTooHigh
    extends StObject
       with DisconnectReasonCode
  /* 150 */ val MessageRateTooHigh: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MessageRateTooHigh & Double = js.native
  
  /**
    * Returned when the remote endpoint wishes to disconnect normally. Will not trigger the publish of a Will message if a
    * Will message was configured on the connection.
    *
    * May be sent by the client or server.
    */
  @js.native
  sealed trait NormalDisconnection
    extends StObject
       with DisconnectReasonCode
  /* 0 */ val NormalDisconnection: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.NormalDisconnection & Double = js.native
  
  /**
    * Returned when the remote endpoint received a packet that represented an operation that was not authorized within
    * the current connection.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait NotAuthorized
    extends StObject
       with DisconnectReasonCode
  /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.NotAuthorized & Double = js.native
  
  /**
    * Returned when the remote endpoint received a packet whose size was greater than the maximum packet size limit
    * it established for itself when the connection was opened.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait PacketTooLarge
    extends StObject
       with DisconnectReasonCode
  /* 149 */ val PacketTooLarge: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.PacketTooLarge & Double = js.native
  
  /**
    * Returned when the remote endpoint received a packet where payload format did not match the format specified
    * by the payload format indicator.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait PayloadFormatInvalid
    extends StObject
       with DisconnectReasonCode
  /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.PayloadFormatInvalid & Double = js.native
  
  /**
    * Returned when an unexpected or out-of-order packet was received by the remote endpoint.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait ProtocolError
    extends StObject
       with DisconnectReasonCode
  /* 130 */ val ProtocolError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ProtocolError & Double = js.native
  
  /**
    * Returned when the client sends a QOS that is greater than the maximum QOS established when the connection was
    * opened.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait QosNotSupported
    extends StObject
       with DisconnectReasonCode
  /* 155 */ val QosNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.QosNotSupported & Double = js.native
  
  /**
    * Returned when an internal quota of the remote endpoint was exceeded.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait QuotaExceeded
    extends StObject
       with DisconnectReasonCode
  /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.QuotaExceeded & Double = js.native
  
  /**
    * Returned when the remote endpoint reached a state where there were more in-progress QoS1+ publishes then the
    * limit it established for itself when the connection was opened.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait ReceiveMaximumExceeded
    extends StObject
       with DisconnectReasonCode
  /* 147 */ val ReceiveMaximumExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ReceiveMaximumExceeded & Double = js.native
  
  /**
    * Returned when the server does not support retained messages.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait RetainNotSupported
    extends StObject
       with DisconnectReasonCode
  /* 154 */ val RetainNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.RetainNotSupported & Double = js.native
  
  /**
    * Returned when the server is busy and cannot continue processing packets from the client.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait ServerBusy
    extends StObject
       with DisconnectReasonCode
  /* 137 */ val ServerBusy: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerBusy & Double = js.native
  
  /**
    * Returned by the server to tell the client to permanently use a different server.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait ServerMoved
    extends StObject
       with DisconnectReasonCode
  /* 157 */ val ServerMoved: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerMoved & Double = js.native
  
  /**
    * Returned when the server is shutting down.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait ServerShuttingDown
    extends StObject
       with DisconnectReasonCode
  /* 139 */ val ServerShuttingDown: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerShuttingDown & Double = js.native
  
  /**
    * Returned when the server has established another connection with the same client ID as a client's current
    * connection, causing the current client to become disconnected.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait SessionTakenOver
    extends StObject
       with DisconnectReasonCode
  /* 142 */ val SessionTakenOver: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SessionTakenOver & Double = js.native
  
  /**
    * Returned by the server to tell the client that shared subscriptions are not supported on the server.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait SharedSubscriptionsNotSupported
    extends StObject
       with DisconnectReasonCode
  /* 158 */ val SharedSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SharedSubscriptionsNotSupported & Double = js.native
  
  /**
    * Returned by the server when it received a SUBSCRIBE packet with a subscription identifier, but the server does
    * not support subscription identifiers.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait SubscriptionIdentifiersNotSupported
    extends StObject
       with DisconnectReasonCode
  /* 161 */ val SubscriptionIdentifiersNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SubscriptionIdentifiersNotSupported & Double = js.native
  
  /**
    * Returned when the remote endpoint receives a PUBLISH packet that contained a topic alias greater than the
    * maximum topic alias limit that it established for itself when the connection was opened.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait TopicAliasInvalid
    extends StObject
       with DisconnectReasonCode
  /* 148 */ val TopicAliasInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicAliasInvalid & Double = js.native
  
  /**
    * Returned when the topic filter name is correctly formed but not accepted by the server.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait TopicFilterInvalid
    extends StObject
       with DisconnectReasonCode
  /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicFilterInvalid & Double = js.native
  
  /**
    * Returned when topic name is correctly formed, but is not accepted.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait TopicNameInvalid
    extends StObject
       with DisconnectReasonCode
  /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicNameInvalid & Double = js.native
  
  /**
    * Returned when the connection was closed but the sender does not want to specify a reason or none
    * of the other reason codes apply.
    *
    * May be sent by the client or the server.
    */
  @js.native
  sealed trait UnspecifiedError
    extends StObject
       with DisconnectReasonCode
  /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.UnspecifiedError & Double = js.native
  
  /**
    * Returned by the server to tell the client to temporarily use a different server.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait UseAnotherServer
    extends StObject
       with DisconnectReasonCode
  /* 156 */ val UseAnotherServer: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.UseAnotherServer & Double = js.native
  
  /**
    * Returned by the server when it received a SUBSCRIBE packet with a wildcard topic filter, but the server does
    * not support wildcard topic filters.
    *
    * May only be sent by the server.
    */
  @js.native
  sealed trait WildcardSubscriptionsNotSupported
    extends StObject
       with DisconnectReasonCode
  /* 162 */ val WildcardSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.WildcardSubscriptionsNotSupported & Double = js.native
}
