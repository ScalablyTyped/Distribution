package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  var initialized: Boolean
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit
  def terminate(): Unit
}

object Core {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Unit, initialized: Boolean, terminate: () => Unit): Core = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP), initialized = initialized.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Core]
  }
}

