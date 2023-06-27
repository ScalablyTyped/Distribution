package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labelitem extends StObject {
  
  /**
  		 * The label users will see for this item.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: String
  
  /**
  		 * The value of the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerLabel.html#labelitem)
  		 */
  var value: String
}
object Labelitem {
  
  inline def apply(label: String, value: String): Labelitem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labelitem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Labelitem] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
