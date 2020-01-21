package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 地址的详细说明 */
  var address: String
  /** 纬度 */
  var latitude: Double | String
  /** 经度 */
  var longitude: Double | String
  /** 位置名称 */
  var name: String
  /** 缩放比例，范围 3~19，默认为 15 */
  var scale: js.UndefOr[Double] = js.undefined
}

object OpenLocationOptions {
  @scala.inline
  def apply(
    address: String,
    latitude: Double | String,
    longitude: Double | String,
    name: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    scale: Int | Double = null,
    success: js.Any => Unit = null
  ): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenLocationOptions]
  }
}

