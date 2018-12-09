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

