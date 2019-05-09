package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResponse extends js.Object {
  /**
    * A list of all of the clusters for your account in the specified Region.
    */
  var clusters: js.UndefOr[StringList] = js.undefined
  /**
    * The nextToken value to include in a future ListClusters request. When the results of a ListClusters request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListClustersResponse {
  @scala.inline
  def apply(clusters: StringList = null, nextToken: String = null): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListClustersResponse]
  }
}

