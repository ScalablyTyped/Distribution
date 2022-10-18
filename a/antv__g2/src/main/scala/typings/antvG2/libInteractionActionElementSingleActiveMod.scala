package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementSingleActiveMod {
  
  /**
    * @ignore
    * 仅允许单个 Element Active 的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/single-active", JSImport.Default)
  @js.native
  open class default () extends ElementSingleActive
  
  /**
    * @ignore
    * 仅允许单个 Element Active 的 Action
    */
  @js.native
  trait ElementSingleActive
    extends typings.antvG2.libInteractionActionElementSingleStateMod.default {
    
    /**
      * 当前事件相关的 Element Active
      */
    def active(): Unit = js.native
  }
}
