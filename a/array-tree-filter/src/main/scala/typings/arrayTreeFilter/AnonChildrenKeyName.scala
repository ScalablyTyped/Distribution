package typings.arrayTreeFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenKeyName extends js.Object {
  var childrenKeyName: js.UndefOr[String] = js.undefined
}

object AnonChildrenKeyName {
  @scala.inline
  def apply(childrenKeyName: String = null): AnonChildrenKeyName = {
    val __obj = js.Dynamic.literal()
    if (childrenKeyName != null) __obj.updateDynamic("childrenKeyName")(childrenKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenKeyName]
  }
}

