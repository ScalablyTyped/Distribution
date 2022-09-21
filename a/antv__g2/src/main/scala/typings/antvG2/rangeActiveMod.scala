package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeActiveMod {
  
  /**
    * @ignore
    * 图表元素区域 Active 的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/range-active", JSImport.Default)
  @js.native
  open class default () extends ElementRangeActive
  
  /**
    * @ignore
    * 图表元素区域 Active 的 Action
    */
  @js.native
  trait ElementRangeActive
    extends typings.antvG2.rangeStateMod.default {
    
    /**
      * 图表元素 Active
      */
    def active(): Unit = js.native
  }
}
