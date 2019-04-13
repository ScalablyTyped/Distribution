package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvalidationsRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var DistributionId: java.lang.String
  /**
    * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches. Because the results are returned in decreasing order from most recent to oldest, the most recent results are on the first page, the second page will contain earlier results, and so on. To get the next page of results, set Marker to the value of the NextMarker from the current page's response. This value is the same as the ID of the last invalidation batch on that page. 
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of invalidation batches that you want in the response body.
    */
  var MaxItems: js.UndefOr[java.lang.String] = js.undefined
}

object ListInvalidationsRequest {
  @scala.inline
  def apply(
    DistributionId: java.lang.String,
    Marker: java.lang.String = null,
    MaxItems: java.lang.String = null
  ): ListInvalidationsRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListInvalidationsRequest]
  }
}

