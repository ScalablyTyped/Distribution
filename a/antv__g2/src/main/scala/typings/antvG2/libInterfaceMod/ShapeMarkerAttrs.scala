package typings.antvG2.libInterfaceMod

import typings.antvGBase.libTypesMod.PathCommand
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeMarkerAttrs extends StObject {
  
  /**
    * @title marker 样式
    * @description
    * marker 的样式，`ShapeAttrs` 属性结构如下：
    *
    * ```ts
    * {
    *   // x 坐标
    *   x?: number;
    *   // y 坐标
    *   y?: number;
    *   // 圆半径
    *   r?: number;
    *   // 描边颜色
    *   stroke?: string | null;
    *   // 描边透明度
    *   strokeOpacity?: number;
    *   // 填充颜色
    *   fill?: string | null;
    *   // 填充透明度
    *   fillOpacity?: number;
    *   // 整体透明度
    *   opacity?: number;
    *   // 线宽
    *   lineWidth?: number;
    *   // 指定如何绘制每一条线段末端
    *   lineCap?: 'butt' | 'round' | 'square';
    *   // 用来设置2个长度不为0的相连部分（线段，圆弧，曲线）如何连接在一起的属性（长度为0的变形部分，其指定的末端和控制点在同一位置，会被忽略）
    *   lineJoin?: 'bevel' | 'round' | 'miter';
    *   // 设置线的虚线样式，可以指定一个数组。一组描述交替绘制线段和间距（坐标空间单位）长度的数字。 如果数组元素的数量是奇数，数组的元素会被复制并重复。例如， [5, 15, 25] 会变成 [5, 15, 25, 5, 15, 25]。这个属性取决于浏览器是否支持 setLineDash() 函数。
    *   lineDash?: number[] | null;
    *   // Path 路径
    *   path?: string | object[];
    *   // 图形坐标点
    *   points?: object[];
    *   // 宽度
    *   width?: number;
    *   // 高度
    *   height?: number;
    *   // 阴影模糊效果程度
    *   shadowBlur?: number;
    *   // 阴影颜色
    *   shadowColor?: string | null;
    *   // 阴影 x 方向偏移量
    *   shadowOffsetX?: number;
    *   // 阴影 y 方向偏移量
    *   shadowOffsetY?: number;
    *   // 设置文本内容的当前对齐方式
    *   textAlign?: 'start' | 'center' | 'end' | 'left' | 'right';
    *   // 设置在绘制文本时使用的当前文本基线
    *   textBaseline?: 'top' | 'hanging' | 'middle' | 'alphabetic' | 'ideographic' | 'bottom';
    *   // 字体样式
    *   fontStyle?: 'normal' | 'italic' | 'oblique';
    *   // 文本字体大小
    *   fontSize?: number;
    *   // 文本字体
    *   fontFamily?: string;
    *   // 文本粗细
    *   fontWeight?: 'normal' | 'bold' | 'bolder' | 'lighter' | number;
    *   // 字体变体
    *   fontVariant?: 'normal' | 'small-caps' | string;
    *   // 文本行高
    *   lineHeight?: number;
    *   [key: string]: any;
    * }
    * ```
    *
    * @link https://github.com/antvis/g/blob/28e3178b616573e0fa6d59694f1aaca2baaa9766/packages/g-base/src/types.ts#L37|ShapeAttrs
    */
  var style: ShapeAttrs
  
  /**
    * @title marker 的形状。
    */
  var symbol: String | ShapeMarkerSymbol
}
object ShapeMarkerAttrs {
  
  inline def apply(style: ShapeAttrs, symbol: String | ShapeMarkerSymbol): ShapeMarkerAttrs = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMarkerAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeMarkerAttrs] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String | ShapeMarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => js.Array[PathCommand]): Self = StObject.set(x, "symbol", js.Any.fromFunction3(value))
  }
}
