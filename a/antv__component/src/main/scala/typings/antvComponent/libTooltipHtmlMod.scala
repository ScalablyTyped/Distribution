package typings.antvComponent

import typings.antvComponent.libTypesMod.HtmlComponentCfg
import typings.antvComponent.libTypesMod.TooltipCfg
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTooltipHtmlMod {
  
  @JSImport("@antv/component/lib/tooltip/html", JSImport.Default)
  @js.native
  open class default[T /* <: TooltipCfg */] () extends Tooltip[T]
  
  @js.native
  trait Tooltip[T /* <: TooltipCfg */]
    extends typings.antvComponent.libAbstractHtmlComponentMod.default[HtmlComponentCfg] {
    
    /* private */ var cacheDoms: Any = js.native
    
    /* private */ var checkCrosshair: Any = js.native
    
    /* private */ var clearCrosshairs: Any = js.native
    
    /* private */ var clearItemDoms: Any = js.native
    
    /* private */ var getHtmlContentNode: Any = js.native
    
    /* private */ var renderCustomContent: Any = js.native
    
    /* private */ var renderItems: Any = js.native
    
    /* private */ var resetCrosshair: Any = js.native
    
    /* private */ var resetCrosshairs: Any = js.native
    
    /* private */ var resetTitle: Any = js.native
    
    def setCrossHairsVisible(visible: Any): Unit = js.native
    
    def setLocation(point: Point): Unit = js.native
    
    /* private */ var setTitle: Any = js.native
  }
}
