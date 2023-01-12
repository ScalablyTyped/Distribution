package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InactiveOpacity extends StObject {
  
  /** 分页导航器 icon 填充色, 默认 #000 */
  var fill: js.UndefOr[String] = js.undefined
  
  /** 分页导航器 icon 非激活时的填充色 */
  var inactiveFill: js.UndefOr[String] = js.undefined
  
  /** 分页导航器 icon 非激活时的填充色 透明度, 默认 0.45 */
  var inactiveOpacity: js.UndefOr[Double] = js.undefined
  
  /** 分页导航器 icon 填充色 透明度, 默认 1 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** 分页器的大小 */
  var size: js.UndefOr[Double] = js.undefined
}
object InactiveOpacity {
  
  inline def apply(): InactiveOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InactiveOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InactiveOpacity] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setInactiveFill(value: String): Self = StObject.set(x, "inactiveFill", value.asInstanceOf[js.Any])
    
    inline def setInactiveFillUndefined: Self = StObject.set(x, "inactiveFill", js.undefined)
    
    inline def setInactiveOpacity(value: Double): Self = StObject.set(x, "inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setInactiveOpacityUndefined: Self = StObject.set(x, "inactiveOpacity", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
