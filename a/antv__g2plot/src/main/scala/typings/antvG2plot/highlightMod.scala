package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@antv/g2plot/lib/plots/venn/interactions/actions/highlight", "VennElementHighlight")
  @js.native
  open class VennElementHighlight () extends StObject {
    
    /** 清楚 */
    def clear(): Unit = js.native
    
    /** 高亮图形元素 */
    def highlight(): Unit = js.native
    
    /** 重置 */
    def reset(): Unit = js.native
    
    /**
      * 同步所有元素的位置
      */
    /* protected */ def syncElementsPos(): Unit = js.native
    
    /** toggle 图形元素高亮状态 */
    def toggle(): Unit = js.native
  }
}
