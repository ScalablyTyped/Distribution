package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCaseRequest extends js.Object {
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using AddAttachmentsToSet.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.undefined
  /**
    * A list of email addresses that AWS Support copies on case correspondence.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
  /**
    * The communication body text when you create an AWS Support case by calling CreateCase.
    */
  var communicationBody: CommunicationBody
  /**
    * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."
    */
  var issueType: js.UndefOr[IssueType] = js.undefined
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * The code for the AWS service returned by the call to DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.undefined
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.  The availability of severity levels depends on each customer's support subscription. In other words, your subscription may not necessarily require the urgent level of response time. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.undefined
  /**
    * The title of the AWS Support case.
    */
  var subject: Subject
}

object CreateCaseRequest {
  @scala.inline
  def apply(
    communicationBody: CommunicationBody,
    subject: Subject,
    attachmentSetId: AttachmentSetId = null,
    categoryCode: CategoryCode = null,
    ccEmailAddresses: CcEmailAddressList = null,
    issueType: IssueType = null,
    language: Language = null,
    serviceCode: ServiceCode = null,
    severityCode: SeverityCode = null
  ): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody, subject = subject)
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId)
    if (categoryCode != null) __obj.updateDynamic("categoryCode")(categoryCode)
    if (ccEmailAddresses != null) __obj.updateDynamic("ccEmailAddresses")(ccEmailAddresses)
    if (issueType != null) __obj.updateDynamic("issueType")(issueType)
    if (language != null) __obj.updateDynamic("language")(language)
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode)
    if (severityCode != null) __obj.updateDynamic("severityCode")(severityCode)
    __obj.asInstanceOf[CreateCaseRequest]
  }
}

