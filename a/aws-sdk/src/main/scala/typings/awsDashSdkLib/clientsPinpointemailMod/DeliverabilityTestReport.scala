package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverabilityTestReport extends js.Object {
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus] = js.undefined
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[ReportId] = js.undefined
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[ReportName] = js.undefined
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
}

object DeliverabilityTestReport {
  @scala.inline
  def apply(
    CreateDate: Timestamp = null,
    DeliverabilityTestStatus: DeliverabilityTestStatus = null,
    FromEmailAddress: EmailAddress = null,
    ReportId: ReportId = null,
    ReportName: ReportName = null,
    Subject: DeliverabilityTestSubject = null
  ): DeliverabilityTestReport = {
    val __obj = js.Dynamic.literal()
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (DeliverabilityTestStatus != null) __obj.updateDynamic("DeliverabilityTestStatus")(DeliverabilityTestStatus.asInstanceOf[js.Any])
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress)
    if (ReportId != null) __obj.updateDynamic("ReportId")(ReportId)
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
}

