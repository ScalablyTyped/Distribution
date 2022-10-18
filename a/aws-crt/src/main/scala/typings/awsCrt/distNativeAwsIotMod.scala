package typings.awsCrt

import typings.awsCrt.distCommonAuthMod.WebsocketOptionsBase
import typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider
import typings.awsCrt.distNativeHttpMod.HttpProxyOptions
import typings.awsCrt.distNativeIoMod.SocketOptions
import typings.awsCrt.distNativeIoMod.TlsContextOptions
import typings.awsCrt.distNativeIoMod.TlsContextOptions.Pkcs11Options
import typings.awsCrt.distNativeMqttMod.MqttConnectionConfig
import typings.awsCrt.distNativeMqttMod.MqttWill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeAwsIotMod {
  
  @JSImport("aws-crt/dist/native/aws_iot", "AwsIotMqttConnectionConfigBuilder")
  @js.native
  /* private */ open class AwsIotMqttConnectionConfigBuilder () extends StObject {
    
    /**
      * Returns the configured MqttConnectionConfig.  On the first invocation of this function, the TLS context is cached
      * and re-used on all subsequent calls to build().
      * @returns The configured MqttConnectionConfig
      */
    def build(): MqttConnectionConfig = js.native
    
    /* private */ var is_using_custom_authorizer: Any = js.native
    
    /* private */ var params: Any = js.native
    
    /* private */ var tls_ctx_options: Any = js.native
    
    /**
      * Overrides the default system trust store.
      * @param ca - Buffer containing all trust CAs, in PEM format
      */
    def with_certificate_authority(ca: String): this.type = js.native
    
    /**
      * Overrides the default system trust store.
      * @param ca_dirpath - Only used on Unix-style systems where all trust anchors are
      * stored in a directory (e.g. /etc/ssl/certs).
      * @param ca_filepath - Single file containing all trust CAs, in PEM format
      */
    def with_certificate_authority_from_path(): this.type = js.native
    def with_certificate_authority_from_path(ca_dirpath: String): this.type = js.native
    def with_certificate_authority_from_path(ca_dirpath: String, ca_filepath: String): this.type = js.native
    def with_certificate_authority_from_path(ca_dirpath: Unit, ca_filepath: String): this.type = js.native
    
    /**
      * Determines whether or not the service should try to resume prior subscriptions, if it has any
      * @param clean_session true if the session should drop prior subscriptions when this client connects, false to resume the session
      */
    def with_clean_session(clean_session: Boolean): this.type = js.native
    
    /**
      * Configures the client_id to use to connect to the IoT Core service
      * @param client_id The client id for this connection. Needs to be unique across all devices/clients.
      */
    def with_client_id(client_id: String): this.type = js.native
    
    /**
      * Configures AWS credentials (usually from Cognito) for this connection
      * @param aws_region The service region to connect to
      * @param aws_access_id IAM Access ID
      * @param aws_secret_key IAM Secret Key
      * @param aws_sts_token STS token from Cognito (optional)
      */
    def with_credentials(aws_region: String, aws_access_id: String, aws_secret_key: String): AwsIotMqttConnectionConfigBuilder = js.native
    def with_credentials(aws_region: String, aws_access_id: String, aws_secret_key: String, aws_sts_token: String): AwsIotMqttConnectionConfigBuilder = js.native
    
    /**
      * Sets the custom authorizer settings. This function will modify the username, port, and TLS options.
      *
      * @param username The username to use with the custom authorizer. If an empty string is passed, it will
      *                 check to see if a username has already been set (via WithUsername function). If no
      *                 username is set then no username will be passed with the MQTT connection.
      * @param authorizerName The name of the custom authorizer. If an empty string is passed, then
      *                       'x-amz-customauthorizer-name' will not be added with the MQTT connection.
      * @param authorizerSignature The signature of the custom authorizer. If an empty string is passed, then
      *                            'x-amz-customauthorizer-signature' will not be added with the MQTT connection.
      * @param password The password to use with the custom authorizer. If null is passed, then no password will
      *                 be set.
      */
    def with_custom_authorizer(username: String, authorizer_name: String, authorizer_signature: String, password: String): this.type = js.native
    
    /**
      * Configures the IoT endpoint for this connection
      * @param endpoint The IoT endpoint to connect to
      */
    def with_endpoint(endpoint: String): this.type = js.native
    
    /**
      * Configure the http proxy options to use to establish the connection
      * @param proxy_options proxy options to use to establish the mqtt connection
      */
    def with_http_proxy_options(proxy_options: HttpProxyOptions): this.type = js.native
    
    /**
      * Configures MQTT keep-alive via PING messages. Note that this is not TCP keepalive.
      * @param keep_alive How often in seconds to send an MQTT PING message to the service to keep the connection alive
      */
    def with_keep_alive_seconds(keep_alive: Double): this.type = js.native
    
    /**
      * Sets password for the connection
      *
      * @param password the password that will be passed with the MQTT connection
      */
    def with_password(password: String): this.type = js.native
    
    /**
      * Configures the PINGREQ response timeout (in milliseconds)
      * @param ping_timeout PINGREQ response timeout
      */
    def with_ping_timeout_ms(ping_timeout: Double): this.type = js.native
    
    /**
      * The port to connect to on the IoT endpoint
      * @param port The port to connect to on the IoT endpoint. Usually 8883 for MQTT, or 443 for websockets
      */
    def with_port(port: Double): this.type = js.native
    
    /**
      * Configures the protocol operation timeout (in milliseconds)
      * @param protocol_operation_timeout protocol operation timeout
      */
    def with_protocol_operation_timeout_ms(protocol_operation_timeout: Double): this.type = js.native
    
    /**
      * Configure the max reconnection period (in second). The reonnection period will
      * be set in range of [reconnect_min_sec,reconnect_max_sec].
      * @param reconnect_max_sec max reconnection period
      */
    def with_reconnect_max_sec(max_sec: Double): this.type = js.native
    
    /**
      * Configure the min reconnection period (in second). The reonnection period will
      * be set in range of [reconnect_min_sec,reconnect_max_sec].
      * @param reconnect_min_sec min reconnection period
      */
    def with_reconnect_min_sec(min_sec: Double): this.type = js.native
    
    /**
      * Configures the common settings for the socket to use when opening a connection to the server
      * @param socket_options The socket settings
      */
    def with_socket_options(socket_options: SocketOptions): this.type = js.native
    
    /**
      * Configures the TCP socket timeout (in milliseconds)
      * @param timeout_ms TCP socket timeout
      * @deprecated
      */
    def with_timeout_ms(timeout_ms: Double): this.type = js.native
    
    /**
      * Sets username for the connection
      *
      * @param username the username that will be passed with the MQTT connection
      */
    def with_username(username: String): this.type = js.native
    
    /**
      * Configures the will message to be sent when this client disconnects
      * @param will The will topic, qos, and message
      */
    def with_will(will: MqttWill): this.type = js.native
  }
  /* static members */
  object AwsIotMqttConnectionConfigBuilder {
    
    @JSImport("aws-crt/dist/native/aws_iot", "AwsIotMqttConnectionConfigBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-crt/dist/native/aws_iot", "AwsIotMqttConnectionConfigBuilder.configure_websocket_handshake")
    @js.native
    def configure_websocket_handshake: Any = js.native
    inline def configure_websocket_handshake_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure_websocket_handshake")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new builder with default Tls options. This requires setting the connection details manually.
      */
    inline def new_default_builder(): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_default_builder")().asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS cert pair in memory
      * @param cert - Certificate, in PEM format
      * @param private_key - Private key, in PEM format
      */
    inline def new_mtls_builder(cert: String, private_key: String): AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder")(cert.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS file paths
      * @param cert_path - Path to certificate, in PEM format
      * @param key_path - Path to private key, in PEM format
      */
    inline def new_mtls_builder_from_path(cert_path: String, key_path: String): AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder_from_path")(cert_path.asInstanceOf[js.Any], key_path.asInstanceOf[js.Any])).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a PKCS#11 library for private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      * @param pkcs11_options - PKCS#11 options.
      */
    inline def new_mtls_pkcs11_builder(pkcs11_options: Pkcs11Options): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_pkcs11_builder")(pkcs11_options.asInstanceOf[js.Any]).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a certificate in a Windows certificate store.
      *
      * NOTE: This configuration only works on Windows devices.
      * @param certificate_path - Path to certificate in a Windows certificate store.
      *      The path must use backslashes and end with the certificate's thumbprint.
      *      Example: `CurrentUser\MY\A11F8A9B5DF5B98BA3508FBCA575D09570E0D2C6`
      */
    inline def new_mtls_windows_cert_store_path_builder(certificate_path: String): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_windows_cert_store_path_builder")(certificate_path.asInstanceOf[js.Any]).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    inline def new_websocket_builder(args: Any*): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_websocket_builder")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Configures the connection to use MQTT over websockets. Forces the port to 443.
      */
    inline def new_with_websockets(): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")().asInstanceOf[AwsIotMqttConnectionConfigBuilder]
    inline def new_with_websockets(options: WebsocketConfig): AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")(options.asInstanceOf[js.Any]).asInstanceOf[AwsIotMqttConnectionConfigBuilder]
  }
  
  trait WebsocketConfig
    extends StObject
       with WebsocketOptionsBase {
    
    /** Sources the AWS Credentials used to sign the websocket connection handshake */
    var credentials_provider: AwsCredentialsProvider
    
    /** (Optional) http proxy configuration */
    var proxy_options: js.UndefOr[HttpProxyOptions] = js.undefined
    
    /** AWS region the websocket connection is being established in.  Must match the region embedded in the
      * endpoint.
      */
    var region: String
    
    /** (Optional)  TLS configuration to use when establishing the connection */
    var tls_ctx_options: js.UndefOr[TlsContextOptions] = js.undefined
  }
  object WebsocketConfig {
    
    inline def apply(credentials_provider: AwsCredentialsProvider, region: String): WebsocketConfig = {
      val __obj = js.Dynamic.literal(credentials_provider = credentials_provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsocketConfig]
    }
    
    extension [Self <: WebsocketConfig](x: Self) {
      
      inline def setCredentials_provider(value: AwsCredentialsProvider): Self = StObject.set(x, "credentials_provider", value.asInstanceOf[js.Any])
      
      inline def setProxy_options(value: HttpProxyOptions): Self = StObject.set(x, "proxy_options", value.asInstanceOf[js.Any])
      
      inline def setProxy_optionsUndefined: Self = StObject.set(x, "proxy_options", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setTls_ctx_options(value: TlsContextOptions): Self = StObject.set(x, "tls_ctx_options", value.asInstanceOf[js.Any])
      
      inline def setTls_ctx_optionsUndefined: Self = StObject.set(x, "tls_ctx_options", js.undefined)
    }
  }
}
