package typings.agDashGrid.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PromiseStatus extends js.Object

@JSImport("ag-grid/dist/lib/utils", "PromiseStatus")
@js.native
object PromiseStatus extends js.Object {
  @js.native
  sealed trait IN_PROGRESS extends PromiseStatus
  
  @js.native
  sealed trait RESOLVED extends PromiseStatus
  
  /* 0 */ val IN_PROGRESS: typings.agDashGrid.distLibUtilsMod.PromiseStatus.IN_PROGRESS with Double = js.native
  /* 1 */ val RESOLVED: typings.agDashGrid.distLibUtilsMod.PromiseStatus.RESOLVED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseStatus with Double] = js.native
}

