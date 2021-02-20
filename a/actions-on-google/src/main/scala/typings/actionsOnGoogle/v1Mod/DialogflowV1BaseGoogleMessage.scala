package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1BaseGoogleMessage[TType /* <: String */] extends StObject {
  
  var platform: google = js.native
  
  var `type`: js.UndefOr[TType] = js.native
}
object DialogflowV1BaseGoogleMessage {
  
  @scala.inline
  def apply[TType /* <: String */](platform: google): DialogflowV1BaseGoogleMessage[TType] = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseGoogleMessage[TType]]
  }
  
  @scala.inline
  implicit class DialogflowV1BaseGoogleMessageMutableBuilder[Self <: DialogflowV1BaseGoogleMessage[_], TType /* <: String */] (val x: Self with DialogflowV1BaseGoogleMessage[TType]) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: google): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
