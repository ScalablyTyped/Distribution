package typings.anyproxy

import typings.anyproxy.anon.PartialResponse
import typings.anyproxy.anyproxyStrings.error
import typings.anyproxy.anyproxyStrings.http
import typings.anyproxy.anyproxyStrings.https
import typings.anyproxy.anyproxyStrings.ready
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anyproxy", "ProxyCore")
  @js.native
  /**
    * Creates an instance of ProxyCore.
    * @param config - configs
    */
  open class ProxyCore () extends EventEmitter {
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
  open class ProxyRecorder () extends EventEmitter {
    def this(config: js.Object) = this()
    
    def appendRecord(info: RecorderInfo): Double = js.native
    
    def clear(): Unit = js.native
    
    def emitUpdate(id: Double): Unit = js.native
    def emitUpdate(id: Double, info: RecorderInfo): Unit = js.native
    
    def emitUpdateLatestWsMessage(id: Double, message: Any): Unit = js.native
    
    def getBody(id: Double): Unit = js.native
    def getBody(id: Double, cb: js.Function2[/* err */ js.Error, /* body */ Buffer, Unit]): Unit = js.native
    
    def getCacheFile(fileName: String, cb: js.Function2[/* err */ js.Error, /* filePath */ String, Unit]): Unit = js.native
    
    def getDecodedBody(id: Double): Unit = js.native
    def getDecodedBody(id: Double, cb: js.Function2[/* err */ js.Error, /* content */ Any, Unit]): Unit = js.native
    
    def getDecodedWsMessage(id: Double): Unit = js.native
    def getDecodedWsMessage(id: Double, cb: js.Function2[/* err */ js.Error, /* content */ Any, Unit]): Unit = js.native
    
    def getRecords(
      idStart: Double,
      limit: Double,
      cb: js.Function2[/* err */ js.Error, /* records */ js.Array[RecorderInfo], Unit]
    ): Unit = js.native
    
    def getSingleRecord(id: Double, cb: js.Function2[/* err */ js.Error, /* record */ RecorderInfo, Unit]): Unit = js.native
    
    def getSummaryList(cb: js.Function2[/* err */ js.Error, /* records */ js.Array[RecorderInfo], Unit]): Unit = js.native
    
    // TypeScript Version: 2.2
    def updateExtInfo(id: Double, extInfo: js.Object): Unit = js.native
    
    def updateRecord(id: Double, info: RecorderInfo): Unit = js.native
    
    def updateRecordBody(id: Double, info: RecorderInfo): Unit = js.native
    
    def updateRecordWsMessage(id: Double, message: Any): Unit = js.native
  }
  
  @JSImport("anyproxy", "ProxyServer")
  @js.native
  open class ProxyServer () extends ProxyCore {
    def this(config: ProxyOptions) = this()
    
    /** Emit when error happened inside proxy server */
    @JSName("on")
    def on_error(eventName: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /** Emit when proxy server is ready */
    @JSName("on")
    def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
  }
  
  @JSImport("anyproxy", "ProxyWebServer")
  @js.native
  open class ProxyWebServer protected () extends EventEmitter {
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
    def getServer(): Any = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  object utils {
    
    /** Manage certificates of AnyProxy. */
    object certMgr {
      
      @JSImport("anyproxy", "utils.certMgr")
      @js.native
      val ^ : js.Any = js.native
      
      /** Generate a rootCA */
      inline def generateRootCA(callback: js.Function2[/* err */ js.Error, /* keyPath */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRootCA")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** Detect if AnyProx rootCA exists */
      inline def ifRootCAFileExists(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ifRootCAFileExists")().asInstanceOf[Boolean]
    }
    
    /** Manage the system proxy config. sudo password may be required. */
    object systemProxyMgr {
      
      @JSImport("anyproxy", "utils.systemProxyMgr")
      @js.native
      val ^ : js.Any = js.native
      
      /** Disable global system proxy. sudo password may be required. */
      inline def disableGlobalProxy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableGlobalProxy")().asInstanceOf[Unit]
      inline def disableGlobalProxy(networkType: NetworkType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableGlobalProxy")(networkType.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /** Enable global system proxy with specified params. sudo password may be required. */
      inline def enableGlobalProxy(host: String, port: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableGlobalProxy")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def enableGlobalProxy(host: String, port: String, networkType: NetworkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableGlobalProxy")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], networkType.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def enableGlobalProxy(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableGlobalProxy")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def enableGlobalProxy(host: String, port: Double, networkType: NetworkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableGlobalProxy")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], networkType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
  
  trait BeforeDealHttpsRequestDetail extends StObject {
    
    var _req: IncomingMessage
    
    var host: String
  }
  object BeforeDealHttpsRequestDetail {
    
    inline def apply(_req: IncomingMessage, host: String): BeforeDealHttpsRequestDetail = {
      val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeDealHttpsRequestDetail]
    }
    
    extension [Self <: BeforeDealHttpsRequestDetail](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<anyproxy.anyproxy.RequestDetail> */
  trait BeforeSendRequestResult extends StObject {
    
    var _req: js.UndefOr[IncomingMessage] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var requestData: js.UndefOr[Any] = js.undefined
    
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
    
    var response: js.UndefOr[PartialResponse] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BeforeSendRequestResult {
    
    inline def apply(): BeforeSendRequestResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSendRequestResult]
    }
    
    extension [Self <: BeforeSendRequestResult](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequestData(value: Any): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
      
      inline def setRequestDataUndefined: Self = StObject.set(x, "requestData", js.undefined)
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setResponse(value: PartialResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
      
      inline def set_reqUndefined: Self = StObject.set(x, "_req", js.undefined)
    }
  }
  
  trait BeforeSendResponseResult extends StObject {
    
    var response: PartialResponse
  }
  object BeforeSendResponseResult {
    
    inline def apply(response: PartialResponse): BeforeSendResponseResult = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeSendResponseResult]
    }
    
    extension [Self <: BeforeSendResponseResult](x: Self) {
      
      inline def setResponse(value: PartialResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type MaybePromise[T] = T | js.Promise[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.anyproxy.anyproxyStrings.http
    - typings.anyproxy.anyproxyStrings.https
  */
  trait NetworkType extends StObject
  object NetworkType {
    
    inline def http: typings.anyproxy.anyproxyStrings.http = "http".asInstanceOf[typings.anyproxy.anyproxyStrings.http]
    
    inline def https: typings.anyproxy.anyproxyStrings.https = "https".asInstanceOf[typings.anyproxy.anyproxyStrings.https]
  }
  
  trait ProxyOptions extends StObject {
    
    /** If ignore certificate error in request, default to false */
    var dangerouslyIgnoreUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /** Force intercept all https request, default to false */
    var forceProxyHttps: js.UndefOr[Boolean] = js.undefined
    
    /** Host name of the proxy server, required when this is an https proxy */
    var hostname: js.UndefOr[String] = js.undefined
    
    /** Port number of proxy server */
    var port: String | Double
    
    /** Recorder to use */
    var recorder: js.UndefOr[ProxyRecorder] = js.undefined
    
    /** Your rule module */
    var rule: js.UndefOr[String | RuleModule] = js.undefined
    
    /** If keep silent in console, false for default false */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /** Throttle in kb/s, unlimited for default */
    var throttle: js.UndefOr[Double] = js.undefined
    
    /** Type of the proxy server, could be 'http' or 'https'. */
    var `type`: js.UndefOr[http | https] = js.undefined
    
    /** Config for web interface */
    var webInterface: js.UndefOr[WebInterfaceOptions] = js.undefined
    
    /** Whether to intercept websocket, default to false */
    var wsIntercept: js.UndefOr[Boolean] = js.undefined
  }
  object ProxyOptions {
    
    inline def apply(port: String | Double): ProxyOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyOptions]
    }
    
    extension [Self <: ProxyOptions](x: Self) {
      
      inline def setDangerouslyIgnoreUnauthorized(value: Boolean): Self = StObject.set(x, "dangerouslyIgnoreUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyIgnoreUnauthorizedUndefined: Self = StObject.set(x, "dangerouslyIgnoreUnauthorized", js.undefined)
      
      inline def setForceProxyHttps(value: Boolean): Self = StObject.set(x, "forceProxyHttps", value.asInstanceOf[js.Any])
      
      inline def setForceProxyHttpsUndefined: Self = StObject.set(x, "forceProxyHttps", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRecorder(value: ProxyRecorder): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
      
      inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
      
      inline def setRule(value: String | RuleModule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setType(value: http | https): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWebInterface(value: WebInterfaceOptions): Self = StObject.set(x, "webInterface", value.asInstanceOf[js.Any])
      
      inline def setWebInterfaceUndefined: Self = StObject.set(x, "webInterface", js.undefined)
      
      inline def setWsIntercept(value: Boolean): Self = StObject.set(x, "wsIntercept", value.asInstanceOf[js.Any])
      
      inline def setWsInterceptUndefined: Self = StObject.set(x, "wsIntercept", js.undefined)
    }
  }
  
  trait RecorderInfo extends StObject {
    
    var _id: Double
    
    var duration: Double | String
    
    var endTime: Double | String
    
    var host: String
    
    var id: Double
    
    var length: Double | String
    
    var method: String
    
    var mime: String
    
    var path: String
    
    var protocol: String
    
    var reqBody: Any
    
    // req
    var reqHeader: Record[String, String]
    
    var resHeader: (Record[String, String]) | String
    
    var startTime: Double
    
    // res
    var statusCode: Double | String
    
    var url: String
  }
  object RecorderInfo {
    
    inline def apply(
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
      reqBody: Any,
      reqHeader: Record[String, String],
      resHeader: (Record[String, String]) | String,
      startTime: Double,
      statusCode: Double | String,
      url: String
    ): RecorderInfo = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reqBody = reqBody.asInstanceOf[js.Any], reqHeader = reqHeader.asInstanceOf[js.Any], resHeader = resHeader.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecorderInfo]
    }
    
    extension [Self <: RecorderInfo](x: Self) {
      
      inline def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEndTime(value: Double | String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setReqBody(value: Any): Self = StObject.set(x, "reqBody", value.asInstanceOf[js.Any])
      
      inline def setReqHeader(value: Record[String, String]): Self = StObject.set(x, "reqHeader", value.asInstanceOf[js.Any])
      
      inline def setResHeader(value: (Record[String, String]) | String): Self = StObject.set(x, "resHeader", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double | String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestDetail extends StObject {
    
    var _req: IncomingMessage
    
    var protocol: String
    
    var requestData: Any
    
    var requestOptions: RequestOptions
    
    var url: String
  }
  object RequestDetail {
    
    inline def apply(
      _req: IncomingMessage,
      protocol: String,
      requestData: Any,
      requestOptions: RequestOptions,
      url: String
    ): RequestDetail = {
      val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestData = requestData.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDetail]
    }
    
    extension [Self <: RequestDetail](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRequestData(value: Any): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def set_req(value: IncomingMessage): Self = StObject.set(x, "_req", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var body: Any
    
    var header: Record[String, String]
    
    var statusCode: Double
  }
  object Response {
    
    inline def apply(body: Any, header: Record[String, String], statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Record[String, String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseDetail extends StObject {
    
    var _res: ServerResponse[IncomingMessage]
    
    var response: Response
  }
  object ResponseDetail {
    
    inline def apply(_res: ServerResponse[IncomingMessage], response: Response): ResponseDetail = {
      val __obj = js.Dynamic.literal(_res = _res.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseDetail]
    }
    
    extension [Self <: ResponseDetail](x: Self) {
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def set_res(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "_res", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleModule extends StObject {
    
    /**
      * When receiving https request, AnyProxy will call beforeDealHttpsRequest with param requestDetail.
      * If configed with forceProxyHttps in launching, AnyProxy will skip calling this method.
      * Only by returning true, AnyProxy will try to replace the certificate and intercept the https request.
      */
    var beforeDealHttpsRequest: js.UndefOr[
        js.Function1[/* requestDetail */ BeforeDealHttpsRequestDetail, MaybePromise[Boolean]]
      ] = js.undefined
    
    /** Before sending request to server, AnyProxy will call beforeSendRequest with param requestDetail. */
    var beforeSendRequest: js.UndefOr[
        js.Function1[
          /* requestDetail */ RequestDetail, 
          MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
        ]
      ] = js.undefined
    
    /** Before sending response to client, AnyProxy will call beforeSendResponse with param requestDetail responseDetail. */
    var beforeSendResponse: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* responseDetail */ ResponseDetail, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.undefined
    
    /** AnyProxy will call this method when failed to connect target server in https request. */
    var onConnectError: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* err */ js.Error, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.undefined
    
    /**
      * AnyProxy will call this method when an error happened in request handling.
      * Errors usually are issued during requesting, e.g. DNS failure, request timeout.
      */
    var onError: js.UndefOr[
        js.Function2[
          /* requestDetail */ RequestDetail, 
          /* err */ js.Error, 
          MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
        ]
      ] = js.undefined
    
    /** Introduction of this rule file. AnyProxy will read this field and give some tip to user. */
    var summary: js.UndefOr[String] = js.undefined
  }
  object RuleModule {
    
    inline def apply(): RuleModule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleModule]
    }
    
    extension [Self <: RuleModule](x: Self) {
      
      inline def setBeforeDealHttpsRequest(value: /* requestDetail */ BeforeDealHttpsRequestDetail => MaybePromise[Boolean]): Self = StObject.set(x, "beforeDealHttpsRequest", js.Any.fromFunction1(value))
      
      inline def setBeforeDealHttpsRequestUndefined: Self = StObject.set(x, "beforeDealHttpsRequest", js.undefined)
      
      inline def setBeforeSendRequest(
        value: /* requestDetail */ RequestDetail => MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
      ): Self = StObject.set(x, "beforeSendRequest", js.Any.fromFunction1(value))
      
      inline def setBeforeSendRequestUndefined: Self = StObject.set(x, "beforeSendRequest", js.undefined)
      
      inline def setBeforeSendResponse(
        value: (/* requestDetail */ RequestDetail, /* responseDetail */ ResponseDetail) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "beforeSendResponse", js.Any.fromFunction2(value))
      
      inline def setBeforeSendResponseUndefined: Self = StObject.set(x, "beforeSendResponse", js.undefined)
      
      inline def setOnConnectError(
        value: (/* requestDetail */ RequestDetail, /* err */ js.Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "onConnectError", js.Any.fromFunction2(value))
      
      inline def setOnConnectErrorUndefined: Self = StObject.set(x, "onConnectError", js.undefined)
      
      inline def setOnError(
        value: (/* requestDetail */ RequestDetail, /* err */ js.Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
      ): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait WebInterfaceOptions extends StObject {
    
    /** If enable web interface, default to false */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Port number for web interface */
    var webPort: js.UndefOr[Double] = js.undefined
  }
  object WebInterfaceOptions {
    
    inline def apply(): WebInterfaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebInterfaceOptions]
    }
    
    extension [Self <: WebInterfaceOptions](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setWebPort(value: Double): Self = StObject.set(x, "webPort", value.asInstanceOf[js.Any])
      
      inline def setWebPortUndefined: Self = StObject.set(x, "webPort", js.undefined)
    }
  }
}
