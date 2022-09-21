package typings.antvG2.libInterfaceMod

import typings.antvG2.antvG2Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateOption extends StObject {
  
  /**
    * @title chart 初始化渲染时的入场动画，false/null 表示关闭入场动画。
    */
  var appear: js.UndefOr[AnimateCfg | `false` | Null] = js.undefined
  
  /**
    * @title chart 发生更新时，新增元素的入场动画，false/null 表示关闭入场动画。
    */
  var enter: js.UndefOr[AnimateCfg | `false` | Null] = js.undefined
  
  /**
    * @title 销毁动画配置，false/null 表示关闭销毁动画。
    */
  var leave: js.UndefOr[AnimateCfg | `false` | Null] = js.undefined
  
  /**
    * @title 更新动画配置，false/null 表示关闭更新动画。
    */
  var update: js.UndefOr[AnimateCfg | `false` | Null] = js.undefined
}
object AnimateOption {
  
  inline def apply(): AnimateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOption]
  }
  
  extension [Self <: AnimateOption](x: Self) {
    
    inline def setAppear(value: AnimateCfg | `false`): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearNull: Self = StObject.set(x, "appear", null)
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setEnter(value: AnimateCfg | `false`): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterNull: Self = StObject.set(x, "enter", null)
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setLeave(value: AnimateCfg | `false`): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveNull: Self = StObject.set(x, "leave", null)
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setUpdate(value: AnimateCfg | `false`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
