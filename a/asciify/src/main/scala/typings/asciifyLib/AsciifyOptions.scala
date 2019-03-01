package typings
package asciifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsciifyOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
}

object AsciifyOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null
  ): AsciifyOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsciifyOptions]
  }
}

