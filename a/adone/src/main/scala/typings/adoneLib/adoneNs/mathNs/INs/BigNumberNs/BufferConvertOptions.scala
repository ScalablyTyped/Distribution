package typings
package adoneLib.adoneNs.mathNs.INs.BigNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferConvertOptions extends js.Object {
  var endian: js.UndefOr[
    adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`-1` | adoneLib.adoneLibStrings.big | adoneLib.adoneLibStrings.little
  ] = js.undefined
  var size: js.UndefOr[adoneLib.adoneLibStrings.auto | scala.Double] = js.undefined
}

object BufferConvertOptions {
  @scala.inline
  def apply(
    endian: adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`-1` | adoneLib.adoneLibStrings.big | adoneLib.adoneLibStrings.little = null,
    size: adoneLib.adoneLibStrings.auto | scala.Double = null
  ): BufferConvertOptions = {
    val __obj = js.Dynamic.literal()
    if (endian != null) __obj.updateDynamic("endian")(endian.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferConvertOptions]
  }
}

