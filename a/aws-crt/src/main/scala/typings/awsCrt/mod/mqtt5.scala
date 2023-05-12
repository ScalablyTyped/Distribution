package typings.awsCrt.mod

import typings.awsCrt.distCommonHttpMod.HttpProxyAuthenticationType
import typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode
import typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode
import typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode
import typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode
import typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode
import typings.awsCrt.distNativeHttpMod.HttpProxyConnectionType
import typings.awsCrt.distNativeIoMod.TlsConnectionOptions
import typings.awsCrt.distNativeMqtt5Mod.Mqtt5ClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqtt5 {
  
  @JSImport("aws-crt", "mqtt5")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt", "mqtt5.ClientExtendedValidationAndFlowControl")
  @js.native
  object ClientExtendedValidationAndFlowControl extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.awsCrt.distNativeMqtt5Mod.ClientExtendedValidationAndFlowControl & Double
      ] = js.native
    
    /* 1 */ val AwsIotCoreDefaults: typings.awsCrt.distNativeMqtt5Mod.ClientExtendedValidationAndFlowControl.AwsIotCoreDefaults & Double = js.native
    
    /* 0 */ val None: typings.awsCrt.distNativeMqtt5Mod.ClientExtendedValidationAndFlowControl.None & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.ClientOperationQueueBehavior")
  @js.native
  object ClientOperationQueueBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior & Double] = js.native
    
    /* 0 */ val Default: typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior.Default & Double = js.native
    
    /* 3 */ val FailAllOnDisconnect: typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior.FailAllOnDisconnect & Double = js.native
    
    /* 1 */ val FailNonQos1PublishOnDisconnect: typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior.FailNonQos1PublishOnDisconnect & Double = js.native
    
    /* 2 */ val FailQos0PublishOnDisconnect: typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior.FailQos0PublishOnDisconnect & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.ClientSessionBehavior")
  @js.native
  object ClientSessionBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior & Double] = js.native
    
    /* 1 */ val Clean: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.Clean & Double = js.native
    
    /* 0 */ val Default: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.Default & Double = js.native
    
    /* 3 */ val RejoinAlways: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.RejoinAlways & Double = js.native
    
    /* 2 */ val RejoinPostSuccess: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.RejoinPostSuccess & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.ConnectReasonCode")
  @js.native
  object ConnectReasonCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode & Double] = js.native
    
    /* 140 */ val BadAuthenticationMethod: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.BadAuthenticationMethod & Double = js.native
    
    /* 134 */ val BadUsernameOrPassword: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.BadUsernameOrPassword & Double = js.native
    
    /* 138 */ val Banned: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.Banned & Double = js.native
    
    /* 133 */ val ClientIdentifierNotValid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ClientIdentifierNotValid & Double = js.native
    
    /* 159 */ val ConnectionRateExceeded: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ConnectionRateExceeded & Double = js.native
    
    /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ImplementationSpecificError & Double = js.native
    
    /* 129 */ val MalformedPacket: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.MalformedPacket & Double = js.native
    
    /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.NotAuthorized & Double = js.native
    
    /* 149 */ val PacketTooLarge: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.PacketTooLarge & Double = js.native
    
    /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.PayloadFormatInvalid & Double = js.native
    
    /* 130 */ val ProtocolError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ProtocolError & Double = js.native
    
    /* 155 */ val QosNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.QosNotSupported & Double = js.native
    
    /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.QuotaExceeded & Double = js.native
    
    /* 154 */ val RetainNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.RetainNotSupported & Double = js.native
    
    /* 137 */ val ServerBusy: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerBusy & Double = js.native
    
    /* 157 */ val ServerMoved: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerMoved & Double = js.native
    
    /* 136 */ val ServerUnavailable: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.ServerUnavailable & Double = js.native
    
    /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.Success & Double = js.native
    
    /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.TopicNameInvalid & Double = js.native
    
    /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UnspecifiedError & Double = js.native
    
    /* 132 */ val UnsupportedProtocolVersion: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UnsupportedProtocolVersion & Double = js.native
    
    /* 156 */ val UseAnotherServer: typings.awsCrt.distCommonMqtt5PacketMod.ConnectReasonCode.UseAnotherServer & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.DisconnectReasonCode")
  @js.native
  object DisconnectReasonCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode & Double] = js.native
    
    /* 152 */ val AdministrativeAction: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.AdministrativeAction & Double = js.native
    
    /* 159 */ val ConnectionRateExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ConnectionRateExceeded & Double = js.native
    
    /* 4 */ val DisconnectWithWillMessage: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.DisconnectWithWillMessage & Double = js.native
    
    /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ImplementationSpecificError & Double = js.native
    
    /* 141 */ val KeepAliveTimeout: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.KeepAliveTimeout & Double = js.native
    
    /* 129 */ val MalformedPacket: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MalformedPacket & Double = js.native
    
    /* 160 */ val MaximumConnectTime: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MaximumConnectTime & Double = js.native
    
    /* 150 */ val MessageRateTooHigh: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.MessageRateTooHigh & Double = js.native
    
    /* 0 */ val NormalDisconnection: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.NormalDisconnection & Double = js.native
    
    /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.NotAuthorized & Double = js.native
    
    /* 149 */ val PacketTooLarge: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.PacketTooLarge & Double = js.native
    
    /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.PayloadFormatInvalid & Double = js.native
    
    /* 130 */ val ProtocolError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ProtocolError & Double = js.native
    
    /* 155 */ val QosNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.QosNotSupported & Double = js.native
    
    /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.QuotaExceeded & Double = js.native
    
    /* 147 */ val ReceiveMaximumExceeded: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ReceiveMaximumExceeded & Double = js.native
    
    /* 154 */ val RetainNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.RetainNotSupported & Double = js.native
    
    /* 137 */ val ServerBusy: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerBusy & Double = js.native
    
    /* 157 */ val ServerMoved: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerMoved & Double = js.native
    
    /* 139 */ val ServerShuttingDown: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.ServerShuttingDown & Double = js.native
    
    /* 142 */ val SessionTakenOver: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SessionTakenOver & Double = js.native
    
    /* 158 */ val SharedSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SharedSubscriptionsNotSupported & Double = js.native
    
    /* 161 */ val SubscriptionIdentifiersNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.SubscriptionIdentifiersNotSupported & Double = js.native
    
    /* 148 */ val TopicAliasInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicAliasInvalid & Double = js.native
    
    /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicFilterInvalid & Double = js.native
    
    /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.TopicNameInvalid & Double = js.native
    
    /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.UnspecifiedError & Double = js.native
    
    /* 156 */ val UseAnotherServer: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.UseAnotherServer & Double = js.native
    
    /* 162 */ val WildcardSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.DisconnectReasonCode.WildcardSubscriptionsNotSupported & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.HttpProxyOptions")
  @js.native
  open class HttpProxyOptions protected ()
    extends typings.awsCrt.distNativeMqtt5Mod.HttpProxyOptions {
    /**
      *
      * @param host_name Name of the proxy server to connect through
      * @param port Port number of the proxy server to connect through
      * @param auth_method Type of proxy authentication to use. Default is {@link HttpProxyAuthenticationType.None}
      * @param auth_username Username to use when `auth_type` is {@link HttpProxyAuthenticationType.Basic}
      * @param auth_password Password to use when `auth_type` is {@link HttpProxyAuthenticationType.Basic}
      * @param tls_opts Optional TLS connection options for the connection to the proxy host.
      *                 Must be distinct from the {@link TlsConnectionOptions} provided to
      *                 the HTTP connection
      * @param connection_type Optional Type of connection to make.  If not specified,
      *                 {@link HttpProxyConnectionType.Legacy} will be used.
      */
    def this(host_name: String, port: Double) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String, auth_password: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: Unit, auth_password: String) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
  }
  
  @JSImport("aws-crt", "mqtt5.Mqtt5Client")
  @js.native
  open class Mqtt5Client protected ()
    extends typings.awsCrt.distNativeMqtt5Mod.Mqtt5Client {
    /**
      * Client constructor
      *
      * @param config The configuration for this client
      */
    def this(config: Mqtt5ClientConfig) = this()
  }
  /* static members */
  object Mqtt5Client {
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Event emitted when the client begins a connection attempt.
      *
      * Listener type: {@link AttemptingConnectEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.ATTEMPTING_CONNECT")
    @js.native
    def ATTEMPTING_CONNECT: String = js.native
    inline def ATTEMPTING_CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTEMPTING_CONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when the client fails to establish an MQTT connection.  Only emitted after
      * an {@link ATTEMPTING_CONNECT attemptingConnect} event.
      *
      * Listener type: {@link ConnectionFailureEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.CONNECTION_FAILURE")
    @js.native
    def CONNECTION_FAILURE: String = js.native
    inline def CONNECTION_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_FAILURE")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when the client successfully establishes an MQTT connection.  Only emitted after
      * an {@link ATTEMPTING_CONNECT attemptingConnect} event.
      *
      * Listener type: {@link ConnectionSuccessEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.CONNECTION_SUCCESS")
    @js.native
    def CONNECTION_SUCCESS: String = js.native
    inline def CONNECTION_SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_SUCCESS")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when the client's current connection is closed for any reason.  Only emitted after
      * a {@link CONNECTION_SUCCESS connectionSuccess} event.
      *
      * Listener type: {@link DisconnectionEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.DISCONNECTION")
    @js.native
    def DISCONNECTION: String = js.native
    inline def DISCONNECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTION")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when the client encounters a serious error condition, such as invalid input, napi failures, and
      * other potentially unrecoverable situations.
      *
      * Listener type: {@link ErrorEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when an MQTT PUBLISH packet is received by the client.
      *
      * Listener type: {@link MessageReceivedEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.MESSAGE_RECEIVED")
    @js.native
    def MESSAGE_RECEIVED: String = js.native
    inline def MESSAGE_RECEIVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_RECEIVED")(x.asInstanceOf[js.Any])
    
    /**
      * Event emitted when the client finishes shutdown as a result of the user invoking {@link stop}.
      *
      * Listener type: {@link StoppedEventListener}
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt5.Mqtt5Client.STOPPED")
    @js.native
    def STOPPED: String = js.native
    inline def STOPPED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STOPPED")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_attempting_connect")
    @js.native
    def _s_on_attempting_connect: Any = js.native
    inline def _s_on_attempting_connect_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_attempting_connect")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_connection_failure")
    @js.native
    def _s_on_connection_failure: Any = js.native
    inline def _s_on_connection_failure_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_failure")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_connection_success")
    @js.native
    def _s_on_connection_success: Any = js.native
    inline def _s_on_connection_success_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_success")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_disconnection")
    @js.native
    def _s_on_disconnection: Any = js.native
    inline def _s_on_disconnection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_disconnection")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_message_received")
    @js.native
    def _s_on_message_received: Any = js.native
    inline def _s_on_message_received_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_message_received")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_puback_callback")
    @js.native
    def _s_on_puback_callback: Any = js.native
    inline def _s_on_puback_callback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_puback_callback")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_stopped")
    @js.native
    def _s_on_stopped: Any = js.native
    inline def _s_on_stopped_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stopped")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_suback_callback")
    @js.native
    def _s_on_suback_callback: Any = js.native
    inline def _s_on_suback_callback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_suback_callback")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "mqtt5.Mqtt5Client._s_on_unsuback_callback")
    @js.native
    def _s_on_unsuback_callback: Any = js.native
    inline def _s_on_unsuback_callback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_unsuback_callback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "mqtt5.PacketType")
  @js.native
  object PacketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.PacketType & Double] = js.native
    
    /* 15 */ val Auth: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Auth & Double = js.native
    
    /* 2 */ val Connack: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Connack & Double = js.native
    
    /* 1 */ val Connect: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Connect & Double = js.native
    
    /* 14 */ val Disconnect: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Disconnect & Double = js.native
    
    /* 12 */ val Pingreq: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pingreq & Double = js.native
    
    /* 13 */ val Pingresp: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pingresp & Double = js.native
    
    /* 4 */ val Puback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Puback & Double = js.native
    
    /* 7 */ val Pubcomp: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubcomp & Double = js.native
    
    /* 3 */ val Publish: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Publish & Double = js.native
    
    /* 5 */ val Pubrec: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubrec & Double = js.native
    
    /* 6 */ val Pubrel: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubrel & Double = js.native
    
    /* 9 */ val Suback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Suback & Double = js.native
    
    /* 8 */ val Subscribe: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Subscribe & Double = js.native
    
    /* 11 */ val Unsuback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Unsuback & Double = js.native
    
    /* 10 */ val Unsubscribe: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Unsubscribe & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.PayloadFormatIndicator")
  @js.native
  object PayloadFormatIndicator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.PayloadFormatIndicator & Double] = js.native
    
    /* 0 */ val Bytes: typings.awsCrt.distCommonMqtt5PacketMod.PayloadFormatIndicator.Bytes & Double = js.native
    
    /* 1 */ val Utf8: typings.awsCrt.distCommonMqtt5PacketMod.PayloadFormatIndicator.Utf8 & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.PubackReasonCode")
  @js.native
  object PubackReasonCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode & Double] = js.native
    
    /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.ImplementationSpecificError & Double = js.native
    
    /* 16 */ val NoMatchingSubscribers: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.NoMatchingSubscribers & Double = js.native
    
    /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.NotAuthorized & Double = js.native
    
    /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.PacketIdentifierInUse & Double = js.native
    
    /* 153 */ val PayloadFormatInvalid: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.PayloadFormatInvalid & Double = js.native
    
    /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.QuotaExceeded & Double = js.native
    
    /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.Success & Double = js.native
    
    /* 144 */ val TopicNameInvalid: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.TopicNameInvalid & Double = js.native
    
    /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.PubackReasonCode.UnspecifiedError & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.QoS")
  @js.native
  object QoS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.QoS & Double] = js.native
    
    /* 1 */ val AtLeastOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.AtLeastOnce & Double = js.native
    
    /* 0 */ val AtMostOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.AtMostOnce & Double = js.native
    
    /* 2 */ val ExactlyOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.ExactlyOnce & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.RetainHandlingType")
  @js.native
  object RetainHandlingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType & Double] = js.native
    
    /* 2 */ val DontSend: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.DontSend & Double = js.native
    
    /* 0 */ val SendOnSubscribe: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.SendOnSubscribe & Double = js.native
    
    /* 1 */ val SendOnSubscribeIfNew: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.SendOnSubscribeIfNew & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.RetryJitterType")
  @js.native
  object RetryJitterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5Mod.RetryJitterType & Double] = js.native
    
    /* 3 */ val Decorrelated: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Decorrelated & Double = js.native
    
    /* 0 */ val Default: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Default & Double = js.native
    
    /* 2 */ val Full: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Full & Double = js.native
    
    /* 1 */ val None: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.None & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.SubackReasonCode")
  @js.native
  object SubackReasonCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode & Double] = js.native
    
    /* 0 */ val GrantedQoS0: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS0 & Double = js.native
    
    /* 1 */ val GrantedQoS1: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS1 & Double = js.native
    
    /* 2 */ val GrantedQoS2: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.GrantedQoS2 & Double = js.native
    
    /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.ImplementationSpecificError & Double = js.native
    
    /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.NotAuthorized & Double = js.native
    
    /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.PacketIdentifierInUse & Double = js.native
    
    /* 151 */ val QuotaExceeded: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.QuotaExceeded & Double = js.native
    
    /* 158 */ val SharedSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.SharedSubscriptionsNotSupported & Double = js.native
    
    /* 161 */ val SubscriptionIdentifiersNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.SubscriptionIdentifiersNotSupported & Double = js.native
    
    /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.TopicFilterInvalid & Double = js.native
    
    /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.UnspecifiedError & Double = js.native
    
    /* 162 */ val WildcardSubscriptionsNotSupported: typings.awsCrt.distCommonMqtt5PacketMod.SubackReasonCode.WildcardSubscriptionsNotSupported & Double = js.native
  }
  
  @JSImport("aws-crt", "mqtt5.UnsubackReasonCode")
  @js.native
  object UnsubackReasonCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode & Double] = js.native
    
    /* 131 */ val ImplementationSpecificError: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.ImplementationSpecificError & Double = js.native
    
    /* 17 */ val NoSubscriptionExisted: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.NoSubscriptionExisted & Double = js.native
    
    /* 135 */ val NotAuthorized: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.NotAuthorized & Double = js.native
    
    /* 145 */ val PacketIdentifierInUse: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.PacketIdentifierInUse & Double = js.native
    
    /* 0 */ val Success: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.Success & Double = js.native
    
    /* 143 */ val TopicFilterInvalid: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.TopicFilterInvalid & Double = js.native
    
    /* 128 */ val UnspecifiedError: typings.awsCrt.distCommonMqtt5PacketMod.UnsubackReasonCode.UnspecifiedError & Double = js.native
  }
  
  inline def isSuccessfulConnectReasonCode(reasonCode: ConnectReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulConnectReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuccessfulDisconnectReasonCode(reasonCode: DisconnectReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulDisconnectReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuccessfulPubackReasonCode(reasonCode: PubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulPubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuccessfulSubackReasonCode(reasonCode: SubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulSubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuccessfulUnsubackReasonCode(reasonCode: UnsubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulUnsubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
