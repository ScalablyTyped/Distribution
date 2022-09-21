package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.LineCap
import typings.antvG2.antvG2Strings.horizontal
import typings.antvG2.antvG2Strings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollbarCfg extends StObject {
  
  /**
    * @title 滚动的时候是否开启动画，默认跟随 view 中 animate 配置
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 对应水平滚动条，为 X 轴每个分类字段的宽度；对于垂直滚动条，为 X 轴每个分类字段的高度
    */
  var categorySize: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 高度，在 horizontal 下生效
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 可选 padding
    */
  var padding: js.UndefOr[Padding] = js.undefined
  
  /**
    * @title 主题样式设置, 暂不提供 hover 高亮滑块样式配置
    */
  var style: js.UndefOr[LineCap] = js.undefined
  
  /**
    * @title 滚动条类型，默认 horizontal
    */
  var `type`: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * @title 宽度，在 vertical 下生效
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ScrollbarCfg {
  
  inline def apply(): ScrollbarCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarCfg]
  }
  
  extension [Self <: ScrollbarCfg](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCategorySize(value: Double): Self = StObject.set(x, "categorySize", value.asInstanceOf[js.Any])
    
    inline def setCategorySizeUndefined: Self = StObject.set(x, "categorySize", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStyle(value: LineCap): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: horizontal | vertical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
