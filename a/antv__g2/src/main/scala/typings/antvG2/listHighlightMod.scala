package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listHighlightMod {
  
  /**
    * highlight Action 的效果是 active 和 inactive 两个状态的组合
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/component/list-highlight", JSImport.Default)
  @js.native
  open class default () extends ListHighlight
  
  /**
    * highlight Action 的效果是 active 和 inactive 两个状态的组合
    * @class
    * @ignore
    */
  @js.native
  trait ListHighlight
    extends typings.antvG2.listStateMod.default {
    
    /**
      * highlight 图例项（坐标轴文本）
      */
    def highlight(): Unit = js.native
    
    /* protected */ @JSName("ignoreItemStates")
    var ignoreItemStates_ListHighlight: js.Array[String] = js.native
    
    /* private */ var setHighlightBy: Any = js.native
  }
}
