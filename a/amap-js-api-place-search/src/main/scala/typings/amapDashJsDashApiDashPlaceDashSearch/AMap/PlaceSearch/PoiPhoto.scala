package typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

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
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PoiPhoto]
  }
}

