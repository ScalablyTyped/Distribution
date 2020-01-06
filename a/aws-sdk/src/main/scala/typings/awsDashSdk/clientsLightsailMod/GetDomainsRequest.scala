package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get domains request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetDomainsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainsRequest]
  }
}

