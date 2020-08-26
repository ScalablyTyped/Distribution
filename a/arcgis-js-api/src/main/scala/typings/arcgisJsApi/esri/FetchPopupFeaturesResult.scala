package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPopupFeaturesResult extends Object {
  /**
    * An array of promises containing graphics from the selected location. This can be a combination of graphics derived from a [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html), and/or graphics that reside directly on the view, ie. [view.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var allGraphicsPromise: js.UndefOr[js.Promise[js.Array[Graphic]]] = js.native
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that do not have any associated [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html), ie. [view.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var clientOnlyGraphics: js.UndefOr[js.Array[Graphic]] = js.native
  /**
    * The resulting location of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)'s' `hitTest`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var location: js.UndefOr[Point] = js.native
  /**
    * An array of [FetchPopupFeaturesPromisesPerLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesResult)
    */
  var promisesPerLayerView: js.UndefOr[js.Array[FetchPopupFeaturesPromisesPerLayerView]] = js.native
}

object FetchPopupFeaturesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchPopupFeaturesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchPopupFeaturesResult]
  }
  @scala.inline
  implicit class FetchPopupFeaturesResultOps[Self <: FetchPopupFeaturesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllGraphicsPromise(value: js.Promise[js.Array[Graphic]]): Self = this.set("allGraphicsPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllGraphicsPromise: Self = this.set("allGraphicsPromise", js.undefined)
    @scala.inline
    def setClientOnlyGraphicsVarargs(value: Graphic*): Self = this.set("clientOnlyGraphics", js.Array(value :_*))
    @scala.inline
    def setClientOnlyGraphics(value: js.Array[Graphic]): Self = this.set("clientOnlyGraphics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientOnlyGraphics: Self = this.set("clientOnlyGraphics", js.undefined)
    @scala.inline
    def setLocation(value: Point): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPromisesPerLayerViewVarargs(value: FetchPopupFeaturesPromisesPerLayerView*): Self = this.set("promisesPerLayerView", js.Array(value :_*))
    @scala.inline
    def setPromisesPerLayerView(value: js.Array[FetchPopupFeaturesPromisesPerLayerView]): Self = this.set("promisesPerLayerView", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromisesPerLayerView: Self = this.set("promisesPerLayerView", js.undefined)
  }
  
}

