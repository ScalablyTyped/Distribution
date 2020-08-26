package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSchemeForPolygonBackground extends Object {
  /**
    * The color of the fill symbol representing the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var color: Color_ = js.native
  /**
    * Properties for defining the outline of the background fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var outline: SizeSchemeForPolygonBackgroundOutline = js.native
}

object SizeSchemeForPolygonBackground {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    outline: SizeSchemeForPolygonBackgroundOutline,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSchemeForPolygonBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSchemeForPolygonBackground]
  }
  @scala.inline
  implicit class SizeSchemeForPolygonBackgroundOps[Self <: SizeSchemeForPolygonBackground] (val x: Self) extends AnyVal {
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
    def setOutline(value: SizeSchemeForPolygonBackgroundOutline): Self = this.set("outline", value.asInstanceOf[js.Any])
  }
  
}

