package typings.antvG2

import typings.antvG2.controllerBaseMod.Controller
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.TooltipOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@antv/g2/lib/chart/controller/tooltip", JSImport.Default)
  @js.native
  open class default () extends Tooltip
  
  @js.native
  trait Tooltip extends Controller[TooltipOption] {
    
    /* private */ var findItemsFromView: Any = js.native
    
    /* private */ var getCrosshairsText: Any = js.native
    
    /* private */ var getGuideGroup: Any = js.native
    
    /**
      * 根据用户配置的 items 配置，来进行用户自定义的处理，并返回最终的 items
      * 默认不做任何处理
      */
    /* private */ var getItemsAfterProcess: Any = js.native
    
    /* private */ var getTitle: Any = js.native
    
    def getTooltipCfg(): Any = js.native
    
    /* private */ var getTooltipCrosshairsGroup: Any = js.native
    
    def getTooltipItems(point: Point): js.Array[Any] = js.native
    
    /* private */ var getTooltipMarkersGroup: Any = js.native
    
    /* private */ var getViewWithGeometry: Any = js.native
    
    /* private */ var guideGroup: Any = js.native
    
    def hideTooltip(): Unit = js.native
    
    /**
      * 当前鼠标点是在 enter tooltip 中
      * @param point
      */
    def isCursorEntered(point: Point): Boolean = js.native
    
    /* private */ var isLocked: Any = js.native
    
    /**
      * isTooltipLocked
      */
    def isTooltipLocked(): Boolean = js.native
    
    /* private */ var isVisible: Any = js.native
    
    /* private */ var items: Any = js.native
    
    /**
      * lockTooltip
      */
    def lockTooltip(): Unit = js.native
    
    /* private */ var point: Any = js.native
    
    /* protected */ def processCustomContent(option: TooltipOption): TooltipOption = js.native
    
    /* private */ var renderCrosshairs: Any = js.native
    
    /* private */ var renderTooltip: Any = js.native
    
    /* private */ var renderTooltipMarkers: Any = js.native
    
    /* private */ var renderXCrosshairs: Any = js.native
    
    /* private */ var renderYCrosshairs: Any = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Shows tooltip
      * @param point
      */
    def showTooltip(point: Point): Unit = js.native
    
    /* private */ var title: Any = js.native
    
    /* private */ var tooltip: Any = js.native
    
    /* private */ var tooltipCrosshairsGroup: Any = js.native
    
    /* private */ var tooltipMarkersGroup: Any = js.native
    
    /**
      * unlockTooltip
      */
    def unlockTooltip(): Unit = js.native
    
    /* private */ var xCrosshair: Any = js.native
    
    /* private */ var yCrosshair: Any = js.native
  }
}
