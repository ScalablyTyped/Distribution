package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScenic extends js.Object {
  var deep_type: SCENIC
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: Scenic
}

object AnonScenic {
  @scala.inline
  def apply(deep_type: SCENIC, scenic: Scenic): AnonScenic = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScenic]
  }
}

