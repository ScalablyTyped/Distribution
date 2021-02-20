package typings.antvComponent

import typings.antvComponent.baseMod.default
import typings.antvComponent.typesMod.AxisBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  @JSImport("@antv/component/lib/axis", "Base")
  @js.native
  abstract class Base[T /* <: AxisBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/axis", "Circle")
  @js.native
  class Circle ()
    extends typings.antvComponent.circleMod.default
  
  @JSImport("@antv/component/lib/axis", "Line")
  @js.native
  class Line ()
    extends typings.antvComponent.axisLineMod.default
}
