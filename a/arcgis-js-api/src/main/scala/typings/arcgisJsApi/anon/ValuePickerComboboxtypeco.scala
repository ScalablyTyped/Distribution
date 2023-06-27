package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.combobox
import typings.arcgisJsApi.esri.ComboboxItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ValuePickerCombobox & {  type :'combobox'} */
trait ValuePickerComboboxtypeco extends StObject {
  
  /**
  		 * An array of combobox items.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#items)
  		 */
  var items: js.Array[ComboboxItem]
  
  /**
  		 * Combobox label.
  		 *
  		 * @default "ValuePickerCombobox"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#label)
  		 */
  var label: String
  
  /**
  		 * Combobox placeholder text.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#placeholder)
  		 */
  var placeholder: String
  
  val `type`: combobox
}
object ValuePickerComboboxtypeco {
  
  inline def apply(items: js.Array[ComboboxItem], label: String, placeholder: String): ValuePickerComboboxtypeco = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("combobox")
    __obj.asInstanceOf[ValuePickerComboboxtypeco]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerComboboxtypeco] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ComboboxItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ComboboxItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setType(value: combobox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
