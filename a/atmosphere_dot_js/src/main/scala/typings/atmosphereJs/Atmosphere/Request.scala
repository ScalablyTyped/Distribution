package typings.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
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
  var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onFailureToReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.undefined
  var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var onReopen: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
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
  var subscribe: js.UndefOr[js.Function1[/* options */ Request, Unit]] = js.undefined
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
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    attachHeadersAsQueryString: js.UndefOr[Boolean] = js.undefined,
    callback: js.Function = null,
    close: () => Unit = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    contentType: String = null,
    data: String = null,
    disableDisconnect: js.UndefOr[Boolean] = js.undefined,
    disconnect: () => Unit = null,
    dispatchUrl: String = null,
    dropHeaders: js.UndefOr[Boolean] = js.undefined,
    enableProtocol: js.UndefOr[Boolean] = js.undefined,
    enableXDR: js.UndefOr[Boolean] = js.undefined,
    execute: () => Unit = null,
    executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.undefined,
    fallbackMethod: String = null,
    fallbackTransport: String = null,
    getUUID: () => Unit = null,
    getUrl: () => String = null,
    headers: js.Any = null,
    lastIndex: js.UndefOr[Double] = js.undefined,
    lastTimestamp: js.UndefOr[Double] = js.undefined,
    logLevel: String = null,
    maxReconnectOnClose: js.UndefOr[Double] = js.undefined,
    maxRequest: js.UndefOr[Double] = js.undefined,
    maxStreamingLength: js.UndefOr[Double] = js.undefined,
    messageDelimiter: String = null,
    method: String = null,
    onClientTimeout: /* request */ js.UndefOr[Request] => Unit = null,
    onClose: /* response */ js.UndefOr[Response] => Unit = null,
    onError: /* response */ js.UndefOr[Response] => Unit = null,
    onFailureToReconnect: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit = null,
    onLocalMessage: /* request */ js.UndefOr[Request] => Unit = null,
    onMessage: /* response */ Response => Unit = null,
    onMessagePublished: /* response */ js.UndefOr[Response] => Unit = null,
    onOpen: /* response */ js.UndefOr[Response] => Unit = null,
    onReconnect: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit = null,
    onReopen: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit = null,
    onTransportFailure: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Unit = null,
    pollingInterval: js.UndefOr[Double] = js.undefined,
    push: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Unit = null,
    pushLocal: /* message */ String => Unit = null,
    readResponsesHeaders: js.UndefOr[Boolean] = js.undefined,
    readyState: js.UndefOr[Double] = js.undefined,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectInterval: js.UndefOr[Double] = js.undefined,
    requestCount: js.UndefOr[Double] = js.undefined,
    rewriteURL: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    subscribe: /* options */ Request => Unit = null,
    suspend: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    trackMessageLength: js.UndefOr[Boolean] = js.undefined,
    transport: String = null,
    url: String = null,
    uuid: String = null,
    webSocketBinaryType: js.Any = null,
    webSocketImpl: js.Any = null,
    webSocketPathDelimiter: String = null,
    webSocketUrl: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attachHeadersAsQueryString)) __obj.updateDynamic("attachHeadersAsQueryString")(attachHeadersAsQueryString.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDisconnect)) __obj.updateDynamic("disableDisconnect")(disableDisconnect.get.asInstanceOf[js.Any])
    if (disconnect != null) __obj.updateDynamic("disconnect")(js.Any.fromFunction0(disconnect))
    if (dispatchUrl != null) __obj.updateDynamic("dispatchUrl")(dispatchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(dropHeaders)) __obj.updateDynamic("dropHeaders")(dropHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProtocol)) __obj.updateDynamic("enableProtocol")(enableProtocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableXDR)) __obj.updateDynamic("enableXDR")(enableXDR.get.asInstanceOf[js.Any])
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction0(execute))
    if (!js.isUndefined(executeCallbackBeforeReconnect)) __obj.updateDynamic("executeCallbackBeforeReconnect")(executeCallbackBeforeReconnect.get.asInstanceOf[js.Any])
    if (fallbackMethod != null) __obj.updateDynamic("fallbackMethod")(fallbackMethod.asInstanceOf[js.Any])
    if (fallbackTransport != null) __obj.updateDynamic("fallbackTransport")(fallbackTransport.asInstanceOf[js.Any])
    if (getUUID != null) __obj.updateDynamic("getUUID")(js.Any.fromFunction0(getUUID))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(lastIndex)) __obj.updateDynamic("lastIndex")(lastIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastTimestamp)) __obj.updateDynamic("lastTimestamp")(lastTimestamp.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReconnectOnClose)) __obj.updateDynamic("maxReconnectOnClose")(maxReconnectOnClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRequest)) __obj.updateDynamic("maxRequest")(maxRequest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStreamingLength)) __obj.updateDynamic("maxStreamingLength")(maxStreamingLength.get.asInstanceOf[js.Any])
    if (messageDelimiter != null) __obj.updateDynamic("messageDelimiter")(messageDelimiter.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onClientTimeout != null) __obj.updateDynamic("onClientTimeout")(js.Any.fromFunction1(onClientTimeout))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFailureToReconnect != null) __obj.updateDynamic("onFailureToReconnect")(js.Any.fromFunction2(onFailureToReconnect))
    if (onLocalMessage != null) __obj.updateDynamic("onLocalMessage")(js.Any.fromFunction1(onLocalMessage))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onMessagePublished != null) __obj.updateDynamic("onMessagePublished")(js.Any.fromFunction1(onMessagePublished))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onReconnect != null) __obj.updateDynamic("onReconnect")(js.Any.fromFunction2(onReconnect))
    if (onReopen != null) __obj.updateDynamic("onReopen")(js.Any.fromFunction2(onReopen))
    if (onTransportFailure != null) __obj.updateDynamic("onTransportFailure")(js.Any.fromFunction2(onTransportFailure))
    if (!js.isUndefined(pollingInterval)) __obj.updateDynamic("pollingInterval")(pollingInterval.get.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2(push))
    if (pushLocal != null) __obj.updateDynamic("pushLocal")(js.Any.fromFunction1(pushLocal))
    if (!js.isUndefined(readResponsesHeaders)) __obj.updateDynamic("readResponsesHeaders")(readResponsesHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readyState)) __obj.updateDynamic("readyState")(readyState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectInterval)) __obj.updateDynamic("reconnectInterval")(reconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCount)) __obj.updateDynamic("requestCount")(requestCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteURL)) __obj.updateDynamic("rewriteURL")(rewriteURL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1(subscribe))
    if (!js.isUndefined(suspend)) __obj.updateDynamic("suspend")(suspend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMessageLength)) __obj.updateDynamic("trackMessageLength")(trackMessageLength.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (webSocketBinaryType != null) __obj.updateDynamic("webSocketBinaryType")(webSocketBinaryType.asInstanceOf[js.Any])
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl.asInstanceOf[js.Any])
    if (webSocketPathDelimiter != null) __obj.updateDynamic("webSocketPathDelimiter")(webSocketPathDelimiter.asInstanceOf[js.Any])
    if (webSocketUrl != null) __obj.updateDynamic("webSocketUrl")(webSocketUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

