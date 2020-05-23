package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedCount extends js.Object {
  var selectedCount: Double
  var totalCount: Double
}

object SelectedCount {
  @scala.inline
  def apply(selectedCount: Double, totalCount: Double): SelectedCount = {
    val __obj = js.Dynamic.literal(selectedCount = selectedCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCount]
  }
}

