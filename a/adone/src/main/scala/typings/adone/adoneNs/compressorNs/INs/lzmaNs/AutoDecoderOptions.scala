package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoDecoderOptions extends js.Object {
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
}

object AutoDecoderOptions {
  @scala.inline
  def apply(flags: Int | Double = null, memlimit: Int | Double = null): AutoDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDecoderOptions]
  }
}

