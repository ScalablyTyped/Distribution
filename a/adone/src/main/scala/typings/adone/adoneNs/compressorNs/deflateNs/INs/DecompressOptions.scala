package typings.adone.adoneNs.compressorNs.deflateNs.INs

import typings.adone.adoneNs.compressorNs.INs.zlibNs.TypedArray
import typings.node.Buffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressOptions extends DecompressStreamOptions {
  /**
    * If true, returns an object with buffer and engine
    */
  var info: js.UndefOr[Boolean] = js.undefined
}

object DecompressOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: Buffer | DataView | TypedArray = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    info: js.UndefOr[Boolean] = js.undefined,
    windowBits: Int | Double = null
  ): DecompressOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecompressOptions]
  }
}

