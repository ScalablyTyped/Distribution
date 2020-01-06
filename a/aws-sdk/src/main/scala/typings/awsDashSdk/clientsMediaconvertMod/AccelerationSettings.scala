package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerationSettings extends js.Object {
  /**
    * Specify the conditions when the service will run your job with accelerated transcoding.
    */
  var Mode: AccelerationMode = js.native
}

object AccelerationSettings {
  @scala.inline
  def apply(Mode: AccelerationMode): AccelerationSettings = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccelerationSettings]
  }
}

