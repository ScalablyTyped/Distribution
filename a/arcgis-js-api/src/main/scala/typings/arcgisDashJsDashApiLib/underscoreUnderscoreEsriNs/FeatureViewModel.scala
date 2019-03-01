package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureViewModel extends Accessor {
  /**
    * The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#content)
    *
    * @default null
    */
  val content: java.lang.String | js.Array[_] | stdLib.HTMLElement | Widget = js.native
  /**
    * The formatted attributes calculated from `fieldInfo` [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content. They are obtained from the feature's [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic) attribute values and can be read:
    *   * globally using the [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property directly at the root level of the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), or
    *   * per an individual content element. This element is defined with a type of fields on the PopupTemplate's content property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#formattedAttributes)
    *
    * @default null
    */
  val formattedAttributes: FeatureViewModelFormattedAttributes = js.native
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic)
    *
    * @default null
    */
  var graphic: Graphic = js.native
  /**
    * The title for the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#title)
    *
    * @default null
    */
  val title: java.lang.String = js.native
  /**
    * The view associated with the Feature instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#view)
    *
    * @default null
    */
  var view: MapView | SceneView = js.native
  /**
    * Indicates whether the feature is currently waiting for all of its content to finish loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#waitingForContent)
    *
    * @default true
    */
  val waitingForContent: scala.Boolean = js.native
}

