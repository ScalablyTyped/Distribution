package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchPopupFeaturesResult extends Object {
  /**
    * An array of promises containing graphics from the selected location. This can be a combination of graphics derived from a [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html), and/or graphics that reside directly on the view, ie. [view.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var allGraphicsPromise: js.UndefOr[js.Promise[js.Array[Graphic]]] = js.undefined
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that do not have any associated [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html), ie. [view.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var clientOnlyGraphics: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * The resulting location of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)'s' `hitTest`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var location: js.UndefOr[Point] = js.undefined
  /**
    * An array of [FetchPopupFeaturesPromisesPerLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var promisesPerLayerView: js.UndefOr[js.Array[FetchPopupFeaturesPromisesPerLayerView]] = js.undefined
}

object FetchPopupFeaturesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    allGraphicsPromise: js.Promise[js.Array[Graphic]] = null,
    clientOnlyGraphics: js.Array[Graphic] = null,
    location: Point = null,
    promisesPerLayerView: js.Array[FetchPopupFeaturesPromisesPerLayerView] = null
  ): FetchPopupFeaturesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (allGraphicsPromise != null) __obj.updateDynamic("allGraphicsPromise")(allGraphicsPromise.asInstanceOf[js.Any])
    if (clientOnlyGraphics != null) __obj.updateDynamic("clientOnlyGraphics")(clientOnlyGraphics.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (promisesPerLayerView != null) __obj.updateDynamic("promisesPerLayerView")(promisesPerLayerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPopupFeaturesResult]
  }
}

