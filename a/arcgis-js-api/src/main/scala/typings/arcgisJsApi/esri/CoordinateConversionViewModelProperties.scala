package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateConversionViewModelProperties extends GoToProperties {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions)
    */
  var conversions: js.UndefOr[CollectionProperties[Conversion]] = js.native
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). Setting this property will update all [conversions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#currentLocation)
    */
  var currentLocation: js.UndefOr[PointProperties] = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.  The default formats are `basemap`, `dd`, `ddm`, `dms`, `mgrs`, `usng`, `utm`, and `xy`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#formats)
    */
  var formats: js.UndefOr[CollectionProperties[Format]] = js.native
  /**
    * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#locationSymbol)
    */
  var locationSymbol: js.UndefOr[SimpleMarkerSymbolProperties | PictureMarkerSymbolProperties] = js.native
  /**
    * Describes the current mode of the widget.
    *   * While in `live` mode, the widget will update as the cursor moves.
    *   * While in `capture` mode, the widget will update on mouse click and display a graphic marking the current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#mode)
    *
    * @default live
    */
  var mode: js.UndefOr[live | capture] = js.native
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).  This only affects conversions that cannot be performed in the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#requestDelay)
    *
    * @default 300
    */
  var requestDelay: js.UndefOr[Double] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object CoordinateConversionViewModelProperties {
  @scala.inline
  def apply(): CoordinateConversionViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionViewModelProperties]
  }
  @scala.inline
  implicit class CoordinateConversionViewModelPropertiesOps[Self <: CoordinateConversionViewModelProperties] (val x: Self) extends AnyVal {
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
    def setConversionsVarargs(value: Conversion*): Self = this.set("conversions", js.Array(value :_*))
    @scala.inline
    def setConversions(value: CollectionProperties[Conversion]): Self = this.set("conversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversions: Self = this.set("conversions", js.undefined)
    @scala.inline
    def setCurrentLocation(value: PointProperties): Self = this.set("currentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLocation: Self = this.set("currentLocation", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: Format*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: CollectionProperties[Format]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setLocationSymbol(value: SimpleMarkerSymbolProperties | PictureMarkerSymbolProperties): Self = this.set("locationSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationSymbol: Self = this.set("locationSymbol", js.undefined)
    @scala.inline
    def setMode(value: live | capture): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRequestDelay(value: Double): Self = this.set("requestDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestDelay: Self = this.set("requestDelay", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

