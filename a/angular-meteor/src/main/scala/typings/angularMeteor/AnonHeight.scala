package typings.angularMeteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHeight {
  @scala.inline
  def apply(height: Int | Double = null, quality: Int | Double = null, width: Int | Double = null): AnonHeight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

