package typings.antvG2

import typings.antvG2.actionMod.Action
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleTransformMod {
  
  /**
    * Scale translate
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/view/scale-transform", JSImport.Default)
  @js.native
  open class default () extends ScaleTranslate
  
  /**
    * Scale translate
    * @ignore
    */
  @js.native
  trait ScaleTranslate extends Action[LooseObject] {
    
    /* protected */ var dims: js.Array[String] = js.native
    
    /* protected */ def getScale(dim: Any): Any = js.native
    
    /* protected */ def hasDim(dim: Any): Boolean = js.native
    
    /**
      * 回滚
      */
    def reset(): Unit = js.native
    
    /* private */ var resetDim: Any = js.native
  }
}
