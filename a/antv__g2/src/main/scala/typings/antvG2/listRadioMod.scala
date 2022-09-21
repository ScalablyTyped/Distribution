package typings.antvG2

import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listRadioMod {
  
  @JSImport("@antv/g2/lib/interaction/action/component/list-radio", JSImport.Default)
  @js.native
  open class default () extends ListRadio
  
  @js.native
  trait ListRadio
    extends typings.antvG2.listStateMod.default {
    
    def hide(): Unit = js.native
    
    /**
      * 隐藏 Tooltip。
      * @returns
      */
    def hideTip(): Unit = js.native
    
    /* protected */ def hideTooltip(): Unit = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var renderTooltip: Any = js.native
    
    def show(): Unit = js.native
    
    /**
      * 显示 Tooltip (展示在上方)
      * @returns
      */
    def showTip(): Unit = js.native
    
    /* protected */ def showTooltip(curLoc: Point): Unit = js.native
    
    /* private */ var timeStamp: Any = js.native
    
    /* private */ var tooltip: Any = js.native
  }
}
