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
  
  @scala.inline
  def apply(): ExternalReferencePolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePolyline]
  }
  
  @scala.inline
  implicit class ExternalReferencePolylineMutableBuilder[Self <: ExternalReferencePolyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurvePath(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "curvePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvePathUndefined: Self = StObject.set(x, "curvePath", js.undefined)
    
    @scala.inline
    def setCurvePathVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "curvePath", js.Array(value :_*))
    
    @scala.inline
    def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
