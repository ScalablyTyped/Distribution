package typings.actionsDashOnDashGoogle.assistantDashAppMod

import typings.actionsDashOnDashGoogle.Anon_Day
import typings.actionsDashOnDashGoogle.Anon_Hours
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  var date: Anon_Day
  var time: Anon_Hours
}

object DateTime {
  @scala.inline
  def apply(date: Anon_Day, time: Anon_Hours): DateTime = {
    val __obj = js.Dynamic.literal(date = date, time = time)
  
    __obj.asInstanceOf[DateTime]
  }
}

