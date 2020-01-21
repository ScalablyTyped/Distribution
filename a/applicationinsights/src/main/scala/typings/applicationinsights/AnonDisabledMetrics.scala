package typings.applicationinsights

import typings.applicationinsights.nativePerformanceMod.IDisabledExtendedMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledMetrics extends js.Object {
  var disabledMetrics: IDisabledExtendedMetrics
  var isEnabled: Boolean
}

object AnonDisabledMetrics {
  @scala.inline
  def apply(disabledMetrics: IDisabledExtendedMetrics, isEnabled: Boolean): AnonDisabledMetrics = {
    val __obj = js.Dynamic.literal(disabledMetrics = disabledMetrics.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledMetrics]
  }
}

