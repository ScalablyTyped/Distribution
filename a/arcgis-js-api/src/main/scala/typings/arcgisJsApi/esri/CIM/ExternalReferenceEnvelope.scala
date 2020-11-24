package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalReferenceEnvelope extends ExternalReferenceGeometry {
  
  var mmax: js.UndefOr[Double] = js.native
  
  var mmin: js.UndefOr[Double] = js.native
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.native
  
  var xmax: js.UndefOr[Double] = js.native
  
  var xmin: js.UndefOr[Double] = js.native
  
  var ymax: js.UndefOr[Double] = js.native
  
  var ymin: js.UndefOr[Double] = js.native
  
  var zmax: js.UndefOr[Double] = js.native
  
  var zmin: js.UndefOr[Double] = js.native
}
object ExternalReferenceEnvelope {
  
  @scala.inline
  def apply(): ExternalReferenceEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferenceEnvelope]
  }
  
  @scala.inline
  implicit class ExternalReferenceEnvelopeOps[Self <: ExternalReferenceEnvelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMmax(value: Double): Self = this.set("mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmax: Self = this.set("mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = this.set("mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmin: Self = this.set("mmin", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmax: Self = this.set("xmax", js.undefined)
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmin: Self = this.set("xmin", js.undefined)
    
    @scala.inline
    def setYmax(value: Double): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmax: Self = this.set("ymax", js.undefined)
    
    @scala.inline
    def setYmin(value: Double): Self = this.set("ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmin: Self = this.set("ymin", js.undefined)
    
    @scala.inline
    def setZmax(value: Double): Self = this.set("zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZmax: Self = this.set("zmax", js.undefined)
    
    @scala.inline
    def setZmin(value: Double): Self = this.set("zmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZmin: Self = this.set("zmin", js.undefined)
  }
}
