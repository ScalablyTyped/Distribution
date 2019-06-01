package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  def initCCP(containerDiv: stdLib.HTMLElement, options: InitCCPOptions): scala.Unit
}

object Core {
  @scala.inline
  def apply(initCCP: (stdLib.HTMLElement, InitCCPOptions) => scala.Unit): Core = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP))
  
    __obj.asInstanceOf[Core]
  }
}

