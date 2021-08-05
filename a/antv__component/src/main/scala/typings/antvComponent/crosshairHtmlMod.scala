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
    
    /* private */ var alignText: js.Any = js.native
    
    /* private */ var getTextPoint: js.Any = js.native
    
    /* private */ var initCrossHair: js.Any = js.native
    
    /* private */ var isVertical: js.Any = js.native
    
    /* private */ var resetText: js.Any = js.native
  }
}
