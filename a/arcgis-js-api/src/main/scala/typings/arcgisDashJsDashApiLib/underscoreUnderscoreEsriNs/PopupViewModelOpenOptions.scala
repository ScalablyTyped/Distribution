package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupViewModelOpenOptions
  extends stdLib.Object {
  /**
    * **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    *
    * @default false
    */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location), which is the geometry used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    */
  var location: js.UndefOr[Geometry] = js.undefined
  /**
    * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    */
  var promises: js.UndefOr[js.Array[arcgisDashJsDashApiLib.IPromise[_]]] = js.undefined
  /**
    * Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature) geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    *
    * @default false
    */
  var updateLocationEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object PopupViewModelOpenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String = null,
    features: js.Array[Graphic] = null,
    location: Geometry = null,
    promises: js.Array[arcgisDashJsDashApiLib.IPromise[_]] = null,
    title: java.lang.String = null,
    updateLocationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PopupViewModelOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (content != null) __obj.updateDynamic("content")(content)
    if (features != null) __obj.updateDynamic("features")(features)
    if (location != null) __obj.updateDynamic("location")(location)
    if (promises != null) __obj.updateDynamic("promises")(promises)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(updateLocationEnabled)) __obj.updateDynamic("updateLocationEnabled")(updateLocationEnabled)
    __obj.asInstanceOf[PopupViewModelOpenOptions]
  }
}

