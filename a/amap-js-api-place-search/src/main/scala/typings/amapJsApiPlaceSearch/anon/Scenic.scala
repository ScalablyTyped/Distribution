package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenic extends js.Object {
  var deep_type: SCENIC
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
}

object Scenic {
  @scala.inline
  def apply(deep_type: SCENIC, scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Scenic = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
}

