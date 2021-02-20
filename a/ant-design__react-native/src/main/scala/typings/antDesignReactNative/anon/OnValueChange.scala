package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnValueChange extends StObject {
  
  def onValueChange(): Unit = js.native
  
  var prefixCls: String = js.native
}
object OnValueChange {
  
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  
  @scala.inline
  implicit class OnValueChangeMutableBuilder[Self <: OnValueChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
