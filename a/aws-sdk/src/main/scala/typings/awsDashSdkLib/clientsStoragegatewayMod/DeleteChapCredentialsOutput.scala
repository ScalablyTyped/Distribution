package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChapCredentialsOutput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var TargetARN: js.UndefOr[TargetARN] = js.undefined
}

object DeleteChapCredentialsOutput {
  @scala.inline
  def apply(InitiatorName: IqnName = null, TargetARN: TargetARN = null): DeleteChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName)
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN)
    __obj.asInstanceOf[DeleteChapCredentialsOutput]
  }
}

