package typings.applicationinsights.metricQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricQuickPulse extends js.Object {
  var Name: String
  var Value: Double
  var Weight: Double
}

object MetricQuickPulse {
  @scala.inline
  def apply(Name: String, Value: Double, Weight: Double): MetricQuickPulse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetricQuickPulse]
  }
}

