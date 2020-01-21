package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsSupportBLE extends js.Object {
  /**
  			 * 是否支持 BLE
  			 */
  var isSupportBLE: Boolean
}

object AnonIsSupportBLE {
  @scala.inline
  def apply(isSupportBLE: Boolean): AnonIsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsSupportBLE]
  }
}

