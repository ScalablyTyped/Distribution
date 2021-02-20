package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTCPropertyBehavior extends StObject {
  
  @JSName("MSHTML.HTCPropertyBehavior_typekey")
  var MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior = js.native
  
  def fireChange(): Unit = js.native
  
  var value: js.Any = js.native
}
object HTCPropertyBehavior {
  
  @scala.inline
  def apply(MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior, fireChange: () => Unit, value: js.Any): HTCPropertyBehavior = {
    val __obj = js.Dynamic.literal(fireChange = js.Any.fromFunction0(fireChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(MSHTMLDotHTCPropertyBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCPropertyBehavior]
  }
  
  @scala.inline
  implicit class HTCPropertyBehaviorMutableBuilder[Self <: HTCPropertyBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFireChange(value: () => Unit): Self = StObject.set(x, "fireChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotHTCPropertyBehavior_typekey(value: HTCPropertyBehavior): Self = StObject.set(x, "MSHTML.HTCPropertyBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
