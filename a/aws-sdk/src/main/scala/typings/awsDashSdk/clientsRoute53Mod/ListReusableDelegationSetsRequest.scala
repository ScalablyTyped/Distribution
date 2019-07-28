package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReusableDelegationSetsRequest extends js.Object {
  /**
    * If the value of IsTruncated in the previous response was true, you have more reusable delegation sets. To get another group, submit another ListReusableDelegationSets request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first reusable delegation set that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more reusable delegation sets to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  /**
    * The number of reusable delegation sets that you want Amazon Route 53 to return in the response to this request. If you specify a value greater than 100, Route 53 returns only the first 100 reusable delegation sets.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
}

object ListReusableDelegationSetsRequest {
  @scala.inline
  def apply(Marker: PageMarker = null, MaxItems: PageMaxItems = null): ListReusableDelegationSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListReusableDelegationSetsRequest]
  }
}

