package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends Widget {
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
    *
    * @default null
    */
  var graphic: Graphic = js.native
  /**
    * The title for the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#title)
    *
    * @default null
    */
  val title: java.lang.String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
    *
    * @default null
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
    */
  var viewModel: FeatureViewModel = js.native
  /**
    * Paginates to a specified [media](esri-PopupTemplate.html#media) info object. For example, you may have [media](esri-PopupTemplate.html#media) content which contains multiple `mediaInfos`. This method allows you to specify the index of the `mediaInfos` you wish to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#goToMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-PopupTemplate.html#media) content element to be updated.
    * @param mediaInfoIndex The index position of the [media](esri-PopupTemplate.html#media) info object you wish to display.
    *
    */
  def goToMedia(contentElementIndex: scala.Double, mediaInfoIndex: scala.Double): scala.Unit = js.native
  /**
    * Paginates to the next [media](esri-PopupTemplate.html#media) info.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#nextMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-PopupTemplate.html#media) content element.
    *
    */
  def nextMedia(contentElementIndex: scala.Double): scala.Unit = js.native
  /**
    * Paginates to the previous [media](esri-PopupTemplate.html#media) info in the specified [media](esri-PopupTemplate.html#media) content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#previousMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-PopupTemplate.html#media) content element.
    *
    */
  def previousMedia(contentElementIndex: scala.Double): scala.Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

