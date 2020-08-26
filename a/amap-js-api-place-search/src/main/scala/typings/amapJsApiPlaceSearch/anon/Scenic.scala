package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scenic extends js.Object {
  var deep_type: SCENIC = js.native
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic = js.native
}

object Scenic {
  @scala.inline
  def apply(deep_type: SCENIC, scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Scenic = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
  @scala.inline
  implicit class ScenicOps[Self <: Scenic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeep_type(value: SCENIC): Self = this.set("deep_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenic(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Self = this.set("scenic", value.asInstanceOf[js.Any])
  }
  
}

