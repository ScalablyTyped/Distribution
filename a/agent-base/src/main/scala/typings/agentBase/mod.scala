package typings.agentBase

import org.scalablytyped.runtime.StringDictionary
import typings.agentBase.agentBaseBooleans.`false`
import typings.agentBase.agentBaseBooleans.`true`
import typings.agentBase.anon.PickAgentaddRequest
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Agent = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Agent]
  inline def apply(callback: AgentCallback): Agent = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Agent]
  inline def apply(callback: AgentCallback, opts: AgentOptions): Agent = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Agent]
  inline def apply(opts: AgentOptions): Agent = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Base `http.Agent` implementation.
    * No pooling/keep-alive is implemented by default.
    *
    * @param {Function} callback
    * @api public
    */
  @JSImport("agent-base", "Agent")
  @js.native
  class Agent () extends EventEmitter {
    def this(callback: AgentCallback) = this()
    def this(callback: AgentOptions) = this()
    def this(callback: Unit, _opts: AgentOptions) = this()
    def this(callback: AgentCallback, _opts: AgentOptions) = this()
    def this(callback: AgentOptions, _opts: AgentOptions) = this()
    
    /**
      * Called by node-core's "_http_client.js" module when creating
      * a new HTTP request with this Agent instance.
      *
      * @api public
      */
    def addRequest(req: ClientRequest, _opts: RequestOptions): Unit = js.native
    
    def callback(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
    def callback(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
    
    def defaultPort: Double = js.native
    def defaultPort_=(v: Double): Unit = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var explicitDefaultPort: js.Any = js.native
    
    /* private */ var explicitProtocol: js.Any = js.native
    
    def freeSocket(socket: Socket, opts: AgentOptions): Unit = js.native
    
    var freeSockets: StringDictionary[js.Array[Socket]] = js.native
    
    var maxFreeSockets: Double = js.native
    
    var maxSockets: Double = js.native
    
    var maxTotalSockets: Double = js.native
    
    var options: typings.node.httpsMod.AgentOptions = js.native
    
    /* private */ var promisifiedCallback: js.Any = js.native
    
    def protocol: String = js.native
    def protocol_=(v: String): Unit = js.native
    
    var requests: StringDictionary[js.Array[IncomingMessage]] = js.native
    
    var sockets: StringDictionary[js.Array[Socket]] = js.native
    
    var timeout: Double | Null = js.native
  }
  
  @js.native
  trait AgentCallback extends StObject {
    
    def apply(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
    def apply(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
  }
  
  type AgentCallbackCallback = js.Function2[
    /* err */ js.UndefOr[Error | Null], 
    /* socket */ js.UndefOr[AgentCallbackReturn], 
    Unit
  ]
  
  type AgentCallbackPromise = js.Function2[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    AgentCallbackReturn | js.Promise[AgentCallbackReturn]
  ]
  
  type AgentCallbackReturn = Duplex | AgentLike
  
  type AgentLike = PickAgentaddRequest | typings.node.httpMod.Agent
  
  trait AgentOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AgentOptions {
    
    inline def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    extension [Self <: AgentOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait AgentRequestOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object AgentRequestOptions {
    
    inline def apply(port: Double): AgentRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentRequestOptions]
    }
    
    extension [Self <: AgentRequestOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientRequest
    extends typings.node.httpMod.ClientRequest {
    
    var _hadError: js.UndefOr[Boolean] = js.native
    
    var _last: js.UndefOr[Boolean] = js.native
  }
  
  /* Inlined parent agent-base.agent-base.AgentRequestOptions */
  /* Inlined parent std.Omit<node.http.RequestOptions, keyof agent-base.agent-base.AgentRequestOptions> */
  trait HttpRequestOptions
    extends StObject
       with RequestOptions {
    
    var _defaultAgent: js.UndefOr[typings.node.httpMod.Agent] = js.undefined
    
    var agent: js.UndefOr[typings.node.httpMod.Agent | Boolean] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var secureEndpoint: `false`
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HttpRequestOptions {
    
    inline def apply(port: Double): HttpRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = false)
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    extension [Self <: HttpRequestOptions](x: Self) {
      
      inline def setAgent(value: typings.node.httpMod.Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCreateConnection(
        value: (HttpRequestOptions, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSecureEndpoint(value: `false`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def set_defaultAgent(value: typings.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined parent agent-base.agent-base.AgentRequestOptions */
  /* Inlined parent std.Omit<node.https.RequestOptions, keyof agent-base.agent-base.AgentRequestOptions> */
  trait HttpsRequestOptions
    extends StObject
       with RequestOptions {
    
    var _defaultAgent: js.UndefOr[typings.node.httpMod.Agent] = js.undefined
    
    var agent: js.UndefOr[typings.node.httpMod.Agent | Boolean] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
    
    var maxVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var minVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
    var port: Double
    
    var privateKeyEngine: js.UndefOr[String] = js.undefined
    
    var privateKeyIdentifier: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var secureEndpoint: `true`
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HttpsRequestOptions {
    
    inline def apply(port: Double): HttpsRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = true)
      __obj.asInstanceOf[HttpsRequestOptions]
    }
    
    extension [Self <: HttpsRequestOptions](x: Self) {
      
      inline def setAgent(value: typings.node.httpMod.Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCreateConnection(
        value: (HttpsRequestOptions, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecureEndpoint(value: `true`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def set_defaultAgent(value: typings.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.agentBase.mod.HttpRequestOptions
    - typings.agentBase.mod.HttpsRequestOptions
  */
  trait RequestOptions extends StObject
  object RequestOptions {
    
    inline def HttpRequestOptions(port: Double): typings.agentBase.mod.HttpRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = false)
      __obj.asInstanceOf[typings.agentBase.mod.HttpRequestOptions]
    }
    
    inline def HttpsRequestOptions(port: Double): typings.agentBase.mod.HttpsRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = true)
      __obj.asInstanceOf[typings.agentBase.mod.HttpsRequestOptions]
    }
  }
}
