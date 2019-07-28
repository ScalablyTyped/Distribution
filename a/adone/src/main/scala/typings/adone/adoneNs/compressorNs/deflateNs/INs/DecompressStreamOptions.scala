package typings.adone.adoneNs.compressorNs.deflateNs.INs

import typings.adone.adoneNs.compressorNs.INs.zlibNs.CommonOptions
import typings.adone.adoneNs.compressorNs.INs.zlibNs.TypedArray
import typings.node.Buffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressStreamOptions extends CommonOptions {
  var dictionary: js.UndefOr[Buffer | DataView | TypedArray] = js.undefined
}

object DecompressStreamOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: Buffer | DataView | TypedArray = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    windowBits: Int | Double = null
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

