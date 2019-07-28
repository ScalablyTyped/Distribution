package typings.agDashGrid.distLibInterfacesISerializedSetFilterMod

import typings.agDashGrid.distLibInterfacesIFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedSetFilter extends SerializedFilter {
  var values: js.Array[String]
}

object SerializedSetFilter {
  @scala.inline
  def apply(filterType: String, values: js.Array[String]): SerializedSetFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType, values = values)
  
    __obj.asInstanceOf[SerializedSetFilter]
  }
}

