package typings.appBuilderLib.macOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DmgWindow extends js.Object {
  /**
    * The height. Defaults to background image height or 380.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The width. Defaults to background image width or 540.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The X position relative to left of the screen.
    * @default 400
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The Y position relative to bottom of the screen.
    * @default 100
    */
  var y: js.UndefOr[Double] = js.undefined
}

object DmgWindow {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DmgWindow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgWindow]
  }
}

