package typings
package adoneLib.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EasyEncoderOptions extends js.Object {
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
    * A number from 0 to 9, 0 being the fastest and weakest compression, 9 the slowest and highest compression level
    */
  var preset: js.UndefOr[scala.Double] = js.undefined
}

object EasyEncoderOptions {
  @scala.inline
  def apply(check: scala.Int | scala.Double = null, preset: scala.Int | scala.Double = null): EasyEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasyEncoderOptions]
  }
}

