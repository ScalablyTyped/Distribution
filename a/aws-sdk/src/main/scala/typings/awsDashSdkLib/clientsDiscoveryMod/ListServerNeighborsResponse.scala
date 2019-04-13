package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServerNeighborsResponse extends js.Object {
  /**
    * Count of distinct servers that are one hop away from the given server.
    */
  var knownDependencyCount: js.UndefOr[Long] = js.undefined
  /**
    * List of distinct servers that are one hop away from the given server.
    */
  var neighbors: NeighborDetailsList
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListServerNeighborsResponse {
  @scala.inline
  def apply(
    neighbors: NeighborDetailsList,
    knownDependencyCount: js.UndefOr[Long] = js.undefined,
    nextToken: String = null
  ): ListServerNeighborsResponse = {
    val __obj = js.Dynamic.literal(neighbors = neighbors)
    if (!js.isUndefined(knownDependencyCount)) __obj.updateDynamic("knownDependencyCount")(knownDependencyCount)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListServerNeighborsResponse]
  }
}

