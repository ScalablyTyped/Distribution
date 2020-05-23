package typings.arrayTreeFilter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenKeyName extends js.Object {
  var childrenKeyName: js.UndefOr[String] = js.undefined
}

object ChildrenKeyName {
  @scala.inline
  def apply(childrenKeyName: String = null): ChildrenKeyName = {
    val __obj = js.Dynamic.literal()
    if (childrenKeyName != null) __obj.updateDynamic("childrenKeyName")(childrenKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenKeyName]
  }
}

