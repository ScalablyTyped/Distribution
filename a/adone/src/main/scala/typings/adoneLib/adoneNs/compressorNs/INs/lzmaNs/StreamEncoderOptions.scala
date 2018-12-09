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

