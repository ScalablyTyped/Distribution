package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceGraphResult extends js.Object {
  /**
    * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may show traces from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.native
  /**
    * The end of the time frame for which the graph was generated.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The services that have processed a traced request during the specified time frame.
    */
  var Services: js.UndefOr[ServiceList] = js.native
  /**
    * The start of the time frame for which the graph was generated.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}

object GetServiceGraphResult {
  @scala.inline
  def apply(
    ContainsOldGroupVersions: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: Timestamp = null,
    NextToken: String = null,
    Services: ServiceList = null,
    StartTime: Timestamp = null
  ): GetServiceGraphResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ContainsOldGroupVersions)) __obj.updateDynamic("ContainsOldGroupVersions")(ContainsOldGroupVersions.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphResult]
  }
}

