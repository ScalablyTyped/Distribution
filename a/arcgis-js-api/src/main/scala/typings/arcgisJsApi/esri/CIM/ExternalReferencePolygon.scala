package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReferencePolygon
  extends StObject
     with ExternalReferenceGeometry {
  
  var curveRings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  var rings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.undefined
}
object ExternalReferencePolygon {
  
  inline def apply(): ExternalReferencePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalReferencePolygon] (val x: Self) extends AnyVal {
    
    inline def setCurveRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "curveRings", value.asInstanceOf[js.Any])
    
    inline def setCurveRingsUndefined: Self = StObject.set(x, "curveRings", js.undefined)
    
    inline def setCurveRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "curveRings", js.Array(value*))
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    inline def setRingsUndefined: Self = StObject.set(x, "rings", js.undefined)
    
    inline def setRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "rings", js.Array(value*))
    
    inline def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
