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
  
  @scala.inline
  def apply(): ExternalReferenceEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferenceEnvelope]
  }
  
  @scala.inline
  implicit class ExternalReferenceEnvelopeMutableBuilder[Self <: ExternalReferenceEnvelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMmax(value: Double): Self = StObject.set(x, "mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMmaxUndefined: Self = StObject.set(x, "mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = StObject.set(x, "mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMminUndefined: Self = StObject.set(x, "mmin", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmaxUndefined: Self = StObject.set(x, "xmax", js.undefined)
    
    @scala.inline
    def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXminUndefined: Self = StObject.set(x, "xmin", js.undefined)
    
    @scala.inline
    def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmaxUndefined: Self = StObject.set(x, "ymax", js.undefined)
    
    @scala.inline
    def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYminUndefined: Self = StObject.set(x, "ymin", js.undefined)
    
    @scala.inline
    def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmaxUndefined: Self = StObject.set(x, "zmax", js.undefined)
    
    @scala.inline
    def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZminUndefined: Self = StObject.set(x, "zmin", js.undefined)
  }
}
