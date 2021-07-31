package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelect extends StObject {
  
  def onSelect(): Unit
}
object OnSelect {
  
  @scala.inline
  def apply(onSelect: () => Unit): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[OnSelect]
  }
  
  @scala.inline
  implicit class OnSelectMutableBuilder[Self <: OnSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
  }
}
