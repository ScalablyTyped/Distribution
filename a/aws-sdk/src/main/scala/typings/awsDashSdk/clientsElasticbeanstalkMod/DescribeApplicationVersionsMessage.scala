package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationVersionsMessage extends js.Object {
  /**
    * Specify an application name to show only application versions for that application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * For a paginated request. Specify a maximum number of application versions to include in each response. If no MaxRecords is specified, all available application versions are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.MaxRecords] = js.undefined
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * Specify a version label to show a specific application version.
    */
  var VersionLabels: js.UndefOr[VersionLabelsList] = js.undefined
}

object DescribeApplicationVersionsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: Token = null,
    VersionLabels: VersionLabelsList = null
  ): DescribeApplicationVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VersionLabels != null) __obj.updateDynamic("VersionLabels")(VersionLabels)
    __obj.asInstanceOf[DescribeApplicationVersionsMessage]
  }
}

