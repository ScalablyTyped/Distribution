package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectedCount extends js.Object {
  var selectedCount: Double
  var totalCount: Double
}

object AnonSelectedCount {
  @scala.inline
  def apply(selectedCount: Double, totalCount: Double): AnonSelectedCount = {
    val __obj = js.Dynamic.literal(selectedCount = selectedCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedCount]
  }
}

