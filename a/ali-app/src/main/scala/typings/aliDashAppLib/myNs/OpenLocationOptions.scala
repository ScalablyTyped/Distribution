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

object OpenLocationOptions {
  @scala.inline
  def apply(
    address: java.lang.String,
    latitude: scala.Double | java.lang.String,
    longitude: scala.Double | java.lang.String,
    name: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    scale: scala.Int | scala.Double = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(address = address, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenLocationOptions]
  }
}

