package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * The launch type for the services to list.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * The maximum number of service results returned by ListServices in paginated output. When this parameter is used, ListServices only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListServices request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListServices returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The nextToken value returned from a previous paginated ListServices request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The scheduling strategy for services to list.
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined
}

object ListServicesRequest {
  @scala.inline
  def apply(
    cluster: String = null,
    launchType: LaunchType = null,
    maxResults: js.UndefOr[BoxedInteger] = js.undefined,
    nextToken: String = null,
    schedulingStrategy: SchedulingStrategy = null
  ): ListServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (schedulingStrategy != null) __obj.updateDynamic("schedulingStrategy")(schedulingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesRequest]
  }
}

