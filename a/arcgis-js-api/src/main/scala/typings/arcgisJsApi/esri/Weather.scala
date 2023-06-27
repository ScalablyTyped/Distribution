package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Weather
  extends StObject
     with Widget_ {
  
  /**
  		 * Indicates the heading level to use for the title of the widget.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Weather#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#view)
  		 */
  var view: SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#viewModel)
  		 */
  var viewModel: WeatherViewModel = js.native
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#visibleElements)
  		 */
  var visibleElements: WeatherVisibleElements = js.native
}
