package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
    */
  var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
    */
  var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined
  /**
    * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
    */
  var IncludeDeleted: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.IncludeDeleted] = js.undefined
  /**
    *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
    */
  var IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.undefined
  /**
    * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.MaxRecords] = js.undefined
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
    */
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object DescribeEnvironmentsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    EnvironmentIds: EnvironmentIdList = null,
    EnvironmentNames: EnvironmentNamesList = null,
    IncludeDeleted: js.UndefOr[IncludeDeleted] = js.undefined,
    IncludedDeletedBackTo: IncludeDeletedBackTo = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: Token = null,
    VersionLabel: VersionLabel = null
  ): DescribeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (EnvironmentIds != null) __obj.updateDynamic("EnvironmentIds")(EnvironmentIds)
    if (EnvironmentNames != null) __obj.updateDynamic("EnvironmentNames")(EnvironmentNames)
    if (!js.isUndefined(IncludeDeleted)) __obj.updateDynamic("IncludeDeleted")(IncludeDeleted)
    if (IncludedDeletedBackTo != null) __obj.updateDynamic("IncludedDeletedBackTo")(IncludedDeletedBackTo)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[DescribeEnvironmentsMessage]
  }
}

