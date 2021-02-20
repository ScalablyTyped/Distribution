package typings.antvComponent

import typings.antvComponent.crosshairBaseMod.default
import typings.antvComponent.typesMod.CrosshairBaseCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crosshairMod {
  
  @JSImport("@antv/component/lib/crosshair", "Base")
  @js.native
  abstract class Base[T /* <: CrosshairBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/crosshair", "Circle")
  @js.native
  class Circle ()
    extends typings.antvComponent.crosshairCircleMod.default
  
  @JSImport("@antv/component/lib/crosshair", "Html")
  @js.native
  class Html[T /* <: HtmlCrossHairCfg */] ()
    extends typings.antvComponent.crosshairHtmlMod.default[T]
  
  @JSImport("@antv/component/lib/crosshair", "Line")
  @js.native
  class Line ()
    extends typings.antvComponent.crosshairLineMod.default
}
