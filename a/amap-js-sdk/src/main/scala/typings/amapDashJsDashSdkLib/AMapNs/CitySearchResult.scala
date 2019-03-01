package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitySearchResult extends js.Object {
  var bounds: Bounds
  var city: java.lang.String
}

object CitySearchResult {
  @scala.inline
  def apply(bounds: Bounds, city: java.lang.String): CitySearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("city")(city)
    __obj.asInstanceOf[CitySearchResult]
  }
}

