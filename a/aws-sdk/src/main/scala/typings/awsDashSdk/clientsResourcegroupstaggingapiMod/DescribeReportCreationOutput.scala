package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportCreationOutput extends js.Object {
  /**
    * Details of the common errors that all operations return.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ErrorMessage] = js.native
  /**
    * The path to the Amazon S3 bucket where the report was stored on creation.
    */
  var S3Location: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.S3Location] = js.native
  /**
    * Reports the status of the operation. The operation status can be one of the following:    RUNNING - Report creation is in progress.    SUCCEEDED - Report creation is complete. You can open the report from the Amazon S3 bucket that you specified when you ran StartReportCreation.    FAILED - Report creation timed out or the Amazon S3 bucket is not accessible.     NO REPORT - No report was generated in the last 90 days.  
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.Status] = js.native
}

object DescribeReportCreationOutput {
  @scala.inline
  def apply(ErrorMessage: ErrorMessage = null, S3Location: S3Location = null, Status: Status = null): DescribeReportCreationOutput = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (S3Location != null) __obj.updateDynamic("S3Location")(S3Location.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportCreationOutput]
  }
}

