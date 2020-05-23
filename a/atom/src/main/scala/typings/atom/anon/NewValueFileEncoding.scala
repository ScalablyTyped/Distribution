package typings.atom.anon

import typings.atom.mod.FileEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueFileEncoding extends js.Object {
  var newValue: FileEncoding
  var oldValue: js.UndefOr[FileEncoding] = js.undefined
}

object NewValueFileEncoding {
  @scala.inline
  def apply(newValue: FileEncoding, oldValue: FileEncoding = null): NewValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueFileEncoding]
  }
}

