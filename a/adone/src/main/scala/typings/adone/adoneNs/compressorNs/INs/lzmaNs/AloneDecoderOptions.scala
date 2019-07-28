package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AloneDecoderOptions extends js.Object {
  /**
    * A memory limit for (de-)compression in bytes
    */
  var memlimit: js.UndefOr[Double] = js.undefined
}

object AloneDecoderOptions {
  @scala.inline
  def apply(memlimit: Int | Double = null): AloneDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AloneDecoderOptions]
  }
}

