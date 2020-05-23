package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale
  extends EventBindable
     with MapControl {
  var offset: Pixel
  var position: String
}

object Scale {
  @scala.inline
  def apply(
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    offset: Pixel,
    on: (String, EventCallback) => Unit,
    position: String,
    show: () => Unit
  ): Scale = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), offset = offset.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), position = position.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Scale]
  }
}

