package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlag extends js.Object {
  var encoding: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Encoding] = js.undefined
  var flag: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Flag] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EncodingFlag {
  @scala.inline
  def apply(
    encoding: adoneLib.adoneNs.fsNs.INs.Encoding = null,
    flag: adoneLib.adoneNs.fsNs.INs.Flag = null,
    mode: scala.Int | scala.Double = null
  ): Anon_EncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlag]
  }
}

