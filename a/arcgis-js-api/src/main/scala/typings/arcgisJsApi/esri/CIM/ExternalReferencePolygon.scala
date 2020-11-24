package typings.arcgisJsApi.esri.CIM

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
  implicit class ExternalReferencePolygonOps[Self <: ExternalReferencePolygon] (val x: Self) extends AnyVal {
    
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
    def setCurveRingsVarargs(value: js.Array[js.Array[Double]]*): Self = this.set("curveRings", js.Array(value :_*))
    
    @scala.inline
    def setCurveRings(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("curveRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurveRings: Self = this.set("curveRings", js.undefined)
    
    @scala.inline
    def setHasM(value: Boolean): Self = this.set("hasM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasM: Self = this.set("hasM", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    
    @scala.inline
    def setRingsVarargs(value: js.Array[js.Array[Double]]*): Self = this.set("rings", js.Array(value :_*))
    
    @scala.inline
    def setRings(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRings: Self = this.set("rings", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
}
