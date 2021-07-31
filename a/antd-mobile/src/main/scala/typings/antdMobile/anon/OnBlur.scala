package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  var disabled: Boolean
  
  def onBlur(): Unit
  
  def onChange(): Unit
  
  def onClear(): Unit
  
  def onFocus(): Unit
  
  def onSubmit(): Unit
  
  var placeholder: String
  
  var prefixCls: String
  
  var showCancelButton: Boolean
}
object OnBlur {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onClear: () => Unit,
    onFocus: () => Unit,
    onSubmit: () => Unit,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean
  ): OnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  
  @scala.inline
  implicit class OnBlurMutableBuilder[Self <: OnBlur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSubmit(value: () => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
  }
}
