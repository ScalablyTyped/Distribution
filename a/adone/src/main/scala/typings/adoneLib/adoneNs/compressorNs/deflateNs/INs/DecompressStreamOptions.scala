package typings
package adoneLib.adoneNs.compressorNs.deflateNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressStreamOptions
  extends adoneLib.adoneNs.compressorNs.INs.zlibNs.CommonOptions {
  var dictionary: js.UndefOr[
    nodeLib.Buffer | stdLib.DataView | adoneLib.adoneNs.compressorNs.INs.zlibNs.TypedArray
  ] = js.undefined
}

object DecompressStreamOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: nodeLib.Buffer | stdLib.DataView | adoneLib.adoneNs.compressorNs.INs.zlibNs.TypedArray = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): DecompressStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecompressStreamOptions]
  }
}

