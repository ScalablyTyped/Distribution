package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelSize extends StObject {
  
  /**
  		 * Spatial reference to be used for the request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#PixelSize)
  		 */
  var spatialReference: js.UndefOr[PixelSizeSpatialReference] = js.undefined
  
  /**
  		 * Represents the size of one pixel in map units along the x axis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#PixelSize)
  		 */
  var x: Double
  
  /**
  		 * Represents the size of one pixel in map units along the y axis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#PixelSize)
  		 */
  var y: Double
}
object PixelSize {
  
  inline def apply(x: Double, y: Double): PixelSize = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelSize] (val x: Self) extends AnyVal {
    
    inline def setSpatialReference(value: PixelSizeSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
