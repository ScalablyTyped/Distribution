package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueFileEncoding extends js.Object {
  var newValue: atomLib.atomMod.FileEncoding
  var oldValue: js.UndefOr[atomLib.atomMod.FileEncoding] = js.undefined
}

object Anon_NewValueOldValueFileEncoding {
  @scala.inline
  def apply(newValue: atomLib.atomMod.FileEncoding, oldValue: atomLib.atomMod.FileEncoding = null): Anon_NewValueOldValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueFileEncoding]
  }
}

