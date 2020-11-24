package typings.antvComponent

import typings.antvComponent.baseMod.AxisBase
import typings.antvComponent.typesMod.AxisBaseCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis", JSImport.Namespace)
@js.native
object axisMod extends js.Object {
  
  @js.native
  abstract class Base[T /* <: AxisBaseCfg */] () extends AxisBase[T]
  
  @js.native
  class Circle ()
    extends typings.antvComponent.circleMod.Circle
  
  @js.native
  class Line ()
    extends typings.antvComponent.axisLineMod.Line
}
