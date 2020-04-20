package typings.agGrid.iFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedFilter extends js.Object {
  var filterType: String
}

object SerializedFilter {
  @scala.inline
  def apply(filterType: String): SerializedFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedFilter]
  }
}

