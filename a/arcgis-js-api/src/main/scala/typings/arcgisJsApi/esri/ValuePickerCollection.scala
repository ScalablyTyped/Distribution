package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePickerCollection extends StObject {
  
  /**
  		 * A collection of values that can be navigated or animated with the play, next, and previous buttons on the [ValuePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html) widget..
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCollection.html#collection)
  		 */
  var collection: Collection[Any]
  
  val `type`: collection
}
object ValuePickerCollection {
  
  inline def apply(collection: Collection[Any]): ValuePickerCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collection")
    __obj.asInstanceOf[ValuePickerCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerCollection] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: Collection[Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setType(value: collection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
