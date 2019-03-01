package typings
package atmosphereDotJsLib.AtmosphereNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var attachHeadersAsQueryString: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var disconnect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dispatchUrl: js.UndefOr[java.lang.String] = js.undefined
  var dropHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var enableProtocol: js.UndefOr[scala.Boolean] = js.undefined
  var enableXDR: js.UndefOr[scala.Boolean] = js.undefined
  var execute: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var executeCallbackBeforeReconnect: js.UndefOr[scala.Boolean] = js.undefined
  var fallbackMethod: js.UndefOr[java.lang.String] = js.undefined
  var fallbackTransport: js.UndefOr[java.lang.String] = js.undefined
  var getUUID: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var lastIndex: js.UndefOr[scala.Double] = js.undefined
  var lastTimestamp: js.UndefOr[scala.Double] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var maxReconnectOnClose: js.UndefOr[scala.Double] = js.undefined
  var maxRequest: js.UndefOr[scala.Double] = js.undefined
  var maxStreamingLength: js.UndefOr[scala.Double] = js.undefined
  var messageDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], scala.Unit]] = js.undefined
  var onFailureToReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit]
  ] = js.undefined
  var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], scala.Unit]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* response */ Response, scala.Unit]] = js.undefined
  var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], scala.Unit]] = js.undefined
  var onReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit]
  ] = js.undefined
  var onReopen: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit]
  ] = js.undefined
  var onTransportFailure: js.UndefOr[
    js.Function2[
      /* reason */ js.UndefOr[java.lang.String], 
      /* response */ js.UndefOr[Response], 
      scala.Unit
    ]
  ] = js.undefined
  var pollingInterval: js.UndefOr[scala.Double] = js.undefined
  var push: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* dispatchUrl */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var pushLocal: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  var readResponsesHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var readyState: js.UndefOr[scala.Double] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var requestCount: js.UndefOr[scala.Double] = js.undefined
  var rewriteURL: js.UndefOr[scala.Boolean] = js.undefined
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  var subscribe: js.UndefOr[js.Function1[/* options */ Request, scala.Unit]] = js.undefined
  var suspend: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var trackMessageLength: js.UndefOr[scala.Boolean] = js.undefined
  var transport: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var uuid: js.UndefOr[java.lang.String] = js.undefined
  var webSocketBinaryType: js.UndefOr[js.Any] = js.undefined
  var webSocketImpl: js.UndefOr[js.Any] = js.undefined
  var webSocketPathDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var webSocketUrl: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    attachHeadersAsQueryString: js.UndefOr[scala.Boolean] = js.undefined,
    callback: js.Function = null,
    close: js.Function0[scala.Unit] = null,
    connectTimeout: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    data: java.lang.String = null,
    disconnect: js.Function0[scala.Unit] = null,
    dispatchUrl: java.lang.String = null,
    dropHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    enableProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    enableXDR: js.UndefOr[scala.Boolean] = js.undefined,
    execute: js.Function0[scala.Unit] = null,
    executeCallbackBeforeReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackMethod: java.lang.String = null,
    fallbackTransport: java.lang.String = null,
    getUUID: js.Function0[scala.Unit] = null,
    getUrl: js.Function0[java.lang.String] = null,
    headers: js.Any = null,
    lastIndex: scala.Int | scala.Double = null,
    lastTimestamp: scala.Int | scala.Double = null,
    logLevel: java.lang.String = null,
    maxReconnectOnClose: scala.Int | scala.Double = null,
    maxRequest: scala.Int | scala.Double = null,
    maxStreamingLength: scala.Int | scala.Double = null,
    messageDelimiter: java.lang.String = null,
    method: java.lang.String = null,
    onClientTimeout: js.Function1[/* request */ js.UndefOr[Request], scala.Unit] = null,
    onClose: js.Function1[/* response */ js.UndefOr[Response], scala.Unit] = null,
    onError: js.Function1[/* response */ js.UndefOr[Response], scala.Unit] = null,
    onFailureToReconnect: js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit] = null,
    onLocalMessage: js.Function1[/* request */ js.UndefOr[Request], scala.Unit] = null,
    onMessage: js.Function1[/* response */ Response, scala.Unit] = null,
    onMessagePublished: js.Function1[/* response */ js.UndefOr[Response], scala.Unit] = null,
    onOpen: js.Function1[/* response */ js.UndefOr[Response], scala.Unit] = null,
    onReconnect: js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit] = null,
    onReopen: js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], scala.Unit] = null,
    onTransportFailure: js.Function2[
      /* reason */ js.UndefOr[java.lang.String], 
      /* response */ js.UndefOr[Response], 
      scala.Unit
    ] = null,
    pollingInterval: scala.Int | scala.Double = null,
    push: js.Function2[
      /* message */ java.lang.String, 
      /* dispatchUrl */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    pushLocal: js.Function1[/* message */ java.lang.String, scala.Unit] = null,
    readResponsesHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    readyState: scala.Int | scala.Double = null,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectInterval: scala.Int | scala.Double = null,
    requestCount: scala.Int | scala.Double = null,
    rewriteURL: js.UndefOr[scala.Boolean] = js.undefined,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    subscribe: js.Function1[/* options */ Request, scala.Unit] = null,
    suspend: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    trackMessageLength: js.UndefOr[scala.Boolean] = js.undefined,
    transport: java.lang.String = null,
    url: java.lang.String = null,
    uuid: java.lang.String = null,
    webSocketBinaryType: js.Any = null,
    webSocketImpl: js.Any = null,
    webSocketPathDelimiter: java.lang.String = null,
    webSocketUrl: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(attachHeadersAsQueryString)) __obj.updateDynamic("attachHeadersAsQueryString")(attachHeadersAsQueryString)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (close != null) __obj.updateDynamic("close")(close)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (disconnect != null) __obj.updateDynamic("disconnect")(disconnect)
    if (dispatchUrl != null) __obj.updateDynamic("dispatchUrl")(dispatchUrl)
    if (!js.isUndefined(dropHeaders)) __obj.updateDynamic("dropHeaders")(dropHeaders)
    if (!js.isUndefined(enableProtocol)) __obj.updateDynamic("enableProtocol")(enableProtocol)
    if (!js.isUndefined(enableXDR)) __obj.updateDynamic("enableXDR")(enableXDR)
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (!js.isUndefined(executeCallbackBeforeReconnect)) __obj.updateDynamic("executeCallbackBeforeReconnect")(executeCallbackBeforeReconnect)
    if (fallbackMethod != null) __obj.updateDynamic("fallbackMethod")(fallbackMethod)
    if (fallbackTransport != null) __obj.updateDynamic("fallbackTransport")(fallbackTransport)
    if (getUUID != null) __obj.updateDynamic("getUUID")(getUUID)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (lastIndex != null) __obj.updateDynamic("lastIndex")(lastIndex.asInstanceOf[js.Any])
    if (lastTimestamp != null) __obj.updateDynamic("lastTimestamp")(lastTimestamp.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (maxReconnectOnClose != null) __obj.updateDynamic("maxReconnectOnClose")(maxReconnectOnClose.asInstanceOf[js.Any])
    if (maxRequest != null) __obj.updateDynamic("maxRequest")(maxRequest.asInstanceOf[js.Any])
    if (maxStreamingLength != null) __obj.updateDynamic("maxStreamingLength")(maxStreamingLength.asInstanceOf[js.Any])
    if (messageDelimiter != null) __obj.updateDynamic("messageDelimiter")(messageDelimiter)
    if (method != null) __obj.updateDynamic("method")(method)
    if (onClientTimeout != null) __obj.updateDynamic("onClientTimeout")(onClientTimeout)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFailureToReconnect != null) __obj.updateDynamic("onFailureToReconnect")(onFailureToReconnect)
    if (onLocalMessage != null) __obj.updateDynamic("onLocalMessage")(onLocalMessage)
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    if (onMessagePublished != null) __obj.updateDynamic("onMessagePublished")(onMessagePublished)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onReconnect != null) __obj.updateDynamic("onReconnect")(onReconnect)
    if (onReopen != null) __obj.updateDynamic("onReopen")(onReopen)
    if (onTransportFailure != null) __obj.updateDynamic("onTransportFailure")(onTransportFailure)
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push)
    if (pushLocal != null) __obj.updateDynamic("pushLocal")(pushLocal)
    if (!js.isUndefined(readResponsesHeaders)) __obj.updateDynamic("readResponsesHeaders")(readResponsesHeaders)
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (requestCount != null) __obj.updateDynamic("requestCount")(requestCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteURL)) __obj.updateDynamic("rewriteURL")(rewriteURL)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    if (!js.isUndefined(suspend)) __obj.updateDynamic("suspend")(suspend)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMessageLength)) __obj.updateDynamic("trackMessageLength")(trackMessageLength)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    if (webSocketBinaryType != null) __obj.updateDynamic("webSocketBinaryType")(webSocketBinaryType)
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl)
    if (webSocketPathDelimiter != null) __obj.updateDynamic("webSocketPathDelimiter")(webSocketPathDelimiter)
    if (webSocketUrl != null) __obj.updateDynamic("webSocketUrl")(webSocketUrl)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Request]
  }
}

