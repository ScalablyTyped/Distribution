package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareInvitation extends js.Object {
  /**
    * The date and time when the invitation was sent.
    */
  var invitationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the AWS account that received the invitation.
    */
  var receiverAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * To view the resources associated with a pending resource share invitation, use  ListPendingInvitationResources.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: js.UndefOr[String] = js.native
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that sent the invitation.
    */
  var senderAccountId: js.UndefOr[String] = js.native
  /**
    * The status of the invitation.
    */
  var status: js.UndefOr[ResourceShareInvitationStatus] = js.native
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
    if (invitationTimestamp != null) __obj.updateDynamic("invitationTimestamp")(invitationTimestamp.asInstanceOf[js.Any])
    if (receiverAccountId != null) __obj.updateDynamic("receiverAccountId")(receiverAccountId.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    if (resourceShareAssociations != null) __obj.updateDynamic("resourceShareAssociations")(resourceShareAssociations.asInstanceOf[js.Any])
    if (resourceShareInvitationArn != null) __obj.updateDynamic("resourceShareInvitationArn")(resourceShareInvitationArn.asInstanceOf[js.Any])
    if (resourceShareName != null) __obj.updateDynamic("resourceShareName")(resourceShareName.asInstanceOf[js.Any])
    if (senderAccountId != null) __obj.updateDynamic("senderAccountId")(senderAccountId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareInvitation]
  }
}

