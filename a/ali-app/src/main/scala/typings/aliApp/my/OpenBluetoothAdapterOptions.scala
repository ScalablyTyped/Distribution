package typings.aliApp.my

import typings.aliApp.anon.IsSupportBLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 快速接入 https://docs.alipay.com/mini/api/bluetooth-intro
//#endregion
//#region API https://docs.alipay.com/mini/api/bluetooth-api
trait OpenBluetoothAdapterOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 不传的话默认是true，表示是否在离开当前页面时自动断开蓝牙(仅对android有效) */
  var autoClose: Boolean
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: IsSupportBLE): Unit
}
object OpenBluetoothAdapterOptions {
  
  inline def apply(autoClose: Boolean, success: IsSupportBLE => Unit): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  extension [Self <: OpenBluetoothAdapterOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: IsSupportBLE => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
