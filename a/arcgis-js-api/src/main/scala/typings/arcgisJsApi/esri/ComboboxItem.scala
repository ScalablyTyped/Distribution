package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboboxItem extends StObject {
  
  /**
  		 * The label for this item that users will see in the combobox.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: String
  
  /**
  		 * The value of the combobox item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#ComboboxItem)
  		 */
  var value: String
}
object ComboboxItem {
  
  inline def apply(label: String, value: String): ComboboxItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboboxItem] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
