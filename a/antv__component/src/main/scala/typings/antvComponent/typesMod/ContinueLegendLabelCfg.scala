package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
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
  
  @scala.inline
  def apply(): ContinueLegendLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendLabelCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendLabelCfgMutableBuilder[Self <: ContinueLegendLabelCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
