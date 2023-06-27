package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ValuePickerCollection")
@js.native
open class ValuePickerCollection ()
  extends StObject
     with typings.arcgisJsApi.esri.ValuePickerCollection {
  def this(properties: Any) = this()
  
  /**
  		 * A collection of values that can be navigated or animated with the play, next, and previous buttons on the [ValuePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html) widget..
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerCollection.html#collection)
  		 */
  /* CompleteClass */
  var collection: typings.arcgisJsApi.esri.Collection[Any] = js.native
  
  /* CompleteClass */
  override val `type`: collection = js.native
}
