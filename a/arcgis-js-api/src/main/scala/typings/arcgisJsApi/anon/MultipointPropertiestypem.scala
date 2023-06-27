package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MultipointProperties & {  type :'multipoint'} */
trait MultipointPropertiestypem extends StObject {
  
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
  		 * An array of points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
  		 */
  var points: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
  		 * The spatial reference of the geometry.
  		 *
  		 * @default WGS84 (wkid: 4326)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  var `type`: multipoint
}
object MultipointPropertiestypem {
  
  inline def apply(): MultipointPropertiestypem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("multipoint")
    __obj.asInstanceOf[MultipointPropertiestypem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipointPropertiestypem] (val x: Self) extends AnyVal {
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setPoints(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setType(value: multipoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
