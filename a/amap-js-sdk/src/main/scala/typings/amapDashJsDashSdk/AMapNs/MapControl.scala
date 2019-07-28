package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControl extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object MapControl {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): MapControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[MapControl]
  }
}

