package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisBaseCfg extends GroupComponentCfg {
  
  /**
    * 文本标签的配置项
    */
  var label: js.UndefOr[AxisLabelCfg] = js.native
  
  /**
    * 坐标轴线的配置项
    * @type {AxisLineCfg}
    */
  var line: js.UndefOr[AxisLineCfg] = js.native
  
  /**
    * 处理遮挡时的顺序，默认 ['autoRotate', 'autoHide']
    */
  var overlapOrder: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 坐标轴子刻度线的配置项
    * @type {AxisSubTickLineCfg}
    */
  var subTickLine: js.UndefOr[AxisSubTickLineCfg] = js.native
  
  /**
    * 坐标轴刻度线线的配置项
    * @type {AxisTickLineCfg}
    */
  var tickLine: js.UndefOr[AxisTickLineCfg] = js.native
  
  /**
    * 坐标轴刻度的集合
    * @type {ListItem[]}
    */
  var ticks: js.Array[ListItem] = js.native
  
  /**
    * 标题的配置项
    * @type {AxisTitleCfg}
    */
  var title: js.UndefOr[AxisTitleCfg] = js.native
  
  /**
    * 垂直于坐标轴方向的因子，决定文本、title、tickLine 在坐标轴的哪一侧，默认是 1，在坐标轴逆时针方向
    */
  var verticalFactor: js.UndefOr[Double] = js.native
  
  /**
    * 垂直于坐标轴方向的限制长度，防止文本超出
    * @type {number}
    */
  var verticalLimitLength: js.UndefOr[Double] = js.native
}
object AxisBaseCfg {
  
  @scala.inline
  def apply(container: IGroup, ticks: js.Array[ListItem]): AxisBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisBaseCfg]
  }
  
  @scala.inline
  implicit class AxisBaseCfgOps[Self <: AxisBaseCfg] (val x: Self) extends AnyVal {
    
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
    def setTicksVarargs(value: ListItem*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[ListItem]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: AxisLabelCfg): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: AxisLineCfg): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOverlapOrderVarargs(value: String*): Self = this.set("overlapOrder", js.Array(value :_*))
    
    @scala.inline
    def setOverlapOrder(value: js.Array[String]): Self = this.set("overlapOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapOrder: Self = this.set("overlapOrder", js.undefined)
    
    @scala.inline
    def setSubTickLine(value: AxisSubTickLineCfg): Self = this.set("subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTickLine: Self = this.set("subTickLine", js.undefined)
    
    @scala.inline
    def setTickLine(value: AxisTickLineCfg): Self = this.set("tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLine: Self = this.set("tickLine", js.undefined)
    
    @scala.inline
    def setTitle(value: AxisTitleCfg): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVerticalFactor(value: Double): Self = this.set("verticalFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalFactor: Self = this.set("verticalFactor", js.undefined)
    
    @scala.inline
    def setVerticalLimitLength(value: Double): Self = this.set("verticalLimitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLimitLength: Self = this.set("verticalLimitLength", js.undefined)
  }
}
