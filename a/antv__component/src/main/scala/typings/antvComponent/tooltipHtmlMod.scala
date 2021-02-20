package typings.antvComponent

import typings.antvComponent.typesMod.HtmlComponentCfg
import typings.antvComponent.typesMod.TooltipCfg
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHtmlMod {
  
  @JSImport("@antv/component/lib/tooltip/html", JSImport.Default)
  @js.native
  class default[T /* <: TooltipCfg */] () extends Tooltip[T]
  
  @js.native
  trait Tooltip[T /* <: TooltipCfg */]
    extends typings.antvComponent.htmlComponentMod.default[HtmlComponentCfg] {
    
    var cacheDoms: js.Any = js.native
    
    var checkCrosshair: js.Any = js.native
    
    var clearCrosshairs: js.Any = js.native
    
    var clearItemDoms: js.Any = js.native
    
    var getHtmlContentNode: js.Any = js.native
    
    var renderCustomContent: js.Any = js.native
    
    var renderItems: js.Any = js.native
    
    var resetCrosshair: js.Any = js.native
    
    var resetCrosshairs: js.Any = js.native
    
    var resetTitle: js.Any = js.native
    
    def setCrossHairsVisible(visible: js.Any): Unit = js.native
    
    def setLocation(point: Point): Unit = js.native
    
    var setTitle: js.Any = js.native
  }
}
