package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDedicatedIpsRequest extends js.Object {
  /**
    * A token returned from a previous call to GetDedicatedIps to indicate the position of the dedicated IP pool in the list of IP pools.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The number of results to show in a single call to GetDedicatedIpsRequest. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
  /**
    * The name of the IP pool that the dedicated IP address is associated with.
    */
  var PoolName: js.UndefOr[PoolName] = js.undefined
}

object GetDedicatedIpsRequest {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    PageSize: js.UndefOr[MaxItems] = js.undefined,
    PoolName: PoolName = null
  ): GetDedicatedIpsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PoolName != null) __obj.updateDynamic("PoolName")(PoolName)
    __obj.asInstanceOf[GetDedicatedIpsRequest]
  }
}

