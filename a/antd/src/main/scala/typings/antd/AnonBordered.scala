package typings.antd

import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBordered extends js.Object {
  var bordered: Boolean
  var expandIconPosition: js.UndefOr[left | right] = js.undefined
}

object AnonBordered {
  @scala.inline
  def apply(bordered: Boolean, expandIconPosition: left | right = null): AnonBordered = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any])
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBordered]
  }
}

