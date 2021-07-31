package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendTitleCfg extends StObject {
  
  /**
    * 标题同图例项的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object LegendTitleCfg {
  
  @scala.inline
  def apply(): LegendTitleCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitleCfg]
  }
  
  @scala.inline
  implicit class LegendTitleCfgMutableBuilder[Self <: LegendTitleCfg] (val x: Self) extends AnyVal {
    
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
