package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait lifeCycleEvents extends js.Object

@JSGlobal("AltJS.lifeCycleEvents")
@js.native
object lifeCycleEvents extends js.Object {
  @js.native
  sealed trait bootstrap extends lifeCycleEvents
  
  @js.native
  sealed trait error extends lifeCycleEvents
  
  @js.native
  sealed trait init extends lifeCycleEvents
  
  @js.native
  sealed trait rollback extends lifeCycleEvents
  
  @js.native
  sealed trait snapshot extends lifeCycleEvents
  
  /* 0 */ val bootstrap: typings.alt.AltJS.lifeCycleEvents.bootstrap with Double = js.native
  /* 4 */ val error: typings.alt.AltJS.lifeCycleEvents.error with Double = js.native
  /* 2 */ val init: typings.alt.AltJS.lifeCycleEvents.init with Double = js.native
  /* 3 */ val rollback: typings.alt.AltJS.lifeCycleEvents.rollback with Double = js.native
  /* 1 */ val snapshot: typings.alt.AltJS.lifeCycleEvents.snapshot with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[lifeCycleEvents with Double] = js.native
}

