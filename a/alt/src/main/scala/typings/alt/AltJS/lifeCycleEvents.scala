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
  
}

