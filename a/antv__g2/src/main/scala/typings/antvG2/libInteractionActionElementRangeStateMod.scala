package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementRangeStateMod {
  
  /**
    * @ignore
    * 区域设置状态的基础 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/range-state", JSImport.Default)
  @js.native
  open class default () extends ElementRangeState
  
  /**
    * @ignore
    * 区域设置状态的基础 Action
    */
  @js.native
  trait ElementRangeState
    extends typings.antvG2.libInteractionActionElementStateBaseMod.default {
    
    /**
      * 是否受 element 的数据影响，还是受包围盒的影响
      */
    /* protected */ var effectByRecord: Boolean = js.native
    
    /**
      * 是否作用于当前 view 的 siblings，默认是 false 仅作用于自己
      */
    /* protected */ var effectSiblings: Boolean = js.native
    
    /**
      * 结束
      */
    def end(): Unit = js.native
    
    /* private */ var endPoint: Any = js.native
    
    /* private */ var getCurrentPoint: Any = js.native
    
    /* protected */ def getIntersectElements(): Any = js.native
    
    /* private */ var isStarted: Any = js.native
    
    /* protected */ def setElementsState(
      elements: js.Array[typings.antvG2.libGeometryElementMod.default],
      enable: Any,
      allElements: js.Array[typings.antvG2.libGeometryElementMod.default]
    ): Unit = js.native
    
    /* private */ var setSiblingsState: Any = js.native
    
    /* private */ var setSiblingsStateByRecord: Any = js.native
    
    /**
      * 开始，记录开始选中的位置
      */
    def start(): Unit = js.native
    
    /* private */ var startPoint: Any = js.native
  }
}
