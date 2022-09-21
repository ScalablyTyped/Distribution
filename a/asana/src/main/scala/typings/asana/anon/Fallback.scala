package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fallback extends StObject {
  
  var fallback: String
  
  var footer: String
  
  var header: String
  
  var header_link: String
  
  var html_text: String
  
  var text: String
  
  var title: String
  
  var title_link: String
}
object Fallback {
  
  inline def apply(
    fallback: String,
    footer: String,
    header: String,
    header_link: String,
    html_text: String,
    text: String,
    title: String,
    title_link: String
  ): Fallback = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], header_link = header_link.asInstanceOf[js.Any], html_text = html_text.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_link = title_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
  
  extension [Self <: Fallback](x: Self) {
    
    inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeader_link(value: String): Self = StObject.set(x, "header_link", value.asInstanceOf[js.Any])
    
    inline def setHtml_text(value: String): Self = StObject.set(x, "html_text", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitle_link(value: String): Self = StObject.set(x, "title_link", value.asInstanceOf[js.Any])
  }
}
