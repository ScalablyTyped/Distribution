package typings.adone.adoneNs.dataNs.base64Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var buffer: js.UndefOr[Boolean] = js.undefined
}

object EncodeOptions {
  @scala.inline
  def apply(buffer: js.UndefOr[Boolean] = js.undefined): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    __obj.asInstanceOf[EncodeOptions]
  }
}

