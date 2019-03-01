package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteStreamOptions extends js.Object {
  var defaultEncoding: js.UndefOr[Encoding | scala.Null] = js.undefined
  var flags: js.UndefOr[Flag] = js.undefined
  /**
    * File mode
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start position to write data at some position past the beginning of the file
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

object WriteStreamOptions {
  @scala.inline
  def apply(
    defaultEncoding: Encoding = null,
    flags: Flag = null,
    mode: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): WriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteStreamOptions]
  }
}

