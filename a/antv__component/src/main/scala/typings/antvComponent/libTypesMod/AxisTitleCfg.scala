package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisTitleCfg extends StObject {
  
  /**
    * 是否自动旋转
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 坐标轴标题详细信息
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * 坐标轴标题详情icon
    */
  var iconStyle: js.UndefOr[AxisIconStyle] = js.undefined
  
  /**
    * 标题距离坐标轴的距离
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本对齐方式
    * @type {string} start, center, end
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * 标题距离坐标轴文本的距离
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 标题文本配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
  
  /**
    * 设置文本
    * @type {string}
    */
  var text: js.UndefOr[String] = js.undefined
}
object AxisTitleCfg {
  
  inline def apply(): AxisTitleCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTitleCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisTitleCfg] (val x: Self) extends AnyVal {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIconStyle(value: AxisIconStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
