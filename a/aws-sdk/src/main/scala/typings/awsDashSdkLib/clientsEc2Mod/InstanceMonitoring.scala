package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceMonitoring extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[Monitoring] = js.undefined
}

object InstanceMonitoring {
  @scala.inline
  def apply(InstanceId: String = null, Monitoring: Monitoring = null): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring)
    __obj.asInstanceOf[InstanceMonitoring]
  }
}

