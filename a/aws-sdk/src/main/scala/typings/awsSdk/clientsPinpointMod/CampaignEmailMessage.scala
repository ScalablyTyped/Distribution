package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignEmailMessage extends StObject {
  
  /**
    * The body of the email for recipients whose email clients don't render HTML content.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The verified email address to send the email from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The body of the email, in HTML format, for recipients whose email clients render HTML content.
    */
  var HtmlBody: js.UndefOr[string] = js.undefined
  
  /**
    * The subject line, or title, of the email.
    */
  var Title: js.UndefOr[string] = js.undefined
}
object CampaignEmailMessage {
  
  inline def apply(): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignEmailMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignEmailMessage] (val x: Self) extends AnyVal {
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    inline def setHtmlBody(value: string): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
    
    inline def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
    
    inline def setTitle(value: string): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
