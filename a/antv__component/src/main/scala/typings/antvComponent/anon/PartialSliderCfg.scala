package typings.antvComponent.anon

import typings.antvComponent.sliderSliderMod.TrendCfg
import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/component.@antv/component/lib/slider/slider.SliderCfg> */
@js.native
trait PartialSliderCfg extends js.Object {
  
  var LocationType: js.UndefOr[String] = js.native
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var animateOption: js.UndefOr[typings.antvComponent.typesMod.AnimateOption] = js.native
  
  var backgroundStyle: js.UndefOr[js.Any] = js.native
  
  var capture: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[IGroup] = js.native
  
  var defaultCfg: js.UndefOr[js.Object] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var events: js.UndefOr[js.Object] = js.native
  
  var foregroundStyle: js.UndefOr[js.Any] = js.native
  
  var group: js.UndefOr[IGroup] = js.native
  
  var handlerStyle: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var maxLimit: js.UndefOr[Double] = js.native
  
  var maxText: js.UndefOr[String] = js.native
  
  var minLimit: js.UndefOr[Double] = js.native
  
  var minText: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offsetX: js.UndefOr[Double] = js.native
  
  var offsetY: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var textStyle: js.UndefOr[js.Any] = js.native
  
  var trendCfg: js.UndefOr[TrendCfg] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var updateAutoRender: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object PartialSliderCfg {
  
  @scala.inline
  def apply(): PartialSliderCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderCfg]
  }
  
  @scala.inline
  implicit class PartialSliderCfgOps[Self <: PartialSliderCfg] (val x: Self) extends AnyVal {
    
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
    def setLocationType(value: String): Self = this.set("LocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("LocationType", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAnimateOption(value: typings.antvComponent.typesMod.AnimateOption): Self = this.set("animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOption: Self = this.set("animateOption", js.undefined)
    
    @scala.inline
    def setBackgroundStyle(value: js.Any): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setContainer(value: IGroup): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefaultCfg(value: js.Object): Self = this.set("defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCfg: Self = this.set("defaultCfg", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setForegroundStyle(value: js.Any): Self = this.set("foregroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundStyle: Self = this.set("foregroundStyle", js.undefined)
    
    @scala.inline
    def setGroup(value: IGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHandlerStyle(value: js.Any): Self = this.set("handlerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlerStyle: Self = this.set("handlerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
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
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = this.set("updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAutoRender: Self = this.set("updateAutoRender", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
