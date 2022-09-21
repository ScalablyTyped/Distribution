package typings.antDesignProLayout

import typings.antDesignProLayout.antDesignProLayoutStrings.italic
import typings.antDesignProLayout.antDesignProLayoutStrings.light
import typings.antDesignProLayout.antDesignProLayoutStrings.none
import typings.antDesignProLayout.antDesignProLayoutStrings.normal
import typings.antDesignProLayout.antDesignProLayoutStrings.oblique
import typings.antDesignProLayout.antDesignProLayoutStrings.weight
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterMarkMod {
  
  @JSImport("@ant-design/pro-layout/es/components/WaterMark", "WaterMark")
  @js.native
  val WaterMark: FC[WaterMarkProps] = js.native
  
  trait WaterMarkProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** 类名 */
    var className: js.UndefOr[String] = js.undefined
    
    /** 水印文字内容 */
    var content: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** 文字颜色 */
    var fontColor: js.UndefOr[String] = js.undefined
    
    /** 文字族 */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** 文字大小 */
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    /** 文字样式 */
    var fontStyle: js.UndefOr[none | normal | italic | oblique] = js.undefined
    
    /** 文字粗细 */
    var fontWeight: js.UndefOr[normal | light | weight | Double] = js.undefined
    
    /** 水印之间的水平间距 */
    var gapX: js.UndefOr[Double] = js.undefined
    
    /** 水印之间的垂直间距 */
    var gapY: js.UndefOr[Double] = js.undefined
    
    /** 水印的高度 */
    var height: js.UndefOr[Double] = js.undefined
    
    /** 高清印图片源, 为了高清屏幕显示，建议使用 2倍或3倍图，优先使用图片渲染水印。 */
    var image: js.UndefOr[String] = js.undefined
    
    /** 水印类名 */
    var markClassName: js.UndefOr[String] = js.undefined
    
    /** 水印样式 */
    var markStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** 水印在canvas 画布上绘制的水平偏移量, 正常情况下，水印绘制在中间位置, 即 offsetTop = gapX / 2 */
    var offsetLeft: js.UndefOr[Double] = js.undefined
    
    /** 水印在canvas 画布上绘制的垂直偏移量，正常情况下，水印绘制在中间位置, 即 offsetTop = gapY / 2 */
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    /** ClassName 前缀 */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** 水印绘制时，旋转的角度，单位 ° */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /** 样式 */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** 水印的宽度 */
    var width: js.UndefOr[Double] = js.undefined
    
    /** 追加的水印元素的z-index */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object WaterMarkProps {
    
    inline def apply(): WaterMarkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaterMarkProps]
    }
    
    extension [Self <: WaterMarkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: none | normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: normal | light | weight | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setGapX(value: Double): Self = StObject.set(x, "gapX", value.asInstanceOf[js.Any])
      
      inline def setGapXUndefined: Self = StObject.set(x, "gapX", js.undefined)
      
      inline def setGapY(value: Double): Self = StObject.set(x, "gapY", value.asInstanceOf[js.Any])
      
      inline def setGapYUndefined: Self = StObject.set(x, "gapY", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMarkClassName(value: String): Self = StObject.set(x, "markClassName", value.asInstanceOf[js.Any])
      
      inline def setMarkClassNameUndefined: Self = StObject.set(x, "markClassName", js.undefined)
      
      inline def setMarkStyle(value: CSSProperties): Self = StObject.set(x, "markStyle", value.asInstanceOf[js.Any])
      
      inline def setMarkStyleUndefined: Self = StObject.set(x, "markStyle", js.undefined)
      
      inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
