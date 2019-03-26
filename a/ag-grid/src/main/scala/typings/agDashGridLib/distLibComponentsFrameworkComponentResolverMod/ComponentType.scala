package typings
package agDashGridLib.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentType extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentType")
@js.native
object ComponentType extends js.Object {
  @js.native
  sealed trait AG_GRID
    extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentType
  
  @js.native
  sealed trait FRAMEWORK
    extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentType
  
  /* 0 */ val AG_GRID: AG_GRID with scala.Double = js.native
  /* 1 */ val FRAMEWORK: FRAMEWORK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentType with scala.Double
  ] = js.native
}

