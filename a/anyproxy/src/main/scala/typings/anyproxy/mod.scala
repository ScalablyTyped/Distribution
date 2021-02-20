package typings.anyproxy

import typings.anyproxy.anon.PartialResponse
import typings.anyproxy.anyproxyStrings.error
import typings.anyproxy.anyproxyStrings.http
import typings.anyproxy.anyproxyStrings.https
import typings.anyproxy.anyproxyStrings.ready
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anyproxy", "ProxyCore")
  @js.native
  /**
    * Creates an instance of ProxyCore.
    * @param config - configs
    */
  class ProxyCore () extends EventEmitter {
    def this(config: ProxyOptions) = this()
    
    /** Close the proxy server */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Manage all created socket
      * for each new socket, we put them to a map;
      * if the socket is closed itself, we remove it from the map
      * when the `close` method is called, we'll close the sockes before the server closed
      *
      * @param socket the http socket that is creating
      */
    def handleExistConnections(socket: Socket): Unit = js.native
    
    /** Start the proxy server */
    def start(): this.type = js.native
  }
  
  @JSImport("anyproxy", "ProxyRecorder")
  @js.native
  // TypeScript Version: 2.2
  class ProxyRecorder () extends EventEmitter {
    def this(config: js.Object) = this()
    
    def appendRecord(info: RecorderInfo): Double = js.native
    
    def clear(): Unit = js.native
    
    def emitUpdate(id: Double): Unit = js.native
    def emitUpdate(id: Double, info: RecorderInfo): Unit = js.native
    
    def emitUpdateLatestWsMessage(id: Double, message: js.Any): Unit = js.native
    
    def getBody(id: Double): Unit = js.native
    def getBody(id: Double, cb: js.Function2[/* err */ Error, /* body */ Buffer, Unit]): Unit = js.native
    
    def getCacheFile(fileName: String, cb: js.Function2[/* err */ Error, /* filePath */ String, Unit]): Unit = js.native
    
    def getDecodedBody(id: Double): Unit = js.native
    def getDecodedBody(id: Double, cb: js.Function2[/* err */ Error, /* content */ js.Any, Unit]): Unit = js.native
    
    def getDecodedWsMessage(id: Double): Unit = js.native
    def getDecodedWsMessage(id: Double, cb: js.Function2[/* err */ Error, /* content */ js.Any, Unit]): Unit = js.native
    
    def getRecords(
      idStart: Double,
      limit: Double,
      cb: js.Function2[/* err */ Error, /* records */ js.Array[RecorderInfo], Unit]
    ): Unit = js.native
    
    def getSingleRecord(id: Double, cb: js.Function2[/* err */ Error, /* record */ RecorderInfo, Unit]): Unit = js.native
    
    def getSummaryList(cb: js.Function2[/* err */ Error, /* records */ js.Array[RecorderInfo], Unit]): Unit = js.native
    
    // TypeScript Version: 2.2
    def updateExtInfo(id: Double, extInfo: js.Object): Unit = js.native
    
    def updateRecord(id: Double, info: RecorderInfo): Unit = js.native
    
    def updateRecordBody(id: Double, info: RecorderInfo): Unit = js.native
    
    def updateRecordWsMessage(id: Double, message: js.Any): Unit = js.native
  }
  
  @JSImport("anyproxy", "ProxyServer")
  @js.native
  class ProxyServer () extends ProxyCore {
    def this(config: ProxyOptions) = this()
    
    /** Emit when error happened inside proxy server */
    @JSName("on")
    def on_error(eventName: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    /** Emit when proxy server is ready */
    @JSName("on")
    def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
  }
  
  @JSImport("anyproxy", "ProxyWebServer")
  @js.native
  class ProxyWebServer protected () extends EventEmitter {
    /**
      * Creates an instance of webInterface.
      *
      * @param config
      * @param config.webPort
      * @param recorder
      */
    def this(config: WebInterfaceOptions, recorder: ProxyRecorder) = this()
    
    def close(): Unit = js.native
    
    /**
      * get the express server
      */
    def getServer(): js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  object utils {
    
    /** Manage certificates of AnyProxy. */
    object certMgr {
      
      /** Generate a rootCA */
      @JSImport("anyproxy", "utils.certMgr.generateRootCA")
      @js.native
      def generateRootCA(callback: js.Function2[/* err */ Error, /* keyPath */ String, Unit]): Unit = js.native
      
      /** Detect if AnyProx rootCA exists */
      @JSImport("anyproxy", "utils.certMgr.ifRootCAFileExists")
      @js.native
      def ifRootCAFileExists(): Boolean = js.native
    }
    
    /** Manage the system proxy config. sudo password may be required. */
    object systemProxyMgr {
      
      /** Disable global system proxy. sudo password may be required. */
      @JSImport("anyproxy", "utils.systemProxyMgr.disableGlobalProxy")
      @js.native
      def disableGlobalProxy(): Unit = js.native
      @JSImport("anyproxy", "utils.systemProxyMgr.disableGlobalProxy")
      @js.native
      def disableGlobalProxy(networkType: NetworkType): Unit = js.native
      
      /** Enable global system proxy with specified params. sudo password may be required. */
      @JSImport("anyproxy", "utils.systemProxyMgr.enableGlobalProxy")
      @js.native
      def enableGlobalProxy(host: String, port: String): Unit = js.native
      @JSImport("anyproxy", "utils.systemProxyMgr.enableGlobalProxy")
      @js.native
      def enableGlobalProxy(host: String, port: String, networkType: NetworkType): Unit = js.native
      @JSImport("anyproxy", "utils.systemProxyMgr.enableGlobalProxy")
      @js.native
      def enableGlobalProxy(host: String, port: Double): Unit = js.native
      @JSImport("anyproxy", "utils.systemProxyMgr.enableGlobalProxy")
      @js.native
      def enableGlobalProxy(host: String, port: Double, networkType: NetworkType): Unit = js.native
    }
  }
  
  @js.native
  trait BeforeDealHttpsRequestDetail extends StObject {
    
    var _req: IncomingMessage = js.native
    
    var host: String = js.native
  }
  object BeforeDealHttpsRequestDetail {
    
    @scala.inline
    def apply(_req: IncomingMessage, host: String): BeforeDealHttpsRequestDetail = {
      val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeDealHttpsRequestDetail]
    }
    
    @scala.inline
    implicit class BeforeDealHttpsRequestDetailMutableBuilder[Self <: BeforeDealHttpsRequestDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<anyproxy.anyproxy.RequestDetail> */
  @js.native
  trait BeforeSendRequestResult extends StObject {
    
    var _req: js.UndefOr[IncomingMessage] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var requestData: js.UndefOr[js.Any] = js.native
    
    var requestOptions: js.UndefOr[RequestOptions] = js.native
    
    var response: js.UndefOr[PartialResponse] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object BeforeSendRequestResult {
    
    @scala.inline
    def apply(): BeforeSendRequestResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSendRequestResult]
    }
    
    @scala.inline
    implicit class BeforeSendRequestResultMutableBuilder[Self <: BeforeSendRequestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequestData(value: js.Any): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDataUndefined: Self = StObject.set(x, "requestData", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setResponse(value: PartialResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_reqUndefined: Self = StObject.set(x, "_req", js.undefined)
    }
  }
  
  @js.native
  trait BeforeSendResponseResult extends StObject {
    
    var response: PartialResponse = js.native
  }
  object BeforeSendResponseResult {
    
    @scala.inline
    def apply(response: PartialResponse): BeforeSendResponseResult = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeSendResponseResult]
    }
    
    @scala.inline
    implicit class BeforeSendResponseResultMutableBuilder[Self <: BeforeSendResponseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: PartialResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type MaybePromise[T] = T | js.Promise[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.anyproxy.anyproxyStrings.http
    - typings.anyproxy.anyproxyStrings.https
  */
  trait NetworkType extends StObject
  object NetworkType {
    
    @scala.inline
    def http: typings.anyproxy.anyproxyStrings.http = "http".asInstanceOf[typings.anyproxy.anyproxyStrings.http]
    
    @scala.inline
    def https: typings.anyproxy.anyproxyStrings.https = "https".asInstanceOf[typings.anyproxy.anyproxyStrings.https]
  }
  
  @js.native
  trait ProxyOptions extends StObject {
    
    /** If ignore certificate error in request, default to false */
    var dangerouslyIgnoreUnauthorized: js.UndefOr[Boolean] = js.native
    
    /** Force intercept all https request, default to false */
    var forceProxyHttps: js.UndefOr[Boolean] = js.native
    
    /** Host name of the proxy server, required when this is an https proxy */
    var hostname: js.UndefOr[String] = js.native
    
    /** Port number of proxy server */
    var port: String | Double = js.native
    
    /** Recorder to use */
    var recorder: js.UndefOr[ProxyRecorder] = js.native
    
    /** Your rule module */
    var rule: js.UndefOr[String | RuleModule] = js.native
    
    /** If keep silent in console, false for default false */
    var silent: js.UndefOr[Boolean] = js.native
    
    /** Throttle in kb/s, unlimited for default */
    var throttle: js.UndefOr[Double] = js.native
    
    /** Type of the proxy server, could be 'http' or 'https'. */
    var `type`: js.UndefOr[http | https] = js.native
    
    /** Config for web interface */
    var webInterface: js.UndefOr[WebInterfaceOptions] = js.native
    
    /** Whether to intercept websocket, default to false */
    var wsIntercept: js.UndefOr[Boolean] = js.native
  }
  object ProxyOptions {
    
    @scala.inline
    def apply(port: String | Double): ProxyOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyOptions]
    }
    
    @scala.inline
    implicit class ProxyOptionsMutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDangerouslyIgnoreUnauthorized(value: Boolean): Self = StObject.set(x, "dangerouslyIgnoreUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyIgnoreUnauthorizedUndefined: Self = StObject.set(x, "dangerouslyIgnoreUnauthorized", js.undefined)
      
      @scala.inline
      def setForceProxyHttps(value: Boolean): Self = StObject.set(x, "forceProxyHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceProxyHttpsUndefined: Self = StObject.set(x, "forceProxyHttps", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecorder(value: ProxyRecorder): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
      
      @scala.inline
      def setRule(value: String | RuleModule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setType(value: http | https): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWebInterface(value: WebInterfaceOptions): Self = StObject.set(x, "webInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebInterfaceUndefined: Self = StObject.set(x, "webInterface", js.undefined)
      
      @scala.inline
      def setWsIntercept(value: Boolean): Self = StObject.set(x, "wsIntercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsInterceptUndefined: Self = StObject.set(x, "wsIntercept", js.undefined)
    }
  }
  
  @js.native
  trait RecorderInfo extends StObject {
    
    var _id: Double = js.native
    
    var duration: Double | String = js.native
    
    var endTime: Double | String = js.native
    
    var host: String = js.native
    
    var id: Double = js.native
    
    var length: Double | String = js.native
    
    var method: String = js.native
    
    var mime: String = js.native
    
    var path: String = js.native
    
    var protocol: String = js.native
    
    var reqBody: js.Any = js.native
    
    // req
    var reqHeader: Record[String, String] = js.native
    
    var resHeader: (Record[String, String]) | String = js.native
    
    var startTime: Double = js.native
    
    // res
    var statusCode: Double | String = js.native
    
    var url: String = js.native
  }
  object RecorderInfo {
    
    @scala.inline
    def apply(
      _id: Double,
      duration: Double | String,
      endTime: Double | String,
      host: String,
      id: Double,
      length: Double | String,
      method: String,
      mime: String,
      path: String,
      protocol: String,
      reqBody: js.Any,
      reqHeader: Record[String, String],
      resHeader: (Record[String, String]) | String,
      startTime: Double,
      statusCode: Double | String,
      url: String
    ): RecorderInfo = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reqBody = reqBody.asInstanceOf[js.Any], reqHeader = reqHeader.asInstanceOf[js.Any], resHeader = resHeader.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecorderInfo]
    }
    
    @scala.inline
    implicit class RecorderInfoMutableBuilder[Self <: RecorderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTime(value: Double | String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqBody(value: js.Any): Self = StObject.set(x, "reqBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqHeader(value: Record[String, String]): Self = StObject.set(x, "reqHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResHeader(value: (Record[String, String]) | String): Self = StObject.set(x, "resHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double | String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestDetail extends StObject {
    
    var _req: IncomingMessage = js.native
    
    var protocol: String = js.native
    
    var requestData: js.Any = js.native
    
    var requestOptions: RequestOptions = js.native
    
    var url: String = js.native
  }
  object RequestDetail {
    
    @scala.inline
    def apply(
      _req: IncomingMessage,
      protocol: String,
      requestData: js.Any,
      requestOptions: RequestOptions,
      url: String
    ): RequestDetail = {
      val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestData = requestData.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDetail]
    }
    
    @scala.inline
    implicit class RequestDetailMutableBuilder[Self <: RequestDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestData(value: js.Any): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var body: js.Any = js.native
    
    var header: Record[String, String] = js.native
    
    var statusCode: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(body: js.Any, header: Record[String, String], statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Record[String, String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseDetail extends StObject {
    
    var _res: ServerResponse = js.native
    
    var response: Response = js.native
  }
  object ResponseDetail {
    
    @scala.inline
    def apply(_res: ServerResponse, response: Response): ResponseDetail = {
      val __obj = js.Dynamic.literal(_res = _res.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseDetail]
    }
    
    @scala.inline
    implicit class ResponseDetailMutableBuilder[Self <: ResponseDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_res(value: ServerResponse): Self = StObject.set(x, "_res", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuleModule extends StObject {
    
    /**
      * When receiving https request, AnyProxy will call beforeDealHttpsRequest with param requestDetail.
      * If configed with forceProxyHttps in launching, AnyProxy will skip calling this method.
      * Only by returning true, AnyProxy will try to replace the certificate and intercept the https request.
      */
    var beforeDealHttpsRequest: js.UndefOr[
        js.Function1[/* requestDetail */ BeforeDealHttpsRequestDetail, MaybePromise[Boolean]]
      ] = js.native
    
    /** Before sending request to server, AnyProxy will call beforeSendRequest with param requestDetail. */
    var beforeSendRequest: js.UndefOr[
        js.Function1[
          /* requestDetail */ RequestDetail, 
          MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
        ]
      ] = js.native
    
    /** Before sending response to client, AnyProxy will call beforeSendResponse with param requestDetail responseDetail. */
    var beforeSendResponse: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* responseDetail */ ResponseDetail, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.native
    
    /** AnyProxy will call this method when failed to connect target server in https request. */
    var onConnectError: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* err */ Error, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.native
    
    /**
      * AnyProxy will call this method when an error happened in request handling.
      * Errors usually are issued during requesting, e.g. DNS failure, request timeout.
      */
    var onError: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* err */ Error, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.native
    
    /** Introduction of this rule file. AnyProxy will read this field and give some tip to user. */
    var summary: js.UndefOr[String] = js.native
  }
  object RuleModule {
    
    @scala.inline
    def apply(): RuleModule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleModule]
    }
    
    @scala.inline
    implicit class RuleModuleMutableBuilder[Self <: RuleModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeDealHttpsRequest(value: /* requestDetail */ BeforeDealHttpsRequestDetail => MaybePromise[Boolean]): Self = StObject.set(x, "beforeDealHttpsRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDealHttpsRequestUndefined: Self = StObject.set(x, "beforeDealHttpsRequest", js.undefined)
      
      @scala.inline
      def setBeforeSendRequest(
        value: /* requestDetail */ RequestDetail => MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
      ): Self = StObject.set(x, "beforeSendRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSendRequestUndefined: Self = StObject.set(x, "beforeSendRequest", js.undefined)
      
      @scala.inline
      def setBeforeSendResponse(
        value: (/* requestDetail */ RequestDetail, /* responseDetail */ ResponseDetail) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "beforeSendResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSendResponseUndefined: Self = StObject.set(x, "beforeSendResponse", js.undefined)
      
      @scala.inline
      def setOnConnectError(
        value: (/* requestDetail */ RequestDetail, /* err */ Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "onConnectError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConnectErrorUndefined: Self = StObject.set(x, "onConnectError", js.undefined)
      
      @scala.inline
      def setOnError(
        value: (/* requestDetail */ RequestDetail, /* err */ Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  @js.native
  trait WebInterfaceOptions extends StObject {
    
    /** If enable web interface, default to false */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Port number for web interface */
    var webPort: js.UndefOr[Double] = js.native
  }
  object WebInterfaceOptions {
    
    @scala.inline
    def apply(): WebInterfaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebInterfaceOptions]
    }
    
    @scala.inline
    implicit class WebInterfaceOptionsMutableBuilder[Self <: WebInterfaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setWebPort(value: Double): Self = StObject.set(x, "webPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebPortUndefined: Self = StObject.set(x, "webPort", js.undefined)
    }
  }
}
