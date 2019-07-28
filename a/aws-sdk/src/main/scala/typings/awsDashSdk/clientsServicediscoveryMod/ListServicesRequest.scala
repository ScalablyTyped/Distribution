package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServicesRequest extends js.Object {
  /**
    * A complex type that contains specifications for the namespaces that you want to list services for.  If you specify more than one filter, an operation must match all filters to be returned by ListServices.
    */
  var Filters: js.UndefOr[ServiceFilters] = js.undefined
  /**
    * The maximum number of services that you want AWS Cloud Map to return in the response to a ListServices request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 services.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  /**
    * For the first ListServices request, omit this value. If the response contains NextToken, submit another ListServices request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults services and then filters them based on the specified criteria. It's possible that no services in the first MaxResults services matched the specified criteria but that subsequent groups of MaxResults services do contain services that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}

object ListServicesRequest {
  @scala.inline
  def apply(
    Filters: ServiceFilters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListServicesRequest]
  }
}

