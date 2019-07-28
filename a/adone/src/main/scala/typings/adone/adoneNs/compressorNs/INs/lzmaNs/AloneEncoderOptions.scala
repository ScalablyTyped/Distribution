package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AloneEncoderOptions extends js.Object {
  /**
    * Maximum uncompressed size of a block in multi-threading mode
    */
  var blockSize: js.UndefOr[Double] = js.undefined
  /**
    * The default size for allocated buffers
    */
  var bufsize: js.UndefOr[Double] = js.undefined
  /**
    * Any of:
    *
    * CHECK_CRC32 (1)
    *
    * CHECK_CRC64 (4)
    *
    * CHECK_NONE (0)
    *
    * CHECK_SHA256 (10)
    */
  var check: js.UndefOr[Double] = js.undefined
  /**
    * An array of additional filters
    */
  var filters: js.UndefOr[Filters] = js.undefined
  /**
    * A bitwise OR of
    * LZMA_TELL_NO_CHECK,
    * LZMA_TELL_UNSUPPORTED_CHECK,
    * LZMA_TELL_ANY_CHECK,
    * LZMA_CONCATENATED
    */
  var flags: js.UndefOr[Double] = js.undefined
  /**
    * A memory limit for (de-)compression in bytes
    */
  var memlimit: js.UndefOr[Double] = js.undefined
  /**
    * A number from 0 to 9, 0 being the fastest and weakest compression, 9 the slowest and highest compression level
    */
  var preset: js.UndefOr[Double] = js.undefined
  /**
    * If true, forces synchronous coding (i.e. no usage of threading)
    */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to an integer to use liblzma’s multi-threading support. 0 will choose the number of CPU cores.
    */
  var threads: js.UndefOr[Double] = js.undefined
  /**
    * 	Timeout for a single encoding operation in multi-threading mode
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AloneEncoderOptions {
  @scala.inline
  def apply(
    blockSize: Int | Double = null,
    bufsize: Int | Double = null,
    check: Int | Double = null,
    filters: Filters = null,
    flags: Int | Double = null,
    memlimit: Int | Double = null,
    preset: Int | Double = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    threads: Int | Double = null,
    timeout: Int | Double = null
  ): AloneEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (bufsize != null) __obj.updateDynamic("bufsize")(bufsize.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AloneEncoderOptions]
  }
}

