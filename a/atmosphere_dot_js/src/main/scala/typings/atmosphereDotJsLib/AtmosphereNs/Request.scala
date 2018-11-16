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

