package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeeptype extends js.Object {
  var deep_type: SCENIC
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: Scenic
}

object AnonDeeptype {
  @scala.inline
  def apply(deep_type: SCENIC, scenic: Scenic): AnonDeeptype = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeeptype]
  }
}

