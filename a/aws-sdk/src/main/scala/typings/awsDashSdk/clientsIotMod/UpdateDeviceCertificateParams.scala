package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceCertificateParams extends js.Object {
  /**
    * The action that you want to apply to the device cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: DeviceCertificateUpdateAction
}

object UpdateDeviceCertificateParams {
  @scala.inline
  def apply(action: DeviceCertificateUpdateAction): UpdateDeviceCertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDeviceCertificateParams]
  }
}

