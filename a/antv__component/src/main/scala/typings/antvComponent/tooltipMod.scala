package typings.antvComponent

import typings.antvComponent.tooltipHtmlMod.Tooltip
import typings.antvComponent.typesMod.TooltipCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  
  @js.native
  class Html[T /* <: TooltipCfg */] () extends Tooltip[T]
}
