package typings.aliApp.my

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothAdapterStateData extends ErrMsgResponse {
  
  /**
    * 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态)
    */
  var available: Boolean = js.native
  
  /**
    * 是否正在搜索设备
    */
  var discovering: Boolean = js.native
}
object BluetoothAdapterStateData {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
  
  @scala.inline
  implicit class BluetoothAdapterStateDataMutableBuilder[Self <: BluetoothAdapterStateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
