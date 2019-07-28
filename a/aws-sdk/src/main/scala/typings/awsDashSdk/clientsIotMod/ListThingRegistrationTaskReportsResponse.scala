package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingRegistrationTaskReportsResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of task report.
    */
  var reportType: js.UndefOr[ReportType] = js.undefined
  /**
    * Links to the task resources.
    */
  var resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
}

object ListThingRegistrationTaskReportsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, reportType: ReportType = null, resourceLinks: S3FileUrlList = null): ListThingRegistrationTaskReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (reportType != null) __obj.updateDynamic("reportType")(reportType.asInstanceOf[js.Any])
    if (resourceLinks != null) __obj.updateDynamic("resourceLinks")(resourceLinks)
    __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
  }
}

