package typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoiPhoto extends js.Object {
  /**
    * 图片名称
    */
  var title: String
  /**
    * 图片url
    */
  var url: String
}

object PoiPhoto {
  @scala.inline
  def apply(title: String, url: String): PoiPhoto = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[PoiPhoto]
  }
}

