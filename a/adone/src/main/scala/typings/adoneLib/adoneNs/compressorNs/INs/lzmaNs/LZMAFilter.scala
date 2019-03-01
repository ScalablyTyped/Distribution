package typings
package adoneLib.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LZMAFilter extends js.Object {
  /**
    * Specify  the  maximum  search  depth in the match finder.
    * The default is the special value of 0, which makes the
    * compressor determine a reasonable depth from mf and nice.
    *
    * Reasonable depth for Hash Chains is 4-100 and 16-1000 for Binary Trees.
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Dictionary size indicates how many bytes of the recently processed
    * uncompressed data is kept in memory.
    */
  var dict_size: js.UndefOr[scala.Double] = js.undefined
  var id: adoneLib.adoneLibStrings.LZMA_FILTER_LZMA1 | adoneLib.adoneLibStrings.LZMA_FILTER_LZMA2
  /**
    * The number of literal context bits.
    * From 0 to 4.
    * Default is 3.
    * In addition, the sum of lc and lp must not exceed 4.
    */
  var lc: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of literal position bits.
    * From 0 to 4.
    * Default is 0.
    * In addition, the sum of lc and lp must not exceed 4.
    */
  var lp: js.UndefOr[scala.Double] = js.undefined
  /**
    * Match finder has major effect on both speed and compression ratio.
    * Usually hash chains are faster than binary trees.
    *
    * MF_HC3 - 3
    *
    * MF_HC4 - 4
    *
    * MF_BT2 - 18
    *
    * MF_BT3 - 19
    *
    * MF_BT4 - 201
    *
    */
  var mf: js.UndefOr[scala.Double] = js.undefined
  /**
    * Compression mode
    *
    * lzma.MODE_FAST - 1
    *
    * lzma.MODE_NORMAL - 2
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify what is considered to be a nice length for a match.
    * Once a match of at least nice bytes is found, the algorithm stops looking for possibly better matches.
    * From 2 to 273.
    * Default is 64.
    */
  var nice_len: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of position bits.
    * From 0 to 4.
    * Default is 2.
    */
  var pb: js.UndefOr[scala.Double] = js.undefined
  /**
    * A number from 0 to 9, 0 being the fastest and weakest compression,
    * 9 the slowest and highest compression level
    */
  var preset: js.UndefOr[scala.Double] = js.undefined
}

object LZMAFilter {
  @scala.inline
  def apply(
    id: adoneLib.adoneLibStrings.LZMA_FILTER_LZMA1 | adoneLib.adoneLibStrings.LZMA_FILTER_LZMA2,
    depth: scala.Int | scala.Double = null,
    dict_size: scala.Int | scala.Double = null,
    lc: scala.Int | scala.Double = null,
    lp: scala.Int | scala.Double = null,
    mf: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    nice_len: scala.Int | scala.Double = null,
    pb: scala.Int | scala.Double = null,
    preset: scala.Int | scala.Double = null
  ): LZMAFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (dict_size != null) __obj.updateDynamic("dict_size")(dict_size.asInstanceOf[js.Any])
    if (lc != null) __obj.updateDynamic("lc")(lc.asInstanceOf[js.Any])
    if (lp != null) __obj.updateDynamic("lp")(lp.asInstanceOf[js.Any])
    if (mf != null) __obj.updateDynamic("mf")(mf.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nice_len != null) __obj.updateDynamic("nice_len")(nice_len.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LZMAFilter]
  }
}

