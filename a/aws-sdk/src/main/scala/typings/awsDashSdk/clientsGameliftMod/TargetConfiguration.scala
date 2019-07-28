package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetConfiguration extends js.Object {
  /**
    * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new game sessions).
    */
  var TargetValue: Double
}

object TargetConfiguration {
  @scala.inline
  def apply(TargetValue: Double): TargetConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue)
  
    __obj.asInstanceOf[TargetConfiguration]
  }
}

