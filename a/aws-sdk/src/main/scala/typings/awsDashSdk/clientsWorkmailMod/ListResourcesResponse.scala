package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesResponse extends js.Object {
  /**
    *  The token used to paginate through all the organization's resources. While results are still available, it has an associated value. When the last page is reached, the token is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * One page of the organization's resource representation.
    */
  var Resources: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.Resources] = js.undefined
}

object ListResourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Resources: Resources = null): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    __obj.asInstanceOf[ListResourcesResponse]
  }
}

