package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsSuccess extends js.Object {
  var beacons: js.Array[Beacon]
  /**
  		 * errorCode=0 ,接口调用成功
  		 */
  var errCode: java.lang.String
  /**
  		 * ok
  		 */
  var errMsg: java.lang.String
}

object GetBeaconsSuccess {
  @scala.inline
  def apply(beacons: js.Array[Beacon], errCode: java.lang.String, errMsg: java.lang.String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons, errCode = errCode, errMsg = errMsg)
  
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
}

