package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapType extends MapControl

object MapType {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): MapType = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[MapType]
  }
}

