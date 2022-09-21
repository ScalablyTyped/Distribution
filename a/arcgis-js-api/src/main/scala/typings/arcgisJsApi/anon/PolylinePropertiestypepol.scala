package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PolylineProperties & {  type :'polyline'} */
trait PolylinePropertiestypepol extends StObject {
  
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
    * An array of paths, or line segments, that make up the polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths)
    */
  var paths: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  /**
    * The spatial reference of the geometry.
    *
    * @default WGS84 (wkid: 4326)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  var `type`: polyline
}
object PolylinePropertiestypepol {
  
  inline def apply(): PolylinePropertiestypepol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("polyline")
    __obj.asInstanceOf[PolylinePropertiestypepol]
  }
  
  extension [Self <: PolylinePropertiestypepol](x: Self) {
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setType(value: polyline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
