package typings.antvG2

import typings.antvComponent.libTypesMod.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementStateMod {
  
  /**
    * 状态量 Action 的基类，允许多个 Element 同时拥有某个状态
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/element/state", JSImport.Default)
  @js.native
  open class default () extends ElementState
  
  /**
    * 状态量 Action 的基类，允许多个 Element 同时拥有某个状态
    * @class
    * @ignore
    */
  @js.native
  trait ElementState
    extends typings.antvG2.libInteractionActionElementStateBaseMod.default {
    
    /* protected */ var ignoreListItemStates: js.Array[String] = js.native
    
    /* private */ var isItemIgnore: Any = js.native
    
    /** 组件的选项是否同 element 匹配 */
    /* protected */ def isMathItem(element: typings.antvG2.libGeometryElementMod.default, field: String, item: ListItem): Boolean = js.native
    
    /**
      * 取消当前时间影响的状态
      */
    def reset(): Unit = js.native
    
    /* protected */ def setElementsStateByItem(
      elements: js.Array[typings.antvG2.libGeometryElementMod.default],
      field: String,
      item: ListItem,
      enable: Boolean
    ): Unit = js.native
    
    /* private */ var setStateByComponent: Any = js.native
    
    /* protected */ def setStateByElement(element: typings.antvG2.libGeometryElementMod.default, enable: Boolean): Unit = js.native
    
    /**
      * 切换状态
      */
    def toggle(): Unit = js.native
  }
}
