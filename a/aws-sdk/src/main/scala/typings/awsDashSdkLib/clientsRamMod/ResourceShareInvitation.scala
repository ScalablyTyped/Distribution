package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShareInvitation extends js.Object {
  /**
    * The date and time when the invitation was sent.
    */
  var invitationTimestamp: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID of the AWS account that received the invitation.
    */
  var receiverAccountId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  /**
    * The resources associated with the resource share.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that sent the invitation.
    */
  var senderAccountId: js.UndefOr[String] = js.undefined
  /**
    * The status of the invitation.
    */
  var status: js.UndefOr[ResourceShareInvitationStatus] = js.undefined
}

object ResourceShareInvitation {
  @scala.inline
  def apply(
    invitationTimestamp: DateTime = null,
    receiverAccountId: String = null,
    resourceShareArn: String = null,
    resourceShareAssociations: ResourceShareAssociationList = null,
    resourceShareInvitationArn: String = null,
    resourceShareName: String = null,
    senderAccountId: String = null,
    status: ResourceShareInvitationStatus = null
  ): ResourceShareInvitation = {
    val __obj = js.Dynamic.literal()
    if (invitationTimestamp != null) __obj.updateDynamic("invitationTimestamp")(invitationTimestamp)
    if (receiverAccountId != null) __obj.updateDynamic("receiverAccountId")(receiverAccountId)
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn)
    if (resourceShareAssociations != null) __obj.updateDynamic("resourceShareAssociations")(resourceShareAssociations)
    if (resourceShareInvitationArn != null) __obj.updateDynamic("resourceShareInvitationArn")(resourceShareInvitationArn)
    if (resourceShareName != null) __obj.updateDynamic("resourceShareName")(resourceShareName)
    if (senderAccountId != null) __obj.updateDynamic("senderAccountId")(senderAccountId)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareInvitation]
  }
}

