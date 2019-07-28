package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentType extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentType")
@js.native
object ComponentType extends js.Object {
  @js.native
  sealed trait AG_GRID extends ComponentType
  
  @js.native
  sealed trait FRAMEWORK extends ComponentType
  
  /* 0 */ val AG_GRID: typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType.AG_GRID with Double = js.native
  /* 1 */ val FRAMEWORK: typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType.FRAMEWORK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
}

