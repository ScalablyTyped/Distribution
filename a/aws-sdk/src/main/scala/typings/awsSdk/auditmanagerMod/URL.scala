package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URL extends StObject {
  
  /**
    *  The name or word that's used as a hyperlink to the URL. 
    */
  var hyperlinkName: js.UndefOr[HyperlinkName] = js.undefined
  
  /**
    *  The unique identifier for the internet resource. 
    */
  var link: js.UndefOr[UrlLink] = js.undefined
}
object URL {
  
  inline def apply(): URL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URL]
  }
  
  extension [Self <: URL](x: Self) {
    
    inline def setHyperlinkName(value: HyperlinkName): Self = StObject.set(x, "hyperlinkName", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkNameUndefined: Self = StObject.set(x, "hyperlinkName", js.undefined)
    
    inline def setLink(value: UrlLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
