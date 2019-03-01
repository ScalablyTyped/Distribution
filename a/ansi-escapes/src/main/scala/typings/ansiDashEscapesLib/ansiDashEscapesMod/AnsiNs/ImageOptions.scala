package typings
package ansiDashEscapesLib.ansiDashEscapesMod.AnsiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

