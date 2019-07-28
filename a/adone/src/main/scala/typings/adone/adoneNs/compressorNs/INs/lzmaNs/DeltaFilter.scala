package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import typings.adone.adoneStrings.LZMA_FILTER_DELTA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeltaFilter extends js.Object {
  var dist: js.UndefOr[Double] = js.undefined
  var id: LZMA_FILTER_DELTA
}

object DeltaFilter {
  @scala.inline
  def apply(id: LZMA_FILTER_DELTA, dist: Int | Double = null): DeltaFilter = {
    val __obj = js.Dynamic.literal(id = id)
    if (dist != null) __obj.updateDynamic("dist")(dist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaFilter]
  }
}

