package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEmailIdentitiesRequest extends js.Object {
  /**
    * A token returned from a previous call to ListEmailIdentities to indicate the position in the list of identities.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.undefined
  /**
    * The number of results to show in a single call to ListEmailIdentities. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}

object ListEmailIdentitiesRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, PageSize: js.UndefOr[MaxItems] = js.undefined): ListEmailIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[ListEmailIdentitiesRequest]
  }
}

