package typings.awsCrt.mod

import typings.awsCrt.distCommonHttpMod.HttpProxyAuthenticationType
import typings.awsCrt.distCommonMqttMod.Payload
import typings.awsCrt.distCommonMqttMod.QoS
import typings.awsCrt.distNativeHttpMod.HttpProxyConnectionType
import typings.awsCrt.distNativeIoMod.ClientBootstrap
import typings.awsCrt.distNativeIoMod.TlsConnectionOptions
import typings.awsCrt.distNativeMqttMod.MqttConnectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqtt {
  
  @JSImport("aws-crt", "mqtt.HttpProxyOptions")
  @js.native
  open class HttpProxyOptions protected ()
    extends typings.awsCrt.distNativeMqttMod.HttpProxyOptions {
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
  
  @JSImport("aws-crt", "mqtt.MqttClient")
  @js.native
  /**
    * @param bootstrap The {@link ClientBootstrap} to use for socket connections.  Leave undefined to use the
    *          default system-wide bootstrap (recommended).
    */
  open class MqttClient ()
    extends typings.awsCrt.distNativeMqttMod.MqttClient {
    def this(bootstrap: ClientBootstrap) = this()
  }
  
  @JSImport("aws-crt", "mqtt.MqttClientConnection")
  @js.native
  open class MqttClientConnection protected ()
    extends typings.awsCrt.distNativeMqttMod.MqttClientConnection {
    /**
      * @param client The client that owns this connection
      * @param config The configuration for this connection
      */
    def this(client: typings.awsCrt.distNativeMqttMod.MqttClient, config: MqttConnectionConfig) = this()
  }
  /* static members */
  object MqttClientConnection {
    
    @JSImport("aws-crt", "mqtt.MqttClientConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when the connection successfully establishes itself for the first time
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.CONNECT")
    @js.native
    def CONNECT: String = js.native
    inline def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when connection has disconnected successfully.
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.DISCONNECT")
    @js.native
    def DISCONNECT: String = js.native
    inline def DISCONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs.  The error will contain the error
      * code and message.
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection is dropped unexpectedly. The error will contain the error
      * code and message.  The underlying mqtt implementation will attempt to reconnect.
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.INTERRUPT")
    @js.native
    def INTERRUPT: String = js.native
    inline def INTERRUPT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when any MQTT publish message arrives.
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection reconnects (after an interrupt). Only triggers on connections after the initial one.
      *
      * @event
      */
    @JSImport("aws-crt", "mqtt.MqttClientConnection.RESUME")
    @js.native
    def RESUME: String = js.native
    inline def RESUME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "mqtt.MqttWill")
  @js.native
  open class MqttWill protected ()
    extends typings.awsCrt.distNativeMqttMod.MqttWill {
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
  }
  
  @JSImport("aws-crt", "mqtt.QoS")
  @js.native
  object QoS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqttMod.QoS & Double] = js.native
    
    /* 1 */ val AtLeastOnce: typings.awsCrt.distCommonMqttMod.QoS.AtLeastOnce & Double = js.native
    
    /* 0 */ val AtMostOnce: typings.awsCrt.distCommonMqttMod.QoS.AtMostOnce & Double = js.native
    
    /* 2 */ val ExactlyOnce: typings.awsCrt.distCommonMqttMod.QoS.ExactlyOnce & Double = js.native
  }
}
