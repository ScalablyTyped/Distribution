package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attr extends StObject {
  
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: Double = js.native
  
  /** ID of the remote user sending the stream. */
  var uid: String | Double = js.native
}
object Attr {
  
  @scala.inline
  def apply(attr: Double, uid: String | Double): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  
  @scala.inline
  implicit class AttrMutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String | Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
