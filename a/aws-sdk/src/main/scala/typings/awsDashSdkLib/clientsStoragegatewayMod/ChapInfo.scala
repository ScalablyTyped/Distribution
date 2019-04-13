package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChapInfo extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
    */
  var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var TargetARN: js.UndefOr[TargetARN] = js.undefined
}

object ChapInfo {
  @scala.inline
  def apply(
    InitiatorName: IqnName = null,
    SecretToAuthenticateInitiator: ChapSecret = null,
    SecretToAuthenticateTarget: ChapSecret = null,
    TargetARN: TargetARN = null
  ): ChapInfo = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName)
    if (SecretToAuthenticateInitiator != null) __obj.updateDynamic("SecretToAuthenticateInitiator")(SecretToAuthenticateInitiator)
    if (SecretToAuthenticateTarget != null) __obj.updateDynamic("SecretToAuthenticateTarget")(SecretToAuthenticateTarget)
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN)
    __obj.asInstanceOf[ChapInfo]
  }
}

