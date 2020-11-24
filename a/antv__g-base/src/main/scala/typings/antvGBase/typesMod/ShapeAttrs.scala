package typings.antvGBase.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.antvGBase.antvGBaseStrings.`small-caps`
import typings.antvGBase.antvGBaseStrings.alphabetic
import typings.antvGBase.antvGBaseStrings.bevel
import typings.antvGBase.antvGBaseStrings.bold
import typings.antvGBase.antvGBaseStrings.bolder
import typings.antvGBase.antvGBaseStrings.bottom
import typings.antvGBase.antvGBaseStrings.butt
import typings.antvGBase.antvGBaseStrings.center
import typings.antvGBase.antvGBaseStrings.end
import typings.antvGBase.antvGBaseStrings.hanging
import typings.antvGBase.antvGBaseStrings.ideographic
import typings.antvGBase.antvGBaseStrings.italic
import typings.antvGBase.antvGBaseStrings.left
import typings.antvGBase.antvGBaseStrings.lighter
import typings.antvGBase.antvGBaseStrings.middle
import typings.antvGBase.antvGBaseStrings.miter
import typings.antvGBase.antvGBaseStrings.normal
import typings.antvGBase.antvGBaseStrings.oblique
import typings.antvGBase.antvGBaseStrings.right
import typings.antvGBase.antvGBaseStrings.round
import typings.antvGBase.antvGBaseStrings.square
import typings.antvGBase.antvGBaseStrings.start
import typings.antvGBase.antvGBaseStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeAttrs
  extends /* key */ StringDictionary[js.Any] {
  
  /** 填充颜色 */
  var fill: js.UndefOr[ColorType] = js.native
  
  /** 填充透明度 */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /** 文本字体 */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** 文本字体大小 */
  var fontSize: js.UndefOr[Double] = js.native
  
  /** 字体样式 */
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
  
  /** 字体变体 */
  var fontVariant: js.UndefOr[normal | `small-caps` | String] = js.native
  
  /** 文本粗细 */
  var fontWeight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.native
  
  /** 高度 */
  var height: js.UndefOr[Double] = js.native
  
  /** 指定如何绘制每一条线段末端 */
  var lineCap: js.UndefOr[butt | round | square] = js.native
  
  /**
    * 设置线的虚线样式，可以指定一个数组。一组描述交替绘制线段和间距（坐标空间单位）长度的数字。 如果数组元素的数量是奇数， 数组的元素会被复制并重复。例如， [5, 15, 25] 会变成 [5, 15, 25, 5, 15, 25]。这个属性取决于浏览器是否支持 setLineDash() 函数。
    */
  var lineDash: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** 文本行高 */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /** 用来设置2个长度不为0的相连部分（线段，圆弧，曲线）如何连接在一起的属性（长度为0的变形部分，其指定的末端和控制点在同一位置，会被忽略） */
  var lineJoin: js.UndefOr[bevel | round | miter] = js.native
  
  /** 线宽 */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /** 整体透明度 */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Path 路径 */
  var path: js.UndefOr[String | js.Array[js.Object]] = js.native
  
  /** 图形坐标点 */
  var points: js.UndefOr[js.Array[js.Object]] = js.native
  
  /** 圆半径 */
  var r: js.UndefOr[Double] = js.native
  
  /** 阴影模糊效果程度 */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /** 阴影颜色 */
  var shadowColor: js.UndefOr[ColorType] = js.native
  
  /** 阴影 x 方向偏移量 */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /** 阴影 y 方向偏移量 */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /** 描边颜色 */
  var stroke: js.UndefOr[ColorType] = js.native
  
  /** 描边透明度 */
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  /** 设置文本内容的当前对齐方式 */
  var textAlign: js.UndefOr[start | center | end | left | right] = js.native
  
  /** 设置在绘制文本时使用的当前文本基线 */
  var textBaseline: js.UndefOr[top | hanging | middle | alphabetic | ideographic | bottom] = js.native
  
  /** 宽度 */
  var width: js.UndefOr[Double] = js.native
  
  /** x 坐标 */
  var x: js.UndefOr[Double] = js.native
  
  /** y 坐标 */
  var y: js.UndefOr[Double] = js.native
}
object ShapeAttrs {
  
  @scala.inline
  def apply(): ShapeAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeAttrs]
  }
  
  @scala.inline
  implicit class ShapeAttrsOps[Self <: ShapeAttrs] (val x: Self) extends AnyVal {
    
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
    def setFill(value: ColorType): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillNull: Self = this.set("fill", null)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic | oblique): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: normal | `small-caps` | String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal | bold | bolder | lighter | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineCap(value: butt | round | square): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDash: Self = this.set("lineDash", js.undefined)
    
    @scala.inline
    def setLineDashNull: Self = this.set("lineDash", null)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineJoin(value: bevel | round | miter): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: js.Object*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[js.Object]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: js.Object*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[js.Object]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: ColorType): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowColorNull: Self = this.set("shadowColor", null)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setStroke(value: ColorType): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeNull: Self = this.set("stroke", null)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setTextAlign(value: start | center | end | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextBaseline(value: top | hanging | middle | alphabetic | ideographic | bottom): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
    
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
