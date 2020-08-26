package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureViewModel extends Accessor {
  /**
    * The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#content)
    *
    * @default null
    */
  val content: js.Array[Content_] | Widget_ | HTMLElement | String = js.native
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: Boolean = js.native
  /**
    * The formatted attributes calculated from `fieldInfo` [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content. They are obtained from the feature's [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic) attribute values and can be read:
    *   * globally using the [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property directly at the root level of the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), or
    *   * per an individual content element. This element is defined with a [fieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html) popup element set on the PopupTemplate content property.
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
    * A read-only property containing metadata regarding the last edit performed on a feature. This object has the following properties:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  val lastEditInfo: FeatureViewModelLastEditInfo = js.native
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). Use this property when needing to get access to the underlying layers within the map. This can then be used within [Arcade](https://developers.arcgis.com/arcade) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#map)
    *
    * @default null
    */
  var map: Map = js.native
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The title for the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#title)
    */
  val title: String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
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

