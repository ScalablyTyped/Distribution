package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementHighlightMod {
  
  /**
    * @ignore
    * highlight，指定图形高亮，其他图形变暗
    */
  @JSImport("@antv/g2/lib/interaction/action/element/highlight", JSImport.Default)
  @js.native
  open class default () extends ElementHighlight
  
  @JSImport("@antv/g2/lib/interaction/action/element/highlight", "STATUS_ACTIVE")
  @js.native
  val STATUS_ACTIVE: String | Double = js.native
  
  @JSImport("@antv/g2/lib/interaction/action/element/highlight", "STATUS_UNACTIVE")
  @js.native
  val STATUS_UNACTIVE: String | Double = js.native
  
  type Callback = js.Function1[/* el */ Any, Boolean]
  
  /**
    * @ignore
    * highlight，指定图形高亮，其他图形变暗
    */
  @js.native
  trait ElementHighlight
    extends typings.antvG2.libInteractionActionElementStateMod.default {
    
    def highlight(): Unit = js.native
    
    /* protected */ def setElementHighlight(el: typings.antvG2.libGeometryElementMod.default, callback: Callback): Unit = js.native
    
    /* protected */ def setHighlightBy(
      elements: js.Array[typings.antvG2.libGeometryElementMod.default],
      callback: Callback,
      enable: Boolean
    ): Unit = js.native
  }
}
