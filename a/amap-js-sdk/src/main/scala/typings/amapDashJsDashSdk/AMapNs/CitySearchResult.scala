package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitySearchResult extends js.Object {
  var bounds: Bounds
  var city: String
}

object CitySearchResult {
  @scala.inline
  def apply(bounds: Bounds, city: String): CitySearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, city = city)
  
    __obj.asInstanceOf[CitySearchResult]
  }
}

