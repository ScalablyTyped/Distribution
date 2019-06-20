package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReportCreationOutput extends js.Object {
  /**
    * Details of the common errors that all operations return.
    */
  var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The path to the Amazon S3 bucket where the report is stored.
    */
  var S3Location: js.UndefOr[S3Location] = js.undefined
  /**
    * Reports the status of the operation. The operation status can be one of the following:    RUNNING: Report generation is in progress.    SUCCEEDED: Report generation is complete. You can open the report from the Amazon S3 bucket you specified when you ran StartReportGeneration.    FAILED: Report generation timed out or the Amazon S3 bucket is not accessible.   
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object DescribeReportCreationOutput {
  @scala.inline
  def apply(ErrorMessage: ErrorMessage = null, S3Location: S3Location = null, Status: Status = null): DescribeReportCreationOutput = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (S3Location != null) __obj.updateDynamic("S3Location")(S3Location)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DescribeReportCreationOutput]
  }
}

