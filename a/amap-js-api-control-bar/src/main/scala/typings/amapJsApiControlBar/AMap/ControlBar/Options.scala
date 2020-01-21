package typings.amapJsApiControlBar.AMap.ControlBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 显示位置
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * 是否显示倾斜、旋转按钮
    */
  var showControlButton: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否显示缩放按钮
    */
  var showZoomBar: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    position: Position = null,
    showControlButton: js.UndefOr[Boolean] = js.undefined,
    showZoomBar: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showControlButton)) __obj.updateDynamic("showControlButton")(showControlButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomBar)) __obj.updateDynamic("showZoomBar")(showZoomBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

