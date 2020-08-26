package typings.anyproxy.mod

import typings.anyproxy.anyproxyStrings.http
import typings.anyproxy.anyproxyStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
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
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
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
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setDangerouslyIgnoreUnauthorized(value: Boolean): Self = this.set("dangerouslyIgnoreUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslyIgnoreUnauthorized: Self = this.set("dangerouslyIgnoreUnauthorized", js.undefined)
    @scala.inline
    def setForceProxyHttps(value: Boolean): Self = this.set("forceProxyHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceProxyHttps: Self = this.set("forceProxyHttps", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setRecorder(value: ProxyRecorder): Self = this.set("recorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecorder: Self = this.set("recorder", js.undefined)
    @scala.inline
    def setRule(value: String | RuleModule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setType(value: http | https): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWebInterface(value: WebInterfaceOptions): Self = this.set("webInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebInterface: Self = this.set("webInterface", js.undefined)
    @scala.inline
    def setWsIntercept(value: Boolean): Self = this.set("wsIntercept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWsIntercept: Self = this.set("wsIntercept", js.undefined)
  }
  
}

