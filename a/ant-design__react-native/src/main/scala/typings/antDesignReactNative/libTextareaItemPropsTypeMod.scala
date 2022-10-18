package typings.antDesignReactNative

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextareaItemPropsTypeMod {
  
  type TextAreaEventHandle = js.Function1[/* val */ js.UndefOr[String], Unit]
  
  trait TextAreaItemPropsType extends StObject {
    
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var labelNumber: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[TextAreaEventHandle] = js.undefined
    
    var onErrorClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TextAreaItemPropsType {
    
    inline def apply(): TextAreaItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaItemPropsType]
    }
    
    extension [Self <: TextAreaItemPropsType](x: Self) {
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLabelNumber(value: Double): Self = StObject.set(x, "labelNumber", value.asInstanceOf[js.Any])
      
      inline def setLabelNumberUndefined: Self = StObject.set(x, "labelNumber", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* val */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnErrorClick(value: () => Unit): Self = StObject.set(x, "onErrorClick", js.Any.fromFunction0(value))
      
      inline def setOnErrorClickUndefined: Self = StObject.set(x, "onErrorClick", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
