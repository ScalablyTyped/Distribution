package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName = js.native
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateInitiator: ChapSecret = js.native
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client). Byte constraints: Minimum bytes of 12. Maximum bytes of 16.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsDashSdk.clientsStoragegatewayMod.TargetARN = js.native
}

object UpdateChapCredentialsInput {
  @scala.inline
  def apply(
    InitiatorName: IqnName,
    SecretToAuthenticateInitiator: ChapSecret,
    TargetARN: TargetARN,
    SecretToAuthenticateTarget: ChapSecret = null
  ): UpdateChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], SecretToAuthenticateInitiator = SecretToAuthenticateInitiator.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    if (SecretToAuthenticateTarget != null) __obj.updateDynamic("SecretToAuthenticateTarget")(SecretToAuthenticateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChapCredentialsInput]
  }
}

