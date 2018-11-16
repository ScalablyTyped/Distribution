package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapContext
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 获取当前地图中心的经纬度，返回 gcj02 坐标系的值，可以用于 my.openLocation
  		 *
  		 * @param options
  		 */
  def getCenterLocation(options: GetCenterLocationOptions): scala.Unit
  /**
  		 * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
  		 */
  def moveToLocation(): scala.Unit
}

