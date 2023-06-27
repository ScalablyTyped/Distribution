package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PointProperties & {  type :'point'} */
trait PointPropertiestypepoint extends StObject {
  
  /**
  		 * Indicates if the geometry has M values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasM)
  		 */
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates if the geometry has z-values (elevation).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasZ)
  		 */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
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
  		 * The spatial reference of the geometry.
  		 *
  		 * @default WGS84 (wkid: 4326)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  var `type`: point
  
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
object PointPropertiestypepoint {
  
  inline def apply(): PointPropertiestypepoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[PointPropertiestypepoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointPropertiestypepoint] (val x: Self) extends AnyVal {
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
