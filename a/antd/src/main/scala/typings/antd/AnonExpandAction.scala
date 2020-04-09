package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.click
import typings.antd.antdStrings.doubleClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpandAction extends js.Object {
  var expandAction: js.UndefOr[`false` | click | doubleClick] = js.undefined
  var showIcon: Boolean
}

object AnonExpandAction {
  @scala.inline
  def apply(showIcon: Boolean, expandAction: `false` | click | doubleClick = null): AnonExpandAction = {
    val __obj = js.Dynamic.literal(showIcon = showIcon.asInstanceOf[js.Any])
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandAction]
  }
}

