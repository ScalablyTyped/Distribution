package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalReferencePolyline extends ExternalReferenceGeometry {
  
  var curvePath: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  
  var hasM: js.UndefOr[Boolean] = js.native
  
  var hasZ: js.UndefOr[Boolean] = js.native
  
  var paths: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.native
}
object ExternalReferencePolyline {
  
  @scala.inline
  def apply(): ExternalReferencePolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePolyline]
  }
  
  @scala.inline
  implicit class ExternalReferencePolylineOps[Self <: ExternalReferencePolyline] (val x: Self) extends AnyVal {
    
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
    def setCurvePathVarargs(value: js.Array[js.Array[Double]]*): Self = this.set("curvePath", js.Array(value :_*))
    
    @scala.inline
    def setCurvePath(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("curvePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurvePath: Self = this.set("curvePath", js.undefined)
    
    @scala.inline
    def setHasM(value: Boolean): Self = this.set("hasM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasM: Self = this.set("hasM", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
}
