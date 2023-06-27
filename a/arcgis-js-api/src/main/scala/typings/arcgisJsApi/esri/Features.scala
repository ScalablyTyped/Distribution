package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features
  extends StObject
     with Widget_
     with GoTo {
  
  /**
  		 * Use this method to remove focus from the Widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#blur)
  		 */
  def blur(): scala.Unit = js.native
  
  /**
  		 * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#content), and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title) from the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#clear)
  		 */
  def clear(): scala.Unit = js.native
  
  /**
  		 * This is a convenience method to closes the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#close)
  		 */
  def close(): scala.Unit = js.native
  
  /**
  		 * The content of the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#content)
  		 */
  var content: String | HTMLElement | Widget_ = js.native
  
  /**
  		 * An array of features associated with the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#features)
  		 */
  var features: js.Array[Graphic] = js.native
  
  /**
  		 * Use this method to return feature(s) at a given screen location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#fetchFeatures)
  		 */
  def fetchFeatures(screenPoint: FeaturesFetchFeaturesScreenPoint): js.Promise[FetchPopupFeaturesResult] = js.native
  def fetchFeatures(screenPoint: FeaturesFetchFeaturesScreenPoint, options: FetchFeaturesOptions): js.Promise[FetchPopupFeaturesResult] = js.native
  
  /**
  		 * Use this method to give focus to the Widget if the widget is able to be focused.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#focus)
  		 */
  def focus(): scala.Unit = js.native
  
  /**
  		 * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title) of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * Selects the feature at the next index in relation to the selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#next)
  		 */
  def next(): FeaturesViewModel = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: FeaturesTriggerActionEventHandler): IHandle = js.native
  
  /**
  		 * Opens the Features widget in its [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#container) with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  def open(): scala.Unit = js.native
  def open(options: FeaturesOpenOptions): scala.Unit = js.native
  
  /**
  		 * Selects the feature at the previous index in relation to the selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#previous)
  		 */
  def previous(): FeaturesViewModel = js.native
  
  /**
  		 * An array of pending Promises that have not yet been fulfilled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#promises)
  		 */
  var promises: js.Promise[Any] = js.native
  
  /**
  		 * The selected feature accessed by the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeature)
  		 */
  val selectedFeature: Graphic = js.native
  
  /**
  		 * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeature).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeatureIndex)
  		 */
  var selectedFeatureIndex: Double = js.native
  
  /**
  		 * Returns a reference to the current [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeatureWidget)
  		 */
  val selectedFeatureWidget: Feature = js.native
  
  /**
  		 * The title of the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#event-trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features-FeaturesViewModel.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features-FeaturesViewModel.html#actions) array.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#triggerAction)
  		 */
  def triggerAction(actionIndex: Double): scala.Unit = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#viewModel)
  		 */
  var viewModel: FeaturesViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#visibleElements)
  		 */
  var visibleElements: FeaturesVisibleElements = js.native
}
