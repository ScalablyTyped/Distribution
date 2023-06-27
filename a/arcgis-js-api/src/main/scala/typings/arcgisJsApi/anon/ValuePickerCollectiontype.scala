package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.collection
import typings.arcgisJsApi.esri.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ValuePickerCollection & {  type :'collection'} */
trait ValuePickerCollectiontype extends StObject {
  
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
object ValuePickerCollectiontype {
  
  inline def apply(collection: Collection[Any]): ValuePickerCollectiontype = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collection")
    __obj.asInstanceOf[ValuePickerCollectiontype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerCollectiontype] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: Collection[Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setType(value: collection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
