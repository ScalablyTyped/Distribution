package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var buffer: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  var height: scala.Double
  var src: java.lang.String
  var tileHeight: scala.Double
  var tileWidth: scala.Double
  var viewportH: js.UndefOr[scala.Double] = js.undefined
  var viewportW: js.UndefOr[scala.Double] = js.undefined
  var width: scala.Double
}

object MapOptions {
  @scala.inline
  def apply(
    height: scala.Double,
    src: java.lang.String,
    tileHeight: scala.Double,
    tileWidth: scala.Double,
    width: scala.Double,
    buffer: stdLib.ArrayBuffer = null,
    viewportH: scala.Int | scala.Double = null,
    viewportW: scala.Int | scala.Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("tileHeight")(tileHeight)
    __obj.updateDynamic("tileWidth")(tileWidth)
    __obj.updateDynamic("width")(width)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (viewportH != null) __obj.updateDynamic("viewportH")(viewportH.asInstanceOf[js.Any])
    if (viewportW != null) __obj.updateDynamic("viewportW")(viewportW.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

