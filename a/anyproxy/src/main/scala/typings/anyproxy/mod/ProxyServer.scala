package typings.anyproxy.mod

import typings.anyproxy.anyproxyStrings.error
import typings.anyproxy.anyproxyStrings.ready
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

