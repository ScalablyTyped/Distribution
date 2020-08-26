package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSchemeForPoint
  extends Object
     with LocationScheme {
  /**
    * The fill color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var color: Color_ = js.native
  /**
    * The opacity of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var opacity: Double = js.native
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var outline: LocationSchemeForPointOutline = js.native
  /**
    * The size of the marker symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var size: Double = js.native
}

object LocationSchemeForPoint {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    outline: LocationSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): LocationSchemeForPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSchemeForPoint]
  }
  @scala.inline
  implicit class LocationSchemeForPointOps[Self <: LocationSchemeForPoint] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutline(value: LocationSchemeForPointOutline): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

