package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverabilityTestReport extends js.Object {
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.DeliverabilityTestStatus] = js.native
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.ReportId] = js.native
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.ReportName] = js.native
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.native
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
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (DeliverabilityTestStatus != null) __obj.updateDynamic("DeliverabilityTestStatus")(DeliverabilityTestStatus.asInstanceOf[js.Any])
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress.asInstanceOf[js.Any])
    if (ReportId != null) __obj.updateDynamic("ReportId")(ReportId.asInstanceOf[js.Any])
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
}

