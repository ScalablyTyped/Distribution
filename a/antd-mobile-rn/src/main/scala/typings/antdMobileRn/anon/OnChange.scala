package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var disabled: Boolean
  
  def onChange(): Unit
  
  def onValueChange(): Unit
  
  var selectedIndex: Double
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
  
  var tintColor: String
  
  var values: js.Array[scala.Nothing]
}
object OnChange {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: () => Unit,
    onValueChange: () => Unit,
    selectedIndex: Double,
    styles: StringDictionary[RegisteredStyle[js.Any]],
    tintColor: String,
    values: js.Array[scala.Nothing]
  ): OnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onValueChange = js.Any.fromFunction0(onValueChange), selectedIndex = selectedIndex.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit class OnChangeMutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[scala.Nothing]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: scala.Nothing*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
