package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawDecoderOptions extends js.Object {
  /**
    * An array of additional filters
    */
  var filters: js.UndefOr[Filters] = js.undefined
}

object RawDecoderOptions {
  @scala.inline
  def apply(filters: Filters = null): RawDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[RawDecoderOptions]
  }
}

