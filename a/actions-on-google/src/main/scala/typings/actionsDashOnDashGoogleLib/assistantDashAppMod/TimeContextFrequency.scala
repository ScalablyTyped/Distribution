package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeContextFrequency extends js.Object

@JSImport("actions-on-google/assistant-app", "TimeContextFrequency")
@js.native
object TimeContextFrequency extends js.Object {
  @js.native
  sealed trait DAILY
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.TimeContextFrequency
  
  /* 0 */ val DAILY: DAILY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.TimeContextFrequency with scala.Double
  ] = js.native
}

