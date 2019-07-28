package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hours extends js.Object {
  var hours: Double
  var minutes: Double
  var nanos: Double
  var seconds: Double
}

object Anon_Hours {
  @scala.inline
  def apply(hours: Double, minutes: Double, nanos: Double, seconds: Double): Anon_Hours = {
    val __obj = js.Dynamic.literal(hours = hours, minutes = minutes, nanos = nanos, seconds = seconds)
  
    __obj.asInstanceOf[Anon_Hours]
  }
}

