package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteStreamOptionsFD extends WriteStreamOptions {
  /**
    * Whether to close the file descriptor
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the specified file descriptor for writing instead of `path`
    */
  var fd: Double
}

object WriteStreamOptionsFD {
  @scala.inline
  def apply(
    fd: Double,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: Encoding = null,
    flags: Flag = null,
    mode: Int | Double = null,
    start: Int | Double = null
  ): WriteStreamOptionsFD = {
    val __obj = js.Dynamic.literal(fd = fd)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteStreamOptionsFD]
  }
}

