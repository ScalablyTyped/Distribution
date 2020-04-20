package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SizeSchemeForPoint
  - typings.arcgisJsApi.esri.SizeSchemeForPolyline
  - typings.arcgisJsApi.esri.SizeSchemeForPolygon
*/
trait SizeScheme extends js.Object

object SizeScheme {
  @scala.inline
  def SizeSchemeForPoint(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxSize: Double,
    minSize: Double,
    noDataColor: Color_,
    noDataSize: Double,
    opacity: Double,
    outline: SizeSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataSize = noDataSize.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeScheme]
  }
  @scala.inline
  def SizeSchemeForPolyline(
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
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataWidth = noDataWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeScheme]
  }
  @scala.inline
  def SizeSchemeForPolygon(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    marker: SizeSchemeForPoint,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeScheme]
  }
}

