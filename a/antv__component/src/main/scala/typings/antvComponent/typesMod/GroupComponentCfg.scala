package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
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
  implicit class GroupComponentCfgMutableBuilder[Self <: GroupComponentCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
