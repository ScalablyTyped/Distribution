package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import org.scalablytyped.runtime.TopLevel
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType.AG_GRID
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType.FRAMEWORK
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
  /* 0 */ @js.native
  object AG_GRID extends TopLevel[AG_GRID with Double]
  
  /* 1 */ @js.native
  object FRAMEWORK extends TopLevel[FRAMEWORK with Double]
  
}

