package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupTemplate
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#actions)
  		 */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
  		 * The template for defining and formatting a popup's content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content)
  		 */
  var content: js.Array[Content_] | String | js.Function | js.Promise[Any] = js.native
  
  /**
  		 * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos)
  		 */
  var expressionInfos: js.Array[popupExpressionInfo] = js.native
  
  /**
  		 * An array of [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that defines how fields in the dataset or values from [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions participate in a popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos)
  		 */
  var fieldInfos: js.Array[FieldInfo] = js.native
  
  /**
  		 * Indicates whether or not editor tracking should display.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#lastEditInfoEnabled)
  		 */
  var lastEditInfoEnabled: Boolean = js.native
  
  /**
  		 * Additional options that can be defined for the popup layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#layerOptions)
  		 */
  var layerOptions: LayerOptions = js.native
  
  /**
  		 * An array of field names used in the PopupTemplate.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields)
  		 */
  var outFields: js.Array[String] = js.native
  
  /**
  		 * Indicates whether actions should replace existing [popup actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions)
  		 */
  var overwriteActions: Boolean = js.native
  
  /**
  		 * Indicates whether to include the feature's geometry for use by the template.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#returnGeometry)
  		 */
  var returnGeometry: Boolean = js.native
  
  /**
  		 * The template for defining how to format the title used in a popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#title)
  		 */
  var title: String | js.Function | js.Promise[Any] = js.native
}
