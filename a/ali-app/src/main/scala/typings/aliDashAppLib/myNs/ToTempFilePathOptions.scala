package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 画布 https://docs.alipay.com/mini/api/ui-canvas
trait ToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 输出的图片宽度，默认为 width
  var destHeight: scala.Double
  		// 画布高度，默认为 canvas 高度 - y
  var destWidth: scala.Double
  		// 画布宽度，默认为 canvas 宽度 - x
  var height: scala.Double
  			// 画布 y 轴起点，默认为 0
  var width: scala.Double
  var x: scala.Double
  			// 画布 x 轴起点，默认为 0
  var y: scala.Double
}

object ToTempFilePathOptions {
  @scala.inline
  def apply(
    destHeight: scala.Double,
    destWidth: scala.Double,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): ToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(destHeight = destHeight, destWidth = destWidth, height = height, width = width, x = x, y = y)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ToTempFilePathOptions]
  }
}

