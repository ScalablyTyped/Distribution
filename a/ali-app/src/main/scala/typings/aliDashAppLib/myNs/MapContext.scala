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

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: js.Function1[GetCenterLocationOptions, scala.Unit],
    moveToLocation: js.Function0[scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = getCenterLocation, moveToLocation = moveToLocation)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[MapContext]
  }
}

