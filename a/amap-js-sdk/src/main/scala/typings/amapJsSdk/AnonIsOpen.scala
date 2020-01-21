package typings.amapJsSdk

import typings.amapJsSdk.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsOpen extends js.Object {
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var tileLayer: js.UndefOr[js.Array[TileLayer]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonIsOpen {
  @scala.inline
  def apply(
    isOpen: js.UndefOr[Boolean] = js.undefined,
    tileLayer: js.Array[TileLayer] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonIsOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsOpen]
  }
}

