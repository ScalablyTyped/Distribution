package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectedMod {
  
  /**
    * @ignore
    * 允许多选的 Action
    * @class
    */
  @JSImport("@antv/g2/lib/interaction/action/element/selected", JSImport.Default)
  @js.native
  open class default () extends ElementMultipleSelected
  
  /**
    * @ignore
    * 允许多选的 Action
    * @class
    */
  @js.native
  trait ElementMultipleSelected
    extends typings.antvG2.stateMod.default {
    
    /**
      * 选中节点，允许多选
      */
    def selected(): Unit = js.native
  }
}
