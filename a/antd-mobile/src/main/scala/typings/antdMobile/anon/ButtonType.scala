package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonType extends StObject {
  
  var buttonType: String
  
  def onButtonClick(): Unit
  
  var prefixCls: String
}
object ButtonType {
  
  inline def apply(buttonType: String, onButtonClick: () => Unit, prefixCls: String): ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonType]
  }
  
  extension [Self <: ButtonType](x: Self) {
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
