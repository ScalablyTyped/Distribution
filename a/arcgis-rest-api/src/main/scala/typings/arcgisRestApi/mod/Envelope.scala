package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
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
  implicit class EnvelopeMutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMmax(value: Double): Self = StObject.set(x, "mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMmaxUndefined: Self = StObject.set(x, "mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = StObject.set(x, "mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMminUndefined: Self = StObject.set(x, "mmin", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    
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
