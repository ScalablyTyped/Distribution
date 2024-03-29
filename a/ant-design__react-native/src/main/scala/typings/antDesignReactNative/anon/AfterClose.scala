package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterClose extends StObject {
  
  def afterClose(): Unit
  
  var closable: Boolean
  
  var disabled: Boolean
  
  def onChange(): Unit
  
  def onClose(): Unit
  
  def onLongPress(): Unit
  
  var selected: Boolean
  
  var small: Boolean
}
object AfterClose {
  
  inline def apply(
    afterClose: () => Unit,
    closable: Boolean,
    disabled: Boolean,
    onChange: () => Unit,
    onClose: () => Unit,
    onLongPress: () => Unit,
    selected: Boolean,
    small: Boolean
  ): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onLongPress = js.Any.fromFunction0(onLongPress), selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterClose] (val x: Self) extends AnyVal {
    
    inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
