package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageText
  extends StObject
     with DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  
  var speech: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageText {
  
  inline def apply(): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
  
  extension [Self <: DialogflowV1MessageText](x: Self) {
    
    inline def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    inline def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
