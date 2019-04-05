package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesMetricQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricQuickPulse extends js.Object {
  var Name: java.lang.String
  var Value: scala.Double
  var Weight: scala.Double
}

object MetricQuickPulse {
  @scala.inline
  def apply(Name: java.lang.String, Value: scala.Double, Weight: scala.Double): MetricQuickPulse = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value, Weight = Weight)
  
    __obj.asInstanceOf[MetricQuickPulse]
  }
}

