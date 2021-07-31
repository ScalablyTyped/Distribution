package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOnUpDown extends StObject {
  
  var focusOnUpDown: Boolean
  
  var prefixCls: String
  
  var readOnly: Boolean
  
  var showNumber: Boolean
  
  var step: Double
}
object FocusOnUpDown {
  
  @scala.inline
  def apply(focusOnUpDown: Boolean, prefixCls: String, readOnly: Boolean, showNumber: Boolean, step: Double): FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], showNumber = showNumber.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOnUpDown]
  }
  
  @scala.inline
  implicit class FocusOnUpDownMutableBuilder[Self <: FocusOnUpDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
