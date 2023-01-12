package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLStyleMedia extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLStyleMedia_typekey")
  var MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia
  
  def matchMedium(mediaQuery: String): Boolean
  
  val `type`: String
}
object IHTMLStyleMedia {
  
  inline def apply(MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia, matchMedium: String => Boolean, `type`: String): IHTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.IHTMLStyleMedia_typekey")(MSHTMLDotIHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleMedia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHTMLStyleMedia] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotIHTMLStyleMedia_typekey(value: IHTMLStyleMedia): Self = StObject.set(x, "MSHTML.IHTMLStyleMedia_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatchMedium(value: String => Boolean): Self = StObject.set(x, "matchMedium", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
