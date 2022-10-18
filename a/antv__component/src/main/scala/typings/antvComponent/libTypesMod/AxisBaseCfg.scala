package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisBaseCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 文本标签的配置项
    */
  var label: js.UndefOr[AxisLabelCfg] = js.undefined
  
  /**
    * 坐标轴线的配置项
    * @type {AxisLineCfg}
    */
  var line: js.UndefOr[AxisLineCfg] = js.undefined
  
  /**
    * 针对大数据量进行优化配置
    */
  var optimize: js.UndefOr[OptimizeCfg] = js.undefined
  
  /**
    * 处理遮挡时的顺序，默认 ['autoRotate', 'autoHide']
    */
  var overlapOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 坐标轴子刻度线的配置项
    * @type {AxisSubTickLineCfg}
    */
  var subTickLine: js.UndefOr[AxisSubTickLineCfg] = js.undefined
  
  /**
    * 坐标轴刻度线线的配置项
    * @type {AxisTickLineCfg}
    */
  var tickLine: js.UndefOr[AxisTickLineCfg] = js.undefined
  
  /**
    * 坐标轴刻度的集合
    * @type {ListItem[]}
    */
  var ticks: js.Array[ListItem]
  
  /**
    * 标题的配置项
    * @type {AxisTitleCfg}
    */
  var title: js.UndefOr[AxisTitleCfg] = js.undefined
  
  /**
    * 垂直于坐标轴方向的因子，决定文本、title、tickLine 在坐标轴的哪一侧，默认是 1，在坐标轴逆时针方向
    */
  var verticalFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * 垂直于坐标轴方向的限制长度，防止文本超出
    * @type {number}
    */
  var verticalLimitLength: js.UndefOr[Double] = js.undefined
}
object AxisBaseCfg {
  
  inline def apply(container: IGroup, ticks: js.Array[ListItem]): AxisBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisBaseCfg]
  }
  
  extension [Self <: AxisBaseCfg](x: Self) {
    
    inline def setLabel(value: AxisLabelCfg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: AxisLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOptimize(value: OptimizeCfg): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    inline def setOverlapOrder(value: js.Array[String]): Self = StObject.set(x, "overlapOrder", value.asInstanceOf[js.Any])
    
    inline def setOverlapOrderUndefined: Self = StObject.set(x, "overlapOrder", js.undefined)
    
    inline def setOverlapOrderVarargs(value: String*): Self = StObject.set(x, "overlapOrder", js.Array(value*))
    
    inline def setSubTickLine(value: AxisSubTickLineCfg): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    inline def setTickLine(value: AxisTickLineCfg): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    inline def setTicks(value: js.Array[ListItem]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: ListItem*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setTitle(value: AxisTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVerticalFactor(value: Double): Self = StObject.set(x, "verticalFactor", value.asInstanceOf[js.Any])
    
    inline def setVerticalFactorUndefined: Self = StObject.set(x, "verticalFactor", js.undefined)
    
    inline def setVerticalLimitLength(value: Double): Self = StObject.set(x, "verticalLimitLength", value.asInstanceOf[js.Any])
    
    inline def setVerticalLimitLengthUndefined: Self = StObject.set(x, "verticalLimitLength", js.undefined)
  }
}
