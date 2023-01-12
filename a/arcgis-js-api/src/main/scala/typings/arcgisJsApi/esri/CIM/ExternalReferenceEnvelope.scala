package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReferenceEnvelope
  extends StObject
     with ExternalReferenceGeometry {
  
  var mmax: js.UndefOr[Double] = js.undefined
  
  var mmin: js.UndefOr[Double] = js.undefined
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.undefined
  
  var xmax: js.UndefOr[Double] = js.undefined
  
  var xmin: js.UndefOr[Double] = js.undefined
  
  var ymax: js.UndefOr[Double] = js.undefined
  
  var ymin: js.UndefOr[Double] = js.undefined
  
  var zmax: js.UndefOr[Double] = js.undefined
  
  var zmin: js.UndefOr[Double] = js.undefined
}
object ExternalReferenceEnvelope {
  
  inline def apply(): ExternalReferenceEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferenceEnvelope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalReferenceEnvelope] (val x: Self) extends AnyVal {
    
    inline def setMmax(value: Double): Self = StObject.set(x, "mmax", value.asInstanceOf[js.Any])
    
    inline def setMmaxUndefined: Self = StObject.set(x, "mmax", js.undefined)
    
    inline def setMmin(value: Double): Self = StObject.set(x, "mmin", value.asInstanceOf[js.Any])
    
    inline def setMminUndefined: Self = StObject.set(x, "mmin", js.undefined)
    
    inline def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    inline def setXmaxUndefined: Self = StObject.set(x, "xmax", js.undefined)
    
    inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    inline def setXminUndefined: Self = StObject.set(x, "xmin", js.undefined)
    
    inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    inline def setYmaxUndefined: Self = StObject.set(x, "ymax", js.undefined)
    
    inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    
    inline def setYminUndefined: Self = StObject.set(x, "ymin", js.undefined)
    
    inline def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    inline def setZmaxUndefined: Self = StObject.set(x, "zmax", js.undefined)
    
    inline def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
    
    inline def setZminUndefined: Self = StObject.set(x, "zmin", js.undefined)
  }
}
