package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cinema extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema = js.native
  var deep_type: CINEMA = js.native
}

object Cinema {
  @scala.inline
  def apply(cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema, deep_type: CINEMA): Cinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cinema]
  }
  @scala.inline
  implicit class CinemaOps[Self <: Cinema] (val x: Self) extends AnyVal {
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
    def setCinema(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema): Self = this.set("cinema", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeep_type(value: CINEMA): Self = this.set("deep_type", value.asInstanceOf[js.Any])
  }
  
}

