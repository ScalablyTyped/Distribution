package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHeight extends StObject {
  
  var autoHeight: Boolean
  
  var clear: Boolean
  
  var disabled: Boolean
  
  var editable: Boolean
  
  var error: Boolean
  
  var labelNumber: Double
  
  var onBlur: js.Function0[Unit]
  
  var onChange: js.Function0[Unit]
  
  var onErrorClick: js.Function0[Unit]
  
  var onFocus: js.Function0[Unit]
  
  var placeholder: String
  
  var prefixCls: String
  
  var prefixListCls: String
  
  var rows: Double
}
object AutoHeight {
  
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    disabled: Boolean,
    editable: Boolean,
    error: Boolean,
    labelNumber: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onFocus: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    rows: Double
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
  
  @scala.inline
  implicit class AutoHeightMutableBuilder[Self <: AutoHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNumber(value: Double): Self = StObject.set(x, "labelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorClick(value: () => Unit): Self = StObject.set(x, "onErrorClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListCls(value: String): Self = StObject.set(x, "prefixListCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
