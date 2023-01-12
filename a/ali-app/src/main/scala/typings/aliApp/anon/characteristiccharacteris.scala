package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristic :{  characteristicId :string,   serviceId :string,   value :std.ArrayBuffer}} & ali-app.my.ErrMsgResponse */
trait characteristiccharacteris extends StObject {
  
  var characteristic: CharacteristicId
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}
object characteristiccharacteris {
  
  inline def apply(characteristic: CharacteristicId, errMsg: ok | String): characteristiccharacteris = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristiccharacteris]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: characteristiccharacteris] (val x: Self) extends AnyVal {
    
    inline def setCharacteristic(value: CharacteristicId): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
