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
  
  val DAILY: DAILY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.TimeContextFrequency with java.lang.String
  ] = js.native
}

