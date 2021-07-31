package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextText extends StObject {
  
  var nextText: String
  
  var prevText: String
}
object NextText {
  
  @scala.inline
  def apply(nextText: String, prevText: String): NextText = {
    val __obj = js.Dynamic.literal(nextText = nextText.asInstanceOf[js.Any], prevText = prevText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextText]
  }
  
  @scala.inline
  implicit class NextTextMutableBuilder[Self <: NextText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
  }
}
