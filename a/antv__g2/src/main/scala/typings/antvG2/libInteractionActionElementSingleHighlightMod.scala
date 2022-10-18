package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementSingleHighlightMod {
  
  /**
    * @ignore
    * 单个 Element Highlight 的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/single-highlight", JSImport.Default)
  @js.native
  open class default () extends ElementSingleHighlight
  
  /**
    * @ignore
    * 单个 Element Highlight 的 Action
    */
  @js.native
  trait ElementSingleHighlight
    extends typings.antvG2.libInteractionActionElementSingleStateMod.default {
    
    /**
      * Element Highlight
      */
    def highlight(): Unit = js.native
  }
}
