package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristic :{  characteristicId :string,   serviceId :string,   value :std.ArrayBuffer}} & ali-app.my.ErrMsgResponse */
@js.native
trait characteristiccharacteris extends StObject {
  
  var characteristic: CharacteristicId = js.native
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}
object characteristiccharacteris {
  
  @scala.inline
  def apply(characteristic: CharacteristicId, errMsg: ok | String): characteristiccharacteris = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristiccharacteris]
  }
  
  @scala.inline
  implicit class characteristiccharacterisMutableBuilder[Self <: characteristiccharacteris] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristic(value: CharacteristicId): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
