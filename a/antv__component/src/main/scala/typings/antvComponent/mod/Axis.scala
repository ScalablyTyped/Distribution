package typings.antvComponent.mod

import typings.antvComponent.baseMod.AxisBase
import typings.antvComponent.typesMod.AxisBaseCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Axis")
@js.native
object Axis extends js.Object {
  
  @js.native
  abstract class Base[T /* <: AxisBaseCfg */] () extends AxisBase[T]
  
  @js.native
  class Circle ()
    extends typings.antvComponent.circleMod.Circle
  
  @js.native
  class Line ()
    extends typings.antvComponent.axisLineMod.Line
}
