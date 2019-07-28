package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptionsFD extends ReadStreamOptions {
  /**
    * Whether to close the file descriptor
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the specified file descriptor for reading instead of `path`
    */
  var fd: Double
}

object ReadStreamOptionsFD {
  @scala.inline
  def apply(
    fd: Double,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    encoding: Encoding = null,
    end: Int | Double = null,
    flags: Flag = null,
    mode: Int | Double = null,
    start: Int | Double = null
  ): ReadStreamOptionsFD = {
    val __obj = js.Dynamic.literal(fd = fd)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadStreamOptionsFD]
  }
}

