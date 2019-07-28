package typings.adone

import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.adone.adoneNs.fsNs.INs.Flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlag extends js.Object {
  var encoding: js.UndefOr[Encoding] = js.undefined
  var flag: js.UndefOr[Flag] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Anon_EncodingFlag {
  @scala.inline
  def apply(encoding: Encoding = null, flag: Flag = null, mode: Int | Double = null): Anon_EncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlag]
  }
}

