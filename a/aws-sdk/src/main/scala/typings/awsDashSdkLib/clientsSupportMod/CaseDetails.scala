package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseDetails extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.undefined
  /**
    * The email addresses that receive copies of communication about the case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
  /**
    * The ID displayed for the case in the AWS Support Center. This is a numeric string.
    */
  var displayId: js.UndefOr[DisplayId] = js.undefined
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to the communications. Also includes a nextToken that you can use to retrieve earlier communications.
    */
  var recentCommunications: js.UndefOr[RecentCaseCommunications] = js.undefined
  /**
    * The code for the AWS service returned by the call to DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.undefined
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.
    */
  var severityCode: js.UndefOr[SeverityCode] = js.undefined
  /**
    * The status of the case.
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The subject line for the case in the AWS Support Center.
    */
  var subject: js.UndefOr[Subject] = js.undefined
  /**
    * The email address of the account that submitted the case.
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
  /**
    * The time that the case was case created in the AWS Support Center.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.undefined
}

object CaseDetails {
  @scala.inline
  def apply(
    caseId: CaseId = null,
    categoryCode: CategoryCode = null,
    ccEmailAddresses: CcEmailAddressList = null,
    displayId: DisplayId = null,
    language: Language = null,
    recentCommunications: RecentCaseCommunications = null,
    serviceCode: ServiceCode = null,
    severityCode: SeverityCode = null,
    status: Status = null,
    subject: Subject = null,
    submittedBy: SubmittedBy = null,
    timeCreated: TimeCreated = null
  ): CaseDetails = {
    val __obj = js.Dynamic.literal()
    if (caseId != null) __obj.updateDynamic("caseId")(caseId)
    if (categoryCode != null) __obj.updateDynamic("categoryCode")(categoryCode)
    if (ccEmailAddresses != null) __obj.updateDynamic("ccEmailAddresses")(ccEmailAddresses)
    if (displayId != null) __obj.updateDynamic("displayId")(displayId)
    if (language != null) __obj.updateDynamic("language")(language)
    if (recentCommunications != null) __obj.updateDynamic("recentCommunications")(recentCommunications)
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode)
    if (severityCode != null) __obj.updateDynamic("severityCode")(severityCode)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (submittedBy != null) __obj.updateDynamic("submittedBy")(submittedBy)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.asInstanceOf[CaseDetails]
  }
}

