package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsSupportBLE extends js.Object {
  /**
    * 是否支持 BLE
    */
  var isSupportBLE: Boolean = js.native
}

object IsSupportBLE {
  @scala.inline
  def apply(isSupportBLE: Boolean): IsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupportBLE]
  }
  @scala.inline
  implicit class IsSupportBLEOps[Self <: IsSupportBLE] (val x: Self) extends AnyVal {
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
    def setIsSupportBLE(value: Boolean): Self = this.set("isSupportBLE", value.asInstanceOf[js.Any])
  }
  
}

