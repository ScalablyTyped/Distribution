package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportingWidgetDefaultsSketch extends Object {
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[js.Any] = js.native
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.native
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.native
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.native
}

object SupportingWidgetDefaultsSketch {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
  @scala.inline
  implicit class SupportingWidgetDefaultsSketchOps[Self <: SupportingWidgetDefaultsSketch] (val x: Self) extends AnyVal {
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
    def setDefaultUpdateOptions(value: js.Any): Self = this.set("defaultUpdateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultUpdateOptions: Self = this.set("defaultUpdateOptions", js.undefined)
    @scala.inline
    def setMarkerSymbol(value: SimpleMarkerSymbol): Self = this.set("markerSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSymbol: Self = this.set("markerSymbol", js.undefined)
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbol): Self = this.set("polygonSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonSymbol: Self = this.set("polygonSymbol", js.undefined)
    @scala.inline
    def setPolylineSymbol(value: SimpleLineSymbol): Self = this.set("polylineSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineSymbol: Self = this.set("polylineSymbol", js.undefined)
  }
  
}

