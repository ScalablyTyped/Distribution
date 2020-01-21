package typings.anyproxy.mod

import typings.anyproxy.anyproxyStrings.http
import typings.anyproxy.anyproxyStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
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
  @scala.inline
  def apply(
    port: String | Double,
    dangerouslyIgnoreUnauthorized: js.UndefOr[Boolean] = js.undefined,
    forceProxyHttps: js.UndefOr[Boolean] = js.undefined,
    hostname: String = null,
    recorder: ProxyRecorder = null,
    rule: String | RuleModule = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    throttle: Int | Double = null,
    `type`: http | https = null,
    webInterface: WebInterfaceOptions = null,
    wsIntercept: js.UndefOr[Boolean] = js.undefined
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslyIgnoreUnauthorized)) __obj.updateDynamic("dangerouslyIgnoreUnauthorized")(dangerouslyIgnoreUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxyHttps)) __obj.updateDynamic("forceProxyHttps")(forceProxyHttps.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webInterface != null) __obj.updateDynamic("webInterface")(webInterface.asInstanceOf[js.Any])
    if (!js.isUndefined(wsIntercept)) __obj.updateDynamic("wsIntercept")(wsIntercept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
}

