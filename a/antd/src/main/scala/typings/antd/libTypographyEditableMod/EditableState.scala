package typings.antd.libTypographyEditableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableState extends js.Object {
  var current: String
  var prevValue: js.UndefOr[String] = js.undefined
}

object EditableState {
  @scala.inline
  def apply(current: String, prevValue: String = null): EditableState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableState]
  }
}

