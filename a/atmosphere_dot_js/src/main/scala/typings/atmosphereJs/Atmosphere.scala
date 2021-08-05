package typings.atmosphereJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Atmosphere {
  
  trait Atmosphere extends StObject {
    
    var AtmosphereRequest: js.UndefOr[typings.atmosphereJs.Atmosphere.AtmosphereRequest] = js.undefined
    
    /**
      * The atmosphere API is a little bit special here: the first parameter can either be
      * a URL string or a Request object. If it is a URL string, then the additional parameters are expected.
      */
    var subscribe: js.UndefOr[
        js.Function3[
          /* requestOrUrl */ js.Any, 
          /* callback */ js.UndefOr[js.Function], 
          /* request */ js.UndefOr[Request], 
          Request
        ]
      ] = js.undefined
    
    var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Atmosphere {
    
    inline def apply(): typings.atmosphereJs.Atmosphere.Atmosphere = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.atmosphereJs.Atmosphere.Atmosphere]
    }
    
    extension [Self <: typings.atmosphereJs.Atmosphere.Atmosphere](x: Self) {
      
      inline def setAtmosphereRequest(value: AtmosphereRequest): Self = StObject.set(x, "AtmosphereRequest", value.asInstanceOf[js.Any])
      
      inline def setAtmosphereRequestUndefined: Self = StObject.set(x, "AtmosphereRequest", js.undefined)
      
      inline def setSubscribe(
        value: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => Request
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      inline def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
  
  // needed to fit JavaScript "new atmosphere.AtmosphereRequest()"
  // and compile with --noImplicitAny
  @js.native
  trait AtmosphereRequest
    extends StObject
       with Instantiable0[Request]
  
  trait Request extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attachHeadersAsQueryString: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function] = js.undefined
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var disableDisconnect: js.UndefOr[Boolean] = js.undefined
    
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var dispatchUrl: js.UndefOr[String] = js.undefined
    
    var dropHeaders: js.UndefOr[Boolean] = js.undefined
    
    var enableProtocol: js.UndefOr[Boolean] = js.undefined
    
    var enableXDR: js.UndefOr[Boolean] = js.undefined
    
    var execute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.undefined
    
    var fallbackMethod: js.UndefOr[String] = js.undefined
    
    var fallbackTransport: js.UndefOr[String] = js.undefined
    
    var getUUID: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var lastIndex: js.UndefOr[Double] = js.undefined
    
    var lastTimestamp: js.UndefOr[Double] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var maxReconnectOnClose: js.UndefOr[Double] = js.undefined
    
    var maxRequest: js.UndefOr[Double] = js.undefined
    
    var maxStreamingLength: js.UndefOr[Double] = js.undefined
    
    var messageDelimiter: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
    
    var onFailureToReconnect: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.undefined
    
    var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], Unit]] = js.undefined
    
    var onMessage: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.undefined
    
    var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
    
    var onReconnect: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.undefined
    
    var onReopen: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.undefined
    
    var onTransportFailure: js.UndefOr[
        js.Function2[/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response], Unit]
      ] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    var push: js.UndefOr[js.Function2[/* message */ String, /* dispatchUrl */ js.UndefOr[String], Unit]] = js.undefined
    
    var pushLocal: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var readResponsesHeaders: js.UndefOr[Boolean] = js.undefined
    
    var readyState: js.UndefOr[Double] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var reconnectInterval: js.UndefOr[Double] = js.undefined
    
    var requestCount: js.UndefOr[Double] = js.undefined
    
    var rewriteURL: js.UndefOr[Boolean] = js.undefined
    
    var shared: js.UndefOr[Boolean] = js.undefined
    
    var subscribe: js.UndefOr[js.Function1[/* options */ this.type, Unit]] = js.undefined
    
    var suspend: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var trackMessageLength: js.UndefOr[Boolean] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
    
    var webSocketBinaryType: js.UndefOr[js.Any] = js.undefined
    
    var webSocketImpl: js.UndefOr[js.Any] = js.undefined
    
    var webSocketPathDelimiter: js.UndefOr[String] = js.undefined
    
    var webSocketUrl: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAttachHeadersAsQueryString(value: Boolean): Self = StObject.set(x, "attachHeadersAsQueryString", value.asInstanceOf[js.Any])
      
      inline def setAttachHeadersAsQueryStringUndefined: Self = StObject.set(x, "attachHeadersAsQueryString", js.undefined)
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisableDisconnect(value: Boolean): Self = StObject.set(x, "disableDisconnect", value.asInstanceOf[js.Any])
      
      inline def setDisableDisconnectUndefined: Self = StObject.set(x, "disableDisconnect", js.undefined)
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setDispatchUrl(value: String): Self = StObject.set(x, "dispatchUrl", value.asInstanceOf[js.Any])
      
      inline def setDispatchUrlUndefined: Self = StObject.set(x, "dispatchUrl", js.undefined)
      
      inline def setDropHeaders(value: Boolean): Self = StObject.set(x, "dropHeaders", value.asInstanceOf[js.Any])
      
      inline def setDropHeadersUndefined: Self = StObject.set(x, "dropHeaders", js.undefined)
      
      inline def setEnableProtocol(value: Boolean): Self = StObject.set(x, "enableProtocol", value.asInstanceOf[js.Any])
      
      inline def setEnableProtocolUndefined: Self = StObject.set(x, "enableProtocol", js.undefined)
      
      inline def setEnableXDR(value: Boolean): Self = StObject.set(x, "enableXDR", value.asInstanceOf[js.Any])
      
      inline def setEnableXDRUndefined: Self = StObject.set(x, "enableXDR", js.undefined)
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setExecuteCallbackBeforeReconnect(value: Boolean): Self = StObject.set(x, "executeCallbackBeforeReconnect", value.asInstanceOf[js.Any])
      
      inline def setExecuteCallbackBeforeReconnectUndefined: Self = StObject.set(x, "executeCallbackBeforeReconnect", js.undefined)
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      inline def setFallbackTransport(value: String): Self = StObject.set(x, "fallbackTransport", value.asInstanceOf[js.Any])
      
      inline def setFallbackTransportUndefined: Self = StObject.set(x, "fallbackTransport", js.undefined)
      
      inline def setGetUUID(value: () => Unit): Self = StObject.set(x, "getUUID", js.Any.fromFunction0(value))
      
      inline def setGetUUIDUndefined: Self = StObject.set(x, "getUUID", js.undefined)
      
      inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setLastIndexUndefined: Self = StObject.set(x, "lastIndex", js.undefined)
      
      inline def setLastTimestamp(value: Double): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxReconnectOnClose(value: Double): Self = StObject.set(x, "maxReconnectOnClose", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectOnCloseUndefined: Self = StObject.set(x, "maxReconnectOnClose", js.undefined)
      
      inline def setMaxRequest(value: Double): Self = StObject.set(x, "maxRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestUndefined: Self = StObject.set(x, "maxRequest", js.undefined)
      
      inline def setMaxStreamingLength(value: Double): Self = StObject.set(x, "maxStreamingLength", value.asInstanceOf[js.Any])
      
      inline def setMaxStreamingLengthUndefined: Self = StObject.set(x, "maxStreamingLength", js.undefined)
      
      inline def setMessageDelimiter(value: String): Self = StObject.set(x, "messageDelimiter", value.asInstanceOf[js.Any])
      
      inline def setMessageDelimiterUndefined: Self = StObject.set(x, "messageDelimiter", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnClientTimeout(value: /* request */ js.UndefOr[Request] => Unit): Self = StObject.set(x, "onClientTimeout", js.Any.fromFunction1(value))
      
      inline def setOnClientTimeoutUndefined: Self = StObject.set(x, "onClientTimeout", js.undefined)
      
      inline def setOnClose(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFailureToReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onFailureToReconnect", js.Any.fromFunction2(value))
      
      inline def setOnFailureToReconnectUndefined: Self = StObject.set(x, "onFailureToReconnect", js.undefined)
      
      inline def setOnLocalMessage(value: /* request */ js.UndefOr[Request] => Unit): Self = StObject.set(x, "onLocalMessage", js.Any.fromFunction1(value))
      
      inline def setOnLocalMessageUndefined: Self = StObject.set(x, "onLocalMessage", js.undefined)
      
      inline def setOnMessage(value: /* response */ Response => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessagePublished(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onMessagePublished", js.Any.fromFunction1(value))
      
      inline def setOnMessagePublishedUndefined: Self = StObject.set(x, "onMessagePublished", js.undefined)
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnOpen(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction2(value))
      
      inline def setOnReconnectUndefined: Self = StObject.set(x, "onReconnect", js.undefined)
      
      inline def setOnReopen(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onReopen", js.Any.fromFunction2(value))
      
      inline def setOnReopenUndefined: Self = StObject.set(x, "onReopen", js.undefined)
      
      inline def setOnTransportFailure(value: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onTransportFailure", js.Any.fromFunction2(value))
      
      inline def setOnTransportFailureUndefined: Self = StObject.set(x, "onTransportFailure", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setPush(value: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setPushLocal(value: /* message */ String => Unit): Self = StObject.set(x, "pushLocal", js.Any.fromFunction1(value))
      
      inline def setPushLocalUndefined: Self = StObject.set(x, "pushLocal", js.undefined)
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReadResponsesHeaders(value: Boolean): Self = StObject.set(x, "readResponsesHeaders", value.asInstanceOf[js.Any])
      
      inline def setReadResponsesHeadersUndefined: Self = StObject.set(x, "readResponsesHeaders", js.undefined)
      
      inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
      
      inline def setRequestCountUndefined: Self = StObject.set(x, "requestCount", js.undefined)
      
      inline def setRewriteURL(value: Boolean): Self = StObject.set(x, "rewriteURL", value.asInstanceOf[js.Any])
      
      inline def setRewriteURLUndefined: Self = StObject.set(x, "rewriteURL", js.undefined)
      
      inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      inline def setSubscribe(value: Request => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTrackMessageLength(value: Boolean): Self = StObject.set(x, "trackMessageLength", value.asInstanceOf[js.Any])
      
      inline def setTrackMessageLengthUndefined: Self = StObject.set(x, "trackMessageLength", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setWebSocketBinaryType(value: js.Any): Self = StObject.set(x, "webSocketBinaryType", value.asInstanceOf[js.Any])
      
      inline def setWebSocketBinaryTypeUndefined: Self = StObject.set(x, "webSocketBinaryType", js.undefined)
      
      inline def setWebSocketImpl(value: js.Any): Self = StObject.set(x, "webSocketImpl", value.asInstanceOf[js.Any])
      
      inline def setWebSocketImplUndefined: Self = StObject.set(x, "webSocketImpl", js.undefined)
      
      inline def setWebSocketPathDelimiter(value: String): Self = StObject.set(x, "webSocketPathDelimiter", value.asInstanceOf[js.Any])
      
      inline def setWebSocketPathDelimiterUndefined: Self = StObject.set(x, "webSocketPathDelimiter", js.undefined)
      
      inline def setWebSocketUrl(value: String): Self = StObject.set(x, "webSocketUrl", value.asInstanceOf[js.Any])
      
      inline def setWebSocketUrlUndefined: Self = StObject.set(x, "webSocketUrl", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var closedByClientTimeout: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var errorHandled: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var messages: js.UndefOr[js.Array[String]] = js.undefined
    
    var partialMessage: js.UndefOr[String] = js.undefined
    
    var reasonPhrase: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var responseBody: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply(): Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setClosedByClientTimeout(value: Boolean): Self = StObject.set(x, "closedByClientTimeout", value.asInstanceOf[js.Any])
      
      inline def setClosedByClientTimeoutUndefined: Self = StObject.set(x, "closedByClientTimeout", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorHandled(value: Boolean): Self = StObject.set(x, "errorHandled", value.asInstanceOf[js.Any])
      
      inline def setErrorHandledUndefined: Self = StObject.set(x, "errorHandled", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      inline def setPartialMessage(value: String): Self = StObject.set(x, "partialMessage", value.asInstanceOf[js.Any])
      
      inline def setPartialMessageUndefined: Self = StObject.set(x, "partialMessage", js.undefined)
      
      inline def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      inline def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
