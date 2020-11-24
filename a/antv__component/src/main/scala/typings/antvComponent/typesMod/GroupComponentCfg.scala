package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupComponentCfg extends ComponentCfg {
  
  /**
    * 组件的容器
    * @type {IGroup}
    */
  var container: IGroup = js.native
  
  /**
    * 当前组件对应的 group，一个 container 中可能会有多个组件，但是一个组件都有一个自己的 Group
    * @type {IGroup}
    */
  var group: js.UndefOr[IGroup] = js.native
}
object GroupComponentCfg {
  
  @scala.inline
  def apply(container: IGroup): GroupComponentCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponentCfg]
  }
  
  @scala.inline
  implicit class GroupComponentCfgOps[Self <: GroupComponentCfg] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: IGroup): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
  }
}
