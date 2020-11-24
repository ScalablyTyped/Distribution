package typings.antvComponent

import typings.antvComponent.htmlComponentMod.HtmlComponent
import typings.antvComponent.typesMod.HtmlComponentCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair/html", JSImport.Namespace)
@js.native
object crosshairHtmlMod extends js.Object {
  
  @js.native
  trait HtmlCrosshair[T /* <: HtmlCrossHairCfg */] extends HtmlComponent[HtmlComponentCfg] {
    
    var alignText: js.Any = js.native
    
    var getTextPoint: js.Any = js.native
    
    var initCrossHair: js.Any = js.native
    
    var isVertical: js.Any = js.native
    
    var resetText: js.Any = js.native
  }
  
  @js.native
  class default[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
}
