package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.combobox
import typings.arcgisJsApi.esri.ComboboxItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ValuePickerCombobox")
@js.native
open class ValuePickerCombobox ()
  extends StObject
     with typings.arcgisJsApi.esri.ValuePickerCombobox {
  def this(properties: Any) = this()
  
  /**
  		 * An array of combobox items.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#items)
  		 */
  /* CompleteClass */
  var items: js.Array[ComboboxItem] = js.native
  
  /**
  		 * Combobox label.
  		 *
  		 * @default "ValuePickerCombobox"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#label)
  		 */
  /* CompleteClass */
  var label: String = js.native
  
  /**
  		 * Combobox placeholder text.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCombobox.html#placeholder)
  		 */
  /* CompleteClass */
  var placeholder: String = js.native
  
  /* CompleteClass */
  override val `type`: combobox = js.native
}
