package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typings.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typings.actionsOnGoogle.actionsOnGoogleStrings.line_
import typings.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typings.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typings.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typings.actionsOnGoogle.actionsOnGoogleStrings.viber_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1BaseMessage[TType /* <: Double */] extends StObject {
  
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.undefined
  
  var `type`: js.UndefOr[TType] = js.undefined
}
object DialogflowV1BaseMessage {
  
  inline def apply[TType /* <: Double */](): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
  
  extension [Self <: DialogflowV1BaseMessage[?], TType /* <: Double */](x: Self & DialogflowV1BaseMessage[TType]) {
    
    inline def setPlatform(value: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
