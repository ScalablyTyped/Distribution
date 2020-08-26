package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBeaconsSuccess extends js.Object {
  var beacons: js.Array[Beacon] = js.native
  /**
    * errorCode=0 ,接口调用成功
    */
  var errCode: String = js.native
  /**
    * ok
    */
  var errMsg: String = js.native
}

object GetBeaconsSuccess {
  @scala.inline
  def apply(beacons: js.Array[Beacon], errCode: String, errMsg: String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
  @scala.inline
  implicit class GetBeaconsSuccessOps[Self <: GetBeaconsSuccess] (val x: Self) extends AnyVal {
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
    def setBeaconsVarargs(value: Beacon*): Self = this.set("beacons", js.Array(value :_*))
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrCode(value: String): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

