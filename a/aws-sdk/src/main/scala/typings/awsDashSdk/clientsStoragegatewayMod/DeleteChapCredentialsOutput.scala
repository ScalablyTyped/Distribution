package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChapCredentialsOutput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var TargetARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TargetARN] = js.native
}

object DeleteChapCredentialsOutput {
  @scala.inline
  def apply(InitiatorName: IqnName = null, TargetARN: TargetARN = null): DeleteChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName.asInstanceOf[js.Any])
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChapCredentialsOutput]
  }
}

