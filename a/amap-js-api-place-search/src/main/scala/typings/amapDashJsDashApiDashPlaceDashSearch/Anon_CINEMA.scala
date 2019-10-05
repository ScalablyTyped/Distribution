package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.Cinema
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CINEMA extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: Cinema
  var deep_type: CINEMA
}

object Anon_CINEMA {
  @scala.inline
  def apply(cinema: Cinema, deep_type: CINEMA): Anon_CINEMA = {
    val __obj = js.Dynamic.literal(cinema = cinema, deep_type = deep_type)
  
    __obj.asInstanceOf[Anon_CINEMA]
  }
}

