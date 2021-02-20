package typings.antvComponent.typesMod

import typings.antvComponent.antvComponentBooleans.`false`
import typings.antvGBase.typesMod.AnimateCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateOption extends StObject {
  
  /** 初始化渲染时的入场动画，false/null 表示关闭入场动画 */
  var appear: js.UndefOr[AnimateCfg | `false` | Null] = js.native
  
  /** 发生更新时，新增元素的入场动画，false/null 表示关闭入场动画 */
  var enter: js.UndefOr[AnimateCfg | `false` | Null] = js.native
  
  /** 销毁动画配置，false/null 表示关闭销毁动画 */
  var leave: js.UndefOr[AnimateCfg | `false` | Null] = js.native
  
  /** 更新动画配置，false/null 表示关闭更新动画 */
  var update: js.UndefOr[AnimateCfg | `false` | Null] = js.native
}
object AnimateOption {
  
  @scala.inline
  def apply(): AnimateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOption]
  }
  
  @scala.inline
  implicit class AnimateOptionMutableBuilder[Self <: AnimateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppear(value: AnimateCfg | `false`): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearNull: Self = StObject.set(x, "appear", null)
    
    @scala.inline
    def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    @scala.inline
    def setEnter(value: AnimateCfg | `false`): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterNull: Self = StObject.set(x, "enter", null)
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setLeave(value: AnimateCfg | `false`): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveNull: Self = StObject.set(x, "leave", null)
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setUpdate(value: AnimateCfg | `false`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = StObject.set(x, "update", null)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
