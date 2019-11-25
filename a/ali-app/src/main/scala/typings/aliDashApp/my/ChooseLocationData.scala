package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseLocationData extends js.Object {
  /**
  		 * 详细地址
  		 */
  var address: String
  /**
  		 * 纬度，浮点数，范围为-90~90，负数表示南纬
  		 */
  var latitude: Double
  /**
  		 * 经度，浮点数，范围为-180~180，负数表示西经
  		 */
  var longitude: Double
  /**
  		 * 位置名称
  		 */
  var name: String
}

object ChooseLocationData {
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, name: String): ChooseLocationData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChooseLocationData]
  }
}

