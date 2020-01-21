package typings.atom

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor extends js.Object {
  var newValue: Word | Cursor
  var oldValue: js.UndefOr[Word | Cursor] = js.undefined
}

object AnonCursor {
  @scala.inline
  def apply(newValue: Word | Cursor, oldValue: Word | Cursor = null): AnonCursor = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCursor]
  }
}

