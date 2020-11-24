package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Envelope extends Geometry {
  
  var mmax: js.UndefOr[Double] = js.native
  
  var mmin: js.UndefOr[Double] = js.native
  
  var xmax: Double = js.native
  
  var xmin: Double = js.native
  
  var ymax: Double = js.native
  
  var ymin: Double = js.native
  
  var zmax: js.UndefOr[Double] = js.native
  
  var zmin: js.UndefOr[Double] = js.native
}
object Envelope {
  
  @scala.inline
  def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Envelope = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
  
  @scala.inline
  implicit class EnvelopeOps[Self <: Envelope] (val x: Self) extends AnyVal {
    
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
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmax(value: Double): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmin(value: Double): Self = this.set("ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMmax(value: Double): Self = this.set("mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmax: Self = this.set("mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = this.set("mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmin: Self = this.set("mmin", js.undefined)
    
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
