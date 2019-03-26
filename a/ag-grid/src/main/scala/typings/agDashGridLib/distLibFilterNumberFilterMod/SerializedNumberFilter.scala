package typings
package agDashGridLib.distLibFilterNumberFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedNumberFilter
  extends agDashGridLib.distLibInterfacesIFilterMod.SerializedFilter {
  var filter: scala.Double
  var filterTo: scala.Double
  var `type`: java.lang.String
}

object SerializedNumberFilter {
  @scala.inline
  def apply(
    filter: scala.Double,
    filterTo: scala.Double,
    filterType: java.lang.String,
    `type`: java.lang.String
  ): SerializedNumberFilter = {
    val __obj = js.Dynamic.literal(filter = filter, filterTo = filterTo, filterType = filterType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializedNumberFilter]
  }
}

