package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureViewModel extends Accessor {
  
  /**
    * The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#content)
    */
  val content: js.Array[Content_] | Widget_ | HTMLElement | String = js.native
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
    * The formatted attributes calculated from `fieldInfo` [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#formattedAttributes)
    */
  val formattedAttributes: FeatureViewModelFormattedAttributes = js.native
  
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#map)
    */
  var map: Map = js.native
  
  /**
    * Paginates to the next [media](esri-popup-content-MediaContent.html) info.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#nextMedia)
    */
  def nextMedia(contentElementIndex: Double): Unit = js.native
  
  /**
    * Paginates to the previous [media](esri-popup-content-MediaContent.html) info in the specified [media](esri-popup-content-MediaContent.html) content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#previousMedia)
    */
  def previousMedia(contentElementIndex: Double): Unit = js.native
  
  /**
    * Paginates to a specified [media](esri-popup-content-MediaContent.html) info object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#setActiveMedia)
    */
  def setActiveMedia(contentElementIndex: Double, mediaInfoIndex: Double): Unit = js.native
  
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
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
