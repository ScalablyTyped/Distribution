package typings.antvG2

import typings.antvG2.actionMod.Action
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveMod {
  
  /**
    * @ignore
    * View 移动的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/view/move", JSImport.Default)
  @js.native
  open class default () extends Move
  
  /**
    * @ignore
    * View 移动的 Action
    */
  @js.native
  trait Move extends Action[LooseObject] {
    
    /**
      * 结束移动
      */
    def end(): Unit = js.native
    
    /* private */ var isMoving: Any = js.native
    
    /**
      * 移动
      */
    def move(): Unit = js.native
    
    /**
      * 回滚
      */
    def reset(): Unit = js.native
    
    /**
      * 开始移动
      */
    def start(): Unit = js.native
    
    /* private */ var startMatrix: Any = js.native
    
    /* private */ var startPoint: Any = js.native
    
    /* private */ var starting: Any = js.native
  }
}
