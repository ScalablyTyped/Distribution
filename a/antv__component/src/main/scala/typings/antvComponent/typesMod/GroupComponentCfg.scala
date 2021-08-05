package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponentCfg
  extends StObject
     with ComponentCfg {
  
  /**
    * 组件的容器
    * @type {IGroup}
    */
  var container: IGroup
  
  /**
    * 当前组件对应的 group，一个 container 中可能会有多个组件，但是一个组件都有一个自己的 Group
    * @type {IGroup}
    */
  var group: js.UndefOr[IGroup] = js.undefined
}
object GroupComponentCfg {
  
  inline def apply(container: IGroup): GroupComponentCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponentCfg]
  }
  
  extension [Self <: GroupComponentCfg](x: Self) {
    
    inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
