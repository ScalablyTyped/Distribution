package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerationSettings extends js.Object {
  /**
    * Acceleration configuration for the job.
    */
  var Mode: AccelerationMode
}

object AccelerationSettings {
  @scala.inline
  def apply(Mode: AccelerationMode): AccelerationSettings = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccelerationSettings]
  }
}

