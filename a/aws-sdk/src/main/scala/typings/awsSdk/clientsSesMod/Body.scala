package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  var Html: js.UndefOr[Content] = js.undefined
  
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  var Text: js.UndefOr[Content] = js.undefined
}
object Body {
  
  inline def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setHtml(value: Content): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "Html", js.undefined)
    
    inline def setText(value: Content): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
