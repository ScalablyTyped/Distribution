package typings.awsCrt.mod

import typings.awsCrt.awsIotMod.WebsocketConfig
import typings.awsCrt.nativeIoMod.TlsContextOptions.Pkcs11Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iot {
  
  @JSImport("aws-crt", "iot.AwsIotMqttConnectionConfigBuilder")
  @js.native
  /* private */ open class AwsIotMqttConnectionConfigBuilder ()
    extends typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder
  /* static members */
  object AwsIotMqttConnectionConfigBuilder {
    
    @JSImport("aws-crt", "iot.AwsIotMqttConnectionConfigBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-crt", "iot.AwsIotMqttConnectionConfigBuilder.configure_websocket_handshake")
    @js.native
    def configure_websocket_handshake: Any = js.native
    inline def configure_websocket_handshake_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure_websocket_handshake")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new builder with default Tls options. This requires setting the connection details manually.
      */
    inline def new_default_builder(): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_default_builder")().asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS cert pair in memory
      * @param cert - Certificate, in PEM format
      * @param private_key - Private key, in PEM format
      */
    inline def new_mtls_builder(cert: String, private_key: String): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder")(cert.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS file paths
      * @param cert_path - Path to certificate, in PEM format
      * @param key_path - Path to private key, in PEM format
      */
    inline def new_mtls_builder_from_path(cert_path: String, key_path: String): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_builder_from_path")(cert_path.asInstanceOf[js.Any], key_path.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a PKCS#11 library for private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      * @param pkcs11_options - PKCS#11 options.
      */
    inline def new_mtls_pkcs11_builder(pkcs11_options: Pkcs11Options): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_pkcs11_builder")(pkcs11_options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Create a new builder with mTLS using a certificate in a Windows certificate store.
      *
      * NOTE: This configuration only works on Windows devices.
      * @param certificate_path - Path to certificate in a Windows certificate store.
      *      The path must use backslashes and end with the certificate's thumbprint.
      *      Example: `CurrentUser\MY\A11F8A9B5DF5B98BA3508FBCA575D09570E0D2C6`
      */
    inline def new_mtls_windows_cert_store_path_builder(certificate_path: String): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_mtls_windows_cert_store_path_builder")(certificate_path.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    inline def new_websocket_builder(args: Any*): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_websocket_builder")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    
    /**
      * Configures the connection to use MQTT over websockets. Forces the port to 443.
      */
    inline def new_with_websockets(): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")().asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
    inline def new_with_websockets(options: WebsocketConfig): typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("new_with_websockets")(options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.awsIotMod.AwsIotMqttConnectionConfigBuilder]
  }
}
