package typings
package applicationinsightsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledMetrics extends js.Object {
  var disabledMetrics: applicationinsightsLib.outAutoCollectionNativePerformanceMod.IDisabledExtendedMetrics
  var isEnabled: scala.Boolean
}

object Anon_DisabledMetrics {
  @scala.inline
  def apply(
    disabledMetrics: applicationinsightsLib.outAutoCollectionNativePerformanceMod.IDisabledExtendedMetrics,
    isEnabled: scala.Boolean
  ): Anon_DisabledMetrics = {
    val __obj = js.Dynamic.literal(disabledMetrics = disabledMetrics, isEnabled = isEnabled)
  
    __obj.asInstanceOf[Anon_DisabledMetrics]
  }
}

