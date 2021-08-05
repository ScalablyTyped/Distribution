package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: String
  
  def onLeftClick(): Unit
  
  var prefixCls: String
}
object Mode {
  
  inline def apply(mode: String, onLeftClick: () => Unit, prefixCls: String): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onLeftClick = js.Any.fromFunction0(onLeftClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnLeftClick(value: () => Unit): Self = StObject.set(x, "onLeftClick", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
