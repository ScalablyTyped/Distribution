package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchPopupFeaturesPromisesPerLayerView extends Object {
  /**
    * The associated [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) in which the features are fetched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var layerView: LayerView
  /**
    * A promise containing an array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) for the selected location associated with a specific [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var promise: js.Promise[js.Array[Graphic]]
}

object FetchPopupFeaturesPromisesPerLayerView {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layerView: LayerView,
    promise: js.Promise[js.Array[Graphic]],
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchPopupFeaturesPromisesPerLayerView = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerView = layerView.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchPopupFeaturesPromisesPerLayerView]
  }
}

