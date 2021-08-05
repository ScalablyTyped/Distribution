package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  /**
    * - An empty string if `success` is `true`.
    * - The failure reason if `success` is `false`.
    */
  var reason: String
  
  /**
    * The result of republishing or re-subscribing to the stream.
    * - `true`: Success.
    * - `false`: Failure.
    */
  var success: Boolean
  
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}
object Success {
  
  inline def apply(reason: String, success: Boolean, uid: Double | String): Success = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
