package typings
package adoneLib.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEncoderOptions extends js.Object {
  /**
    * Any of:
    *
    * CHECK_CRC32 (1)
    *
    * CHECK_CRC64 (4)
    *
    * CHECK_NONE (0)
    *
    * CHECK_SHA256 (10)
    */
  var check: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of additional filters
    */
  var filters: js.UndefOr[Filters] = js.undefined
}

object StreamEncoderOptions {
  @scala.inline
  def apply(check: scala.Int | scala.Double = null, filters: Filters = null): StreamEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[StreamEncoderOptions]
  }
}

