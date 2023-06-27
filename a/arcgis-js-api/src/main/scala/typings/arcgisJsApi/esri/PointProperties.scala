package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointProperties
  extends StObject
     with GeometryProperties {
  
  /**
  		 * The latitude of the point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#latitude)
  		 */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The longitude of the point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#longitude)
  		 */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The m-coordinate of the point in map units.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#m)
  		 */
  var m: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The x-coordinate (easting) of the point in map units.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x)
  		 */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The y-coordinate (northing) of the point in map units.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y)
  		 */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The z-coordinate (or elevation) of the point in map units.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#z)
  		 */
  var z: js.UndefOr[Double] = js.undefined
}
object PointProperties {
  
  inline def apply(): PointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointProperties] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
