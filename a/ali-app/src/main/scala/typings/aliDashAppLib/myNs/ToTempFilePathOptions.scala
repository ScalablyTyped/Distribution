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

