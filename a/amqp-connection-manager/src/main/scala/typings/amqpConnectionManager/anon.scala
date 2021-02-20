package typings.amqpConnectionManager

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PSKCallbackNegotation
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Connection extends StObject {
    
    var connection: typings.amqplib.mod.Connection = js.native
    
    var url: String = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connection: typings.amqplib.mod.Connection, url: String): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: typings.amqplib.mod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node.tls.ConnectionOptions & {  noDelay :boolean | undefined,   timeout :number | undefined,   keepAlive :boolean | undefined,   keepAliveDelay :number | undefined,   clientProperties :any | undefined,   credentials :{  mechanism :string,   username :string,   password :string, response (): node.Buffer} | undefined} */
  @js.native
  trait ConnectionOptionsnoDelayb extends StObject {
    
    /**
      * An array of strings or a Buffer naming possible ALPN protocols.
      * (Protocols should be ordered by their priority.)
      */
    var ALPNProtocols: js.UndefOr[(js.Array[String | Uint8Array]) | Uint8Array] = js.native
    
    /**
      * SNICallback(servername, cb) <Function> A function that will be
      * called if the client supports SNI TLS extension. Two arguments
      * will be passed when called: servername and cb. SNICallback should
      * invoke cb(null, ctx), where ctx is a SecureContext instance.
      * (tls.createSecureContext(...) can be used to get a proper
      * SecureContext.) If SNICallback wasn't provided the default callback
      * with high-level API will be used (see below).
      */
    var SNICallback: js.UndefOr[
        js.Function2[
          /* servername */ String, 
          /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Optionally override the trusted CA certificates. Default is to trust
      * the well-known CAs curated by Mozilla. Mozilla's CAs are completely
      * replaced when CAs are explicitly specified using this option.
      */
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    /**
      *  Cert chains in PEM format. One cert chain should be provided per
      *  private key. Each cert chain should consist of the PEM formatted
      *  certificate for a provided private key, followed by the PEM
      *  formatted intermediate certificates (if any), in order, and not
      *  including the root CA (the root CA must be pre-known to the peer,
      *  see ca). When providing multiple cert chains, they do not have to
      *  be in the same order as their private keys in key. If the
      *  intermediate certificates are not provided, the peer will not be
      *  able to validate the certificate, and the handshake will fail.
      */
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    // Establish secure connection on a given socket rather than creating a new socket
    var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.native
    
    /**
      * Cipher suite specification, replacing the default. For more
      * information, see modifying the default cipher suite. Permitted
      * ciphers can be obtained via tls.getCiphers(). Cipher names must be
      * uppercased in order for OpenSSL to accept them.
      */
    var ciphers: js.UndefOr[String] = js.native
    
    /**
      * Name of an OpenSSL engine which can provide the client certificate.
      */
    var clientCertEngine: js.UndefOr[String] = js.native
    
    var clientProperties: js.UndefOr[js.Any] = js.native
    
    var credentials: js.UndefOr[Mechanism] = js.native
    
    /**
      * PEM formatted CRLs (Certificate Revocation Lists).
      */
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    /**
      * Diffie Hellman parameters, required for Perfect Forward Secrecy. Use
      * openssl dhparam to create the parameters. The key length must be
      * greater than or equal to 1024 bits or else an error will be thrown.
      * Although 1024 bits is permissible, use 2048 bits or larger for
      * stronger security. If omitted or invalid, the parameters are
      * silently discarded and DHE ciphers will not be available.
      */
    var dhparam: js.UndefOr[String | Buffer] = js.native
    
    /**
      * A string describing a named curve or a colon separated list of curve
      * NIDs or names, for example P-521:P-384:P-256, to use for ECDH key
      * agreement. Set to auto to select the curve automatically. Use
      * crypto.getCurves() to obtain a list of available curve names. On
      * recent releases, openssl ecparam -list_curves will also display the
      * name and description of each available elliptic curve. Default:
      * tls.DEFAULT_ECDH_CURVE.
      */
    var ecdhCurve: js.UndefOr[String] = js.native
    
    /**
      * When enabled, TLS packet trace information is written to `stderr`. This can be
      * used to debug TLS connection problems.
      * @default false
      */
    var enableTrace: js.UndefOr[Boolean] = js.native
    
    /**
      * Attempt to use the server's cipher suite preferences instead of the
      * client's. When true, causes SSL_OP_CIPHER_SERVER_PREFERENCE to be
      * set in secureOptions
      */
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var keepAliveDelay: js.UndefOr[Double] = js.native
    
    /**
      * Private keys in PEM format. PEM allows the option of private keys
      * being encrypted. Encrypted keys will be decrypted with
      * options.passphrase. Multiple keys using different algorithms can be
      * provided either as an array of unencrypted key strings or buffers,
      * or an array of objects in the form {pem: <string|buffer>[,
      * passphrase: <string>]}. The object form can only occur in an array.
      * object.passphrase is optional. Encrypted keys will be decrypted with
      * object.passphrase if provided, or options.passphrase if it is not.
      */
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
    
    var lookup: js.UndefOr[LookupFunction] = js.native
    
    /**
      * Optionally set the maximum TLS version to allow. One
      * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
      * `secureProtocol` option, use one or the other.
      * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
      * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
      * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
      */
    var maxVersion: js.UndefOr[SecureVersion] = js.native
    
    var minDHSize: js.UndefOr[Double] = js.native
    
    /**
      * Optionally set the minimum TLS version to allow. One
      * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
      * `secureProtocol` option, use one or the other.  It is not recommended to use
      * less than TLSv1.2, but it may be required for interoperability.
      * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
      * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
      * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
      * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
      */
    var minVersion: js.UndefOr[SecureVersion] = js.native
    
    var noDelay: js.UndefOr[Boolean] = js.native
    
    /**
      * Shared passphrase used for a single private key and/or a PFX.
      */
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    /**
      * PFX or PKCS12 encoded private key and certificate chain. pfx is an
      * alternative to providing key and cert individually. PFX is usually
      * encrypted, if it is, passphrase will be used to decrypt it. Multiple
      * PFX can be provided either as an array of unencrypted PFX buffers,
      * or an array of objects in the form {buf: <string|buffer>[,
      * passphrase: <string>]}. The object form can only occur in an array.
      * object.passphrase is optional. Encrypted PFX will be decrypted with
      * object.passphrase if provided, or options.passphrase if it is not.
      */
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    /**
      * Name of an OpenSSL engine to get private key from. Should be used
      * together with privateKeyIdentifier.
      */
    var privateKeyEngine: js.UndefOr[String] = js.native
    
    /**
      * Identifier of a private key managed by an OpenSSL engine. Should be
      * used together with privateKeyEngine. Should not be set together with
      * key, because both options define a private key in different ways.
      */
    var privateKeyIdentifier: js.UndefOr[String] = js.native
    
    /**
      * When negotiating TLS-PSK (pre-shared keys), this function is called
      * with optional identity `hint` provided by the server or `null`
      * in case of TLS 1.3 where `hint` was removed.
      * It will be necessary to provide a custom `tls.checkServerIdentity()`
      * for the connection as the default one will try to check hostname/IP
      * of the server against the certificate but that's not applicable for PSK
      * because there won't be a certificate present.
      * More information can be found in the RFC 4279.
      *
      * @param hint message sent from the server to help client
      * decide which identity to use during negotiation.
      * Always `null` if TLS 1.3 is used.
      * @returns Return `null` to stop the negotiation process. `psk` must be
      * compatible with the selected cipher's digest.
      * `identity` must use UTF-8 encoding.
      */
    var pskCallback: js.UndefOr[js.Function1[/* hint */ String | Null, PSKCallbackNegotation | Null]] = js.native
    
    /**
      * If true the server will reject any connection which is not
      * authorized with the list of supplied CAs. This option only has an
      * effect if requestCert is true.
      * @default true
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /**
      * If true the server will request a certificate from clients that
      * connect and attempt to verify that certificate. Defaults to
      * false.
      */
    var requestCert: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional TLS context object from tls.createSecureContext()
      */
    var secureContext: js.UndefOr[SecureContext] = js.native
    
    /**
      * Optionally affect the OpenSSL protocol behavior, which is not
      * usually necessary. This should be used carefully if at all! Value is
      * a numeric bitmask of the SSL_OP_* options from OpenSSL Options
      */
    var secureOptions: js.UndefOr[Double] = js.native
    
    // Value is a numeric bitmask of the `SSL_OP_*` options
    /**
      * Legacy mechanism to select the TLS protocol version to use, it does
      * not support independent control of the minimum and maximum version,
      * and does not support limiting the protocol to TLSv1.3. Use
      * minVersion and maxVersion instead. The possible values are listed as
      * SSL_METHODS, use the function names as strings. For example, use
      * 'TLSv1_1_method' to force TLS version 1.1, or 'TLS_method' to allow
      * any TLS protocol version up to TLSv1.3. It is not recommended to use
      * TLS versions less than 1.2, but it may be required for
      * interoperability. Default: none, see minVersion.
      */
    var secureProtocol: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String] = js.native
    
    // SNI TLS Extension
    var session: js.UndefOr[Buffer] = js.native
    
    /**
      * Opaque identifier used by servers to ensure session state is not
      * shared between applications. Unused by clients.
      */
    var sessionIdContext: js.UndefOr[String] = js.native
    
    /**
      * The number of seconds after which a TLS session created by the
      * server will no longer be resumable. See Session Resumption for more
      * information. Default: 300.
      */
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    /**
      *  Colon-separated list of supported signature algorithms. The list
      *  can contain digest algorithms (SHA256, MD5 etc.), public key
      *  algorithms (RSA-PSS, ECDSA etc.), combination of both (e.g
      *  'RSA+SHA384') or TLS v1.3 scheme names (e.g. rsa_pss_pss_sha512).
      */
    var sigalgs: js.UndefOr[String] = js.native
    
    // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
    var socket: js.UndefOr[Socket] = js.native
    
    /**
      * 48-bytes of cryptographically strong pseudo-random data.
      * See Session Resumption for more information.
      */
    var ticketKeys: js.UndefOr[Buffer] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ConnectionOptionsnoDelayb {
    
    @scala.inline
    def apply(): ConnectionOptionsnoDelayb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptionsnoDelayb]
    }
    
    @scala.inline
    implicit class ConnectionOptionsnoDelaybMutableBuilder[Self <: ConnectionOptionsnoDelayb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setALPNProtocols(value: (js.Array[String | Uint8Array]) | Uint8Array): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
      
      @scala.inline
      def setALPNProtocolsVarargs(value: (String | Uint8Array)*): Self = StObject.set(x, "ALPNProtocols", js.Array(value :_*))
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setClientProperties(value: js.Any): Self = StObject.set(x, "clientProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientPropertiesUndefined: Self = StObject.set(x, "clientProperties", js.undefined)
      
      @scala.inline
      def setCredentials(value: Mechanism): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setEnableTrace(value: Boolean): Self = StObject.set(x, "enableTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTraceUndefined: Self = StObject.set(x, "enableTrace", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveDelay(value: Double): Self = StObject.set(x, "keepAliveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveDelayUndefined: Self = StObject.set(x, "keepAliveDelay", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMinDHSize(value: Double): Self = StObject.set(x, "minDHSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDHSizeUndefined: Self = StObject.set(x, "minDHSize", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = StObject.set(x, "pskCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
      
      @scala.inline
      def setSNICallback(
        value: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit
      ): Self = StObject.set(x, "SNICallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
      
      @scala.inline
      def setSecureContext(value: SecureContext): Self = StObject.set(x, "secureContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureContextUndefined: Self = StObject.set(x, "secureContext", js.undefined)
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Err extends StObject {
    
    var err: Error = js.native
  }
  object Err {
    
    @scala.inline
    def apply(err: Error): Err = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err]
    }
    
    @scala.inline
    implicit class ErrMutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mechanism extends StObject {
    
    var mechanism: String = js.native
    
    var password: String = js.native
    
    def response(): Buffer = js.native
    
    var username: String = js.native
  }
  object Mechanism {
    
    @scala.inline
    def apply(mechanism: String, password: String, response: () => Buffer, username: String): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = js.Any.fromFunction0(response), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: () => Buffer): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
