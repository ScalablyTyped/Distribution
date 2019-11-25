package typings.amapDashJsDashApi.AMap.convertFrom

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * 成功状态文字描述
    */
  var info: String
   // 'ok'
  /**
    * 高德坐标集合
    */
  var locations: js.Array[LngLat]
}

object Result {
  @scala.inline
  def apply(info: String, locations: js.Array[LngLat]): Result = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

