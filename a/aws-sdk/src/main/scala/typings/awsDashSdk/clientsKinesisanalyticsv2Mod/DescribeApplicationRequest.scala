package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
    */
  var IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.native
}

object DescribeApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, IncludeAdditionalDetails: js.UndefOr[Boolean] = js.undefined): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeAdditionalDetails)) __obj.updateDynamic("IncludeAdditionalDetails")(IncludeAdditionalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
}

