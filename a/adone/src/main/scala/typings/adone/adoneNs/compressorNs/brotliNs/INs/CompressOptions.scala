package typings.adone.adoneNs.compressorNs.brotliNs.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /**
    * A custom dictionary
    */
  var dictionary: js.UndefOr[Buffer] = js.undefined
  /**
    * Flag that affects usage of "literal context modeling" format feature.
    * This flag is a "decoding-speed vs compression ratio" trade-off.
    */
  var disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined
  /**
    * Recommended input block size.
    * Encoder may reduce this value, e.g. if input is much smaller than input block size.
    * Bigger input block size allows better compression, but consumes more memory.
    * From 16 to 24.
    */
  var lgblock: js.UndefOr[Double] = js.undefined
  /**
    * Recommended sliding LZ77 window size.
    * Encoder may reduce this value, e.g. if input is much smaller than window size.
    * Window size is (1 << value) - 16.
    * From 10 to 24.
    *
    * Default is 22.
    */
  var lgwin: js.UndefOr[Double] = js.undefined
  /**
    * Tune encoder for specific input.
    *
    * 0 - Generic mode, compressor does not know anything in advance about the properties of the input.
    *
    * 1 - Text mode, compression mode for UTF-8 formatted text input.
    *
    * 2 - Font, compression mode used in WOFF 2.0.
    *
    * Default is 0.
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * The main compression speed-density lever.
    * The higher the quality, the slower the compression.
    * From 0 to 11.
    *
    * Default is 11.
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Estimated total input size for all BrotliEncoderCompressStream calls.
    *
    * Automatically set for `compress` and `compressSync` to the input buffer length
    */
  var size_hint: js.UndefOr[Double] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    dictionary: Buffer = null,
    disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined,
    lgblock: Int | Double = null,
    lgwin: Int | Double = null,
    mode: Int | Double = null,
    quality: Int | Double = null,
    size_hint: Int | Double = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (!js.isUndefined(disable_literal_context_modeling)) __obj.updateDynamic("disable_literal_context_modeling")(disable_literal_context_modeling)
    if (lgblock != null) __obj.updateDynamic("lgblock")(lgblock.asInstanceOf[js.Any])
    if (lgwin != null) __obj.updateDynamic("lgwin")(lgwin.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (size_hint != null) __obj.updateDynamic("size_hint")(size_hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

