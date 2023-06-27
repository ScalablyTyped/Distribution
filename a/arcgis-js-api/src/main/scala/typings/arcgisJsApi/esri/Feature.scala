package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature
  extends StObject
     with Widget_ {
  
  /**
  		 * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#defaultPopupTemplateEnabled)
  		 */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
  		 * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
  		 */
  var graphic: Graphic = js.native
  
  /**
  		 * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#title) of the feature widget.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#map)
  		 */
  var map: Map = js.native
  
  /**
  		 * Paginates to the next [media](esri-popup-content-MediaContent.html) info.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#nextMedia)
  		 */
  def nextMedia(contentElementIndex: Double): scala.Unit = js.native
  
  /**
  		 * Paginates to the previous [media](esri-popup-content-MediaContent.html) info in the specified [media](esri-popup-content-MediaContent.html) content element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#previousMedia)
  		 */
  def previousMedia(contentElementIndex: Double): scala.Unit = js.native
  
  /**
  		 * Paginates to a specified [media](esri-popup-content-MediaContent.html) info object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#setActiveMedia)
  		 */
  def setActiveMedia(contentElementIndex: Double, mediaInfoIndex: Double): scala.Unit = js.native
  
  /**
  		 * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * The title for the feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#title)
  		 */
  val title: String = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
  		 */
  var viewModel: FeatureViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget's [graphic.popupTemplate.content](esri-PopupTemplate.html#content).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#visibleElements)
  		 */
  var visibleElements: FeatureVisibleElements = js.native
}
