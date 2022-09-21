package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.`0`
import typings.antvG2.antvG2Booleans.`false`
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryLabelCfg extends StObject {
  
  /**
    * @title 动画配置。
    */
  var animate: js.UndefOr[AnimateOption | `false` | Null] = js.undefined
  
  /**
    * @title 是否自动旋转
    * @description label 是否自动旋转
    * @default true
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 背景
    * @description 用于绘制 label 背景
    */
  var background: js.UndefOr[typings.antvG2.anon.Padding] = js.undefined
  
  /**
    * @title 文本内容
    * @description 展示的文本内容，如果不声明则按照参与映射的第一字段的值进行显示。当 content 为 IGroup 或者 IShape 类型时，请使用相对定位，即 x 和 y 坐标都设为 0，G2 内部会整体做最后的 label 进行定位的。
    * @link 示例： https://g2.antv.vision/zh/examples/pie/basic#pie-custome-label
    */
  var content: js.UndefOr[String | IGroup | IShape | GeometryLabelContentCallback] = js.undefined
  
  /**
    * @title 文本放射状
    * @description 只对极坐标下的文本生效，表示文本是否按照角度进行放射状显示，true 表示开启，false 表示关闭。
    */
  var labelEmit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 标签高度
    * @description 标签高度设置，仅当标签类型 type 为 pie 时生效；也可在主题中设置 pieLabels.labelHeight
    */
  var labelHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 文本连接线
    * @description 用于设置文本连接线的样式属性，null 表示不展示。
    */
  var labelLine: js.UndefOr[Null | Boolean | `0`] = js.undefined
  
  /**
    * @title 文本布局
    * 文本布局类型，支持多种布局函数组合使用。
    *
    * 目前提供了三种：'overlap'，'fixedOverlap'，'limitInShape'：
    * 1. overlap: label 防遮挡，为了防止 label 之间相互覆盖，通过尝试向**四周偏移**来剔除放不下的 label。
    * 2. fixed-overlap: 不改变 label 位置的情况下对相互重叠的 label 进行调整。
    * 3. limit-in-shape: 剔除 shape 容纳不了的 label。
    *
    * @example
    * ```ts
    * layout: {
    *   type: 'overlap',
    * },
    * ```
    */
  var layout: js.UndefOr[GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]] = js.undefined
  
  /**
    * @title 相对数据点的偏移距离, polar 和 theta 坐标系下可使用百分比字符串。
    */
  var offset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @title label 相对于数据点在 X 方向的偏移距离。
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * @title label 相对于数据点在 Y 方向的偏移距离。
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 位置
    * @description 仅当 geometry 为 interval 时生效，指定当前 label 与当前图形的相对位置。
    */
  var position: js.UndefOr[
    (js.Function3[
      /* data */ Datum, 
      /* mappingData */ MappingDatum, 
      /* index */ Double, 
      IntervalGeometryLabelPosition
    ]) | IntervalGeometryLabelPosition
  ] = js.undefined
  
  /**
    * @title 旋转
    * @description 当且仅当 `autoRotate` 为 false 时生效，用于设置文本的旋转角度，**弧度制**。
    */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 文本样式
    * @description label 文本图形属性样式。
    */
  var style: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title 类型
    * @description 用于声明渲染的 label 类型。当用户使用了自定义的 label 类型，需要声明具体的 type 类型，否则会使用默认的 label 类型渲染。
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GeometryLabelCfg {
  
  inline def apply(): GeometryLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryLabelCfg]
  }
  
  extension [Self <: GeometryLabelCfg](x: Self) {
    
    inline def setAnimate(value: AnimateOption | `false`): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateNull: Self = StObject.set(x, "animate", null)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setBackground(value: typings.antvG2.anon.Padding): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContent(value: String | IGroup | IShape | GeometryLabelContentCallback): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction3(
      value: (/* data */ Datum, /* mappingData */ MappingDatum, /* index */ Double) => String | IShape | IGroup
    ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setLabelEmit(value: Boolean): Self = StObject.set(x, "labelEmit", value.asInstanceOf[js.Any])
    
    inline def setLabelEmitUndefined: Self = StObject.set(x, "labelEmit", js.undefined)
    
    inline def setLabelHeight(value: Double): Self = StObject.set(x, "labelHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelHeightUndefined: Self = StObject.set(x, "labelHeight", js.undefined)
    
    inline def setLabelLine(value: Boolean | `0`): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    inline def setLabelLineNull: Self = StObject.set(x, "labelLine", null)
    
    inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    inline def setLayout(value: GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: GeometryLabelLayoutCfg*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(
      value: (js.Function3[
          /* data */ Datum, 
          /* mappingData */ MappingDatum, 
          /* index */ Double, 
          IntervalGeometryLabelPosition
        ]) | IntervalGeometryLabelPosition
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction3(
      value: (/* data */ Datum, /* mappingData */ MappingDatum, /* index */ Double) => IntervalGeometryLabelPosition
    ): Self = StObject.set(x, "position", js.Any.fromFunction3(value))
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setStyle(value: LooseObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
