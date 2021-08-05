package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @param uid ID of the remote user.
  * @param reason Reason why the user goes offline.
  * - "Quit": The user calls {@link Client.leave} and leaves the channel.
  * - "ServerTimeOut": The user drops offline.
  * - "BecomeAudience": The client role switches from `"host"` to `"audience"`.
  */
trait Reason extends StObject {
  
  var reason: String
  
  var uid: String
}
object Reason {
  
  inline def apply(reason: String, uid: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
