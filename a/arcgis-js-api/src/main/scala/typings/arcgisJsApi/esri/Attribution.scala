package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribution
  extends StObject
     with Widget_ {
  
  /**
  		 * Full attribution text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#attributionText)
  		 */
  val attributionText: String = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Attribution#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * Text used to split attribution by [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
  		 *
  		 * @default |
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#itemDelimiter)
  		 */
  var itemDelimiter: String = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#viewModel)
  		 */
  var viewModel: AttributionViewModel = js.native
}
