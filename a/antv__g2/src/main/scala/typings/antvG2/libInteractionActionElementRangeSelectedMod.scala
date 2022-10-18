package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementRangeSelectedMod {
  
  /**
    * @ignore
    * 区域选中的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/range-selected", JSImport.Default)
  @js.native
  open class default () extends ElementRangeSelected
  
  /**
    * @ignore
    * 区域选中的 Action
    */
  @js.native
  trait ElementRangeSelected
    extends typings.antvG2.libInteractionActionElementRangeStateMod.default {
    
    /**
      * 选中
      */
    def selected(): Unit = js.native
  }
}
