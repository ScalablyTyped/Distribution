package typings.antvComponent.libTypesMod

import typings.antvComponent.anon.Cfg
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.ShapeAttrs
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
    * @type {boolean|avoidCallback|string|{type:string,cfg?:AxisLabelAutoHideCfg}}
    */
  var autoHide: js.UndefOr[Boolean | avoidCallback | String | Cfg] = js.undefined
  
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
    * label 在X方向的额外偏移量
    * @type {number}
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * label 在Y方向的额外偏移量
    * @type {number}
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
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
  
  inline def apply(): AxisLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabelCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabelCfg] (val x: Self) extends AnyVal {
    
    inline def setAutoEllipsis(value: Boolean | avoidCallback | String): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    inline def setAutoEllipsisFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoEllipsis", js.Any.fromFunction3(value))
    
    inline def setAutoEllipsisUndefined: Self = StObject.set(x, "autoEllipsis", js.undefined)
    
    inline def setAutoHide(value: Boolean | avoidCallback | String | Cfg): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoHide", js.Any.fromFunction3(value))
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setAutoRotate(value: Boolean | avoidCallback | String): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = StObject.set(x, "autoRotate", js.Any.fromFunction3(value))
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
