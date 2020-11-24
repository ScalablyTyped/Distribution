package typings.antvComponent.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrendCfg extends js.Object {
  
  val areaStyle: js.UndefOr[js.Object] = js.native
  
  val backgroundStyle: js.UndefOr[js.Object] = js.native
  
  val data: js.Array[Double] = js.native
  
  val isArea: js.UndefOr[Boolean] = js.native
  
  val lineStyle: js.UndefOr[js.Object] = js.native
  
  val smooth: js.UndefOr[Boolean] = js.native
}
object TrendCfg {
  
  @scala.inline
  def apply(data: js.Array[Double]): TrendCfg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendCfg]
  }
  
  @scala.inline
  implicit class TrendCfgOps[Self <: TrendCfg] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Double*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaStyle(value: js.Object): Self = this.set("areaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaStyle: Self = this.set("areaStyle", js.undefined)
    
    @scala.inline
    def setBackgroundStyle(value: js.Object): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    
    @scala.inline
    def setIsArea(value: Boolean): Self = this.set("isArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArea: Self = this.set("isArea", js.undefined)
    
    @scala.inline
    def setLineStyle(value: js.Object): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
  }
}
