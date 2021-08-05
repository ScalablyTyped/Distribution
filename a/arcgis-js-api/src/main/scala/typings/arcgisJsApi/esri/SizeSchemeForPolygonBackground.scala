package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSchemeForPolygonBackground
  extends StObject
     with Object {
  
  /**
    * The color of the fill symbol representing the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var color: Color_
  
  /**
    * Properties for defining the outline of the background fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var outline: SizeSchemeForPolygonBackgroundOutline
}
object SizeSchemeForPolygonBackground {
  
  inline def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    outline: SizeSchemeForPolygonBackgroundOutline,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSchemeForPolygonBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSchemeForPolygonBackground]
  }
  
  extension [Self <: SizeSchemeForPolygonBackground](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: SizeSchemeForPolygonBackgroundOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
