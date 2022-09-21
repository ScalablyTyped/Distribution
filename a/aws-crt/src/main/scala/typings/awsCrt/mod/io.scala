package typings.awsCrt.mod

import typings.awsCrt.ioMod.SocketDomain
import typings.awsCrt.ioMod.SocketType
import typings.awsCrt.nativeIoMod.LogLevel
import typings.awsCrt.nativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior
import typings.awsCrt.nativeIoMod.TlsContextOptions.Pkcs11Options
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("aws-crt", "io")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt", "io.ClientBootstrap")
  @js.native
  open class ClientBootstrap ()
    extends typings.awsCrt.nativeIoMod.ClientBootstrap
  
  @JSImport("aws-crt", "io.ClientTlsContext")
  @js.native
  open class ClientTlsContext ()
    extends typings.awsCrt.nativeIoMod.ClientTlsContext {
    def this(ctx_opt: typings.awsCrt.nativeIoMod.TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt", "io.InputStream")
  @js.native
  open class InputStream protected ()
    extends typings.awsCrt.nativeIoMod.InputStream {
    def this(source: Readable) = this()
  }
  
  @JSImport("aws-crt", "io.LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.nativeIoMod.LogLevel & Double] = js.native
    
    /* 5 */ val DEBUG: typings.awsCrt.nativeIoMod.LogLevel.DEBUG & Double = js.native
    
    /* 2 */ val ERROR: typings.awsCrt.nativeIoMod.LogLevel.ERROR & Double = js.native
    
    /* 1 */ val FATAL: typings.awsCrt.nativeIoMod.LogLevel.FATAL & Double = js.native
    
    /* 4 */ val INFO: typings.awsCrt.nativeIoMod.LogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typings.awsCrt.nativeIoMod.LogLevel.NONE & Double = js.native
    
    /* 6 */ val TRACE: typings.awsCrt.nativeIoMod.LogLevel.TRACE & Double = js.native
    
    /* 3 */ val WARN: typings.awsCrt.nativeIoMod.LogLevel.WARN & Double = js.native
  }
  
  @JSImport("aws-crt", "io.Pkcs11Lib")
  @js.native
  open class Pkcs11Lib protected ()
    extends typings.awsCrt.nativeIoMod.Pkcs11Lib {
    /**
      * @param path - Path to PKCS#11 library.
      * @param behavior - Specifies how `C_Initialize()` and `C_Finalize()`
      *                   will be called on the PKCS#11 library.
      */
    def this(path: String) = this()
    def this(path: String, behavior: InitializeFinalizeBehavior) = this()
  }
  object Pkcs11Lib {
    
    /**
      * Controls `C_Initialize()` and `C_Finalize()` are called on the PKCS#11 library.
      */
    @JSImport("aws-crt", "io.Pkcs11Lib.InitializeFinalizeBehavior")
    @js.native
    object InitializeFinalizeBehavior extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.awsCrt.nativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior & Double] = js.native
      
      /* 0 */ val DEFAULT: typings.awsCrt.nativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.DEFAULT & Double = js.native
      
      /* 1 */ val OMIT: typings.awsCrt.nativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.OMIT & Double = js.native
      
      /* 2 */ val STRICT: typings.awsCrt.nativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.STRICT & Double = js.native
    }
  }
  
  @JSImport("aws-crt", "io.ServerTlsContext")
  @js.native
  open class ServerTlsContext ()
    extends typings.awsCrt.nativeIoMod.ServerTlsContext {
    def this(ctx_opt: typings.awsCrt.nativeIoMod.TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt", "io.SocketDomain")
  @js.native
  object SocketDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.ioMod.SocketDomain & Double] = js.native
    
    /* 0 */ val IPV4: typings.awsCrt.ioMod.SocketDomain.IPV4 & Double = js.native
    
    /* 1 */ val IPV6: typings.awsCrt.ioMod.SocketDomain.IPV6 & Double = js.native
    
    /* 2 */ val LOCAL: typings.awsCrt.ioMod.SocketDomain.LOCAL & Double = js.native
  }
  
  @JSImport("aws-crt", "io.SocketOptions")
  @js.native
  open class SocketOptions protected ()
    extends typings.awsCrt.nativeIoMod.SocketOptions {
    def this(
      `type`: js.UndefOr[SocketType],
      domain: js.UndefOr[SocketDomain],
      connect_timeout_ms: js.UndefOr[Double],
      keepalive: js.UndefOr[Boolean],
      keep_alive_interval_sec: js.UndefOr[Double],
      keep_alive_timeout_sec: js.UndefOr[Double],
      keep_alive_max_failed_probes: js.UndefOr[Double]
    ) = this()
  }
  
  @JSImport("aws-crt", "io.SocketType")
  @js.native
  object SocketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.ioMod.SocketType & Double] = js.native
    
    /* 1 */ val DGRAM: typings.awsCrt.ioMod.SocketType.DGRAM & Double = js.native
    
    /* 0 */ val STREAM: typings.awsCrt.ioMod.SocketType.STREAM & Double = js.native
  }
  
  @JSImport("aws-crt", "io.TlsConnectionOptions")
  @js.native
  open class TlsConnectionOptions protected ()
    extends typings.awsCrt.nativeIoMod.TlsConnectionOptions {
    def this(tls_ctx: typings.awsCrt.nativeIoMod.TlsContext) = this()
    def this(tls_ctx: typings.awsCrt.nativeIoMod.TlsContext, server_name: String) = this()
    def this(tls_ctx: typings.awsCrt.nativeIoMod.TlsContext, server_name: String, alpn_list: js.Array[String]) = this()
    def this(tls_ctx: typings.awsCrt.nativeIoMod.TlsContext, server_name: Unit, alpn_list: js.Array[String]) = this()
  }
  
  @JSImport("aws-crt", "io.TlsContext")
  @js.native
  abstract class TlsContext protected ()
    extends typings.awsCrt.nativeIoMod.TlsContext {
    def this(ctx_opt: typings.awsCrt.nativeIoMod.TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt", "io.TlsContextOptions")
  @js.native
  open class TlsContextOptions ()
    extends typings.awsCrt.nativeIoMod.TlsContextOptions
  /* static members */
  object TlsContextOptions {
    
    @JSImport("aws-crt", "io.TlsContextOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create options configured for mutual TLS in client mode,
      * with client certificate and private key provided as in-memory strings.
      * @param certificate - Client certificate file contents, in PEM format
      * @param private_key - Client private key file contents, in PEM format
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls(certificate: String, private_key: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls")(certificate.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Create options configured for mutual TLS in client mode,
      * with client certificate and private key provided via filepath.
      * @param certificate_filepath - Path to client certificate, in PEM format
      * @param private_key_filepath - Path to private key, in PEM format
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls_from_path(certificate_filepath: String, private_key_filepath: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_from_path")(certificate_filepath.asInstanceOf[js.Any], private_key_filepath.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Create options configured for mutual TLS in client mode,
      * using a PKCS#11 library for private key operations.
      *
      * NOTE: This configuration only works on Unix devices.
      *
      * @param options - PKCS#11 options
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls_pkcs11(options: Pkcs11Options): typings.awsCrt.nativeIoMod.TlsContextOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs11")(options.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Create options for mutual TLS in client mode,
      * with client certificate and private key bundled in a single PKCS#12 file.
      * @param pkcs12_filepath - Path to PKCS#12 file containing client certificate and private key.
      * @param pkcs12_password - PKCS#12 password
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls_pkcs12_from_path(pkcs12_filepath: String, pkcs12_password: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs12_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * @deprecated Renamed [[create_client_with_mtls_pkcs12_from_path]]
      */
    inline def create_client_with_mtls_pkcs_from_path(pkcs12_filepath: String, pkcs12_password: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Create options configured for mutual TLS in client mode,
      * using a certificate in a Windows certificate store.
      *
      * NOTE: Windows only.
      *
      * @param certificate_path - Path to certificate in a Windows certificate store.
      *      The path must use backslashes and end with the certificate's thumbprint.
      *      Example: `CurrentUser\MY\A11F8A9B5DF5B98BA3508FBCA575D09570E0D2C6`
      */
    inline def create_client_with_mtls_windows_cert_store_path(certificate_path: String): typings.awsCrt.nativeIoMod.TlsContextOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_windows_cert_store_path")(certificate_path.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Creates TLS context with peer verification disabled, along with a certificate and private key
      * @param certificate_filepath - Path to certificate, in PEM format
      * @param private_key_filepath - Path to private key, in PEM format
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_server_with_mtls_from_path(certificate_filepath: String, private_key_filepath: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_server_with_mtls_from_path")(certificate_filepath.asInstanceOf[js.Any], private_key_filepath.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
    
    /**
      * Creates TLS context with peer verification disabled, along with a certificate and private key
      * in PKCS#12 format
      * @param pkcs12_filepath - Path to certificate, in PKCS#12 format
      * @param pkcs12_password - PKCS#12 Password
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_server_with_mtls_pkcs_from_path(pkcs12_filepath: String, pkcs12_password: String): typings.awsCrt.nativeIoMod.TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_server_with_mtls_pkcs_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.nativeIoMod.TlsContextOptions]
  }
  
  @JSImport("aws-crt", "io.TlsVersion")
  @js.native
  object TlsVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.ioMod.TlsVersion & Double] = js.native
    
    /* 128 */ val Default: typings.awsCrt.ioMod.TlsVersion.Default & Double = js.native
    
    /* 0 */ val SSLv3: typings.awsCrt.ioMod.TlsVersion.SSLv3 & Double = js.native
    
    /* 1 */ val TLSv1: typings.awsCrt.ioMod.TlsVersion.TLSv1 & Double = js.native
    
    /* 2 */ val TLSv1_1: typings.awsCrt.ioMod.TlsVersion.TLSv1_1 & Double = js.native
    
    /* 3 */ val TLSv1_2: typings.awsCrt.ioMod.TlsVersion.TLSv1_2 & Double = js.native
    
    /* 4 */ val TLSv1_3: typings.awsCrt.ioMod.TlsVersion.TLSv1_3 & Double = js.native
  }
  
  inline def enableLogging(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def errorCodeToName(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_name")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorCodeToString(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_string")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAlpnAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_alpn_available")().asInstanceOf[Boolean]
}
