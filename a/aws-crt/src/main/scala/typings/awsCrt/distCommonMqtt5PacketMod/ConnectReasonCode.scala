package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectReasonCode extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "ConnectReasonCode")
@js.native
object ConnectReasonCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectReasonCode & Double] = js.native
  
  /**
    * Returned when the authentication method used in the connection is either not supported on the server or it does
    * not match the authentication method currently in use in the CONNECT packet.
    */
  @js.native
  sealed trait BadAuthenticationMethod
    extends StObject
       with ConnectReasonCode
  /* 140 */ val BadAuthenticationMethod: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.BadAuthenticationMethod & Double = js.native
  
  /**
    * Returned when the server does not accept the username and/or password specified by the client
    * in the connection packet.
    */
  @js.native
  sealed trait BadUsernameOrPassword
    extends StObject
       with ConnectReasonCode
  /* 134 */ val BadUsernameOrPassword: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.BadUsernameOrPassword & Double = js.native
  
  /**
    * Returned when the client has been banned by the server.
    */
  @js.native
  sealed trait Banned
    extends StObject
       with ConnectReasonCode
  /* 138 */ val Banned: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.Banned & Double = js.native
  
  /**
    * Returned when the client identifier in the CONNECT packet is a valid string but not one that
    * is allowed on the server.
    */
  @js.native
  sealed trait ClientIdentifierNotValid
    extends StObject
       with ConnectReasonCode
  /* 133 */ val ClientIdentifierNotValid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ClientIdentifierNotValid & Double = js.native
  
  /**
    * Returned when the server connection rate limit has been exceeded.
    */
  @js.native
  sealed trait ConnectionRateExceeded
    extends StObject
       with ConnectReasonCode
  /* 159 */ val ConnectionRateExceeded: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ConnectionRateExceeded & Double = js.native
  
  /**
    * Returned when the CONNECT packet is valid but was not accepted by the server.
    */
  @js.native
  sealed trait ImplementationSpecificError
    extends StObject
       with ConnectReasonCode
  /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ImplementationSpecificError & Double = js.native
  
  /**
    * Returned when data in the CONNECT packet could not be correctly parsed by the server.
    */
  @js.native
  sealed trait MalformedPacket
    extends StObject
       with ConnectReasonCode
  /* 129 */ val MalformedPacket: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.MalformedPacket & Double = js.native
  
  /**
    * Returned when the client is not authorized to connect to the server.
    */
  @js.native
  sealed trait NotAuthorized
    extends StObject
       with ConnectReasonCode
  /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.NotAuthorized & Double = js.native
  
  /**
    * Returned when the connection packet exceeded the maximum permissible size on the server.
    */
  @js.native
  sealed trait PacketTooLarge
    extends StObject
       with ConnectReasonCode
  /* 149 */ val PacketTooLarge: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.PacketTooLarge & Double = js.native
  
  /**
    * Returned when the Will payload in the CONNECT packet does not match the specified payload format indicator.
    */
  @js.native
  sealed trait PayloadFormatInvalid
    extends StObject
       with ConnectReasonCode
  /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.PayloadFormatInvalid & Double = js.native
  
  /**
    * Returned when data in the CONNECT packet does not conform to the MQTT5 specification requirements.
    */
  @js.native
  sealed trait ProtocolError
    extends StObject
       with ConnectReasonCode
  /* 130 */ val ProtocolError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ProtocolError & Double = js.native
  
  /**
    * Returned when the server does not support the QOS setting in the Will QOS in the connection packet.
    */
  @js.native
  sealed trait QosNotSupported
    extends StObject
       with ConnectReasonCode
  /* 155 */ val QosNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.QosNotSupported & Double = js.native
  
  /**
    * Returned when the quota limits set on the server have been met and/or exceeded.
    */
  @js.native
  sealed trait QuotaExceeded
    extends StObject
       with ConnectReasonCode
  /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.QuotaExceeded & Double = js.native
  
  /**
    * Returned when the server does not retain messages but the connection packet on the client had Will retain enabled.
    */
  @js.native
  sealed trait RetainNotSupported
    extends StObject
       with ConnectReasonCode
  /* 154 */ val RetainNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.RetainNotSupported & Double = js.native
  
  /**
    * Returned when the server is too busy to make a connection. It is recommended that the client try again later.
    */
  @js.native
  sealed trait ServerBusy
    extends StObject
       with ConnectReasonCode
  /* 137 */ val ServerBusy: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerBusy & Double = js.native
  
  /**
    * Returned when the server is telling the client to permanently use another server instead of the one they
    * are trying to connect to.
    */
  @js.native
  sealed trait ServerMoved
    extends StObject
       with ConnectReasonCode
  /* 157 */ val ServerMoved: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerMoved & Double = js.native
  
  /**
    * Returned when the MQTT5 server is not available.
    */
  @js.native
  sealed trait ServerUnavailable
    extends StObject
       with ConnectReasonCode
  /* 136 */ val ServerUnavailable: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerUnavailable & Double = js.native
  
  /**
    * Returned when the connection is accepted.
    */
  @js.native
  sealed trait Success
    extends StObject
       with ConnectReasonCode
  /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.Success & Double = js.native
  
  /**
    * Returned when the Will topic name sent in the connection packet is correctly formed, but is not accepted by
    * the server.
    */
  @js.native
  sealed trait TopicNameInvalid
    extends StObject
       with ConnectReasonCode
  /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.TopicNameInvalid & Double = js.native
  
  /**
    * Returned when the server has a failure but does not want to specify a reason or none
    * of the other reason codes apply.
    */
  @js.native
  sealed trait UnspecifiedError
    extends StObject
       with ConnectReasonCode
  /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UnspecifiedError & Double = js.native
  
  /**
    * Returned when the server does not support MQTT5 protocol version specified in the connection.
    */
  @js.native
  sealed trait UnsupportedProtocolVersion
    extends StObject
       with ConnectReasonCode
  /* 132 */ val UnsupportedProtocolVersion: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UnsupportedProtocolVersion & Double = js.native
  
  /**
    * Returned when the server is telling the client to temporarily use another server instead of the one they
    * are trying to connect to.
    */
  @js.native
  sealed trait UseAnotherServer
    extends StObject
       with ConnectReasonCode
  /* 156 */ val UseAnotherServer: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UseAnotherServer & Double = js.native
}
