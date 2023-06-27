package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.collection
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.ValuePickerCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsValuePickerValuePickerCollectionMod {
  
  @JSImport("esri/widgets/ValuePicker/ValuePickerCollection", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ValuePickerCollection {
    def this(properties: Any) = this()
    
    /**
    		 * A collection of values that can be navigated or animated with the play, next, and previous buttons on the [ValuePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html) widget..
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCollection.html#collection)
    		 */
    /* CompleteClass */
    var collection: Collection[Any] = js.native
    
    /* CompleteClass */
    override val `type`: collection = js.native
  }
}
