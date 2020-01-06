package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCaseRequest extends js.Object {
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using AddAttachmentsToSet.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.native
  /**
    * A list of email addresses that AWS Support copies on case correspondence.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The communication body text when you create an AWS Support case by calling CreateCase.
    */
  var communicationBody: CommunicationBody = js.native
  /**
    * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."  Service limit increases are not supported by the Support API; you must submit service limit increase requests in Support Center. 
    */
  var issueType: js.UndefOr[IssueType] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The code for the AWS service returned by the call to DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.native
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.  The availability of severity levels depends on the support plan for the account. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.native
  /**
    * The title of the AWS Support case.
    */
  var subject: Subject = js.native
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
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId.asInstanceOf[js.Any])
    if (categoryCode != null) __obj.updateDynamic("categoryCode")(categoryCode.asInstanceOf[js.Any])
    if (ccEmailAddresses != null) __obj.updateDynamic("ccEmailAddresses")(ccEmailAddresses.asInstanceOf[js.Any])
    if (issueType != null) __obj.updateDynamic("issueType")(issueType.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (severityCode != null) __obj.updateDynamic("severityCode")(severityCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
}

