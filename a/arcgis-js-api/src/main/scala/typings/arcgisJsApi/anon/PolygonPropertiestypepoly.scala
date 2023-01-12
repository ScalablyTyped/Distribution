package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.esri.PointProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PolygonProperties & {  type :'polygon'} */
trait PolygonPropertiestypepoly extends StObject {
  
  /**
    * The centroid of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
    */
  var centroid: js.UndefOr[PointProperties] = js.undefined
  
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
    * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
    */
  var isSelfIntersecting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of rings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
    */
  var rings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  /**
    * The spatial reference of the geometry.
    *
    * @default WGS84 (wkid: 4326)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  var `type`: polygon
}
object PolygonPropertiestypepoly {
  
  inline def apply(): PolygonPropertiestypepoly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("polygon")
    __obj.asInstanceOf[PolygonPropertiestypepoly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonPropertiestypepoly] (val x: Self) extends AnyVal {
    
    inline def setCentroid(value: PointProperties): Self = StObject.set(x, "centroid", value.asInstanceOf[js.Any])
    
    inline def setCentroidUndefined: Self = StObject.set(x, "centroid", js.undefined)
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setIsSelfIntersecting(value: Boolean): Self = StObject.set(x, "isSelfIntersecting", value.asInstanceOf[js.Any])
    
    inline def setIsSelfIntersectingUndefined: Self = StObject.set(x, "isSelfIntersecting", js.undefined)
    
    inline def setRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    inline def setRingsUndefined: Self = StObject.set(x, "rings", js.undefined)
    
    inline def setRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "rings", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setType(value: polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
