package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOpen extends js.Object {
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var tileLayer: js.UndefOr[js.Array[TileLayer]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsOpen {
  @scala.inline
  def apply(
    isOpen: js.UndefOr[Boolean] = js.undefined,
    tileLayer: js.Array[TileLayer] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsOpen]
  }
}

