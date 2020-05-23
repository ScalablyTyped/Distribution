package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Poi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[Poi]
  var id: String
  var index: Double
}

object Data {
  @scala.inline
  def apply(data: js.Array[Poi], id: String, index: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

