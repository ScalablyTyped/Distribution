package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClustersRequest extends js.Object {
  /**
    * The names of the DAX clusters being described.
    */
  var ClusterNames: js.UndefOr[ClusterNameList] = js.undefined
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeClustersRequest {
  @scala.inline
  def apply(
    ClusterNames: ClusterNameList = null,
    MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
    NextToken: String = null
  ): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterNames != null) __obj.updateDynamic("ClusterNames")(ClusterNames)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClustersRequest]
  }
}

