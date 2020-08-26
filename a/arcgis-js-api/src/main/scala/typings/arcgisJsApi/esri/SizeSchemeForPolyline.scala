package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSchemeForPolyline
  extends Object
     with SizeScheme {
  /**
    * The color of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var color: Color_ = js.native
  /**
    * The maximum width of a line symbol in pixels or points representing features with high data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var maxWidth: Double = js.native
  /**
    * The minimum width of a line symbol in pixels or points representing features with low data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var minWidth: Double = js.native
  /**
    * The color of the line symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var noDataColor: Color_ = js.native
  /**
    * The width of the line symbol in pixels or points used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var noDataWidth: Double = js.native
  /**
    * The opacity of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var opacity: Double = js.native
  /**
    * The default width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
    */
  var width: Double = js.native
}

object SizeSchemeForPolyline {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxWidth: Double,
    minWidth: Double,
    noDataColor: Color_,
    noDataWidth: Double,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): SizeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataWidth = noDataWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSchemeForPolyline]
  }
  @scala.inline
  implicit class SizeSchemeForPolylineOps[Self <: SizeSchemeForPolyline] (val x: Self) extends AnyVal {
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
    def setColor(value: Color_): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDataColor(value: Color_): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDataWidth(value: Double): Self = this.set("noDataWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

