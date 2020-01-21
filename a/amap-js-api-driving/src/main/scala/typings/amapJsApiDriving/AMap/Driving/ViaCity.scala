package typings.amapJsApiDriving.AMap.Driving

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaCity extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 途径行政区列表
    */
  var districts: js.Array[District]
  /**
    * 途径名称
    */
  var name: String
}

object ViaCity {
  @scala.inline
  def apply(adcode: String, citycode: String, districts: js.Array[District], name: String): ViaCity = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districts = districts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViaCity]
  }
}

