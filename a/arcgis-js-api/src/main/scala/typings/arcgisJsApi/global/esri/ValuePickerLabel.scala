package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.label
import typings.arcgisJsApi.esri.Labelitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ValuePickerLabel")
@js.native
open class ValuePickerLabel ()
  extends StObject
     with typings.arcgisJsApi.esri.ValuePickerLabel {
  def this(properties: Any) = this()
  
  /**
  		 * An array of label items.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerLabel.html#items)
  		 */
  /* CompleteClass */
  var items: js.Array[Labelitem] = js.native
  
  /* CompleteClass */
  override val `type`: label = js.native
}
