package typings.antvComponent.mod

import typings.antvComponent.gridBaseMod.GridBase
import typings.antvComponent.typesMod.GroupComponentCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Grid")
@js.native
object Grid extends js.Object {
  
  @js.native
  abstract class Base[T /* <: GroupComponentCfg */] () extends GridBase[T]
  
  @js.native
  class Circle ()
    extends typings.antvComponent.gridCircleMod.Circle
  
  @js.native
  class Line ()
    extends typings.antvComponent.gridLineMod.Line
}
