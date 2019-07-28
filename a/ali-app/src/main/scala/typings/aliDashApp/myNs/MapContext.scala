package typings.aliDashApp.myNs

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
  def getCenterLocation(options: GetCenterLocationOptions): Unit
  /**
  		 * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
  		 */
  def moveToLocation(): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationOptions => Unit,
    moveToLocation: () => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), moveToLocation = js.Any.fromFunction0(moveToLocation))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MapContext]
  }
}

