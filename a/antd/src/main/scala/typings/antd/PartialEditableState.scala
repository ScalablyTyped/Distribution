package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/typography/Editable.EditableState> */
trait PartialEditableState extends js.Object {
  var current: js.UndefOr[String] = js.undefined
  var prevValue: js.UndefOr[String] = js.undefined
}

object PartialEditableState {
  @scala.inline
  def apply(current: String = null, prevValue: String = null): PartialEditableState = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEditableState]
  }
}

