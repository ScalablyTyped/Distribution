package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticSet extends js.Object {
  /**
    * The maximum value of the sample set.
    */
  var Maximum: DatapointValue
  /**
    * The minimum value of the sample set.
    */
  var Minimum: DatapointValue
  /**
    * The number of samples used for the statistic set.
    */
  var SampleCount: DatapointValue
  /**
    * The sum of values for the sample set.
    */
  var Sum: DatapointValue
}

object StatisticSet {
  @scala.inline
  def apply(Maximum: DatapointValue, Minimum: DatapointValue, SampleCount: DatapointValue, Sum: DatapointValue): StatisticSet = {
    val __obj = js.Dynamic.literal(Maximum = Maximum, Minimum = Minimum, SampleCount = SampleCount, Sum = Sum)
  
    __obj.asInstanceOf[StatisticSet]
  }
}

