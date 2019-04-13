package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebACLsResponse extends js.Object {
  /**
    * If you have more WebACL objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more WebACL objects, submit another ListWebACLs request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
  /**
    * An array of WebACLSummary objects.
    */
  var WebACLs: js.UndefOr[WebACLSummaries] = js.undefined
}

object ListWebACLsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, WebACLs: WebACLSummaries = null): ListWebACLsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (WebACLs != null) __obj.updateDynamic("WebACLs")(WebACLs)
    __obj.asInstanceOf[ListWebACLsResponse]
  }
}

