package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBuilderStateChangeReason extends StObject {
  
  /**
    * The state change reason code.
    */
  var Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined
  
  /**
    * The state change reason message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ImageBuilderStateChangeReason {
  
  @scala.inline
  def apply(): ImageBuilderStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBuilderStateChangeReason]
  }
  
  @scala.inline
  implicit class ImageBuilderStateChangeReasonMutableBuilder[Self <: ImageBuilderStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ImageBuilderStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
