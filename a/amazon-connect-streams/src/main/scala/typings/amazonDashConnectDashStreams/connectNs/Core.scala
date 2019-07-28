package typings.amazonDashConnectDashStreams.connectNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit
}

object Core {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Unit): Core = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP))
  
    __obj.asInstanceOf[Core]
  }
}

