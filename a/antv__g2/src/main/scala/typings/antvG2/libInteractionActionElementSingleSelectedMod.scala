package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementSingleSelectedMod {
  
  /**
    * @ignore
    * 单选的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/single-selected", JSImport.Default)
  @js.native
  open class default () extends ElementSingleSelected
  
  /**
    * @ignore
    * 单选的 Action
    */
  @js.native
  trait ElementSingleSelected
    extends typings.antvG2.libInteractionActionElementSingleStateMod.default {
    
    /**
      * 选中
      */
    def selected(): Unit = js.native
  }
}
