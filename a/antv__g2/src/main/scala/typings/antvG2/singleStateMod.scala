package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleStateMod {
  
  /**
    * 单状态量的 Action 基类
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/element/single-state", JSImport.Default)
  @js.native
  open class default () extends ElementSingleState
  
  /**
    * 单状态量的 Action 基类
    * @class
    * @ignore
    */
  @js.native
  trait ElementSingleState
    extends typings.antvG2.stateBaseMod.default {
    
    /**
      * 取消当前时间影响的状态
      */
    def reset(): Unit = js.native
    
    /**
      * 切换选中，只允许选中一个
      */
    def toggle(): Unit = js.native
  }
}
