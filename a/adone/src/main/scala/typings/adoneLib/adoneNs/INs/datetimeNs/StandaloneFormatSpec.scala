package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandaloneFormatSpec extends js.Object {
  var format: js.Array[java.lang.String]
  var isFormat: js.UndefOr[stdLib.RegExp] = js.undefined
  var standalone: js.Array[java.lang.String]
}

object StandaloneFormatSpec {
  @scala.inline
  def apply(
    format: js.Array[java.lang.String],
    standalone: js.Array[java.lang.String],
    isFormat: stdLib.RegExp = null
  ): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("standalone")(standalone)
    if (isFormat != null) __obj.updateDynamic("isFormat")(isFormat)
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
}

