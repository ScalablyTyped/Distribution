package typings
package agDashGridLib.distLibInterfacesISerializedSetFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedSetFilter
  extends agDashGridLib.distLibInterfacesIFilterMod.SerializedFilter {
  var values: js.Array[java.lang.String]
}

object SerializedSetFilter {
  @scala.inline
  def apply(filterType: java.lang.String, values: js.Array[java.lang.String]): SerializedSetFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType, values = values)
  
    __obj.asInstanceOf[SerializedSetFilter]
  }
}

