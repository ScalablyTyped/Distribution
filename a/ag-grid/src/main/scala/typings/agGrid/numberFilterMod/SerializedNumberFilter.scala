package typings.agGrid.numberFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedNumberFilter extends SerializedFilter {
  var filter: Double
  var filterTo: Double
  var `type`: String
}

object SerializedNumberFilter {
  @scala.inline
  def apply(filter: Double, filterTo: Double, filterType: String, `type`: String): SerializedNumberFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterTo = filterTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedNumberFilter]
  }
}

