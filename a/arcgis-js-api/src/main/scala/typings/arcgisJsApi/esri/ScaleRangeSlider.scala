package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRangeSlider
  extends StObject
     with Widget_ {
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale) values will match the layer's.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#layer)
  		 */
  var layer: Layer = js.native
  
  /**
  		 * The maximum scale of the active scale range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale)
  		 */
  var maxScale: Double = js.native
  
  /**
  		 * The lowest possible maximum scale value on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScaleLimit)
  		 */
  var maxScaleLimit: Double = js.native
  
  /**
  		 * The minimum scale of the active scale range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale)
  		 */
  var minScale: Double = js.native
  
  /**
  		 * The highest possible minimum scale value on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScaleLimit)
  		 */
  var minScaleLimit: Double = js.native
  
  /**
  		 * The region that the scale thumbnails will focus on.
  		 *
  		 * @default "US"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#region)
  		 */
  var region: SupportedRegion = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#viewModel)
  		 */
  var viewModel: ScaleRangeSliderViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#visibleElements)
  		 */
  var visibleElements: ScaleRangeSliderVisibleElements = js.native
}
