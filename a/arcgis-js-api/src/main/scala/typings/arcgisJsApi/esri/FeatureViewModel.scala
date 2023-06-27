package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Defines the specific [abilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities) that the [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html) and [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) widgets should use when querying and displaying its content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#abilities)
  		 */
  var abilities: Abilities = js.native
  
  /**
  		 * The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) of the feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#content)
  		 */
  val content: js.Array[Content_] | Widget_ | HTMLElement | String = js.native
  
  /**
  		 * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#defaultPopupTemplateEnabled)
  		 */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
  		 * The formatted attributes calculated from `fieldInfo` [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#formattedAttributes)
  		 */
  val formattedAttributes: FeatureViewModelFormattedAttributes = js.native
  
  /**
  		 * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic)
  		 */
  var graphic: Graphic = js.native
  
  /**
  		 * A read-only property containing metadata regarding the last edit performed on a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
  		 */
  val lastEditInfo: FeatureViewModelLastEditInfo = js.native
  
  /**
  		 * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#map)
  		 */
  var map: Map = js.native
  
  /**
  		 * Paginates to the next [media](esri-popup-content-MediaContent.html) info.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#nextMedia)
  		 */
  def nextMedia(contentElementIndex: Double): scala.Unit = js.native
  
  /**
  		 * Paginates to the previous [media](esri-popup-content-MediaContent.html) info in the specified [media](esri-popup-content-MediaContent.html) content element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#previousMedia)
  		 */
  def previousMedia(contentElementIndex: Double): scala.Unit = js.native
  
  /**
  		 * Paginates to a specified [media](esri-popup-content-MediaContent.html) info object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#setActiveMedia)
  		 */
  def setActiveMedia(contentElementIndex: Double, mediaInfoIndex: Double): scala.Unit = js.native
  
  /**
  		 * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#state)
  		 */
  val state: ready | disabled | error | loading = js.native
  
  /**
  		 * The title for the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#title)
  		 */
  val title: String = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * Indicates whether the feature is currently waiting for all of its content to finish loading.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#waitingForContent)
  		 */
  val waitingForContent: Boolean = js.native
}
