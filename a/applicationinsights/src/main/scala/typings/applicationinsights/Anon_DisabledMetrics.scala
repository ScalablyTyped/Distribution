package typings.applicationinsights

import typings.applicationinsights.outAutoCollectionNativePerformanceMod.IDisabledExtendedMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledMetrics extends js.Object {
  var disabledMetrics: IDisabledExtendedMetrics
  var isEnabled: Boolean
}

object Anon_DisabledMetrics {
  @scala.inline
  def apply(disabledMetrics: IDisabledExtendedMetrics, isEnabled: Boolean): Anon_DisabledMetrics = {
    val __obj = js.Dynamic.literal(disabledMetrics = disabledMetrics, isEnabled = isEnabled)
  
    __obj.asInstanceOf[Anon_DisabledMetrics]
  }
}

