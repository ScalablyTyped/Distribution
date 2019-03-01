package typings
package adoneLib.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEncoderOptions extends js.Object {
  /**
    * An array of additional filters
    */
  var filters: js.UndefOr[Filters] = js.undefined
}

object RawEncoderOptions {
  @scala.inline
  def apply(filters: Filters = null): RawEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[RawEncoderOptions]
  }
}

