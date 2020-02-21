package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stop extends js.Object {
  /**
    * 公交站点ID
    */
  var id: String
  /**
    * 站点经纬度信息
    */
  var location: LngLat
  /**
    * 公交站点名称
    */
  var name: String
  var segment: js.UndefOr[TransitSegment] = js.undefined
}

object Stop {
  @scala.inline
  def apply(id: String, location: LngLat, name: String, segment: TransitSegment = null): Stop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stop]
  }
}

