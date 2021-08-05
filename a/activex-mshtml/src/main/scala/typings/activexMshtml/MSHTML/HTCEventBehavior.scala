package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCEventBehavior extends StObject {
  
  /* private */ @JSName("MSHTML.HTCEventBehavior_typekey")
  var MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior
  
  def fire(pVar: IHTMLEventObj): Unit
}
object HTCEventBehavior {
  
  inline def apply(MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior, fire: IHTMLEventObj => Unit): HTCEventBehavior = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire))
    __obj.updateDynamic("MSHTML.HTCEventBehavior_typekey")(MSHTMLDotHTCEventBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCEventBehavior]
  }
  
  extension [Self <: HTCEventBehavior](x: Self) {
    
    inline def setFire(value: IHTMLEventObj => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotHTCEventBehavior_typekey(value: HTCEventBehavior): Self = StObject.set(x, "MSHTML.HTCEventBehavior_typekey", value.asInstanceOf[js.Any])
  }
}
