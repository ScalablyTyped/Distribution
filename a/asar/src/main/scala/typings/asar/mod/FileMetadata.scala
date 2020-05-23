package typings.asar.mod

import typings.asar.asarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asar.asar.EntryMetadata & {  executable ? :true,   offset ? :number,   size ? :number} */
trait FileMetadata extends Metadata {
  var executable: js.UndefOr[`true`] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var unpacked: Boolean
}

object FileMetadata {
  @scala.inline
  def apply(
    unpacked: Boolean,
    executable: `true` = null,
    offset: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): FileMetadata = {
    val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
    if (executable != null) __obj.updateDynamic("executable")(executable.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMetadata]
  }
}

