package typings
package adoneLib.adoneNs.compressorNs.INs.zlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressStreamOptions extends CommonOptions {
  /**
    * The compression level must be Z_DEFAULT_COMPRESSION, or between 0 and 9:
    * 1 gives best speed,
    * 9 gives best compression,
    * 0 gives no compression at all (the input data is simply copied a block at a time).
    * Z_DEFAULT_COMPRESSION requests a default compromise between speed and compression (currently equivalent to level 6)
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    * How much memory should be allocated for the internal compression state
    *
    * memLevel=1 uses minimum memory but is slow and reduces compression ratio
    *
    * memLevel=9 uses maximum memory for optimal speed
    */
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Used to tune the compression algorithm.
    *
    * Use the value Z_DEFAULT_STRATEGY for normal data,
    * Z_FILTERED for data produced by a filter (or predictor),
    * Z_HUFFMAN_ONLY to force Huffman encoding only (no string match),
    * or Z_RLE to limit match distances to one (run-length encoding).
    */
  var strategy: js.UndefOr[scala.Double] = js.undefined
}

object CompressStreamOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): CompressStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressStreamOptions]
  }
}

