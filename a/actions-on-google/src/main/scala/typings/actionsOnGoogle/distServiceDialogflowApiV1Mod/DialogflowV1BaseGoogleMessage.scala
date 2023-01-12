package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1BaseGoogleMessage[TType /* <: String */] extends StObject {
  
  var platform: google
  
  var `type`: js.UndefOr[TType] = js.undefined
}
object DialogflowV1BaseGoogleMessage {
  
  inline def apply[TType /* <: String */](): DialogflowV1BaseGoogleMessage[TType] = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1BaseGoogleMessage[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1BaseGoogleMessage[?], TType /* <: String */] (val x: Self & DialogflowV1BaseGoogleMessage[TType]) extends AnyVal {
    
    inline def setPlatform(value: google): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
