package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSupportBLE extends js.Object {
  /**
    * 是否支持 BLE
    */
  var isSupportBLE: Boolean
}

object IsSupportBLE {
  @scala.inline
  def apply(isSupportBLE: Boolean): IsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupportBLE]
  }
}

