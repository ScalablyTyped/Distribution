package typings.antvG2.anon

import typings.antvG2.antvG2Numbers.`0.5`
import typings.antvG2.antvG2Strings.`39Percentsign`
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRotate extends StObject {
  
  /**
    * 是否沿线的角度排布，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 文本的内容
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * y 方向的偏移量
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本的显示位置
    */
  var position: js.UndefOr[start | center | end | `39Percentsign` | `0.5`] = js.undefined
  
  /**
    * 文本图形样式配置
    */
  var style: js.UndefOr[js.Any] = js.undefined
}
object AutoRotate {
  
  inline def apply(): AutoRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRotate]
  }
  
  extension [Self <: AutoRotate](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(value: start | center | end | `39Percentsign` | `0.5`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
