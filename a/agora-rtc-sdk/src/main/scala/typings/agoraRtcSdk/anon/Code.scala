package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /** Event code. */
  var code: Double
  
  /** Event message. */
  var msg: String
  
  /** The uid of the user who experiences the exception or recovery event. */
  var uid: String
}
object Code {
  
  inline def apply(code: Double, msg: String, uid: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
