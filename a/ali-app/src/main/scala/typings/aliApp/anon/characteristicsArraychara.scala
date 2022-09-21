package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristics :std.Array<{  characteristicId :string,   serviceId :string,   value :std.ArrayBuffer,   properties :std.Array<{  read :boolean,   write :boolean,   notify :boolean,   indicate :boolean}>}>} & ali-app.my.ErrMsgResponse */
trait characteristicsArraychara extends StObject {
  
  var characteristics: js.Array[Properties]
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}
object characteristicsArraychara {
  
  inline def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArraychara = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArraychara]
  }
  
  extension [Self <: characteristicsArraychara](x: Self) {
    
    inline def setCharacteristics(value: js.Array[Properties]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsVarargs(value: Properties*): Self = StObject.set(x, "characteristics", js.Array(value*))
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
