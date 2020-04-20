package typings.agGrid.iSerializedSetFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedSetFilter extends SerializedFilter {
  var values: js.Array[String]
}

object SerializedSetFilter {
  @scala.inline
  def apply(filterType: String, values: js.Array[String]): SerializedSetFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedSetFilter]
  }
}

