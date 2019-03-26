package typings
package agDashGridLib.distLibFilterDateFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedDateFilter
  extends agDashGridLib.distLibInterfacesIFilterMod.SerializedFilter {
  var dateFrom: java.lang.String
  var dateTo: java.lang.String
  var `type`: java.lang.String
}

object SerializedDateFilter {
  @scala.inline
  def apply(
    dateFrom: java.lang.String,
    dateTo: java.lang.String,
    filterType: java.lang.String,
    `type`: java.lang.String
  ): SerializedDateFilter = {
    val __obj = js.Dynamic.literal(dateFrom = dateFrom, dateTo = dateTo, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedDateFilter]
  }
}

