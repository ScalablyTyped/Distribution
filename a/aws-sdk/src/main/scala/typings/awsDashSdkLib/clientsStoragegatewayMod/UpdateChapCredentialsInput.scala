package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateInitiator: ChapSecret
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client). Byte constraints: Minimum bytes of 12. Maximum bytes of 16.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return the TargetARN for specified VolumeARN.
    */
  var TargetARN: awsDashSdkLib.clientsStoragegatewayMod.TargetARN
}

object UpdateChapCredentialsInput {
  @scala.inline
  def apply(
    InitiatorName: IqnName,
    SecretToAuthenticateInitiator: ChapSecret,
    TargetARN: TargetARN,
    SecretToAuthenticateTarget: ChapSecret = null
  ): UpdateChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName, SecretToAuthenticateInitiator = SecretToAuthenticateInitiator, TargetARN = TargetARN)
    if (SecretToAuthenticateTarget != null) __obj.updateDynamic("SecretToAuthenticateTarget")(SecretToAuthenticateTarget)
    __obj.asInstanceOf[UpdateChapCredentialsInput]
  }
}

