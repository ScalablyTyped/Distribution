package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSchemeForPolygon
  extends StObject
     with SizeScheme {
  
  /**
  		 * The schema defining the backgound symbol of the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
  		 */
  var background: SizeSchemeForPolygonBackground
  
  /**
  		 * The scheme defining the symbology of the marker symbol used to represent polygon features by size.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
  		 */
  var marker: SizeSchemeForPoint
  
  /**
  		 * The opacity of the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
  		 */
  var opacity: Double
}
object SizeSchemeForPolygon {
  
  inline def apply(background: SizeSchemeForPolygonBackground, marker: SizeSchemeForPoint, opacity: Double): SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSchemeForPolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeSchemeForPolygon] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: SizeSchemeForPolygonBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: SizeSchemeForPoint): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
