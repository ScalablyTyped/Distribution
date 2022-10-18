package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementActiveMod {
  
  /**
    * 元素 active 的 Action，允许多个元素同时 active
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/element/active", JSImport.Default)
  @js.native
  open class default () extends ElementActive
  
  /**
    * 元素 active 的 Action，允许多个元素同时 active
    * @class
    * @ignore
    */
  @js.native
  trait ElementActive
    extends typings.antvG2.libInteractionActionElementStateMod.default {
    
    /**
      * Active Element
      */
    def active(): Unit = js.native
  }
}
