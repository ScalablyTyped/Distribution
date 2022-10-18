package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentTooltipEllipsisTextMod {
  
  @JSImport("@antv/g2/lib/interaction/action/component/tooltip/ellipsis-text", JSImport.Default)
  @js.native
  open class default () extends EllipsisText
  
  @js.native
  trait EllipsisText
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 隐藏 Tooltip。
      * @returns
      */
    def hide(): Unit = js.native
    
    /* protected */ def hideTooltip(): Unit = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var renderTooltip: Any = js.native
    
    /**
      * 显示 Tooltip
      * @returns
      */
    def show(): Unit = js.native
    
    /* protected */ def showTooltip(curLoc: Point): Unit = js.native
    
    /* private */ var timeStamp: Any = js.native
    
    /* private */ var tooltip: Any = js.native
  }
}
