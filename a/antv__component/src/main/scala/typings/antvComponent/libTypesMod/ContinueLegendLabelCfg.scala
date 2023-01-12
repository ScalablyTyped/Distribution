package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueLegendLabelCfg extends StObject {
  
  /**
    * 文本同滑轨的对齐方式，有五种类型
    *  - rail ： 同滑轨对齐，在滑轨的两端
    *  - top, bottom: 图例水平布局时有效
    *  - left, right: 图例垂直布局时有效
    * @type {string}
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * 文本格式化
    * @type {string}
    */
  var formatter: js.UndefOr[js.Function1[/* text */ String | Double | Null, String]] = js.undefined
  
  /**
    * 文本同滑轨的距离
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object ContinueLegendLabelCfg {
  
  inline def apply(): ContinueLegendLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendLabelCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueLegendLabelCfg] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setFormatter(value: /* text */ String | Double | Null => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
