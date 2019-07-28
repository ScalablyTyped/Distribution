package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNamespacesResponse extends js.Object {
  /**
    * An array that contains one NamespaceSummary object for each namespace that matches the specified filter criteria.
    */
  var Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined
  /**
    * If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}

object ListNamespacesResponse {
  @scala.inline
  def apply(Namespaces: NamespaceSummariesList = null, NextToken: NextToken = null): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    if (Namespaces != null) __obj.updateDynamic("Namespaces")(Namespaces)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListNamespacesResponse]
  }
}

