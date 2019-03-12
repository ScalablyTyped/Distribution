package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControl extends js.Object {
  def hide(): scala.Unit
  def show(): scala.Unit
}

object MapControl {
  @scala.inline
  def apply(hide: () => scala.Unit, show: () => scala.Unit): MapControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[MapControl]
  }
}

