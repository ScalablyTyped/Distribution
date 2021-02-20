package typings.agentkeepalive

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpsMod.Agent
import typings.std.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agentkeepalive", JSImport.Namespace)
  @js.native
  class ^ () extends HttpAgent
  
  @JSImport("agentkeepalive", "HttpsAgent")
  @js.native
  class HttpsAgent () extends Agent {
    def this(opts: HttpOptions) = this()
    
    def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
    
    def getCurrentStatus(): AgentStatus = js.native
    
    val statusChanged: Boolean = js.native
  }
  
  @JSImport("agentkeepalive", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  type AgentKeepAlive = HttpAgent
  
  @js.native
  trait AgentStatus extends StObject {
    
    var closeSocketCount: Double = js.native
    
    var createSocketCount: Double = js.native
    
    var createSocketErrorCount: Double = js.native
    
    var errorSocketCount: Double = js.native
    
    var freeSockets: PlainObject = js.native
    
    var requestCount: Double = js.native
    
    var requests: PlainObject = js.native
    
    var sockets: PlainObject = js.native
    
    var timeoutSocketCount: Double = js.native
  }
  object AgentStatus {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AgentStatusMutableBuilder[Self <: AgentStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseSocketCount(value: Double): Self = StObject.set(x, "closeSocketCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSocketCount(value: Double): Self = StObject.set(x, "createSocketCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSocketErrorCount(value: Double): Self = StObject.set(x, "createSocketErrorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorSocketCount(value: Double): Self = StObject.set(x, "errorSocketCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSockets(value: PlainObject): Self = StObject.set(x, "freeSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequests(value: PlainObject): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockets(value: PlainObject): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutSocketCount(value: Double): Self = StObject.set(x, "timeoutSocketCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommonHttpOption extends StObject {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
    
    var freeSocketTimeout: js.UndefOr[Double] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var socketActiveTTL: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object CommonHttpOption {
    
    @scala.inline
    def apply(): CommonHttpOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonHttpOption]
    }
    
    @scala.inline
    implicit class CommonHttpOptionMutableBuilder[Self <: CommonHttpOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      @scala.inline
      def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Constants_ extends StObject {
    
    var CREATE_HTTPS_CONNECTION: Symbol = js.native
    
    var CREATE_ID: Symbol = js.native
    
    var CURRENT_ID: Symbol = js.native
    
    var INIT_SOCKET: Symbol = js.native
    
    var SOCKET_CREATED_TIME: Symbol = js.native
    
    var SOCKET_NAME: Symbol = js.native
    
    var SOCKET_REQUEST_COUNT: Symbol = js.native
    
    var SOCKET_REQUEST_FINISHED_COUNT: Symbol = js.native
  }
  object Constants_ {
    
    @scala.inline
    def apply(
      CREATE_HTTPS_CONNECTION: Symbol,
      CREATE_ID: Symbol,
      CURRENT_ID: Symbol,
      INIT_SOCKET: Symbol,
      SOCKET_CREATED_TIME: Symbol,
      SOCKET_NAME: Symbol,
      SOCKET_REQUEST_COUNT: Symbol,
      SOCKET_REQUEST_FINISHED_COUNT: Symbol
    ): Constants_ = {
      val __obj = js.Dynamic.literal(CREATE_HTTPS_CONNECTION = CREATE_HTTPS_CONNECTION.asInstanceOf[js.Any], CREATE_ID = CREATE_ID.asInstanceOf[js.Any], CURRENT_ID = CURRENT_ID.asInstanceOf[js.Any], INIT_SOCKET = INIT_SOCKET.asInstanceOf[js.Any], SOCKET_CREATED_TIME = SOCKET_CREATED_TIME.asInstanceOf[js.Any], SOCKET_NAME = SOCKET_NAME.asInstanceOf[js.Any], SOCKET_REQUEST_COUNT = SOCKET_REQUEST_COUNT.asInstanceOf[js.Any], SOCKET_REQUEST_FINISHED_COUNT = SOCKET_REQUEST_FINISHED_COUNT.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants_]
    }
    
    @scala.inline
    implicit class Constants_MutableBuilder[Self <: Constants_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCREATE_HTTPS_CONNECTION(value: Symbol): Self = StObject.set(x, "CREATE_HTTPS_CONNECTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCREATE_ID(value: Symbol): Self = StObject.set(x, "CREATE_ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCURRENT_ID(value: Symbol): Self = StObject.set(x, "CURRENT_ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINIT_SOCKET(value: Symbol): Self = StObject.set(x, "INIT_SOCKET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOCKET_CREATED_TIME(value: Symbol): Self = StObject.set(x, "SOCKET_CREATED_TIME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOCKET_NAME(value: Symbol): Self = StObject.set(x, "SOCKET_NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOCKET_REQUEST_COUNT(value: Symbol): Self = StObject.set(x, "SOCKET_REQUEST_COUNT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOCKET_REQUEST_FINISHED_COUNT(value: Symbol): Self = StObject.set(x, "SOCKET_REQUEST_FINISHED_COUNT", value.asInstanceOf[js.Any])
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
  - typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ @js.native
  trait HttpOptions extends AgentOptions {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
    
    var freeSocketTimeout: js.UndefOr[Double] = js.native
    
    var socketActiveTTL: js.UndefOr[Double] = js.native
  }
  object HttpOptions {
    
    @scala.inline
    def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit class HttpOptionsMutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      @scala.inline
      def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      @scala.inline
      def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ @js.native
  trait HttpsOptions
    extends typings.node.httpsMod.AgentOptions {
    
    var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
    
    var freeSocketTimeout: js.UndefOr[Double] = js.native
    
    var socketActiveTTL: js.UndefOr[Double] = js.native
  }
  object HttpsOptions {
    
    @scala.inline
    def apply(): HttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOptions]
    }
    
    @scala.inline
    implicit class HttpsOptionsMutableBuilder[Self <: HttpsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
      
      @scala.inline
      def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
      
      @scala.inline
      def setSocketActiveTTL(value: Double): Self = StObject.set(x, "socketActiveTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketActiveTTLUndefined: Self = StObject.set(x, "socketActiveTTL", js.undefined)
    }
  }
  
  type PlainObject = StringDictionary[js.Any]
}
