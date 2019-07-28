package typings.agDashGrid.distLibFilterTextFilterMod

import typings.agDashGrid.distLibInterfacesIFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedTextFilter extends SerializedFilter {
  var filter: String
  var `type`: String
}

object SerializedTextFilter {
  @scala.inline
  def apply(filter: String, filterType: String, `type`: String): SerializedTextFilter = {
    val __obj = js.Dynamic.literal(filter = filter, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedTextFilter]
  }
}

