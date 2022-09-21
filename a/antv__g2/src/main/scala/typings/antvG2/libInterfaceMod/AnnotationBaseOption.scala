package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationBaseOption extends StObject {
  
  /**
    * @title 是否进行动画
    */
  val animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 动画参数配置
    * @description 当且仅当 `animate` 属性为 true，即动画开启时生效。
    */
  val animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
  
  /**
    * @title x 方向的偏移量
    */
  val offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * @title y 方向的偏移量
    */
  val offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 是否顶层
    * @description 指定 annotation 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  val top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 类型
    */
  val `type`: js.UndefOr[String] = js.undefined
}
object AnnotationBaseOption {
  
  inline def apply(): AnnotationBaseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationBaseOption]
  }
  
  extension [Self <: AnnotationBaseOption](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
