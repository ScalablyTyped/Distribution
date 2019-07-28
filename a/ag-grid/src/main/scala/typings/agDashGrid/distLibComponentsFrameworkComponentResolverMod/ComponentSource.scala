package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentSource")
@js.native
object ComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT extends ComponentSource
  
  @js.native
  sealed trait HARDCODED extends ComponentSource
  
  @js.native
  sealed trait REGISTERED_BY_NAME extends ComponentSource
  
  /* 0 */ val DEFAULT: typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentSource.DEFAULT with Double = js.native
  /* 2 */ val HARDCODED: typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentSource.HARDCODED with Double = js.native
  /* 1 */ val REGISTERED_BY_NAME: typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentSource.REGISTERED_BY_NAME with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentSource with Double] = js.native
}

