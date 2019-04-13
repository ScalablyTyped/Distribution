package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDefinition extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: MetricName
  /**
    * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
    */
  var Regex: MetricRegex
}

object MetricDefinition {
  @scala.inline
  def apply(Name: MetricName, Regex: MetricRegex): MetricDefinition = {
    val __obj = js.Dynamic.literal(Name = Name, Regex = Regex)
  
    __obj.asInstanceOf[MetricDefinition]
  }
}

