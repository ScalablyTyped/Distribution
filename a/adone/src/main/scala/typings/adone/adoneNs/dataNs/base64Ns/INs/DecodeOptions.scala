package typings.adone.adoneNs.dataNs.base64Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(buffer: js.UndefOr[Boolean] = js.undefined, encoding: String = null): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[DecodeOptions]
  }
}

