package typings.awsCrt

import typings.awsCrt.distCommonAwsIotSharedMod.MqttConnectCustomAuthConfig
import typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior
import typings.awsCrt.distCommonMqtt5Mod.RetryJitterType
import typings.awsCrt.distCommonMqtt5PacketMod.ConnectPacket
import typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider
import typings.awsCrt.distNativeHttpMod.HttpProxyOptions
import typings.awsCrt.distNativeIoMod.Pkcs12Options
import typings.awsCrt.distNativeIoMod.SocketOptions
import typings.awsCrt.distNativeIoMod.TlsContextOptions.Pkcs11Options
import typings.awsCrt.distNativeMqtt5Mod.ClientExtendedValidationAndFlowControl
import typings.awsCrt.distNativeMqtt5Mod.ClientOperationQueueBehavior
import typings.awsCrt.distNativeMqtt5Mod.Mqtt5ClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeAwsIotMqtt5Mod {
  
  @JSImport("aws-crt/dist/native/aws_iot_mqtt5", "AwsIotMqtt5ClientConfigBuilder")
  @js.native
  /* private */ open class AwsIotMqtt5ClientConfigBuilder () extends StObject {
    
    /**
      * Constructs an MQTT5 Client configuration object for creating mqtt5 clients.
      */
    def build(): Mqtt5ClientConfig = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var customAuthConfig: Any = js.native
    
    /* private */ var tlsContextOptions: Any = js.native
    
    /**
      * Overrides the time interval to wait for an ack after sending a QoS 1+ PUBLISH, SUBSCRIBE, or UNSUBSCRIBE before
      * failing the operation.  Defaults to no timeout.
      *
      * @param ackTimeoutSeconds the time interval to wait for an ack after sending a QoS 1+ PUBLISH, SUBSCRIBE,
      * or UNSUBSCRIBE before failing the operation
      *
      * @group Node-only
      */
    def withAckTimeoutSeconds(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withAckTimeoutSeconds(ackTimeoutSeconds: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the default system trust store.
      *
      * @param ca - Buffer containing all trust CAs, in PEM format
      */
    def withCertificateAuthority(ca: String): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the default system trust store.
      *
      * @param caDirpath - Only used on Unix-style systems where all trust anchors are
      * stored in a directory (e.g. /etc/ssl/certs).
      * @param caFilepath - Single file containing all trust CAs, in PEM format
      */
    def withCertificateAuthorityFromPath(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withCertificateAuthorityFromPath(caDirpath: String): AwsIotMqtt5ClientConfigBuilder = js.native
    def withCertificateAuthorityFromPath(caDirpath: String, caFilepath: String): AwsIotMqtt5ClientConfigBuilder = js.native
    def withCertificateAuthorityFromPath(caDirpath: Unit, caFilepath: String): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the time interval to wait after sending a CONNECT request for a CONNACK to arrive.  If one does not
      * arrive, the connection will be shut down.
      *
      * @param connackTimeoutMs time interval to wait after sending a CONNECT request for a CONNACK to arrive
      */
    def withConnackTimeoutMs(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withConnackTimeoutMs(connackTimeoutMs: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides all configurable options with respect to the CONNECT packet sent by the client, including the will.
      * These connect properties will be used for every connection attempt made by the client.  Custom authentication
      * configuration will override the username and password values in this configuration.
      *
      * @param connectPacket all configurable options with respect to the CONNECT packet sent by the client
      */
    def withConnectProperties(connectPacket: ConnectPacket): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides additional controls for client behavior with respect to operation validation and flow control; these
      * checks go beyond the base MQTT5 spec to respect limits of specific MQTT brokers.
      *
      * @param extendedValidationAndFlowControlOptions additional controls for client behavior with respect to operation
      * validation and flow control
      *
      * @group Node-only
      */
    def withExtendedValidationAndFlowControlOptions(extendedValidationAndFlowControlOptions: ClientExtendedValidationAndFlowControl): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides (tunneling) HTTP proxy usage when establishing MQTT connections.
      *
      * @param httpProxyOptions HTTP proxy options to use when establishing MQTT connections
      *
      * @group Node-only
      */
    def withHttpProxyOptions(httpProxyOptions: HttpProxyOptions): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the maximum amount of time to wait to reconnect after a disconnect.  Exponential backoff is performed
      * with controllable jitter after each connection failure.
      *
      * @param maxReconnectDelayMs maximum amount of time to wait to reconnect after a disconnect.
      */
    def withMaxReconnectDelayMs(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withMaxReconnectDelayMs(maxReconnectDelayMs: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the amount of time that must elapse with an established connection before the reconnect delay is
      * reset to the minimum.  This helps alleviate bandwidth-waste in fast reconnect cycles due to permission
      * failures on operations.
      *
      * @param minConnectedTimeToResetReconnectDelayMs the amount of time that must elapse with an established
      * connection before the reconnect delay is reset to the minimum
      */
    def withMinConnectedTimeToResetReconnectDelayMs(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withMinConnectedTimeToResetReconnectDelayMs(minConnectedTimeToResetReconnectDelayMs: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the minimum amount of time to wait to reconnect after a disconnect.  Exponential backoff is performed
      * with controllable jitter after each connection failure.
      *
      * @param minReconnectDelayMs minimum amount of time to wait to reconnect after a disconnect.
      */
    def withMinReconnectDelayMs(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withMinReconnectDelayMs(minReconnectDelayMs: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides how disconnects affect the queued and in-progress operations tracked by the client.  Also controls
      * how new operations are handled while the client is not connected.  In particular, if the client is not connected,
      * then any operation that would be failed on disconnect (according to these rules) will also be rejected.
      *
      * @param offlineQueueBehavior how disconnects affect the queued and in-progress operations tracked by the client
      *
      * @group Node-only
      */
    def withOfflineQueueBehavior(offlineQueueBehavior: ClientOperationQueueBehavior): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the time interval to wait after sending a PINGREQ for a PINGRESP to arrive.  If one does not arrive,
      * the client will close the current connection.
      *
      * @param pingTimeoutMs time interval to wait after sending a PINGREQ for a PINGRESP to arrive
      *
      * @group Node-only
      */
    def withPingTimeoutMs(): AwsIotMqtt5ClientConfigBuilder = js.native
    def withPingTimeoutMs(pingTimeoutMs: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the IoT endpoint port to connect to.
      *
      * @param port The IoT endpoint port to connect to. Usually 8883 for MQTT, or 443 for websockets
      */
    def withPort(port: Double): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides how the reconnect delay is modified in order to smooth out the distribution of reconnection attempt
      * timepoints for a large set of reconnecting clients.
      *
      * @param retryJitterMode controls how the reconnect delay is modified in order to smooth out the distribution of
      * econnection attempt timepoints for a large set of reconnecting clients.
      */
    def withRetryJitterMode(retryJitterMode: RetryJitterType): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides how the MQTT5 client should behave with respect to MQTT sessions.
      *
      * @param sessionBehavior how the MQTT5 client should behave with respect to MQTT sessions.
      */
    def withSessionBehavior(sessionBehavior: ClientSessionBehavior): AwsIotMqtt5ClientConfigBuilder = js.native
    
    /**
      * Overrides the socket properties of the underlying MQTT connections made by the client.  Leave undefined to use
      * defaults (no TCP keep alive, 10 second socket timeout).
      *
      * @param socketOptions socket properties of the underlying MQTT connections made by the client
      *
      * @group Node-only
      */
    def withSocketOptions(socketOptions: SocketOptions): AwsIotMqtt5ClientConfigBuilder = js.native
  }
  /* static members */
  object AwsIotMqtt5ClientConfigBuilder {
    
    @JSImport("aws-crt/dist/native/aws_iot_mqtt5", "AwsIotMqtt5ClientConfigBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-crt/dist/native/aws_iot_mqtt5", "AwsIotMqtt5ClientConfigBuilder.DEFAULT_DIRECT_MQTT_PORT")
    @js.native
    def DEFAULT_DIRECT_MQTT_PORT: Any = js.native
    inline def DEFAULT_DIRECT_MQTT_PORT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DIRECT_MQTT_PORT")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt/dist/native/aws_iot_mqtt5", "AwsIotMqtt5ClientConfigBuilder.DEFAULT_WEBSOCKET_MQTT_PORT")
    @js.native
    def DEFAULT_WEBSOCKET_MQTT_PORT: Any = js.native
    inline def DEFAULT_WEBSOCKET_MQTT_PORT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WEBSOCKET_MQTT_PORT")(x.asInstanceOf[js.Any])
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via TLS,
      * authenticating via a custom authenticator.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param customAuthConfig - AWS IoT custom auth configuration
      */
    inline def newDirectMqttBuilderWithCustomAuth(hostName: String, customAuthConfig: MqttConnectCustomAuthConfig): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithCustomAuth")(hostName.asInstanceOf[js.Any], customAuthConfig.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using in-memory X509 certificate and key.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param cert - Certificate, in PEM format
      * @param privateKey - Private key, in PEM format
      */
    inline def newDirectMqttBuilderWithMtlsFromMemory(hostName: String, cert: String, privateKey: String): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromMemory")(hostName.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using X509 certificate and key at the supplied file paths.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param certPath - Path to certificate, in PEM format
      * @param keyPath - Path to private key, in PEM format
      */
    inline def newDirectMqttBuilderWithMtlsFromPath(hostName: String, certPath: String, keyPath: String): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPath")(hostName.asInstanceOf[js.Any], certPath.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using a PKCS11 library for certificate and private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param pkcs11Options - PKCS#11 options.
      */
    inline def newDirectMqttBuilderWithMtlsFromPkcs11(hostName: String, pkcs11Options: Pkcs11Options): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPkcs11")(hostName.asInstanceOf[js.Any], pkcs11Options.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using a PKCS12 file.
      *
      * Note: This configuration only works on MacOS devices.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param pkcs12_options - The PKCS#12 options to use in the builder.
      */
    inline def newDirectMqttBuilderWithMtlsFromPkcs12(hostName: String, pkcs12_options: Pkcs12Options): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPkcs12")(hostName.asInstanceOf[js.Any], pkcs12_options.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using a certificate entry in a Windows certificate store.
      *
      * NOTE: This configuration only works on Windows devices.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param certificatePath - Path to certificate in a Windows certificate store.
      *      The path must use backslashes and end with the certificate's thumbprint.
      *      Example: `CurrentUser\MY\A11F8A9B5DF5B98BA3508FBCA575D09570E0D2C6`
      */
    inline def newDirectMqttBuilderWithMtlsFromWindowsCertStorePath(hostName: String, certificatePath: String): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromWindowsCertStorePath")(hostName.asInstanceOf[js.Any], certificatePath.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via websockets,
      * authenticating via a custom authenticator.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param customAuthConfig - AWS IoT custom auth configuration
      */
    inline def newWebsocketMqttBuilderWithCustomAuth(hostName: String, customAuthConfig: MqttConnectCustomAuthConfig): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithCustomAuth")(hostName.asInstanceOf[js.Any], customAuthConfig.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via websockets,
      * using AWS Sigv4 signing to establish authenticate.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param options - additional sigv4-oriented options to use
      */
    inline def newWebsocketMqttBuilderWithSigv4Auth(hostName: String): AwsIotMqtt5ClientConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithSigv4Auth")(hostName.asInstanceOf[js.Any]).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
    inline def newWebsocketMqttBuilderWithSigv4Auth(hostName: String, options: WebsocketSigv4Config): AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithSigv4Auth")(hostName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqtt5ClientConfigBuilder]
  }
  
  trait WebsocketSigv4Config extends StObject {
    
    /**
      * Sources the AWS Credentials used to sign the websocket connection handshake.  If not provided, the
      * default credentials provider chain is used.
      */
    var credentialsProvider: js.UndefOr[AwsCredentialsProvider] = js.undefined
    
    /**
      * AWS region the websocket connection is being established in.  Must match the region embedded in the
      * endpoint.  If not provided, pattern-matching logic is used to extract the region from the endpoint.
      * Use this option if the pattern-matching logic has not yet been updated to handle new endpoint formats.
      */
    var region: js.UndefOr[String] = js.undefined
  }
  object WebsocketSigv4Config {
    
    inline def apply(): WebsocketSigv4Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsocketSigv4Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebsocketSigv4Config] (val x: Self) extends AnyVal {
      
      inline def setCredentialsProvider(value: AwsCredentialsProvider): Self = StObject.set(x, "credentialsProvider", value.asInstanceOf[js.Any])
      
      inline def setCredentialsProviderUndefined: Self = StObject.set(x, "credentialsProvider", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
