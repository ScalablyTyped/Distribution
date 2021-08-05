package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValueChange extends StObject {
  
  def onValueChange(): Unit
  
  var prefixCls: String
}
object OnValueChange {
  
  inline def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  
  extension [Self <: OnValueChange](x: Self) {
    
    inline def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
