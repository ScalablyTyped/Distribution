package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
}

object AnonDirection {
  @scala.inline
  def apply(direction: String = null): AnonDirection = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

