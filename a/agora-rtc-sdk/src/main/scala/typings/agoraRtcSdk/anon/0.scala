package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}
object `0` {
  
  inline def apply(uid: Double | String): `0` = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
