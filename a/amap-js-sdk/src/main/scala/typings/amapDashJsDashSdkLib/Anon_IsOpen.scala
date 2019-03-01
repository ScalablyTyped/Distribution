package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOpen extends js.Object {
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var tileLayer: js.UndefOr[js.Array[amapDashJsDashSdkLib.AMapNs.TileLayer]] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsOpen {
  @scala.inline
  def apply(
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    tileLayer: js.Array[amapDashJsDashSdkLib.AMapNs.TileLayer] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IsOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_IsOpen]
  }
}

