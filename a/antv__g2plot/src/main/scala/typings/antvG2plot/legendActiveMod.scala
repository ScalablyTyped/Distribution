package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendActiveMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any */ @JSImport("@antv/g2plot/lib/plots/pie/interactions/actions/legend-active", "PieLegendAction")
  @js.native
  open class PieLegendAction () extends StObject {
    
    def active(): Unit = js.native
    
    /**
      * 获取激活的标签
      */
    /* private */ var getActiveElementLabels: Any = js.native
    
    /**
      * 获取激活的图形元素
      */
    /* private */ var getActiveElements: Any = js.native
    
    /**
      * 激活态还原
      */
    def reset(): Unit = js.native
    
    /* protected */ def transfrom(): Unit = js.native
    /* protected */ def transfrom(offset: Double): Unit = js.native
  }
}
