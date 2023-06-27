package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePickerLabel extends StObject {
  
  /**
  		 * An array of label items.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerLabel.html#items)
  		 */
  var items: js.Array[Labelitem]
  
  val `type`: label
}
object ValuePickerLabel {
  
  inline def apply(items: js.Array[Labelitem]): ValuePickerLabel = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[ValuePickerLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerLabel] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Labelitem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Labelitem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
