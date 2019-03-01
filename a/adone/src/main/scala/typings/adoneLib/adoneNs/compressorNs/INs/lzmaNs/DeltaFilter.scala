package typings
package adoneLib.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeltaFilter extends js.Object {
  var dist: js.UndefOr[scala.Double] = js.undefined
  var id: adoneLib.adoneLibStrings.LZMA_FILTER_DELTA
}

object DeltaFilter {
  @scala.inline
  def apply(id: adoneLib.adoneLibStrings.LZMA_FILTER_DELTA, dist: scala.Int | scala.Double = null): DeltaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (dist != null) __obj.updateDynamic("dist")(dist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaFilter]
  }
}

