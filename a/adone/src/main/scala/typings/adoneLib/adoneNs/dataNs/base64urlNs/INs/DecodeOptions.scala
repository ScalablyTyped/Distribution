package typings
package adoneLib.adoneNs.dataNs.base64urlNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(buffer: js.UndefOr[scala.Boolean] = js.undefined, encoding: java.lang.String = null): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[DecodeOptions]
  }
}

