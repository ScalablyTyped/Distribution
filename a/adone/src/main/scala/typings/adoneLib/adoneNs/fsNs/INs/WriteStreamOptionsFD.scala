package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteStreamOptionsFD extends WriteStreamOptions {
  /**
    * Whether to close the file descriptor
    */
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use the specified file descriptor for writing instead of `path`
    */
  var fd: scala.Double
}

object WriteStreamOptionsFD {
  @scala.inline
  def apply(
    fd: scala.Double,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: Encoding = null,
    flags: Flag = null,
    mode: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
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

