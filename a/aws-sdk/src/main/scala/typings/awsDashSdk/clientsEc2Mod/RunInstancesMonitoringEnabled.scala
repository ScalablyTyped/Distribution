package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunInstancesMonitoringEnabled extends js.Object {
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: Boolean
}

object RunInstancesMonitoringEnabled {
  @scala.inline
  def apply(Enabled: Boolean): RunInstancesMonitoringEnabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
  
    __obj.asInstanceOf[RunInstancesMonitoringEnabled]
  }
}

