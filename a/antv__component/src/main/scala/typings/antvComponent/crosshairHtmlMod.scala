package typings.antvComponent

import typings.antvComponent.typesMod.HtmlComponentCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crosshairHtmlMod {
  
  @JSImport("@antv/component/lib/crosshair/html", JSImport.Default)
  @js.native
  class default[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
  
  @js.native
  trait HtmlCrosshair[T /* <: HtmlCrossHairCfg */]
    extends typings.antvComponent.htmlComponentMod.default[HtmlComponentCfg] {
    
    var alignText: js.Any = js.native
    
    var getTextPoint: js.Any = js.native
    
    var initCrossHair: js.Any = js.native
    
    var isVertical: js.Any = js.native
    
    var resetText: js.Any = js.native
  }
}
