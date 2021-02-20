package typings.atmosphereJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Atmosphere {
  
  @js.native
  trait Atmosphere extends StObject {
    
    var AtmosphereRequest: js.UndefOr[typings.atmosphereJs.Atmosphere.AtmosphereRequest] = js.native
    
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
      ] = js.native
    
    var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Atmosphere {
    
    @scala.inline
    def apply(): typings.atmosphereJs.Atmosphere.Atmosphere = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.atmosphereJs.Atmosphere.Atmosphere]
    }
    
    @scala.inline
    implicit class AtmosphereMutableBuilder[Self <: typings.atmosphereJs.Atmosphere.Atmosphere] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtmosphereRequest(value: AtmosphereRequest): Self = StObject.set(x, "AtmosphereRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtmosphereRequestUndefined: Self = StObject.set(x, "AtmosphereRequest", js.undefined)
      
      @scala.inline
      def setSubscribe(
        value: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => Request
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
  
  // needed to fit JavaScript "new atmosphere.AtmosphereRequest()"
  // and compile with --noImplicitAny
  @js.native
  trait AtmosphereRequest extends Instantiable0[Request]
  
  @js.native
  trait Request extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var attachHeadersAsQueryString: js.UndefOr[Boolean] = js.native
    
    var callback: js.UndefOr[js.Function] = js.native
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var connectTimeout: js.UndefOr[Double] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var disableDisconnect: js.UndefOr[Boolean] = js.native
    
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
    
    var dispatchUrl: js.UndefOr[String] = js.native
    
    var dropHeaders: js.UndefOr[Boolean] = js.native
    
    var enableProtocol: js.UndefOr[Boolean] = js.native
    
    var enableXDR: js.UndefOr[Boolean] = js.native
    
    var execute: js.UndefOr[js.Function0[Unit]] = js.native
    
    var executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.native
    
    var fallbackMethod: js.UndefOr[String] = js.native
    
    var fallbackTransport: js.UndefOr[String] = js.native
    
    var getUUID: js.UndefOr[js.Function0[Unit]] = js.native
    
    var getUrl: js.UndefOr[js.Function0[String]] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var lastIndex: js.UndefOr[Double] = js.native
    
    var lastTimestamp: js.UndefOr[Double] = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var maxReconnectOnClose: js.UndefOr[Double] = js.native
    
    var maxRequest: js.UndefOr[Double] = js.native
    
    var maxStreamingLength: js.UndefOr[Double] = js.native
    
    var messageDelimiter: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
    
    var onFailureToReconnect: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.native
    
    var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], Unit]] = js.native
    
    var onMessage: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.native
    
    var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
    
    var onReconnect: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.native
    
    var onReopen: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[this.type], /* response */ js.UndefOr[Response], Unit]
      ] = js.native
    
    var onTransportFailure: js.UndefOr[
        js.Function2[/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response], Unit]
      ] = js.native
    
    var pollingInterval: js.UndefOr[Double] = js.native
    
    var push: js.UndefOr[js.Function2[/* message */ String, /* dispatchUrl */ js.UndefOr[String], Unit]] = js.native
    
    var pushLocal: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    var readResponsesHeaders: js.UndefOr[Boolean] = js.native
    
    var readyState: js.UndefOr[Double] = js.native
    
    var reconnect: js.UndefOr[Boolean] = js.native
    
    var reconnectInterval: js.UndefOr[Double] = js.native
    
    var requestCount: js.UndefOr[Double] = js.native
    
    var rewriteURL: js.UndefOr[Boolean] = js.native
    
    var shared: js.UndefOr[Boolean] = js.native
    
    var subscribe: js.UndefOr[js.Function1[/* options */ this.type, Unit]] = js.native
    
    var suspend: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var trackMessageLength: js.UndefOr[Boolean] = js.native
    
    var transport: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var uuid: js.UndefOr[String] = js.native
    
    var webSocketBinaryType: js.UndefOr[js.Any] = js.native
    
    var webSocketImpl: js.UndefOr[js.Any] = js.native
    
    var webSocketPathDelimiter: js.UndefOr[String] = js.native
    
    var webSocketUrl: js.UndefOr[String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAttachHeadersAsQueryString(value: Boolean): Self = StObject.set(x, "attachHeadersAsQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachHeadersAsQueryStringUndefined: Self = StObject.set(x, "attachHeadersAsQueryString", js.undefined)
      
      @scala.inline
      def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisableDisconnect(value: Boolean): Self = StObject.set(x, "disableDisconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDisconnectUndefined: Self = StObject.set(x, "disableDisconnect", js.undefined)
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      @scala.inline
      def setDispatchUrl(value: String): Self = StObject.set(x, "dispatchUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchUrlUndefined: Self = StObject.set(x, "dispatchUrl", js.undefined)
      
      @scala.inline
      def setDropHeaders(value: Boolean): Self = StObject.set(x, "dropHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropHeadersUndefined: Self = StObject.set(x, "dropHeaders", js.undefined)
      
      @scala.inline
      def setEnableProtocol(value: Boolean): Self = StObject.set(x, "enableProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableProtocolUndefined: Self = StObject.set(x, "enableProtocol", js.undefined)
      
      @scala.inline
      def setEnableXDR(value: Boolean): Self = StObject.set(x, "enableXDR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableXDRUndefined: Self = StObject.set(x, "enableXDR", js.undefined)
      
      @scala.inline
      def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecuteCallbackBeforeReconnect(value: Boolean): Self = StObject.set(x, "executeCallbackBeforeReconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteCallbackBeforeReconnectUndefined: Self = StObject.set(x, "executeCallbackBeforeReconnect", js.undefined)
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      @scala.inline
      def setFallbackMethod(value: String): Self = StObject.set(x, "fallbackMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackMethodUndefined: Self = StObject.set(x, "fallbackMethod", js.undefined)
      
      @scala.inline
      def setFallbackTransport(value: String): Self = StObject.set(x, "fallbackTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackTransportUndefined: Self = StObject.set(x, "fallbackTransport", js.undefined)
      
      @scala.inline
      def setGetUUID(value: () => Unit): Self = StObject.set(x, "getUUID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUUIDUndefined: Self = StObject.set(x, "getUUID", js.undefined)
      
      @scala.inline
      def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndexUndefined: Self = StObject.set(x, "lastIndex", js.undefined)
      
      @scala.inline
      def setLastTimestamp(value: Double): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMaxReconnectOnClose(value: Double): Self = StObject.set(x, "maxReconnectOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectOnCloseUndefined: Self = StObject.set(x, "maxReconnectOnClose", js.undefined)
      
      @scala.inline
      def setMaxRequest(value: Double): Self = StObject.set(x, "maxRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRequestUndefined: Self = StObject.set(x, "maxRequest", js.undefined)
      
      @scala.inline
      def setMaxStreamingLength(value: Double): Self = StObject.set(x, "maxStreamingLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStreamingLengthUndefined: Self = StObject.set(x, "maxStreamingLength", js.undefined)
      
      @scala.inline
      def setMessageDelimiter(value: String): Self = StObject.set(x, "messageDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDelimiterUndefined: Self = StObject.set(x, "messageDelimiter", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnClientTimeout(value: /* request */ js.UndefOr[Request] => Unit): Self = StObject.set(x, "onClientTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClientTimeoutUndefined: Self = StObject.set(x, "onClientTimeout", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFailureToReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onFailureToReconnect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFailureToReconnectUndefined: Self = StObject.set(x, "onFailureToReconnect", js.undefined)
      
      @scala.inline
      def setOnLocalMessage(value: /* request */ js.UndefOr[Request] => Unit): Self = StObject.set(x, "onLocalMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocalMessageUndefined: Self = StObject.set(x, "onLocalMessage", js.undefined)
      
      @scala.inline
      def setOnMessage(value: /* response */ Response => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessagePublished(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onMessagePublished", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessagePublishedUndefined: Self = StObject.set(x, "onMessagePublished", js.undefined)
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* response */ js.UndefOr[Response] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReconnectUndefined: Self = StObject.set(x, "onReconnect", js.undefined)
      
      @scala.inline
      def setOnReopen(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onReopen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReopenUndefined: Self = StObject.set(x, "onReopen", js.undefined)
      
      @scala.inline
      def setOnTransportFailure(value: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Unit): Self = StObject.set(x, "onTransportFailure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransportFailureUndefined: Self = StObject.set(x, "onTransportFailure", js.undefined)
      
      @scala.inline
      def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      @scala.inline
      def setPush(value: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPushLocal(value: /* message */ String => Unit): Self = StObject.set(x, "pushLocal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushLocalUndefined: Self = StObject.set(x, "pushLocal", js.undefined)
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setReadResponsesHeaders(value: Boolean): Self = StObject.set(x, "readResponsesHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadResponsesHeadersUndefined: Self = StObject.set(x, "readResponsesHeaders", js.undefined)
      
      @scala.inline
      def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCountUndefined: Self = StObject.set(x, "requestCount", js.undefined)
      
      @scala.inline
      def setRewriteURL(value: Boolean): Self = StObject.set(x, "rewriteURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteURLUndefined: Self = StObject.set(x, "rewriteURL", js.undefined)
      
      @scala.inline
      def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      @scala.inline
      def setSubscribe(value: Request => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      @scala.inline
      def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTrackMessageLength(value: Boolean): Self = StObject.set(x, "trackMessageLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMessageLengthUndefined: Self = StObject.set(x, "trackMessageLength", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      @scala.inline
      def setWebSocketBinaryType(value: js.Any): Self = StObject.set(x, "webSocketBinaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketBinaryTypeUndefined: Self = StObject.set(x, "webSocketBinaryType", js.undefined)
      
      @scala.inline
      def setWebSocketImpl(value: js.Any): Self = StObject.set(x, "webSocketImpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketImplUndefined: Self = StObject.set(x, "webSocketImpl", js.undefined)
      
      @scala.inline
      def setWebSocketPathDelimiter(value: String): Self = StObject.set(x, "webSocketPathDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketPathDelimiterUndefined: Self = StObject.set(x, "webSocketPathDelimiter", js.undefined)
      
      @scala.inline
      def setWebSocketUrl(value: String): Self = StObject.set(x, "webSocketUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketUrlUndefined: Self = StObject.set(x, "webSocketUrl", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var closedByClientTimeout: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var errorHandled: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Array[String]] = js.native
    
    var messages: js.UndefOr[js.Array[String]] = js.native
    
    var partialMessage: js.UndefOr[String] = js.native
    
    var reasonPhrase: js.UndefOr[String] = js.native
    
    var request: js.UndefOr[Request] = js.native
    
    var responseBody: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var transport: js.UndefOr[String] = js.native
  }
  object Response {
    
    @scala.inline
    def apply(): Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosedByClientTimeout(value: Boolean): Self = StObject.set(x, "closedByClientTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedByClientTimeoutUndefined: Self = StObject.set(x, "closedByClientTimeout", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorHandled(value: Boolean): Self = StObject.set(x, "errorHandled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorHandledUndefined: Self = StObject.set(x, "errorHandled", js.undefined)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setPartialMessage(value: String): Self = StObject.set(x, "partialMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialMessageUndefined: Self = StObject.set(x, "partialMessage", js.undefined)
      
      @scala.inline
      def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
