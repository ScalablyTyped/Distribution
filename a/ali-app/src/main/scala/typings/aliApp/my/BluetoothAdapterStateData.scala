package typings.aliApp.my

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothAdapterStateData
  extends StObject
     with ErrMsgResponse {
  
  /**
    * 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态)
    */
  var available: Boolean
  
  /**
    * 是否正在搜索设备
    */
  var discovering: Boolean
}
object BluetoothAdapterStateData {
  
  inline def apply(available: Boolean, discovering: Boolean, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothAdapterStateData] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
