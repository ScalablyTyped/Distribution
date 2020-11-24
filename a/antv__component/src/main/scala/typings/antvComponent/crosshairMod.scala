package typings.antvComponent

import typings.antvComponent.crosshairBaseMod.CrosshairBase
import typings.antvComponent.crosshairCircleMod.LineCrosshair
import typings.antvComponent.crosshairHtmlMod.HtmlCrosshair
import typings.antvComponent.typesMod.CrosshairBaseCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair", JSImport.Namespace)
@js.native
object crosshairMod extends js.Object {
  
  @js.native
  abstract class Base[T /* <: CrosshairBaseCfg */] () extends CrosshairBase[T]
  
  @js.native
  class Circle () extends LineCrosshair
  
  @js.native
  class Html[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
  
  @js.native
  class Line ()
    extends typings.antvComponent.crosshairLineMod.LineCrosshair
}
