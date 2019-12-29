package typings.alt.AltJS

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[lifeCycleEvents with Double] = js.native
  /* 0 */ @js.native
  object bootstrap extends TopLevel[bootstrap with Double]
  
  /* 4 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 2 */ @js.native
  object init extends TopLevel[init with Double]
  
  /* 3 */ @js.native
  object rollback extends TopLevel[rollback with Double]
  
  /* 1 */ @js.native
  object snapshot extends TopLevel[snapshot with Double]
  
}

