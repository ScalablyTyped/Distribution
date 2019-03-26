package typings
package agDashGridLib.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PromiseStatus extends js.Object

@JSImport("ag-grid/dist/lib/utils", "PromiseStatus")
@js.native
object PromiseStatus extends js.Object {
  @js.native
  sealed trait IN_PROGRESS
    extends agDashGridLib.distLibUtilsMod.PromiseStatus
  
  @js.native
  sealed trait RESOLVED
    extends agDashGridLib.distLibUtilsMod.PromiseStatus
  
  /* 0 */ val IN_PROGRESS: IN_PROGRESS with scala.Double = js.native
  /* 1 */ val RESOLVED: RESOLVED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[agDashGridLib.distLibUtilsMod.PromiseStatus with scala.Double] = js.native
}

