package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageStateChangeReason extends StObject {
  
  /**
    * The state change reason code.
    */
  var Code: js.UndefOr[ImageStateChangeReasonCode] = js.native
  
  /**
    * The state change reason message.
    */
  var Message: js.UndefOr[String] = js.native
}
object ImageStateChangeReason {
  
  @scala.inline
  def apply(): ImageStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageStateChangeReason]
  }
  
  @scala.inline
  implicit class ImageStateChangeReasonMutableBuilder[Self <: ImageStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ImageStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
