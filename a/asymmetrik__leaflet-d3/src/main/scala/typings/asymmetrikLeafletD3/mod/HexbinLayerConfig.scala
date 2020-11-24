package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexbinLayerConfig extends js.Object {
  
  var colorRange: js.UndefOr[js.Array[String]] = js.native
  
  var colorScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pointerEvents: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radiusRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var radiusScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object HexbinLayerConfig {
  
  @scala.inline
  def apply(): HexbinLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexbinLayerConfig]
  }
  
  @scala.inline
  implicit class HexbinLayerConfigOps[Self <: HexbinLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setColorRangeVarargs(value: String*): Self = this.set("colorRange", js.Array(value :_*))
    
    @scala.inline
    def setColorRange(value: js.Array[String]): Self = this.set("colorRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRange: Self = this.set("colorRange", js.undefined)
    
    @scala.inline
    def setColorScaleExtent(value: js.Tuple2[Double, Double]): Self = this.set("colorScaleExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScaleExtent: Self = this.set("colorScaleExtent", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRadiusRange(value: js.Tuple2[Double, Double]): Self = this.set("radiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusRange: Self = this.set("radiusRange", js.undefined)
    
    @scala.inline
    def setRadiusScaleExtent(value: js.Tuple2[Double, Double]): Self = this.set("radiusScaleExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusScaleExtent: Self = this.set("radiusScaleExtent", js.undefined)
  }
}
