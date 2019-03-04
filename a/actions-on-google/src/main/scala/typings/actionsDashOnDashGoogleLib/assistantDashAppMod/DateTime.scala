package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  var date: actionsDashOnDashGoogleLib.Anon_Day
  var time: actionsDashOnDashGoogleLib.Anon_Hours
}

object DateTime {
  @scala.inline
  def apply(date: actionsDashOnDashGoogleLib.Anon_Day, time: actionsDashOnDashGoogleLib.Anon_Hours): DateTime = {
    val __obj = js.Dynamic.literal(date = date, time = time)
  
    __obj.asInstanceOf[DateTime]
  }
}

