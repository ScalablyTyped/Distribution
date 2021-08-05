package typings.antdMobile.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: Element
  
  var mode: String
  
  def onClick(): Unit
  
  var prefixCls: String
}
object Icon {
  
  inline def apply(icon: Element, mode: String, onClick: () => Unit, prefixCls: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
