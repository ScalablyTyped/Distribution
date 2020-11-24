package typings.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
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
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setAttachHeadersAsQueryString(value: Boolean): Self = this.set("attachHeadersAsQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachHeadersAsQueryString: Self = this.set("attachHeadersAsQueryString", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisableDisconnect(value: Boolean): Self = this.set("disableDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDisconnect: Self = this.set("disableDisconnect", js.undefined)
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisconnect: Self = this.set("disconnect", js.undefined)
    
    @scala.inline
    def setDispatchUrl(value: String): Self = this.set("dispatchUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchUrl: Self = this.set("dispatchUrl", js.undefined)
    
    @scala.inline
    def setDropHeaders(value: Boolean): Self = this.set("dropHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropHeaders: Self = this.set("dropHeaders", js.undefined)
    
    @scala.inline
    def setEnableProtocol(value: Boolean): Self = this.set("enableProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableProtocol: Self = this.set("enableProtocol", js.undefined)
    
    @scala.inline
    def setEnableXDR(value: Boolean): Self = this.set("enableXDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableXDR: Self = this.set("enableXDR", js.undefined)
    
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setExecuteCallbackBeforeReconnect(value: Boolean): Self = this.set("executeCallbackBeforeReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecuteCallbackBeforeReconnect: Self = this.set("executeCallbackBeforeReconnect", js.undefined)
    
    @scala.inline
    def setFallbackMethod(value: String): Self = this.set("fallbackMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackMethod: Self = this.set("fallbackMethod", js.undefined)
    
    @scala.inline
    def setFallbackTransport(value: String): Self = this.set("fallbackTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackTransport: Self = this.set("fallbackTransport", js.undefined)
    
    @scala.inline
    def setGetUUID(value: () => Unit): Self = this.set("getUUID", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUUID: Self = this.set("getUUID", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLastIndex(value: Double): Self = this.set("lastIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIndex: Self = this.set("lastIndex", js.undefined)
    
    @scala.inline
    def setLastTimestamp(value: Double): Self = this.set("lastTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTimestamp: Self = this.set("lastTimestamp", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMaxReconnectOnClose(value: Double): Self = this.set("maxReconnectOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReconnectOnClose: Self = this.set("maxReconnectOnClose", js.undefined)
    
    @scala.inline
    def setMaxRequest(value: Double): Self = this.set("maxRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequest: Self = this.set("maxRequest", js.undefined)
    
    @scala.inline
    def setMaxStreamingLength(value: Double): Self = this.set("maxStreamingLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStreamingLength: Self = this.set("maxStreamingLength", js.undefined)
    
    @scala.inline
    def setMessageDelimiter(value: String): Self = this.set("messageDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDelimiter: Self = this.set("messageDelimiter", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnClientTimeout(value: /* request */ js.UndefOr[Request] => Unit): Self = this.set("onClientTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClientTimeout: Self = this.set("onClientTimeout", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* response */ js.UndefOr[Response] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnError(value: /* response */ js.UndefOr[Response] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFailureToReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = this.set("onFailureToReconnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFailureToReconnect: Self = this.set("onFailureToReconnect", js.undefined)
    
    @scala.inline
    def setOnLocalMessage(value: /* request */ js.UndefOr[Request] => Unit): Self = this.set("onLocalMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLocalMessage: Self = this.set("onLocalMessage", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* response */ Response => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    
    @scala.inline
    def setOnMessagePublished(value: /* response */ js.UndefOr[Response] => Unit): Self = this.set("onMessagePublished", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMessagePublished: Self = this.set("onMessagePublished", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* response */ js.UndefOr[Response] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = this.set("onReconnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReconnect: Self = this.set("onReconnect", js.undefined)
    
    @scala.inline
    def setOnReopen(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = this.set("onReopen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReopen: Self = this.set("onReopen", js.undefined)
    
    @scala.inline
    def setOnTransportFailure(value: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Unit): Self = this.set("onTransportFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTransportFailure: Self = this.set("onTransportFailure", js.undefined)
    
    @scala.inline
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
    
    @scala.inline
    def setPush(value: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Unit): Self = this.set("push", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setPushLocal(value: /* message */ String => Unit): Self = this.set("pushLocal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePushLocal: Self = this.set("pushLocal", js.undefined)
    
    @scala.inline
    def setReadResponsesHeaders(value: Boolean): Self = this.set("readResponsesHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadResponsesHeaders: Self = this.set("readResponsesHeaders", js.undefined)
    
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyState: Self = this.set("readyState", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setReconnectInterval(value: Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    
    @scala.inline
    def setRequestCount(value: Double): Self = this.set("requestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCount: Self = this.set("requestCount", js.undefined)
    
    @scala.inline
    def setRewriteURL(value: Boolean): Self = this.set("rewriteURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewriteURL: Self = this.set("rewriteURL", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSubscribe(value: Request => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    
    @scala.inline
    def setSuspend(value: Boolean): Self = this.set("suspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspend: Self = this.set("suspend", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTrackMessageLength(value: Boolean): Self = this.set("trackMessageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackMessageLength: Self = this.set("trackMessageLength", js.undefined)
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    
    @scala.inline
    def setWebSocketBinaryType(value: js.Any): Self = this.set("webSocketBinaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketBinaryType: Self = this.set("webSocketBinaryType", js.undefined)
    
    @scala.inline
    def setWebSocketImpl(value: js.Any): Self = this.set("webSocketImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketImpl: Self = this.set("webSocketImpl", js.undefined)
    
    @scala.inline
    def setWebSocketPathDelimiter(value: String): Self = this.set("webSocketPathDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketPathDelimiter: Self = this.set("webSocketPathDelimiter", js.undefined)
    
    @scala.inline
    def setWebSocketUrl(value: String): Self = this.set("webSocketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketUrl: Self = this.set("webSocketUrl", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
