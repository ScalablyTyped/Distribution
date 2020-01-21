package typings.agGrid.utilsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseStatus with Double] = js.native
  /* 0 */ @js.native
  object IN_PROGRESS extends TopLevel[IN_PROGRESS with Double]
  
  /* 1 */ @js.native
  object RESOLVED extends TopLevel[RESOLVED with Double]
  
}

