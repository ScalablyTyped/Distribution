package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core_ extends js.Object {
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit
}

object Core_ {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Unit): Core_ = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP))
    __obj.asInstanceOf[Core_]
  }
}

