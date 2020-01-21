package typings.atom

import typings.atom.mod.FileEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueOldValueFileEncoding extends js.Object {
  var newValue: FileEncoding
  var oldValue: js.UndefOr[FileEncoding] = js.undefined
}

object AnonNewValueOldValueFileEncoding {
  @scala.inline
  def apply(newValue: FileEncoding, oldValue: FileEncoding = null): AnonNewValueOldValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueOldValueFileEncoding]
  }
}

