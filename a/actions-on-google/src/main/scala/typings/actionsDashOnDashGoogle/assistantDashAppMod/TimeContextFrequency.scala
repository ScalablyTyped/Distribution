package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeContextFrequency extends js.Object

@JSImport("actions-on-google/assistant-app", "TimeContextFrequency")
@js.native
object TimeContextFrequency extends js.Object {
  @js.native
  sealed trait DAILY extends TimeContextFrequency
  
  /* 0 */ val DAILY: typings.actionsDashOnDashGoogle.assistantDashAppMod.TimeContextFrequency.DAILY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeContextFrequency with Double] = js.native
}

