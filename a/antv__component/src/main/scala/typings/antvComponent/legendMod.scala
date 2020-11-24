package typings.antvComponent

import typings.antvComponent.continuousMod.ContinueLegend
import typings.antvComponent.legendBaseMod.LegendBase
import typings.antvComponent.typesMod.LegendBaseCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/legend", JSImport.Namespace)
@js.native
object legendMod extends js.Object {
  
  @js.native
  abstract class Base[T /* <: LegendBaseCfg */] () extends LegendBase[T]
  
  @js.native
  class Category ()
    extends typings.antvComponent.categoryMod.Category
  
  @js.native
  class Continuous () extends ContinueLegend
}
