package typings.antvG2

import typings.antvComponent.libInterfacesMod.IList
import typings.antvComponent.libTypesMod.ListItem
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentListStateMod {
  
  /**
    * 列表项状态 Action 的基础类
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/component/list-state", JSImport.Default)
  @js.native
  open class default () extends ListState
  
  /**
    * 列表项状态 Action 的基础类
    * @class
    * @ignore
    */
  @js.native
  trait ListState
    extends typings.antvG2.libInteractionActionBaseMod.default[ListStateCfg] {
    
    /* protected */ def allowSetStateByElement(component: Any): Boolean = js.native
    
    /* private */ var allowSetStateByItem: Any = js.native
    
    /**
      * 取消状态
      */
    def clear(): Unit = js.native
    
    /** 清理组件的状态 */
    /* protected */ def clearAllComponentsState(): Unit = js.native
    
    /* protected */ def getAllowComponents(): js.Array[Any] = js.native
    
    /** 获取触发的列表组件 */
    /* protected */ def getTriggerListInfo(): LooseObject = js.native
    
    /** 是否存在指定的状态 */
    /* protected */ def hasState(list: IList, item: ListItem): Boolean = js.native
    
    /* protected */ var ignoreItemStates: js.Array[Any] = js.native
    
    /**
      * 取消状态
      */
    def reset(): Unit = js.native
    
    /* protected */ def setItemState(list: IList, item: ListItem, enable: Boolean): Unit = js.native
    
    /* protected */ def setItemsState(list: IList, name: String, enable: Boolean): Unit = js.native
    
    /**
      * 设置状态
      */
    def setState(): Unit = js.native
    
    /* private */ var setStateByElement: Any = js.native
    
    /* protected */ def setStateEnable(enable: Boolean): Unit = js.native
    
    /* protected */ var stateName: String = js.native
    
    /**
      * 切换状态
      */
    def toggle(): Unit = js.native
  }
  
  /** @ignore */
  trait ListStateCfg extends StObject {
    
    var componentNames: js.Array[String]
  }
  object ListStateCfg {
    
    inline def apply(componentNames: js.Array[String]): ListStateCfg = {
      val __obj = js.Dynamic.literal(componentNames = componentNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStateCfg]
    }
    
    extension [Self <: ListStateCfg](x: Self) {
      
      inline def setComponentNames(value: js.Array[String]): Self = StObject.set(x, "componentNames", value.asInstanceOf[js.Any])
      
      inline def setComponentNamesVarargs(value: String*): Self = StObject.set(x, "componentNames", js.Array(value*))
    }
  }
}
