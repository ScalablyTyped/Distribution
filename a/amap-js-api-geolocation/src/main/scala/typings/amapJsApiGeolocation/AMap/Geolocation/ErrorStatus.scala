package typings.amapJsApiGeolocation.AMap.Geolocation

import typings.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorStatus extends js.Object {
  /**
    * 错误信息
    */
  var info: String
  /**
    * 造成定位失败结果的一些有用信息
    */
  var message: String
  /**
    * 状态码
    */
  var status: `0`
}

object ErrorStatus {
  @scala.inline
  def apply(info: String, message: String, status: `0`): ErrorStatus = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorStatus]
  }
}

