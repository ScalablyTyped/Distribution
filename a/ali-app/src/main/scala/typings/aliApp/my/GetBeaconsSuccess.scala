package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsSuccess extends js.Object {
  var beacons: js.Array[Beacon]
  /**
  		 * errorCode=0 ,接口调用成功
  		 */
  var errCode: String
  /**
  		 * ok
  		 */
  var errMsg: String
}

object GetBeaconsSuccess {
  @scala.inline
  def apply(beacons: js.Array[Beacon], errCode: String, errMsg: String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
}

