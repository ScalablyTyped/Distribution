package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsSketch
  extends stdLib.Object {
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.undefined
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.undefined
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.undefined
}

object SupportingWidgetDefaultsSketch {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    defaultUpdateOptions: js.Any = null,
    markerSymbol: SimpleMarkerSymbol = null,
    polygonSymbol: SimpleFillSymbol = null,
    polylineSymbol: SimpleLineSymbol = null
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (defaultUpdateOptions != null) __obj.updateDynamic("defaultUpdateOptions")(defaultUpdateOptions)
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol)
    if (polygonSymbol != null) __obj.updateDynamic("polygonSymbol")(polygonSymbol)
    if (polylineSymbol != null) __obj.updateDynamic("polylineSymbol")(polylineSymbol)
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
}

