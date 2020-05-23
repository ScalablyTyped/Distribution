package typings.athenajs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var buffer: js.UndefOr[ArrayBuffer] = js.undefined
  var height: Double
  var src: String
  var tileHeight: Double
  var tileWidth: Double
  var viewportH: js.UndefOr[Double] = js.undefined
  var viewportW: js.UndefOr[Double] = js.undefined
  var width: Double
}

object MapOptions {
  @scala.inline
  def apply(
    height: Double,
    src: String,
    tileHeight: Double,
    tileWidth: Double,
    width: Double,
    buffer: ArrayBuffer = null,
    viewportH: js.UndefOr[Double] = js.undefined,
    viewportW: js.UndefOr[Double] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportH)) __obj.updateDynamic("viewportH")(viewportH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportW)) __obj.updateDynamic("viewportW")(viewportW.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

