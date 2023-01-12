package typings.aliApp.my

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrMsgResponse extends StObject {
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}
object ErrMsgResponse {
  
  inline def apply(errMsg: ok | String): ErrMsgResponse = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsgResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrMsgResponse] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
