package typings.adone.adoneNs.mathNs.INs.BigNumberNs

import typings.adone.adoneNumbers.`-1`
import typings.adone.adoneNumbers.`1`
import typings.adone.adoneStrings.auto
import typings.adone.adoneStrings.big
import typings.adone.adoneStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferConvertOptions extends js.Object {
  var endian: js.UndefOr[`1` | `-1` | big | little] = js.undefined
  var size: js.UndefOr[auto | Double] = js.undefined
}

object BufferConvertOptions {
  @scala.inline
  def apply(endian: `1` | `-1` | big | little = null, size: auto | Double = null): BufferConvertOptions = {
    val __obj = js.Dynamic.literal()
    if (endian != null) __obj.updateDynamic("endian")(endian.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferConvertOptions]
  }
}

