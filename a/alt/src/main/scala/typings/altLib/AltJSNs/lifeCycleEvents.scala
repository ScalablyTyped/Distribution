package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait lifeCycleEvents extends js.Object

@JSGlobal("AltJS.lifeCycleEvents")
@js.native
object lifeCycleEvents extends js.Object {
  @js.native
  sealed trait bootstrap
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait error
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait init
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait rollback
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait snapshot
    extends altLib.AltJSNs.lifeCycleEvents
  
  /* 0 */ val bootstrap: bootstrap with scala.Double = js.native
  /* 4 */ val error: error with scala.Double = js.native
  /* 2 */ val init: init with scala.Double = js.native
  /* 3 */ val rollback: rollback with scala.Double = js.native
  /* 1 */ val snapshot: snapshot with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[altLib.AltJSNs.lifeCycleEvents with scala.Double] = js.native
}

