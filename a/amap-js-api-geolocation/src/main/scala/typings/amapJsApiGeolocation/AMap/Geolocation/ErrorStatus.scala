package typings.amapJsApiGeolocation.AMap.Geolocation

import typings.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorStatus extends js.Object {
  
  /**
    * 错误信息
    */
  var info: String = js.native
  
  /**
    * 造成定位失败结果的一些有用信息
    */
  var message: String = js.native
  
  /**
    * 状态码
    */
  var status: `0` = js.native
}
object ErrorStatus {
  
  @scala.inline
  def apply(info: String, message: String, status: `0`): ErrorStatus = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStatus]
  }
  
  @scala.inline
  implicit class ErrorStatusOps[Self <: ErrorStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
