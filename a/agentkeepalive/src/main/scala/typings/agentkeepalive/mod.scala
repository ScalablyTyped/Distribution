package typings.agentkeepalive

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpsMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agentkeepalive", JSImport.Namespace)
  @js.native
  open class ^ () extends HttpAgent
  
  @JSImport("agentkeepalive", "HttpsAgent")
  @js.native
  open class HttpsAgent () extends Agent {
    def this(opts: HttpsOptions) = this()
    
    def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
    
    def getCurrentStatus(): AgentStatus = js.native
    
    val statusChanged: Boolean = js.native
  }
  
  @JSImport("agentkeepalive", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  type AgentKeepAlive = HttpAgent
  
  trait AgentStatus extends StObject {
    
    var closeSocketCount: Double
    
    var createSocketCount: Double
    
    var createSocketErrorCount: Double
    
    var errorSocketCount: Double
    
    var freeSockets: PlainObject
    
    var requestCount: Double
    
    var requests: PlainObject
    
    var sockets: PlainObject
    
    var timeoutSocketCount: Double
  }
  object AgentStatus {
    
    inline def apply(
      closeSocketCount: Double,
      createSocketCount: Double,
      createSocketErrorCount: Double,
      errorSocketCount: Double,
      freeSockets: PlainObject,
      requestCount: Double,
      requests: PlainObject,
      sockets: PlainObject,
      timeoutSocketCount: Double
    ): AgentStatus = {
      val __obj = js.Dynamic.literal(closeSocketCount = closeSocketCount.asInstanceOf[js.Any], createSocketCount = createSocketCount.asInstanceOf[js.Any], createSocketErrorCount = createSocketErrorCount.asInstanceOf[js.Any], errorSocketCount = errorSocketCount.asInstanceOf[js.Any], freeSockets = freeSockets.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], timeoutSocketCount = timeoutSocketCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentStatus]
    }
    
    extension [Self <: AgentStatus](x: Self) {
      
      inline def setCloseSocketCount(value: Double): Self = StObject.set(x, "closeSocketCount", value.asInstanceOf[js.Any])
      
      inline def setCreateSocketCount(value: Double): Self = StObject.set(x, "createSocketCount", value.asInstanceOf[js.Any])
      
      inline def setCreateSocketErrorCount(value: Double): Self = StObject.set(x, "createSocketErrorCount", value.asInstanceOf[js.Any])
      
      inline def setErrorSocketCount(value: Double): Self = StObject.set(x, "errorSocketCount", value.asInstanceOf[js.Any])
      
      inline def setFreeSockets(value: PlainObject): Self = StObject.set(x, "freeSockets", value.asInstanceOf[js.Any])
      
      inline def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: PlainObject): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setSockets(value: PlainObject): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      inline def setTimeoutSocketCount(value: Double): Self = StObject.set(x, "timeoutSocketCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonHttpOption extends StObject {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
    
    var freeSocketTimeout: js.UndefOr[Double] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var socketActiveTTL: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CommonHttpOption {
    
    inline def apply(): CommonHttpOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonHttpOption]
    }
    
    extension [Self <: CommonHttpOption](x: Self) {
      
      inline def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      inline def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      inline def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Constants_ extends StObject {
    
    var CREATE_HTTPS_CONNECTION: js.Symbol
    
    var CREATE_ID: js.Symbol
    
    var CURRENT_ID: js.Symbol
    
    var INIT_SOCKET: js.Symbol
    
    var SOCKET_CREATED_TIME: js.Symbol
    
    var SOCKET_NAME: js.Symbol
    
    var SOCKET_REQUEST_COUNT: js.Symbol
    
    var SOCKET_REQUEST_FINISHED_COUNT: js.Symbol
  }
  object Constants_ {
    
    inline def apply(
      CREATE_HTTPS_CONNECTION: js.Symbol,
      CREATE_ID: js.Symbol,
      CURRENT_ID: js.Symbol,
      INIT_SOCKET: js.Symbol,
      SOCKET_CREATED_TIME: js.Symbol,
      SOCKET_NAME: js.Symbol,
      SOCKET_REQUEST_COUNT: js.Symbol,
      SOCKET_REQUEST_FINISHED_COUNT: js.Symbol
    ): Constants_ = {
      val __obj = js.Dynamic.literal(CREATE_HTTPS_CONNECTION = CREATE_HTTPS_CONNECTION.asInstanceOf[js.Any], CREATE_ID = CREATE_ID.asInstanceOf[js.Any], CURRENT_ID = CURRENT_ID.asInstanceOf[js.Any], INIT_SOCKET = INIT_SOCKET.asInstanceOf[js.Any], SOCKET_CREATED_TIME = SOCKET_CREATED_TIME.asInstanceOf[js.Any], SOCKET_NAME = SOCKET_NAME.asInstanceOf[js.Any], SOCKET_REQUEST_COUNT = SOCKET_REQUEST_COUNT.asInstanceOf[js.Any], SOCKET_REQUEST_FINISHED_COUNT = SOCKET_REQUEST_FINISHED_COUNT.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants_]
    }
    
    extension [Self <: Constants_](x: Self) {
      
      inline def setCREATE_HTTPS_CONNECTION(value: js.Symbol): Self = StObject.set(x, "CREATE_HTTPS_CONNECTION", value.asInstanceOf[js.Any])
      
      inline def setCREATE_ID(value: js.Symbol): Self = StObject.set(x, "CREATE_ID", value.asInstanceOf[js.Any])
      
      inline def setCURRENT_ID(value: js.Symbol): Self = StObject.set(x, "CURRENT_ID", value.asInstanceOf[js.Any])
      
      inline def setINIT_SOCKET(value: js.Symbol): Self = StObject.set(x, "INIT_SOCKET", value.asInstanceOf[js.Any])
      
      inline def setSOCKET_CREATED_TIME(value: js.Symbol): Self = StObject.set(x, "SOCKET_CREATED_TIME", value.asInstanceOf[js.Any])
      
      inline def setSOCKET_NAME(value: js.Symbol): Self = StObject.set(x, "SOCKET_NAME", value.asInstanceOf[js.Any])
      
      inline def setSOCKET_REQUEST_COUNT(value: js.Symbol): Self = StObject.set(x, "SOCKET_REQUEST_COUNT", value.asInstanceOf[js.Any])
      
      inline def setSOCKET_REQUEST_FINISHED_COUNT(value: js.Symbol): Self = StObject.set(x, "SOCKET_REQUEST_FINISHED_COUNT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpAgent
    extends typings.node.httpMod.Agent {
    
    def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
    
    def getCurrentStatus(): AgentStatus = js.native
    
    val statusChanged: Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ trait HttpOptions
    extends StObject
       with AgentOptions {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
    
    var freeSocketTimeout: js.UndefOr[Double] = js.undefined
    
    var socketActiveTTL: js.UndefOr[Double] = js.undefined
  }
  object HttpOptions {
    
    inline def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    extension [Self <: HttpOptions](x: Self) {
      
      inline def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      inline def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      inline def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      inline def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ trait HttpsOptions
    extends StObject
       with typings.node.httpsMod.AgentOptions {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
    
    var freeSocketTimeout: js.UndefOr[Double] = js.undefined
    
    var socketActiveTTL: js.UndefOr[Double] = js.undefined
  }
  object HttpsOptions {
    
    inline def apply(): HttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOptions]
    }
    
    extension [Self <: HttpsOptions](x: Self) {
      
      inline def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      inline def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      inline def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      inline def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
    }
  }
  
  type PlainObject = StringDictionary[Any]
}
