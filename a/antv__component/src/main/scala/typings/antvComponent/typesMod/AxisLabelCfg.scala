package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelCfg extends StObject {
  
  /**
    * 是否自动省略，默认 false
    * @type {boolean|avoidCallback|string}
    */
  var autoEllipsis: js.UndefOr[Boolean | avoidCallback | String] = js.undefined
  
  /**
    * 是否自动隐藏，默认 false
    * @type {boolean|avoidCallback|string}
    */
  var autoHide: js.UndefOr[Boolean | avoidCallback | String] = js.undefined
  
  /**
    * 是否自动旋转，默认 true
    * @type {boolean|avoidCallback|string}
    */
  var autoRotate: js.UndefOr[Boolean | avoidCallback | String] = js.undefined
  
  /**
    * 格式化函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.undefined
  
  /**
    * label 的偏移量
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本旋转角度
    * @type {number}
    */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /**
    * 坐标轴文本的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
}
object AxisLabelCfg {
  
  @scala.inline
  def apply(): AxisLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabelCfg]
  }
  
  @scala.inline
  implicit class AxisLabelCfgMutableBuilder[Self <: AxisLabelCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEllipsis(value: Boolean | avoidCallback | String): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEllipsisFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoEllipsis", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoEllipsisUndefined: Self = StObject.set(x, "autoEllipsis", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean | avoidCallback | String): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoHide", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean | avoidCallback | String): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoRotate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
