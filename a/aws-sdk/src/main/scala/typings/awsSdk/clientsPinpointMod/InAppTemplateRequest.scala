package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppTemplateRequest extends StObject {
  
  /**
    * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and background color. ImageUrl and buttons are optional.
    */
  var Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined
  
  /**
    * Custom config to be sent to client.
    */
  var CustomConfig: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The layout of the message.
    */
  var Layout: js.UndefOr[typings.awsSdk.clientsPinpointMod.Layout] = js.undefined
  
  /**
    * The description of the template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object InAppTemplateRequest {
  
  inline def apply(): InAppTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppTemplateRequest]
  }
  
  extension [Self <: InAppTemplateRequest](x: Self) {
    
    inline def setContent(value: ListOfInAppMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: InAppMessageContent*): Self = StObject.set(x, "Content", js.Array(value*))
    
    inline def setCustomConfig(value: MapOfString): Self = StObject.set(x, "CustomConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomConfigUndefined: Self = StObject.set(x, "CustomConfig", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
  }
}
