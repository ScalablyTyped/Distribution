package typings.amapDashJsDashApiDashRiding.AMap.Riding

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.end
import typings.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  /**
    * 坐标
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
  /**
    * 类型
    */
  var `type`: start | end
}

object Poi {
  @scala.inline
  def apply(location: LngLat, name: String, `type`: start | end): Poi = {
    val __obj = js.Dynamic.literal(location = location, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
}

