package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginTopNumber extends StObject {
  
  var fontSize: Double
  
  var marginTop: Double
}
object MarginTopNumber {
  
  @scala.inline
  def apply(fontSize: Double, marginTop: Double): MarginTopNumber = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopNumber]
  }
  
  @scala.inline
  implicit class MarginTopNumberMutableBuilder[Self <: MarginTopNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
