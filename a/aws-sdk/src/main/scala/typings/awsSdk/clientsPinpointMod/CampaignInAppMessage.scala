package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignInAppMessage extends StObject {
  
  /**
    * The message body of the notification, the email body or the text message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * In-app message content.
    */
  var Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined
  
  /**
    * Custom config to be sent to client.
    */
  var CustomConfig: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * In-app message layout.
    */
  var Layout: js.UndefOr[typings.awsSdk.clientsPinpointMod.Layout] = js.undefined
}
object CampaignInAppMessage {
  
  inline def apply(): CampaignInAppMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignInAppMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignInAppMessage] (val x: Self) extends AnyVal {
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setContent(value: ListOfInAppMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: InAppMessageContent*): Self = StObject.set(x, "Content", js.Array(value*))
    
    inline def setCustomConfig(value: MapOfString): Self = StObject.set(x, "CustomConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomConfigUndefined: Self = StObject.set(x, "CustomConfig", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
  }
}
