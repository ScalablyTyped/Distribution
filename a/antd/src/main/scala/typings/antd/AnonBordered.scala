package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBordered extends js.Object {
  var bordered: Boolean
  var expandIconPosition: String
  var openAnimation: AnonAppear
}

object AnonBordered {
  @scala.inline
  def apply(bordered: Boolean, expandIconPosition: String, openAnimation: AnonAppear): AnonBordered = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], expandIconPosition = expandIconPosition.asInstanceOf[js.Any], openAnimation = openAnimation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBordered]
  }
}

