package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennInteractionsActionsActiveMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@antv/g2plot/lib/plots/venn/interactions/actions/active", "VennElementActive")
  @js.native
  open class VennElementActive () extends StObject {
    
    /** 激活图形元素 */
    def active(): Unit = js.native
    
    /** 重置 */
    def reset(): Unit = js.native
    
    /**
      * 同步所有元素的位置
      */
    /* protected */ def syncElementsPos(): Unit = js.native
    
    /** toggle 图形元素激活状态 */
    def toggle(): Unit = js.native
  }
}
