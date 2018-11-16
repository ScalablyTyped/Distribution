package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 地址的详细说明 */
  var address: java.lang.String
  /** 纬度 */
  var latitude: scala.Double | java.lang.String
  /** 经度 */
  var longitude: scala.Double | java.lang.String
  /** 位置名称 */
  var name: java.lang.String
  /** 缩放比例，范围 3~19，默认为 15 */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

