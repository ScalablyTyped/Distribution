package typings.antvComponent

import typings.antvComponent.libTypesMod.HtmlComponentCfg
import typings.antvComponent.libTypesMod.HtmlCrossHairCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCrosshairHtmlMod {
  
  @JSImport("@antv/component/lib/crosshair/html", JSImport.Default)
  @js.native
  open class default[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
  
  @js.native
  trait HtmlCrosshair[T /* <: HtmlCrossHairCfg */]
    extends typings.antvComponent.libAbstractHtmlComponentMod.default[HtmlComponentCfg] {
    
    /* private */ var alignText: Any = js.native
    
    /* private */ var getTextPoint: Any = js.native
    
    /* private */ var initCrossHair: Any = js.native
    
    /* private */ var isVertical: Any = js.native
    
    /* private */ var resetText: Any = js.native
  }
}
