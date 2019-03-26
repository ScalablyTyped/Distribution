package typings
package agDashGridLib.distLibFilterTextFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedTextFilter
  extends agDashGridLib.distLibInterfacesIFilterMod.SerializedFilter {
  var filter: java.lang.String
  var `type`: java.lang.String
}

object SerializedTextFilter {
  @scala.inline
  def apply(filter: java.lang.String, filterType: java.lang.String, `type`: java.lang.String): SerializedTextFilter = {
    val __obj = js.Dynamic.literal(filter = filter, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedTextFilter]
  }
}

