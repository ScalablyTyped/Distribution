package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uid extends StObject {
  
  /** The ID of the remote user. */
  var uid: String = js.native
}
object Uid {
  
  @scala.inline
  def apply(uid: String): Uid = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
  
  @scala.inline
  implicit class UidMutableBuilder[Self <: Uid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
