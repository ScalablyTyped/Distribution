package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
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
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
}
object AfterClose {
  
  @scala.inline
  def apply(
    afterClose: () => Unit,
    closable: Boolean,
    disabled: Boolean,
    onChange: () => Unit,
    onClose: () => Unit,
    onLongPress: () => Unit,
    selected: Boolean,
    small: Boolean,
    styles: StringDictionary[RegisteredStyle[js.Any]]
  ): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onLongPress = js.Any.fromFunction0(onLongPress), selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  
  @scala.inline
  implicit class AfterCloseMutableBuilder[Self <: AfterClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
