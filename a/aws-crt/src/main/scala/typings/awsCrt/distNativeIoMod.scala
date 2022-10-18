package typings.awsCrt

import typings.awsCrt.distCommonIoMod.SocketDomain
import typings.awsCrt.distCommonIoMod.SocketType
import typings.awsCrt.distCommonIoMod.TlsVersion
import typings.awsCrt.distNativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior
import typings.awsCrt.distNativeIoMod.TlsContextOptions.Pkcs11Options
import typings.awsCrt.distNativeNativeResourceMod.NativeResource
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeIoMod {
  
  @JSImport("aws-crt/dist/native/io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/io", "ClientBootstrap")
  @js.native
  open class ClientBootstrap () extends NativeResource
  
  @JSImport("aws-crt/dist/native/io", "ClientTlsContext")
  @js.native
  open class ClientTlsContext () extends TlsContext {
    def this(ctx_opt: TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt/dist/native/io", "InputStream")
  @js.native
  open class InputStream protected () extends NativeResource {
    def this(source: Readable) = this()
    
    /* private */ var source: Any = js.native
  }
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("aws-crt/dist/native/io", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    /** Enough information to debug the chain of events a given network connection encounters */
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogLevel
    /* 5 */ val DEBUG: typings.awsCrt.distNativeIoMod.LogLevel.DEBUG & Double = js.native
    
    /** Only errors */
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 2 */ val ERROR: typings.awsCrt.distNativeIoMod.LogLevel.ERROR & Double = js.native
    
    /** Only fatals. In practice, this will not do much, as the process will log and then crash (intentionally) if a fatal condition occurs */
    @js.native
    sealed trait FATAL
      extends StObject
         with LogLevel
    /* 1 */ val FATAL: typings.awsCrt.distNativeIoMod.LogLevel.FATAL & Double = js.native
    
    /** Information about connection/stream creation/destruction events */
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 4 */ val INFO: typings.awsCrt.distNativeIoMod.LogLevel.INFO & Double = js.native
    
    /** No logging whatsoever. Equivalent to never calling {@link enable_logging}. */
    @js.native
    sealed trait NONE
      extends StObject
         with LogLevel
    /* 0 */ val NONE: typings.awsCrt.distNativeIoMod.LogLevel.NONE & Double = js.native
    
    /** Everything. Only use this if you really need to know EVERY single call */
    @js.native
    sealed trait TRACE
      extends StObject
         with LogLevel
    /* 6 */ val TRACE: typings.awsCrt.distNativeIoMod.LogLevel.TRACE & Double = js.native
    
    /** Only warnings and errors */
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 3 */ val WARN: typings.awsCrt.distNativeIoMod.LogLevel.WARN & Double = js.native
  }
  
  @JSImport("aws-crt/dist/native/io", "Pkcs11Lib")
  @js.native
  open class Pkcs11Lib protected () extends NativeResource {
    /**
      * @param path - Path to PKCS#11 library.
      * @param behavior - Specifies how `C_Initialize()` and `C_Finalize()`
      *                   will be called on the PKCS#11 library.
      */
    def this(path: String) = this()
    def this(path: String, behavior: InitializeFinalizeBehavior) = this()
    
    /**
      * Release the PKCS#11 library immediately, without waiting for the GC.
      */
    def close(): Unit = js.native
  }
  object Pkcs11Lib {
    
    @js.native
    sealed trait InitializeFinalizeBehavior extends StObject
    /**
      * Controls `C_Initialize()` and `C_Finalize()` are called on the PKCS#11 library.
      */
    @JSImport("aws-crt/dist/native/io", "Pkcs11Lib.InitializeFinalizeBehavior")
    @js.native
    object InitializeFinalizeBehavior extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[InitializeFinalizeBehavior & Double] = js.native
      
      /**
        * Default behavior that accommodates most use cases.
        *
        * `C_Initialize()` is called on creation, and "already-initialized"
        * errors are ignored. `C_Finalize()` is never called, just in case
        * another part of your application is still using the PKCS#11 library.
        */
      @js.native
      sealed trait DEFAULT
        extends StObject
           with InitializeFinalizeBehavior
      /* 0 */ val DEFAULT: typings.awsCrt.distNativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.DEFAULT & Double = js.native
      
      /**
        * Skip calling `C_Initialize()` and `C_Finalize()`.
        *
        * Use this if your application has already initialized the PKCS#11 library,
        * and you do not want `C_Initialize()` called again.
        */
      @js.native
      sealed trait OMIT
        extends StObject
           with InitializeFinalizeBehavior
      /* 1 */ val OMIT: typings.awsCrt.distNativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.OMIT & Double = js.native
      
      /**
        * `C_Initialize()` is called on creation and `C_Finalize()` is called on cleanup.
        *
        * If `C_Initialize()` reports that's it's already initialized, this is
        * treated as an error. Use this if you need perfect cleanup (ex: running
        * valgrind with --leak-check).
        */
      @js.native
      sealed trait STRICT
        extends StObject
           with InitializeFinalizeBehavior
      /* 2 */ val STRICT: typings.awsCrt.distNativeIoMod.Pkcs11Lib.InitializeFinalizeBehavior.STRICT & Double = js.native
    }
  }
  
  @JSImport("aws-crt/dist/native/io", "ServerTlsContext")
  @js.native
  open class ServerTlsContext () extends TlsContext {
    def this(ctx_opt: TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt/dist/native/io", "SocketDomain")
  @js.native
  object SocketDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonIoMod.SocketDomain & Double] = js.native
    
    /* 0 */ val IPV4: typings.awsCrt.distCommonIoMod.SocketDomain.IPV4 & Double = js.native
    
    /* 1 */ val IPV6: typings.awsCrt.distCommonIoMod.SocketDomain.IPV6 & Double = js.native
    
    /* 2 */ val LOCAL: typings.awsCrt.distCommonIoMod.SocketDomain.LOCAL & Double = js.native
  }
  
  @JSImport("aws-crt/dist/native/io", "SocketOptions")
  @js.native
  open class SocketOptions protected () extends NativeResource {
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
  
  @JSImport("aws-crt/dist/native/io", "SocketType")
  @js.native
  object SocketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonIoMod.SocketType & Double] = js.native
    
    /* 1 */ val DGRAM: typings.awsCrt.distCommonIoMod.SocketType.DGRAM & Double = js.native
    
    /* 0 */ val STREAM: typings.awsCrt.distCommonIoMod.SocketType.STREAM & Double = js.native
  }
  
  @JSImport("aws-crt/dist/native/io", "TlsConnectionOptions")
  @js.native
  open class TlsConnectionOptions protected () extends NativeResource {
    def this(tls_ctx: TlsContext) = this()
    def this(tls_ctx: TlsContext, server_name: String) = this()
    def this(tls_ctx: TlsContext, server_name: String, alpn_list: js.Array[String]) = this()
    def this(tls_ctx: TlsContext, server_name: Unit, alpn_list: js.Array[String]) = this()
    
    val alpn_list: js.Array[String] = js.native
    
    val server_name: js.UndefOr[String] = js.native
    
    val tls_ctx: TlsContext = js.native
  }
  
  /* note: abstract class */ @JSImport("aws-crt/dist/native/io", "TlsContext")
  @js.native
  open class TlsContext protected () extends NativeResource {
    def this(ctx_opt: TlsContextOptions) = this()
  }
  
  @JSImport("aws-crt/dist/native/io", "TlsContextOptions")
  @js.native
  open class TlsContextOptions () extends StObject {
    
    /** List of ALPN protocols to be used on platforms which support ALPN */
    var alpn_list: js.Array[String] = js.native
    
    /** Path to directory containing trust anchors. Only used on Unix-style systems. */
    var ca_dirpath: js.UndefOr[String] = js.native
    
    /** Path to a single file with all trust anchors in it, in PEM format */
    var ca_filepath: js.UndefOr[String] = js.native
    
    /** Certificate, in PEM format */
    var certificate: js.UndefOr[String] = js.native
    
    /** String with all trust anchors in it, in PEM format */
    var certificate_authority: js.UndefOr[String] = js.native
    
    /** Path to certificate, in PEM format */
    var certificate_filepath: js.UndefOr[String] = js.native
    
    /** Minimum version of TLS to support. Uses OS/system default if unspecified. */
    var min_tls_version: TlsVersion = js.native
    
    /**
      * Overrides the default system trust store.
      * @param certificate_authority - String containing all trust CAs, in PEM format
      */
    def override_default_trust_store(certificate_authority: String): Unit = js.native
    
    /**
      * Overrides the default system trust store.
      * @param ca_dirpath - Only used on Unix-style systems where all trust anchors are
      * stored in a directory (e.g. /etc/ssl/certs).
      * @param ca_filepath - Single file containing all trust CAs, in PEM format
      */
    def override_default_trust_store_from_path(): Unit = js.native
    def override_default_trust_store_from_path(ca_dirpath: String): Unit = js.native
    def override_default_trust_store_from_path(ca_dirpath: String, ca_filepath: String): Unit = js.native
    def override_default_trust_store_from_path(ca_dirpath: Unit, ca_filepath: String): Unit = js.native
    
    /** PKCS#11 options. Currently, only supported on Unix */
    var pkcs11_options: js.UndefOr[Pkcs11Options] = js.native
    
    /** Path to certificate, in PKCS#12 format. Currently, only supported on OSX */
    var pkcs12_filepath: js.UndefOr[String] = js.native
    
    /** Password for PKCS#12. Currently, only supported on OSX. */
    var pkcs12_password: js.UndefOr[String] = js.native
    
    /** Private key, in PEM format */
    var private_key: js.UndefOr[String] = js.native
    
    /** Path to private key, in PEM format */
    var private_key_filepath: js.UndefOr[String] = js.native
    
    /**
      * In client mode, this turns off x.509 validation. Don't do this unless you are testing.
      * It is much better to just override the default trust store and pass the self-signed
      * certificate as the ca_file argument.
      *
      * In server mode (ServerTlsContext), this defaults to false. If you want to enforce mutual TLS on the server,
      * set this to true.
      */
    var verify_peer: Boolean = js.native
    
    /** Path to certificate in a Windows cert store. Windows only. */
    var windows_cert_store_path: js.UndefOr[String] = js.native
  }
  /* static members */
  object TlsContextOptions {
    
    @JSImport("aws-crt/dist/native/io", "TlsContextOptions")
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
    inline def create_client_with_mtls(certificate: String, private_key: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls")(certificate.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
    /**
      * Create options configured for mutual TLS in client mode,
      * with client certificate and private key provided via filepath.
      * @param certificate_filepath - Path to client certificate, in PEM format
      * @param private_key_filepath - Path to private key, in PEM format
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls_from_path(certificate_filepath: String, private_key_filepath: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_from_path")(certificate_filepath.asInstanceOf[js.Any], private_key_filepath.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
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
    inline def create_client_with_mtls_pkcs11(options: Pkcs11Options): TlsContextOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs11")(options.asInstanceOf[js.Any]).asInstanceOf[TlsContextOptions]
    
    /**
      * Create options for mutual TLS in client mode,
      * with client certificate and private key bundled in a single PKCS#12 file.
      * @param pkcs12_filepath - Path to PKCS#12 file containing client certificate and private key.
      * @param pkcs12_password - PKCS#12 password
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_client_with_mtls_pkcs12_from_path(pkcs12_filepath: String, pkcs12_password: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs12_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
    /**
      * @deprecated Renamed [[create_client_with_mtls_pkcs12_from_path]]
      */
    inline def create_client_with_mtls_pkcs_from_path(pkcs12_filepath: String, pkcs12_password: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_pkcs_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
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
    inline def create_client_with_mtls_windows_cert_store_path(certificate_path: String): TlsContextOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create_client_with_mtls_windows_cert_store_path")(certificate_path.asInstanceOf[js.Any]).asInstanceOf[TlsContextOptions]
    
    /**
      * Creates TLS context with peer verification disabled, along with a certificate and private key
      * @param certificate_filepath - Path to certificate, in PEM format
      * @param private_key_filepath - Path to private key, in PEM format
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_server_with_mtls_from_path(certificate_filepath: String, private_key_filepath: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_server_with_mtls_from_path")(certificate_filepath.asInstanceOf[js.Any], private_key_filepath.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
    /**
      * Creates TLS context with peer verification disabled, along with a certificate and private key
      * in PKCS#12 format
      * @param pkcs12_filepath - Path to certificate, in PKCS#12 format
      * @param pkcs12_password - PKCS#12 Password
      *
      * @returns newly configured TlsContextOptions object
      */
    inline def create_server_with_mtls_pkcs_from_path(pkcs12_filepath: String, pkcs12_password: String): TlsContextOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create_server_with_mtls_pkcs_from_path")(pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any])).asInstanceOf[TlsContextOptions]
    
    /**
      * Options for TLS using a PKCS#11 library for private key operations.
      *
      * Unix only. nodejs only.
      *
      * @see [[TlsContextOptions.create_client_with_mtls_pkcs11]]
      */
    trait Pkcs11Options extends StObject {
      
      /**
        * Use this X.509 certificate (contents in memory).
        * The certificate must be PEM-formatted.
        * The certificate may be specified by other means instead
        * (ex: [[cert_file_path]])
        */
      var cert_file_contents: js.UndefOr[String] = js.undefined
      
      /**
        * Use this X.509 certificate (file on disk).
        * The certificate must be PEM-formatted.
        * The certificate may be specified by other means instead
        * (ex: [[cert_file_contents]])
        */
      var cert_file_path: js.UndefOr[String] = js.undefined
      
      /**
        * Use this PKCS#11 library.
        */
      var pkcs11_lib: Pkcs11Lib
      
      /**
        * Specify the label of the private key object on the PKCS#11 token. If not
        * specified, the key will be chosen based on other criteria (such as being the
        * only available private key on the token).
        */
      var private_key_object_label: js.UndefOr[String] = js.undefined
      
      /**
        * Specify the slot ID containing a PKCS#11 token. If not specified, the token
        * will be chosen based on other criteria (such as [[token_label]]).
        */
      var slot_id: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify the label of the PKCS#11 token to use. If not specified, the token
        * will be chosen based on other criteria (such as [[slot_id]]).
        */
      var token_label: js.UndefOr[String] = js.undefined
      
      /**
        * Use this PIN to log the user into the PKCS#11 token. Pass `null`
        * to log into a token with a "protected authentication path".
        */
      var user_pin: Null | String
    }
    object Pkcs11Options {
      
      inline def apply(pkcs11_lib: Pkcs11Lib): Pkcs11Options = {
        val __obj = js.Dynamic.literal(pkcs11_lib = pkcs11_lib.asInstanceOf[js.Any], user_pin = null)
        __obj.asInstanceOf[Pkcs11Options]
      }
      
      extension [Self <: Pkcs11Options](x: Self) {
        
        inline def setCert_file_contents(value: String): Self = StObject.set(x, "cert_file_contents", value.asInstanceOf[js.Any])
        
        inline def setCert_file_contentsUndefined: Self = StObject.set(x, "cert_file_contents", js.undefined)
        
        inline def setCert_file_path(value: String): Self = StObject.set(x, "cert_file_path", value.asInstanceOf[js.Any])
        
        inline def setCert_file_pathUndefined: Self = StObject.set(x, "cert_file_path", js.undefined)
        
        inline def setPkcs11_lib(value: Pkcs11Lib): Self = StObject.set(x, "pkcs11_lib", value.asInstanceOf[js.Any])
        
        inline def setPrivate_key_object_label(value: String): Self = StObject.set(x, "private_key_object_label", value.asInstanceOf[js.Any])
        
        inline def setPrivate_key_object_labelUndefined: Self = StObject.set(x, "private_key_object_label", js.undefined)
        
        inline def setSlot_id(value: Double): Self = StObject.set(x, "slot_id", value.asInstanceOf[js.Any])
        
        inline def setSlot_idUndefined: Self = StObject.set(x, "slot_id", js.undefined)
        
        inline def setToken_label(value: String): Self = StObject.set(x, "token_label", value.asInstanceOf[js.Any])
        
        inline def setToken_labelUndefined: Self = StObject.set(x, "token_label", js.undefined)
        
        inline def setUser_pin(value: String): Self = StObject.set(x, "user_pin", value.asInstanceOf[js.Any])
        
        inline def setUser_pinNull: Self = StObject.set(x, "user_pin", null)
      }
    }
  }
  
  @JSImport("aws-crt/dist/native/io", "TlsVersion")
  @js.native
  object TlsVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonIoMod.TlsVersion & Double] = js.native
    
    /* 128 */ val Default: typings.awsCrt.distCommonIoMod.TlsVersion.Default & Double = js.native
    
    /* 0 */ val SSLv3: typings.awsCrt.distCommonIoMod.TlsVersion.SSLv3 & Double = js.native
    
    /* 1 */ val TLSv1: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1 & Double = js.native
    
    /* 2 */ val TLSv1_1: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_1 & Double = js.native
    
    /* 3 */ val TLSv1_2: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_2 & Double = js.native
    
    /* 4 */ val TLSv1_3: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_3 & Double = js.native
  }
  
  inline def enableLogging(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def errorCodeToName(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_name")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorCodeToString(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_string")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAlpnAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_alpn_available")().asInstanceOf[Boolean]
}
