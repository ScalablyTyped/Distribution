package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Communication extends js.Object {
  /**
    * Information about the attachments to the case communication.
    */
  var attachmentSet: js.UndefOr[AttachmentSet] = js.undefined
  /**
    * The text of the communication between the customer and AWS Support.
    */
  var body: js.UndefOr[CommunicationBody] = js.undefined
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
  /**
    * The email address of the account that submitted the AWS Support case.
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
  /**
    * The time the communication was created.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.undefined
}

object Communication {
  @scala.inline
  def apply(
    attachmentSet: AttachmentSet = null,
    body: CommunicationBody = null,
    caseId: CaseId = null,
    submittedBy: SubmittedBy = null,
    timeCreated: TimeCreated = null
  ): Communication = {
    val __obj = js.Dynamic.literal()
    if (attachmentSet != null) __obj.updateDynamic("attachmentSet")(attachmentSet)
    if (body != null) __obj.updateDynamic("body")(body)
    if (caseId != null) __obj.updateDynamic("caseId")(caseId)
    if (submittedBy != null) __obj.updateDynamic("submittedBy")(submittedBy)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.asInstanceOf[Communication]
  }
}

