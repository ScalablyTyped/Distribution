package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsOpen extends js.Object {
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var tileLayer: js.UndefOr[js.Array[TileLayer]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IsOpen {
  @scala.inline
  def apply(
    isOpen: js.UndefOr[Boolean] = js.undefined,
    tileLayer: js.Array[TileLayer] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IsOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpen]
  }
}

