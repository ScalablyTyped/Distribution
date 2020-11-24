package typings.antvComponent.sliderSliderMod

import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderCfg extends GroupComponentCfg {
  
  val backgroundStyle: js.UndefOr[js.Any] = js.native
  
  val end: js.UndefOr[Double] = js.native
  
  val foregroundStyle: js.UndefOr[js.Any] = js.native
  
  val handlerStyle: js.UndefOr[js.Any] = js.native
  
  val height: Double = js.native
  
  val maxLimit: js.UndefOr[Double] = js.native
  
  val maxText: js.UndefOr[String] = js.native
  
  val minLimit: js.UndefOr[Double] = js.native
  
  val minText: js.UndefOr[String] = js.native
  
  val start: js.UndefOr[Double] = js.native
  
  val textStyle: js.UndefOr[js.Any] = js.native
  
  val trendCfg: js.UndefOr[TrendCfg] = js.native
  
  val width: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
object SliderCfg {
  
  @scala.inline
  def apply(container: IGroup, height: Double, width: Double, x: Double, y: Double): SliderCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderCfg]
  }
  
  @scala.inline
  implicit class SliderCfgOps[Self <: SliderCfg] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundStyle(value: js.Any): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setForegroundStyle(value: js.Any): Self = this.set("foregroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundStyle: Self = this.set("foregroundStyle", js.undefined)
    
    @scala.inline
    def setHandlerStyle(value: js.Any): Self = this.set("handlerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlerStyle: Self = this.set("handlerStyle", js.undefined)
    
    @scala.inline
    def setMaxLimit(value: Double): Self = this.set("maxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLimit: Self = this.set("maxLimit", js.undefined)
    
    @scala.inline
    def setMaxText(value: String): Self = this.set("maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxText: Self = this.set("maxText", js.undefined)
    
    @scala.inline
    def setMinLimit(value: Double): Self = this.set("minLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLimit: Self = this.set("minLimit", js.undefined)
    
    @scala.inline
    def setMinText(value: String): Self = this.set("minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinText: Self = this.set("minText", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTextStyle(value: js.Any): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTrendCfg(value: TrendCfg): Self = this.set("trendCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendCfg: Self = this.set("trendCfg", js.undefined)
  }
}
