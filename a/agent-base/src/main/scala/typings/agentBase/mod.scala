package typings.agentBase

import typings.agentBase.agentBaseBooleans.`false`
import typings.agentBase.agentBaseBooleans.`true`
import typings.agentBase.anon.PartialTcpNetConnectOptsC
import typings.agentBase.distHelpersMod.ThenableRequest
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.ClientRequest
import typings.node.httpsMod.RequestOptions
import typings.node.netMod.TcpNetConnectOpts
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.tlsMod.ConnectionOptions
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("agent-base", "Agent")
  @js.native
  open class Agent ()
    extends typings.node.httpMod.Agent {
    def this(opts: AgentOptions) = this()
    
    var _currentSocket: js.UndefOr[Duplex] = js.native
    
    var _defaultPort: js.UndefOr[Double] = js.native
    
    var _protocol: js.UndefOr[String] = js.native
    
    def connect(req: ClientRequest, options: AgentConnectOpts): (js.Promise[Duplex | typings.node.httpMod.Agent]) | Duplex | typings.node.httpMod.Agent = js.native
    
    def createConnection(): Duplex = js.native
    
    def createSocket(
      req: ClientRequest,
      options: AgentConnectOpts,
      cb: js.Function2[/* err */ js.Error | Null, /* s */ js.UndefOr[Duplex], Unit]
    ): Unit = js.native
    
    def defaultPort: Double = js.native
    def defaultPort_=(v: Double): Unit = js.native
    
    var keepAlive: Boolean = js.native
    
    var options: PartialTcpNetConnectOptsC = js.native
    
    def protocol: String = js.native
    def protocol_=(v: String): Unit = js.native
  }
  
  inline def json(stream: Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def req(url: String): ThenableRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any]).asInstanceOf[ThenableRequest]
  inline def req(url: String, opts: RequestOptions): ThenableRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThenableRequest]
  inline def req(url: URL): ThenableRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any]).asInstanceOf[ThenableRequest]
  inline def req(url: URL, opts: RequestOptions): ThenableRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThenableRequest]
  
  inline def toBuffer(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.agentBase.mod.HttpConnectOpts
    - typings.agentBase.mod.HttpsConnectOpts
  */
  trait AgentConnectOpts extends StObject
  object AgentConnectOpts {
    
    inline def HttpConnectOpts(port: Double): typings.agentBase.mod.HttpConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = false)
      __obj.asInstanceOf[typings.agentBase.mod.HttpConnectOpts]
    }
    
    inline def HttpsConnectOpts(port: Double): typings.agentBase.mod.HttpsConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = true)
      __obj.asInstanceOf[typings.agentBase.mod.HttpsConnectOpts]
    }
  }
  
  trait HttpConnectOpts
    extends StObject
       with TcpNetConnectOpts
       with AgentConnectOpts {
    
    var secureEndpoint: `false`
  }
  object HttpConnectOpts {
    
    inline def apply(port: Double): HttpConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = false)
      __obj.asInstanceOf[HttpConnectOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpConnectOpts] (val x: Self) extends AnyVal {
      
      inline def setSecureEndpoint(value: `false`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpsConnectOpts
    extends StObject
       with ConnectionOptions
       with AgentConnectOpts {
    
    @JSName("port")
    var port_HttpsConnectOpts: Double
    
    var secureEndpoint: `true`
  }
  object HttpsConnectOpts {
    
    inline def apply(port: Double): HttpsConnectOpts = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = true)
      __obj.asInstanceOf[HttpsConnectOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpsConnectOpts] (val x: Self) extends AnyVal {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSecureEndpoint(value: `true`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
