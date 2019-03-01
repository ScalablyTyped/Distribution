package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileOptions extends js.Object {
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[scala.Null | Encoding] = js.undefined
  var flags: js.UndefOr[Flag] = js.undefined
}

object ReadFileOptions {
  @scala.inline
  def apply(check: js.UndefOr[scala.Boolean] = js.undefined, encoding: Encoding = null, flags: Flag = null): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[ReadFileOptions]
  }
}

