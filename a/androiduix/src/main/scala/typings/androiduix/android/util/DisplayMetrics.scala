package typings.androiduix.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMetrics extends js.Object {
  
  var density: Double = js.native
  
  var densityDpi: Double = js.native
  
  var heightPixels: Double = js.native
  
  var scaledDensity: Double = js.native
  
  var widthPixels: Double = js.native
  
  var xdpi: Double = js.native
  
  var ydpi: Double = js.native
}
object DisplayMetrics {
  
  @scala.inline
  def apply(
    density: Double,
    densityDpi: Double,
    heightPixels: Double,
    scaledDensity: Double,
    widthPixels: Double,
    xdpi: Double,
    ydpi: Double
  ): DisplayMetrics = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], densityDpi = densityDpi.asInstanceOf[js.Any], heightPixels = heightPixels.asInstanceOf[js.Any], scaledDensity = scaledDensity.asInstanceOf[js.Any], widthPixels = widthPixels.asInstanceOf[js.Any], xdpi = xdpi.asInstanceOf[js.Any], ydpi = ydpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMetrics]
  }
  
  @scala.inline
  implicit class DisplayMetricsOps[Self <: DisplayMetrics] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityDpi(value: Double): Self = this.set("densityDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledDensity(value: Double): Self = this.set("scaledDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXdpi(value: Double): Self = this.set("xdpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYdpi(value: Double): Self = this.set("ydpi", value.asInstanceOf[js.Any])
  }
}
