package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServerNeighborsRequest extends js.Object {
  /**
    * Configuration ID of the server for which neighbors are being listed.
    */
  var configurationId: ConfigurationId
  /**
    * Maximum number of results to return in a single page of output.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * List of configuration IDs to test for one-hop-away.
    */
  var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * Flag to indicate if port and protocol information is needed as part of the response.
    */
  var portInformationNeeded: js.UndefOr[Boolean] = js.undefined
}

object ListServerNeighborsRequest {
  @scala.inline
  def apply(
    configurationId: ConfigurationId,
    maxResults: js.UndefOr[Integer] = js.undefined,
    neighborConfigurationIds: ConfigurationIdList = null,
    nextToken: String = null,
    portInformationNeeded: js.UndefOr[Boolean] = js.undefined
  ): ListServerNeighborsRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (neighborConfigurationIds != null) __obj.updateDynamic("neighborConfigurationIds")(neighborConfigurationIds)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (!js.isUndefined(portInformationNeeded)) __obj.updateDynamic("portInformationNeeded")(portInformationNeeded)
    __obj.asInstanceOf[ListServerNeighborsRequest]
  }
}

