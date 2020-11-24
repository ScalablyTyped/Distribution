package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingLayerConfig extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var fps: js.UndefOr[Double] = js.native
  
  var opacityRange: js.UndefOr[js.Array[Double]] = js.native
  
  var radiusRange: js.UndefOr[js.Array[Double]] = js.native
}
object PingLayerConfig {
  
  @scala.inline
  def apply(): PingLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingLayerConfig]
  }
  
  @scala.inline
  implicit class PingLayerConfigOps[Self <: PingLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setOpacityRangeVarargs(value: Double*): Self = this.set("opacityRange", js.Array(value :_*))
    
    @scala.inline
    def setOpacityRange(value: js.Array[Double]): Self = this.set("opacityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacityRange: Self = this.set("opacityRange", js.undefined)
    
    @scala.inline
    def setRadiusRangeVarargs(value: Double*): Self = this.set("radiusRange", js.Array(value :_*))
    
    @scala.inline
    def setRadiusRange(value: js.Array[Double]): Self = this.set("radiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusRange: Self = this.set("radiusRange", js.undefined)
  }
}
