package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsSketch
  extends stdLib.Object {
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
  /**
    * An object containing the [updateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var updateOptions: js.UndefOr[js.Any] = js.undefined
}

object SupportingWidgetDefaultsSketch {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    markerSymbol: SimpleMarkerSymbol = null,
    polygonSymbol: SimpleFillSymbol = null,
    polylineSymbol: SimpleLineSymbol = null,
    updateOptions: js.Any = null
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol)
    if (polygonSymbol != null) __obj.updateDynamic("polygonSymbol")(polygonSymbol)
    if (polylineSymbol != null) __obj.updateDynamic("polylineSymbol")(polylineSymbol)
    if (updateOptions != null) __obj.updateDynamic("updateOptions")(updateOptions)
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
}

