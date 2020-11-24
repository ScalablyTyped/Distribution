package typings.agGrid.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PromiseStatus extends js.Object
@JSImport("ag-grid/dist/lib/utils", "PromiseStatus")
@js.native
object PromiseStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseStatus with Double] = js.native
  
  @js.native
  sealed trait IN_PROGRESS extends PromiseStatus
  /* 0 */ @js.native
  object IN_PROGRESS extends TopLevel[IN_PROGRESS with Double]
  
  @js.native
  sealed trait RESOLVED extends PromiseStatus
  /* 1 */ @js.native
  object RESOLVED extends TopLevel[RESOLVED with Double]
}
