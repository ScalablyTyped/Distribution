package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResponse extends js.Object {
  /**
    * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
    */
  var clusterArns: js.UndefOr[StringList] = js.undefined
  /**
    * The nextToken value to include in a future ListClusters request. When the results of a ListClusters request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListClustersResponse {
  @scala.inline
  def apply(clusterArns: StringList = null, nextToken: String = null): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusterArns != null) __obj.updateDynamic("clusterArns")(clusterArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListClustersResponse]
  }
}

