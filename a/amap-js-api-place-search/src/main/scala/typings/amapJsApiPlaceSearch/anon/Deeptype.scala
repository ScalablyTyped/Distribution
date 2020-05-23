package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Dining
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.DINING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deeptype extends js.Object {
  var deep_type: DINING
  /**
    * @deprecated 餐饮类深度信息
    */
  var dining: Dining
}

object Deeptype {
  @scala.inline
  def apply(deep_type: DINING, dining: Dining): Deeptype = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], dining = dining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeptype]
  }
}

