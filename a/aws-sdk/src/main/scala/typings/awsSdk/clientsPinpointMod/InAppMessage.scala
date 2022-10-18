package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessage extends StObject {
  
  /**
    * In-app message content.
    */
  var Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined
  
  /**
    * Custom config to be sent to SDK.
    */
  var CustomConfig: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The layout of the message.
    */
  var Layout: js.UndefOr[typings.awsSdk.clientsPinpointMod.Layout] = js.undefined
}
object InAppMessage {
  
  inline def apply(): InAppMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppMessage]
  }
  
  extension [Self <: InAppMessage](x: Self) {
    
    inline def setContent(value: ListOfInAppMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: InAppMessageContent*): Self = StObject.set(x, "Content", js.Array(value*))
    
    inline def setCustomConfig(value: MapOfString): Self = StObject.set(x, "CustomConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomConfigUndefined: Self = StObject.set(x, "CustomConfig", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
  }
}
