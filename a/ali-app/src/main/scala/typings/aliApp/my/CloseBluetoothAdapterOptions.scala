package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: js.Any): Unit = js.native
}

object CloseBluetoothAdapterOptions {
  @scala.inline
  def apply(success: js.Any => Unit): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
  @scala.inline
  implicit class CloseBluetoothAdapterOptionsOps[Self <: CloseBluetoothAdapterOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

