package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSchemeForPolyline
  extends StObject
     with SizeScheme {
  
  /**
  		 * The color of the line symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var color: Color_
  
  /**
  		 * The maximum width of a line symbol in pixels or points representing features with high data values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var maxWidth: Double
  
  /**
  		 * The minimum width of a line symbol in pixels or points representing features with low data values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var minWidth: Double
  
  /**
  		 * The color of the line symbol used to indicate features with no data and features that are out of range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The width of the line symbol in pixels or points used to indicate features with no data and features that are out of range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var noDataWidth: Double
  
  /**
  		 * The opacity of the line symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var opacity: Double
  
  /**
  		 * The default width of the line symbol in pixels or points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolyline)
  		 */
  var width: Double
}
object SizeSchemeForPolyline {
  
  inline def apply(
    color: Color_,
    maxWidth: Double,
    minWidth: Double,
    noDataColor: Color_,
    noDataWidth: Double,
    opacity: Double,
    width: Double
  ): SizeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataWidth = noDataWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSchemeForPolyline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeSchemeForPolyline] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setNoDataWidth(value: Double): Self = StObject.set(x, "noDataWidth", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
