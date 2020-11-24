package typings.antvComponent.typesMod

import typings.antvComponent.antvComponentBooleans.`false`
import typings.antvGBase.typesMod.AnimateCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateOption extends js.Object {
  
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
  implicit class AnimateOptionOps[Self <: AnimateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppear(value: AnimateCfg | `false`): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setAppearNull: Self = this.set("appear", null)
    
    @scala.inline
    def setEnter(value: AnimateCfg | `false`): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEnterNull: Self = this.set("enter", null)
    
    @scala.inline
    def setLeave(value: AnimateCfg | `false`): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setLeaveNull: Self = this.set("leave", null)
    
    @scala.inline
    def setUpdate(value: AnimateCfg | `false`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
}
