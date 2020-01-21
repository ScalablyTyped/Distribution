package typings.agGrid.textFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
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
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedTextFilter]
  }
}

