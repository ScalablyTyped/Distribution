package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceDelegatesResponse extends js.Object {
  /**
    * One page of the resource's delegates.
    */
  var Delegates: js.UndefOr[ResourceDelegates] = js.undefined
  /**
    * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
}

object ListResourceDelegatesResponse {
  @scala.inline
  def apply(Delegates: ResourceDelegates = null, NextToken: NextToken = null): ListResourceDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourceDelegatesResponse]
  }
}

