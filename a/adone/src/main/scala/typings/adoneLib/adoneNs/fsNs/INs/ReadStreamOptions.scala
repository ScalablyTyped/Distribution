package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends js.Object {
  var encoding: js.UndefOr[Encoding | scala.Null] = js.undefined
  /**
    * Inclusive end of the reading range
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[Flag] = js.undefined
  /**
    * File mode
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Inclusive start of the reading range
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

object ReadStreamOptions {
  @scala.inline
  def apply(
    encoding: Encoding = null,
    end: scala.Int | scala.Double = null,
    flags: Flag = null,
    mode: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

