package typings.amqpConnectionManager.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.tls.ConnectionOptions & {  noDelay :boolean | undefined,   timeout :number | undefined,   keepAlive :boolean | undefined,   keepAliveDelay :number | undefined,   clientProperties :any | undefined,   credentials :{  mechanism :string,   username :string,   password :string, response (): node.Buffer} | undefined} */
@js.native
trait ConnectionOptionsnoDelayb extends js.Object {
  
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
  implicit class ConnectionOptionsnoDelaybOps[Self <: ConnectionOptionsnoDelayb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setALPNProtocolsVarargs(value: (String | Uint8Array)*): Self = this.set("ALPNProtocols", js.Array(value :_*))
    
    @scala.inline
    def setALPNProtocols(value: (js.Array[String | Uint8Array]) | Uint8Array): Self = this.set("ALPNProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteALPNProtocols: Self = this.set("ALPNProtocols", js.undefined)
    
    @scala.inline
    def setSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = this.set("SNICallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSNICallback: Self = this.set("SNICallback", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setClientCertEngine(value: String): Self = this.set("clientCertEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertEngine: Self = this.set("clientCertEngine", js.undefined)
    
    @scala.inline
    def setClientProperties(value: js.Any): Self = this.set("clientProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientProperties: Self = this.set("clientProperties", js.undefined)
    
    @scala.inline
    def setCredentials(value: Mechanism): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = this.set("crl", js.Array(value :_*))
    
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    
    @scala.inline
    def setDhparam(value: String | Buffer): Self = this.set("dhparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhparam: Self = this.set("dhparam", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    
    @scala.inline
    def setEnableTrace(value: Boolean): Self = this.set("enableTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrace: Self = this.set("enableTrace", js.undefined)
    
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = this.set("honorCipherOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorCipherOrder: Self = this.set("honorCipherOrder", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveDelay(value: Double): Self = this.set("keepAliveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveDelay: Self = this.set("keepAliveDelay", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject)*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    
    @scala.inline
    def setMinDHSize(value: Double): Self = this.set("minDHSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDHSize: Self = this.set("minDHSize", js.undefined)
    
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = this.set("pfx", js.Array(value :_*))
    
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPrivateKeyEngine(value: String): Self = this.set("privateKeyEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyEngine: Self = this.set("privateKeyEngine", js.undefined)
    
    @scala.inline
    def setPrivateKeyIdentifier(value: String): Self = this.set("privateKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyIdentifier: Self = this.set("privateKeyIdentifier", js.undefined)
    
    @scala.inline
    def setPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = this.set("pskCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePskCallback: Self = this.set("pskCallback", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestCert(value: Boolean): Self = this.set("requestCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCert: Self = this.set("requestCert", js.undefined)
    
    @scala.inline
    def setSecureContext(value: SecureContext): Self = this.set("secureContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureContext: Self = this.set("secureContext", js.undefined)
    
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSession(value: Buffer): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSessionIdContext(value: String): Self = this.set("sessionIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIdContext: Self = this.set("sessionIdContext", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    
    @scala.inline
    def setSigalgs(value: String): Self = this.set("sigalgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigalgs: Self = this.set("sigalgs", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setTicketKeys(value: Buffer): Self = this.set("ticketKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketKeys: Self = this.set("ticketKeys", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
