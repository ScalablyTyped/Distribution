package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get domains request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetDomainsRequest {
  @scala.inline
  def apply(pageToken: java.lang.String = null): GetDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetDomainsRequest]
  }
}

