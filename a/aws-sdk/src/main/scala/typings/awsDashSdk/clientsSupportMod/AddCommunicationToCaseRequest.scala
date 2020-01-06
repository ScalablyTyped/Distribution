package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCommunicationToCaseRequest extends js.Object {
  /**
    * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling AddAttachmentsToSet 
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  /**
    * The email addresses in the CC line of an email to be added to the support case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The body of an email communication to add to the support case.
    */
  var communicationBody: CommunicationBody = js.native
}

object AddCommunicationToCaseRequest {
  @scala.inline
  def apply(
    communicationBody: CommunicationBody,
    attachmentSetId: AttachmentSetId = null,
    caseId: CaseId = null,
    ccEmailAddresses: CcEmailAddressList = null
  ): AddCommunicationToCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any])
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId.asInstanceOf[js.Any])
    if (caseId != null) __obj.updateDynamic("caseId")(caseId.asInstanceOf[js.Any])
    if (ccEmailAddresses != null) __obj.updateDynamic("ccEmailAddresses")(ccEmailAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCommunicationToCaseRequest]
  }
}

