package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.AxisLabelCfg
import typings.antvComponent.libTypesMod.AxisLineCfg
import typings.antvComponent.libTypesMod.AxisSubTickLineCfg
import typings.antvComponent.libTypesMod.AxisTickLineCfg
import typings.antvComponent.libTypesMod.AxisTitleCfg
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisCfg extends StObject {
  
  /**
    * @title 动画
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 动画参数
    */
  var animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
  
  /**
    * @title 网格线
    * @description 坐标轴网格线的配置项，null 表示不展示。
    */
  var grid: js.UndefOr[AxisGridCfg | Null] = js.undefined
  
  /**
    * @title 文本标签
    * @description
    * 文本标签的配置项，null 表示不展示。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   // 坐标轴文本的样式
    *   style?: ShapeAttrs;
    *   // label 的偏移量
    *   offset?: number;
    *   // 文本旋转角度
    *   rotate?: number;
    *   // 格式化函数
    *   formatter?: (text: string, item: ListItem, index: number) => any;
    *   // 是否自动旋转，默认 false
    *   autoRotate?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
    *   // 是否自动隐藏，默认 true
    *   autoHide?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
    *   // 是否自动省略，默认 false
    *   autoEllipsis?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L127|AxisLabelCfg
    */
  var label: js.UndefOr[AxisLabelCfg | Null] = js.undefined
  
  /**
    * @title 轴线
    * @description
    * 坐标轴线的配置项，null 表示不展示。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   style?: ShapeAttrs; // 坐标轴线的样式配置项
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L91|AxisLineCfg
    */
  var line: js.UndefOr[AxisLineCfg | Null] = js.undefined
  
  /**
    * @title 坐标轴的位置
    * @description 适用于直角坐标系，设置坐标轴的位置。
    */
  var position: js.UndefOr[top | bottom | right | left] = js.undefined
  
  /**
    * @title 子刻度线
    * @description
    * 坐标轴子刻度线的配置项，null 表示不展示。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   style?: ShapeAttrs; // 坐标轴刻度线的样式配置项
    *   count?: number; // 子刻度个数
    *   length?: number; // 子刻度线长度
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L169|AxisSubTickLineCfg
    */
  var subTickLine: js.UndefOr[AxisSubTickLineCfg | Null] = js.undefined
  
  /**
    * @title 刻度线线
    * @description
    * 坐标轴刻度线线的配置项，null 表示不展示。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   style?: ShapeAttrs; // 坐标轴刻度线的样式配置项
    *   alignTick?: boolean; // 是否同 tick 对齐
    *   length?: number;  // 长度
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L103|AxisTickLineCfg
    */
  var tickLine: js.UndefOr[AxisTickLineCfg | Null] = js.undefined
  
  /**
    * @title 标题
    * @description
    * 标题的配置项，null 表示不展示。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   offset?: number; // 标题距离坐标轴的距离
    *   style?: ShapeAttrs; // 标题文本配置项
    *   autoRotate?: boolean; // 是否自动旋转
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L191|AxisTitleCfg
    */
  var title: js.UndefOr[AxisTitleCfg | Null] = js.undefined
  
  /**
    * @title 是否渲染在画布顶层
    * @description 防止部分图形中，需要将 axis 显示在图形上面，避免被图形遮挡
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 坐标轴 label 的方向
    * @description 标记坐标轴 label 的方向，左侧为 1，右侧为 -1。
    */
  var verticalFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 坐标轴垂直方向的最大限制长度
    * @description
    * 配置坐标轴垂直方向的最大限制长度，对文本自适应有很大影响。
    * 1. 可以直接设置像素值，如 100；
    * 2. 也可设置绝对值，如 0.2，如果是 x 轴，则相对于图表的高度，如果是 y 轴，则相对于图表的宽度
    *
    * 在 G2 中，x 轴的文本默认最大高度为图表高度的 1/2，y 轴的文本默认最大长度为图表宽度的 1/3
    */
  var verticalLimitLength: js.UndefOr[Double] = js.undefined
}
object AxisCfg {
  
  inline def apply(): AxisCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCfg]
  }
  
  extension [Self <: AxisCfg](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setGrid(value: AxisGridCfg): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridNull: Self = StObject.set(x, "grid", null)
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setLabel(value: AxisLabelCfg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: AxisLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: top | bottom | right | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSubTickLine(value: AxisSubTickLineCfg): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setSubTickLineNull: Self = StObject.set(x, "subTickLine", null)
    
    inline def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    inline def setTickLine(value: AxisTickLineCfg): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLineNull: Self = StObject.set(x, "tickLine", null)
    
    inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    inline def setTitle(value: AxisTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVerticalFactor(value: Double): Self = StObject.set(x, "verticalFactor", value.asInstanceOf[js.Any])
    
    inline def setVerticalFactorUndefined: Self = StObject.set(x, "verticalFactor", js.undefined)
    
    inline def setVerticalLimitLength(value: Double): Self = StObject.set(x, "verticalLimitLength", value.asInstanceOf[js.Any])
    
    inline def setVerticalLimitLengthUndefined: Self = StObject.set(x, "verticalLimitLength", js.undefined)
  }
}
