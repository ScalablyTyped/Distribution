package typings.atom

import typings.atom.atomMod.FileEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueFileEncoding extends js.Object {
  var newValue: FileEncoding
  var oldValue: js.UndefOr[FileEncoding] = js.undefined
}

object Anon_NewValueOldValueFileEncoding {
  @scala.inline
  def apply(newValue: FileEncoding, oldValue: FileEncoding = null): Anon_NewValueOldValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueFileEncoding]
  }
}

