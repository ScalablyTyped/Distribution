package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReferencePolyline
  extends StObject
     with ExternalReferenceGeometry {
  
  var curvePath: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  var paths: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.undefined
}
object ExternalReferencePolyline {
  
  inline def apply(): ExternalReferencePolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePolyline]
  }
  
  extension [Self <: ExternalReferencePolyline](x: Self) {
    
    inline def setCurvePath(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "curvePath", value.asInstanceOf[js.Any])
    
    inline def setCurvePathUndefined: Self = StObject.set(x, "curvePath", js.undefined)
    
    inline def setCurvePathVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "curvePath", js.Array(value :_*))
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    inline def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
