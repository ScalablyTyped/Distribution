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
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DmgWindow = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgWindow]
  }
}

