package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSchemeForPolygon
  extends Object
     with SizeScheme {
  /**
    * The schema defining the backgound symbol of the feature. This is a fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var background: SizeSchemeForPolygonBackground = js.native
  /**
    * The scheme defining the symbology of the marker symbol used to represent polygon features by size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var marker: SizeSchemeForPoint = js.native
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var opacity: Double = js.native
}

object SizeSchemeForPolygon {
  @scala.inline
  def apply(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    marker: SizeSchemeForPoint,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSchemeForPolygon]
  }
  @scala.inline
  implicit class SizeSchemeForPolygonOps[Self <: SizeSchemeForPolygon] (val x: Self) extends AnyVal {
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
    def setBackground(value: SizeSchemeForPolygonBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: SizeSchemeForPoint): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
  
}

