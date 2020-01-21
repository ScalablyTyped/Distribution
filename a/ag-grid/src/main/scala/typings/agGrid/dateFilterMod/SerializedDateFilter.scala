package typings.agGrid.dateFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedDateFilter extends SerializedFilter {
  var dateFrom: String
  var dateTo: String
  var `type`: String
}

object SerializedDateFilter {
  @scala.inline
  def apply(dateFrom: String, dateTo: String, filterType: String, `type`: String): SerializedDateFilter = {
    val __obj = js.Dynamic.literal(dateFrom = dateFrom.asInstanceOf[js.Any], dateTo = dateTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedDateFilter]
  }
}

