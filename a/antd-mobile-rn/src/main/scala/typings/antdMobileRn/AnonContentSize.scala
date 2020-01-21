package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentSize extends js.Object {
  var contentSize: AnonHeightWidth
  var eventCount: Double
  var target: Double
  var text: String
}

object AnonContentSize {
  @scala.inline
  def apply(contentSize: AnonHeightWidth, eventCount: Double, target: Double, text: String): AnonContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentSize]
  }
}

