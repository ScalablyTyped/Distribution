package typings.antvComponent

import typings.antvComponent.typesMod.HtmlComponentCfg
import typings.antvComponent.typesMod.TooltipCfg
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHtmlMod {
  
  @JSImport("@antv/component/lib/tooltip/html", JSImport.Default)
  @js.native
  class default[T /* <: TooltipCfg */] () extends Tooltip[T]
  
  @js.native
  trait Tooltip[T /* <: TooltipCfg */]
    extends typings.antvComponent.htmlComponentMod.default[HtmlComponentCfg] {
    
    /* private */ var cacheDoms: js.Any = js.native
    
    /* private */ var checkCrosshair: js.Any = js.native
    
    /* private */ var clearCrosshairs: js.Any = js.native
    
    /* private */ var clearItemDoms: js.Any = js.native
    
    /* private */ var getHtmlContentNode: js.Any = js.native
    
    /* private */ var renderCustomContent: js.Any = js.native
    
    /* private */ var renderItems: js.Any = js.native
    
    /* private */ var resetCrosshair: js.Any = js.native
    
    /* private */ var resetCrosshairs: js.Any = js.native
    
    /* private */ var resetTitle: js.Any = js.native
    
    def setCrossHairsVisible(visible: js.Any): Unit = js.native
    
    def setLocation(point: Point): Unit = js.native
    
    /* private */ var setTitle: js.Any = js.native
  }
}
