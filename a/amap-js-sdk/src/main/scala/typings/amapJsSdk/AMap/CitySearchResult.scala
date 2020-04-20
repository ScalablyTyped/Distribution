package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitySearchResult]
  }
}

