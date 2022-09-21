package typings.antvComponent

import typings.antvComponent.typesMod.HtmlComponentCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crosshairHtmlMod {
  
  @JSImport("@antv/component/lib/crosshair/html", JSImport.Default)
  @js.native
  open class default[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
  
  @js.native
  trait HtmlCrosshair[T /* <: HtmlCrossHairCfg */]
    extends typings.antvComponent.htmlComponentMod.default[HtmlComponentCfg] {
    
    /* private */ var alignText: Any = js.native
    
    /* private */ var getTextPoint: Any = js.native
    
    /* private */ var initCrossHair: Any = js.native
    
    /* private */ var isVertical: Any = js.native
    
    /* private */ var resetText: Any = js.native
  }
}
