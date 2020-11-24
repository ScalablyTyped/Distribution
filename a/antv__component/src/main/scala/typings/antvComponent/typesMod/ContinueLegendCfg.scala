package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendCfg extends LegendBaseCfg {
  
  /**
    * 图例的颜色，可以写多个颜色
    * @type {number[]}
    */
  var colors: js.Array[Double] = js.native
  
  /**
    * 滑块的配置项
    * @type {ContinueLegendHandlerCfg}
    */
  var handler: ContinueLegendHandlerCfg = js.native
  
  /**
    * 文本的配置项
    * @type {ContinueLegendLabelCfg}
    */
  var label: ContinueLegendLabelCfg = js.native
  
  /**
    * 选择范围的最大值
    * @type {number}
    */
  var max: Double = js.native
  
  /**
    * 选择范围的最小值
    * @type {number}
    */
  var min: Double = js.native
  
  /**
    * 图例滑轨（背景）的配置项
    * @type {ContinueLegendRailCfg}
    */
  var rail: ContinueLegendRailCfg = js.native
  
  /**
    * 是否可以滑动
    * @type {boolean}
    */
  var slidable: Boolean = js.native
  
  /**
    * 选择范围的色块配置项
    * @type {ContinueLegendTrackCfg}
    */
  var track: ContinueLegendTrackCfg = js.native
  
  /**
    * 选择的值
    * @type {number[]}
    */
  var value: js.Array[Double] = js.native
}
object ContinueLegendCfg {
  
  @scala.inline
  def apply(
    colors: js.Array[Double],
    container: IGroup,
    handler: ContinueLegendHandlerCfg,
    label: ContinueLegendLabelCfg,
    max: Double,
    min: Double,
    rail: ContinueLegendRailCfg,
    slidable: Boolean,
    track: ContinueLegendTrackCfg,
    value: js.Array[Double]
  ): ContinueLegendCfg = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], slidable = slidable.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueLegendCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendCfgOps[Self <: ContinueLegendCfg] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: ContinueLegendHandlerCfg): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ContinueLegendLabelCfg): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRail(value: ContinueLegendRailCfg): Self = this.set("rail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidable(value: Boolean): Self = this.set("slidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: ContinueLegendTrackCfg): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
