package typings.awsCrt

import typings.awsCrt.distCommonAwsIotSharedMod.MqttConnectCustomAuthConfig
import typings.awsCrt.distNativeAwsIotMod.WebsocketConfig
import typings.awsCrt.distNativeAwsIotMqtt5Mod.WebsocketSigv4Config
import typings.awsCrt.distNativeIoMod.Pkcs12Options
import typings.awsCrt.distNativeIoMod.TlsContextOptions.Pkcs11Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeIotMod {
  
  @JSImport("aws-crt/dist/native/iot", "AwsIotMqtt5ClientConfigBuilder")
  @js.native
  /* private */ open class AwsIotMqtt5ClientConfigBuilder ()
    extends typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder
  /* static members */
  object AwsIotMqtt5ClientConfigBuilder {
    
    @JSImport("aws-crt/dist/native/iot", "AwsIotMqtt5ClientConfigBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-crt/dist/native/iot", "AwsIotMqtt5ClientConfigBuilder.DEFAULT_DIRECT_MQTT_PORT")
    @js.native
    def DEFAULT_DIRECT_MQTT_PORT: Any = js.native
    inline def DEFAULT_DIRECT_MQTT_PORT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DIRECT_MQTT_PORT")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt/dist/native/iot", "AwsIotMqtt5ClientConfigBuilder.DEFAULT_WEBSOCKET_MQTT_PORT")
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
    inline def newDirectMqttBuilderWithCustomAuth(hostName: String, customAuthConfig: MqttConnectCustomAuthConfig): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithCustomAuth")(hostName.asInstanceOf[js.Any], customAuthConfig.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using in-memory X509 certificate and key.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param cert - Certificate, in PEM format
      * @param privateKey - Private key, in PEM format
      */
    inline def newDirectMqttBuilderWithMtlsFromMemory(hostName: String, cert: String, privateKey: String): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromMemory")(hostName.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using X509 certificate and key at the supplied file paths.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param certPath - Path to certificate, in PEM format
      * @param keyPath - Path to private key, in PEM format
      */
    inline def newDirectMqttBuilderWithMtlsFromPath(hostName: String, certPath: String, keyPath: String): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPath")(hostName.asInstanceOf[js.Any], certPath.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using a PKCS11 library for certificate and private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param pkcs11Options - PKCS#11 options.
      */
    inline def newDirectMqttBuilderWithMtlsFromPkcs11(hostName: String, pkcs11Options: Pkcs11Options): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPkcs11")(hostName.asInstanceOf[js.Any], pkcs11Options.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via mutual TLS
      * using a PKCS12 file.
      *
      * Note: This configuration only works on MacOS devices.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param pkcs12_options - The PKCS#12 options to use in the builder.
      */
    inline def newDirectMqttBuilderWithMtlsFromPkcs12(hostName: String, pkcs12_options: Pkcs12Options): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromPkcs12")(hostName.asInstanceOf[js.Any], pkcs12_options.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
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
    inline def newDirectMqttBuilderWithMtlsFromWindowsCertStorePath(hostName: String, certificatePath: String): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newDirectMqttBuilderWithMtlsFromWindowsCertStorePath")(hostName.asInstanceOf[js.Any], certificatePath.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via websockets,
      * authenticating via a custom authenticator.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param customAuthConfig - AWS IoT custom auth configuration
      */
    inline def newWebsocketMqttBuilderWithCustomAuth(hostName: String, customAuthConfig: MqttConnectCustomAuthConfig): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithCustomAuth")(hostName.asInstanceOf[js.Any], customAuthConfig.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    
    /**
      * Create a new MQTT5 client builder that will create MQTT5 clients that connect to AWS IoT Core via websockets,
      * using AWS Sigv4 signing to establish authenticate.
      *
      * @param hostName - AWS IoT endpoint to connect to
      * @param options - additional sigv4-oriented options to use
      */
    inline def newWebsocketMqttBuilderWithSigv4Auth(hostName: String): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithSigv4Auth")(hostName.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
    inline def newWebsocketMqttBuilderWithSigv4Auth(hostName: String, options: WebsocketSigv4Config): typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("newWebsocketMqttBuilderWithSigv4Auth")(hostName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMqtt5Mod.AwsIotMqtt5ClientConfigBuilder]
  }
  
  @JSImport("aws-crt/dist/native/iot", "AwsIotMqttConnectionConfigBuilder")
  @js.native
  /* private */ open class AwsIotMqttConnectionConfigBuilder ()
    extends typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder
  /* static members */
  object AwsIotMqttConnectionConfigBuilder {
    
    @JSImport("aws-crt/dist/native/iot", "AwsIotMqttConnectionConfigBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-crt/dist/native/iot", "AwsIotMqttConnectionConfigBuilder.configure_websocket_handshake")
    @js.native
    def configure_websocket_handshake: Any = js.native
    inline def configure_websocket_handshake_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure_websocket_handshake")(x.asInstanceOf[js.Any])
    
    /**
      * For API compatibility with the browser version. Alias for {@link new_with_websockets}.
      *
      * @returns a new websocket connection builder object with default TLS configuration
      */
    inline def new_builder_for_websocket(): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_builder_for_websocket")().asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Creates a new builder with default Tls options. This requires setting the connection details manually.
      */
    inline def new_default_builder(): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_default_builder")().asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS cert pair in memory
      * @param cert - Certificate, in PEM format
      * @param private_key - Private key, in PEM format
      */
    inline def new_mtls_builder(cert: String, private_key: String): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder")(cert.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS file paths
      * @param cert_path - Path to certificate, in PEM format
      * @param key_path - Path to private key, in PEM format
      */
    inline def new_mtls_builder_from_path(cert_path: String, key_path: String): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder_from_path")(cert_path.asInstanceOf[js.Any], key_path.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a PKCS#11 library for private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      * @param pkcs11_options - PKCS#11 options.
      */
    inline def new_mtls_pkcs11_builder(pkcs11_options: Pkcs11Options): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_pkcs11_builder")(pkcs11_options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a PKCS#12 file for private key operations.
      *
      * Note: This configuration only works on MacOS devices.
      *
      * @param pkcs12_options - The PKCS#12 options to use in the builder.
      */
    inline def new_mtls_pkcs12_builder(pkcs12_options: Pkcs12Options): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_pkcs12_builder")(pkcs12_options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a certificate in a Windows certificate store.
      *
      * NOTE: This configuration only works on Windows devices.
      * @param certificate_path - Path to certificate in a Windows certificate store.
      *      The path must use backslashes and end with the certificate's thumbprint.
      *      Example: `CurrentUser\MY\A11F8A9B5DF5B98BA3508FBCA575D09570E0D2C6`
      */
    inline def new_mtls_windows_cert_store_path_builder(certificate_path: String): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_windows_cert_store_path_builder")(certificate_path.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    inline def new_websocket_builder(args: Any*): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_websocket_builder")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Configures the connection to use MQTT over websockets. Forces the port to 443.
      */
    inline def new_with_websockets(): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")().asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
    inline def new_with_websockets(options: WebsocketConfig): typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")(options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAwsIotMod.AwsIotMqttConnectionConfigBuilder]
  }
}
