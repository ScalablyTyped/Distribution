package typings.agDashGrid.distLibFilterDateFilterMod

import typings.agDashGrid.distLibInterfacesIFilterMod.SerializedFilter
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
    val __obj = js.Dynamic.literal(dateFrom = dateFrom, dateTo = dateTo, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedDateFilter]
  }
}

