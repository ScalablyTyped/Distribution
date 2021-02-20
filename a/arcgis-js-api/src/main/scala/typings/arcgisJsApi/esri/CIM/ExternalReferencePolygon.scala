package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalReferencePolygon extends ExternalReferenceGeometry {
  
  var curveRings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  
  var hasM: js.UndefOr[Boolean] = js.native
  
  var hasZ: js.UndefOr[Boolean] = js.native
  
  var rings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.native
}
object ExternalReferencePolygon {
  
  @scala.inline
  def apply(): ExternalReferencePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePolygon]
  }
  
  @scala.inline
  implicit class ExternalReferencePolygonMutableBuilder[Self <: ExternalReferencePolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurveRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "curveRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveRingsUndefined: Self = StObject.set(x, "curveRings", js.undefined)
    
    @scala.inline
    def setCurveRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "curveRings", js.Array(value :_*))
    
    @scala.inline
    def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    @scala.inline
    def setRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingsUndefined: Self = StObject.set(x, "rings", js.undefined)
    
    @scala.inline
    def setRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "rings", js.Array(value :_*))
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
