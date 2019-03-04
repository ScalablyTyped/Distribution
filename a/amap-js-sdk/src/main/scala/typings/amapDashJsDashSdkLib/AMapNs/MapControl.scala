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
  def apply(hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): MapControl = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[MapControl]
  }
}

