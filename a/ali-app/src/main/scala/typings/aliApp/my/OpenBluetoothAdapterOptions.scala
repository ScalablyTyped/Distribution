package typings.aliApp.my

import typings.aliApp.anon.IsSupportBLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 快速接入 https://docs.alipay.com/mini/api/bluetooth-intro
//#endregion
//#region API https://docs.alipay.com/mini/api/bluetooth-api
@js.native
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 不传的话默认是true，表示是否在离开当前页面时自动断开蓝牙(仅对android有效) */
  var autoClose: Boolean = js.native
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: IsSupportBLE): Unit = js.native
}
object OpenBluetoothAdapterOptions {
  
  @scala.inline
  def apply(autoClose: Boolean, success: IsSupportBLE => Unit): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit class OpenBluetoothAdapterOptionsOps[Self <: OpenBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: IsSupportBLE => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
