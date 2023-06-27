package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.label
import typings.arcgisJsApi.esri.Labelitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ValuePickerLabel & {  type :'label'} */
trait ValuePickerLabeltypelabel extends StObject {
  
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
object ValuePickerLabeltypelabel {
  
  inline def apply(items: js.Array[Labelitem]): ValuePickerLabeltypelabel = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[ValuePickerLabeltypelabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerLabeltypelabel] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Labelitem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Labelitem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
