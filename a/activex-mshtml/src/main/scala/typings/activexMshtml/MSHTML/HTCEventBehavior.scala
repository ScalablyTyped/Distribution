package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCEventBehavior extends StObject {
  
  @JSName("MSHTML.HTCEventBehavior_typekey")
  var MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior
  
  def fire(pVar: IHTMLEventObj): Unit
}
object HTCEventBehavior {
  
  @scala.inline
  def apply(MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior, fire: IHTMLEventObj => Unit): HTCEventBehavior = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire))
    __obj.updateDynamic("MSHTML.HTCEventBehavior_typekey")(MSHTMLDotHTCEventBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCEventBehavior]
  }
  
  @scala.inline
  implicit class HTCEventBehaviorMutableBuilder[Self <: HTCEventBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFire(value: IHTMLEventObj => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotHTCEventBehavior_typekey(value: HTCEventBehavior): Self = StObject.set(x, "MSHTML.HTCEventBehavior_typekey", value.asInstanceOf[js.Any])
  }
}
