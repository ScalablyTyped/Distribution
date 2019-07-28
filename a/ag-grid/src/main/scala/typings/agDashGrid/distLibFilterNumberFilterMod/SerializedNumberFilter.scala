package typings.agDashGrid.distLibFilterNumberFilterMod

import typings.agDashGrid.distLibInterfacesIFilterMod.SerializedFilter
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
    val __obj = js.Dynamic.literal(filter = filter, filterTo = filterTo, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedNumberFilter]
  }
}

